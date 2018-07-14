import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms'
 
import { AppComponent } from './app.component';
import { ProductsListComponent } from './products-list/products-list.component';
import { HomeComponent } from './home/home.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { ProductFormComponent } from './product-form/product-form.component';
import { ProductsService } from './products.service';

const routes: Routes = [
  { path:'',component: HomeComponent},
  { path:'products',component: ProductsListComponent},
  { path:'products/new',component: ProductFormComponent},
  { path:'products/edit/:productId',component: ProductFormComponent},
  { path:'**',component: NotFoundComponent}
]


@NgModule({
  declarations: [
    AppComponent,
    ProductsListComponent,
    HomeComponent,
    NotFoundComponent,
    ProductFormComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [ProductsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
