import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import {AppComponent} from './app.component';
import { CartService } from './cart.service';
import {HomeComponent} from './home/home.component';
import {ProductComponent} from './product/product.component';
import {ReviewComponent} from './review/review.component';
import {ReviewFormComponent} from './review-form/review-form.component';
import {ViewCartComponent} from './view-cart/view-cart.component';
import {PriceDiscountPipe} from './price-discount.pipe';
import {ProductsService} from './products.service';
import {RouterModule, Routes} from '@angular/router';
import { ProductListComponent } from './product-list/product-list.component';
import { CartBadgeComponent } from './cart-badge/cart-badge.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'products', component: ProductListComponent}, 
  {path: 'cart', component: ViewCartComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
    ReviewComponent,
    ReviewFormComponent,
    ViewCartComponent,
    PriceDiscountPipe,
    ProductListComponent,
    HomeComponent,
    CartBadgeComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [
    ProductsService,
    CartService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}