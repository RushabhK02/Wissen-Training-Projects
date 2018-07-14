import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CheckStateService {

  constructor() { }

  canDeactivate() {
    console.log('CheckStateService :: canDeactivate()');
    let b = confirm("Are you sure ?")
    return b;
  }
}
