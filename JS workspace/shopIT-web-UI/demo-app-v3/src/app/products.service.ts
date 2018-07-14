import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class ProductsService {

  constructor(private http: HttpClient) { }

  loadProducts() {
    let url = "http://localhost:3000/api/products";
    return this.http.get(url); // Non-blocking IO
  }
  loadReviews(productId) {
    let url = `http://localhost:3000/api/products/${productId}/reviews`;
    return this.http.get(url);
  }
  submitNewRewiew(productId, review) {
    let url = `http://localhost:3000/api/products/${productId}/reviews`;
    return this.http.post(url, review);
  }


}
