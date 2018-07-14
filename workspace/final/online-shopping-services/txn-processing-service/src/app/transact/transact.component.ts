import { Component, OnInit, Output } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { AccountService } from '../account.service';

@Component({
  selector: 'app-transact',
  templateUrl: './transact.component.html',
  styleUrls: ['./transact.component.css']
})
export class TransactComponent implements OnInit {

  transactForm: FormGroup;
  accounts: any;

    constructor(private fb: FormBuilder,
      private accountService: AccountService) { }

  ngOnInit() {
    this.transactForm = this.fb.group({
      fromAccount: ['1', [Validators.required]],
      toAccount: ['2', [Validators.required]],
      amount: ['0', [Validators.required]],
    });

    this.accountService.loadAccounts()
      .subscribe((accounts) => {
        this.accounts = accounts;
      });
  }

  handleSubmit(e) {
    e.preventDefault();
    console.log(e);
    let transaction = this.transactForm.value;

    console.log(transaction);
    this.accountService.processTxn(transaction)
      .subscribe(status => {
        console.log(status);

        this.transactForm.controls['toAccount'].setValue('2');
        this.transactForm.controls['fromAccount'].setValue('1');
        this.transactForm.controls['amount'].setValue('0');
      }
      )
  }
}
