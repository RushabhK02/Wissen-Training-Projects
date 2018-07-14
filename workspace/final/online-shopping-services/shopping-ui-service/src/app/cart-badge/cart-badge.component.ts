import {CartService} from '../cart.service';
import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-cart-badge',
  templateUrl: './cart-badge.component.html',
  styleUrls: ['./cart-badge.component.css']
})
export class CartBadgeComponent implements OnInit {


  count: number = 0;

  constructor(private cartService: CartService) {}

  ngOnInit() {
    this.cartService.getCartStream()
      .subscribe(e => {
        this.count += e.value;
      })
  }

}
