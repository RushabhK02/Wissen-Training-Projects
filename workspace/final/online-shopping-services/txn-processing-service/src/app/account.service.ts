import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  apiUrl: string = "http://localhost:8080/api/product-txn";

  constructor(private http: HttpClient) { }

  loadAccounts() {
    return this.http.get(this.apiUrl);
  }

  processTxn(txn){
    return this.http.post(this.apiUrl,txn);
  }

  loadTxns() {
    let url = "http://localhost:8080/api/product-txn/txns";
    return this.http.get(url);
  }

}
