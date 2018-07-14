import { Component, OnInit } from '@angular/core';
import { AccountService } from '../account.service';

@Component({
  selector: 'app-txn-summary',
  templateUrl: './txn-summary.component.html',
  styleUrls: ['./txn-summary.component.css']
})
export class TxnSummaryComponent implements OnInit {

  private txns: any = [];
  constructor(private accountService: AccountService) { }

  ngOnInit() {
    this.accountService.loadTxns()
      .subscribe((txns) => {
        this.txns = txns;
        console.log(this.txns);
      });
  }


}
