import {CartService} from '../cart.service';
import {Component, OnInit, Input} from '@angular/core';

@Component({
  selector: 'app-view-cart',
  templateUrl: './view-cart.component.html',
  styleUrls: ['./view-cart.component.css']
})
export class ViewCartComponent {


  totalAmount: number = 0.0;
  itemsLine: Array<any> = [];

  constructor(private cartService: CartService) {}

  ngDoCheck() {
    let cart = this.cartService.getCart();
    let keys = Object.keys(cart);
    this.itemsLine = [];
    this.totalAmount = 0.0;
    keys.forEach(key => {
      let line = cart[key];
      this.itemsLine.push(line)
      this.totalAmount += line.item.price * line.qty;
    })
  }



}