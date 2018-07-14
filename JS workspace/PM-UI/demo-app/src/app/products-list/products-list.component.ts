import { Component, OnInit } from '@angular/core';
import { ProductsService } from '../products.service';

@Component({
  selector: 'app-products-list',
  templateUrl: './products-list.component.html',
  styleUrls: ['./products-list.component.css']
})
export class ProductsListComponent implements OnInit {

  products:any=[];

  constructor(private productsService:ProductsService) { }

  ngOnInit() {
    this.productsService.loadProducts()
    .subscribe(product=>{
      this.products=product;
    })
  }

  delete(id){
    this.productsService.delete(id)
    .subscribe(resp => {
      this.products= this.products.filter(item=>item.id!==id)
    }
  )}

}
