import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-product-view',
  templateUrl: './product-view.component.html',
  styleUrls: ['./product-view.component.css']
})
export class ProductViewComponent implements OnInit {

  constructor(private route: ActivatedRoute) { }

  prodId: any;

  ngOnInit() {
    this.route.params.subscribe(e => {
      this.prodId = e.prodId;
    })
  }

}
