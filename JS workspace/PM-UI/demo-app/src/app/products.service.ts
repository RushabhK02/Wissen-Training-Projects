import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  apiUrl="http://localhost:3000/api/products";

  constructor(private http:HttpClient) { }

  loadProducts(){
    return this.http.get(this.apiUrl);
  }
  loadProduct(id){
    return this.http.get(this.apiUrl+`/${id}`);
  }
  save(newProduct){
    return this.http.post(this.apiUrl,newProduct);
  }
  update(product){
    return this.http.put(this.apiUrl+`/${product.id}`, product);
  }

  delete(id){
    return this.http.delete(this.apiUrl+`/${id}`);
  }
}
