import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http'
import { ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ProductListComponent } from './product-list/product-list.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { ProductFormComponent } from './product-form/product-form.component';
import { ProductsResolverService } from './products-resolver.service';
import { LoginComponent } from './login/login.component';
import { AuthGuardService } from './auth-guard.service';
import { patch } from 'webdriver-js-extender';
import { CheckStateService } from './check-state.service';
import { ProductViewComponent } from './product-view/product-view.component';


const routes: Routes = [
  { path: '', component: HomeComponent },
  {
    path: 'products',
    // canActivate: [AuthGuardService],
    children: [
      {
        path: '',
        component: ProductListComponent,
        // canActivateChild: [AuthGuardService],
        resolve: {
          allProducts: ProductsResolverService
        },
        children: [
          {
            path: 'view/:prodId',
            component: ProductViewComponent,
          },
          {
            path: 'edit/:prodId',
            component: ProductFormComponent,
            canDeactivate:[CheckStateService],
          },
        ]
      }
    ]
  },
  {
    path: 'products/new',
    component: ProductFormComponent,
    // canActivate: [AuthGuardService],
    pathMatch: 'full'
  },
  { path: 'login', component: LoginComponent },
  { path: '**', component: NotFoundComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ProductListComponent,
    NotFoundComponent,
    ProductFormComponent,
    LoginComponent,
    ProductViewComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
