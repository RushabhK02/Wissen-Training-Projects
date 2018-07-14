import { Component, OnInit, Input, Output,EventEmitter } from '@angular/core';
import { FormGroup, FormBuilder,Validators } from '@angular/forms';
import {ProductsService} from '../products.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
 
  @Input() product:any;
  currentTab = 1;
  @Input() idx:number;
  @Output() buy = new EventEmitter;
  imgUrl="../images/Laptop.png";

  reviews: any = [];

  constructor(private productsService: ProductsService) { }
  ngOnInit() {
  }

  changeTab(event, tabIdx) {
    this.currentTab = tabIdx;
    if (tabIdx === 3) {
      this.productsService.loadReviews(this.product.id)
        .subscribe(reviews => {
          this.reviews = reviews;
        })
    }
  }

  isTabSelected(tabIdx){
    return tabIdx===this.currentTab;
  }

  addNewReview(event) {
    this.productsService.submitNewRewiew(this.product.id, event.value)
      .subscribe(e => {
        this.reviews.push(e)
      })

  }
  handleBuy(event) {
    this.buy.emit({ item: this.product, qty: 1 })
  }

}
