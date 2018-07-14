import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-view-cart',
  templateUrl: './view-cart.component.html',
  styleUrls: ['./view-cart.component.css']
})
export class ViewCartComponent implements OnInit {


  @Input() cart;
  itemsLine: Array<any> = [];

  totalAmount: number = 0.0;

  constructor() { }

  ngOnInit() {
  }

  ngOnChanges() {
    let keys = Object.keys(this.cart);
    this.itemsLine = [];
    this.totalAmount = 0.0;
    keys.forEach(key => {
      let line = this.cart[key];
      this.itemsLine.push(line)
      this.totalAmount += line.item.price * line.qty;
    })
  }

}
