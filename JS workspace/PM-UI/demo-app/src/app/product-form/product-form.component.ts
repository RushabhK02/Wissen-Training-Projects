import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { ProductsService } from '../products.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.css']
})
export class ProductFormComponent implements OnInit {
  productForm:FormGroup;
  isEditing:boolean=false;
  originalProduct:any;

  constructor(private fb:FormBuilder, 
              private productsService:ProductsService,
              private router:Router,
              private route:ActivatedRoute) { }

  ngOnInit() {
    this.productForm = this.fb.group({
      name:[''],
      price:[''],
      makeDate:[''],
      description:['']
    });

    this.route.params.subscribe(obj=>{
      if(obj.productId){
        this.productsService.loadProduct(obj.productId)
        .subscribe(product=>{
          this.originalProduct=product;
          this.productForm.patchValue(product);
          this.isEditing=true;
        })
      }
    })

  }

  handleSubmit(e){
    e.preventDefault();
    if(this.isEditing){
      let formData=this.productForm.value;
      let product = Object.assign({}, this.originalProduct, formData)
      this.productsService.update(product)
        .subscribe(product => {
          this.router.navigate(['products'])
          this.isEditing=false;
        })
      return;
    }
    this.productsService.save(this.productForm.value)
    .subscribe(product=>{
        this.router.navigate(['products']);
    })
  }

}
