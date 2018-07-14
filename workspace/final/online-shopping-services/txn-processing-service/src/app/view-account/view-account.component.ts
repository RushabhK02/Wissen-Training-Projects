import { Component, OnInit } from '@angular/core';
import { AccountService } from '../account.service';

@Component({
  selector: 'app-view-account',
  templateUrl: './view-account.component.html',
  styleUrls: ['./view-account.component.css']
})
export class ViewAccountComponent implements OnInit {

  accounts: any;
  constructor(private accountService: AccountService) { }

  ngOnInit() {
    this.accountService.loadAccounts()
    .subscribe((accounts) => {
      this.accounts = accounts;
    });
  }

}
