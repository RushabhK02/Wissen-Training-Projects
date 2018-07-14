import { ProductsService } from '../products.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: any = []
  
  constructor(private productsService: ProductsService) { }

  ngOnInit() {
    this.productsService.loadProducts()
      .subscribe((products) => {
        this.products = products;
      });
  }


}