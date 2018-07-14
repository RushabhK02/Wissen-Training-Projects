import { Component } from '@angular/core';
import { ProductsService } from './products.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [
    ProductsService
  ]
})
export class AppComponent {
  title = 'shop-IT';
  cart: any = {};
  isCartOpen: boolean = false;
  itemsCount: number = 0;
  products: any = []

  constructor(private productsService: ProductsService) { }

  ngOnInit() {
    this.productsService.loadProducts()
      .subscribe((products) => {
        console.log(products);
        this.products = products;
      });
  }

  addToCart(event) {
    let item = event.item;
    let qty = event.qty;
    let id = item.id;
    let line = this.cart[id];
    if (line) {
      line = Object.assign({}, line, { qty })
    } else {
      line = Object.assign({ item, qty })
    }
    this.cart = Object.assign({}, this.cart, { [id]: line })
    this.itemsCount = Object.keys(this.cart).length;

  }

  toggleCart() {
    this.isCartOpen = !this.isCartOpen;
  }


}
