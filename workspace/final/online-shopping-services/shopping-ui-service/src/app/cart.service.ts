import {Injectable} from '@angular/core';
import {Subject} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  cartStream: Subject<any> = new Subject();
  cart: any = {};

  constructor() {}

  addToCart(event) {
    let item = event.item;
    let qty = event.qty;
    let id = item.id;
    let line = this.cart[id];
    if (line) {
      this.cart[id].qty+=qty;
      //line = Object.assign({}, line, {qty})
    } else {
      line = Object.assign({item, qty})
      this.cartStream.next({value: 1})
    }
    this.cart = Object.assign({}, this.cart, {[id]: line});
  }

  getCartStream() {
    return this.cartStream;
  }

  getCart() {
    return this.cart;
  }

}