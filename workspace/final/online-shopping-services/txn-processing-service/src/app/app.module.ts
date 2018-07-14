import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import {ReactiveFormsModule} from '@angular/forms';
import {TableModule} from 'primeng/table';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { TransactComponent } from './transact/transact.component';
import { ViewAccountComponent } from './view-account/view-account.component';
import { TxnSummaryComponent } from './txn-summary/txn-summary.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'transact', component: TransactComponent},
  { path: 'account', component: ViewAccountComponent},
  { path: 'summary', component: TxnSummaryComponent},
  { path: '**', component: HomeComponent}
]
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    TxnSummaryComponent,
    TransactComponent,
    ViewAccountComponent
  ],
  imports: [
    BrowserModule,
    TableModule,
    RouterModule.forRoot(routes),
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
