import {CartService} from './cart.service';
import {Component} from '@angular/core';
import {ProductsService} from './products.service';
import {Subject} from 'rxjs';

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
}