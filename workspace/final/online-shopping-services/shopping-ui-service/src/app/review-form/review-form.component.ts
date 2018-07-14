import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { debounceTime } from 'rxjs/operators';

@Component({
  selector: 'app-review-form',
  templateUrl: './review-form.component.html',
  styleUrls: ['./review-form.component.css']
})
export class ReviewFormComponent implements OnInit {

  isFormOpen: boolean = false;
  reviewForm: FormGroup;
  errors: any = {};
  @Output() review = new EventEmitter();


  constructor(private fb: FormBuilder) { }

  ngOnInit() {
    this.reviewForm = this.fb.group({
      stars: ['5', [Validators.required]],
      author: ['', [Validators.required, Validators.email]],
      review: ['', [Validators.required, Validators.minLength(5)]]
    });

    let authorControl = this.reviewForm.get('author')
    authorControl.statusChanges
      .pipe(debounceTime(2000))
      .subscribe(e => {
        if (e === 'INVALID') {
          let errors = authorControl.errors;
          if (errors.required) { this.errors['email'] = 'Email is Required' }
          if (errors.email) { this.errors['email'] = 'Invalid Email' }
        } else {
          this.errors['email'] = '';
        }
      })
  }

  toggleForm() {
    this.isFormOpen = !this.isFormOpen;
  }

  handleFormSubmit(e) {
    e.preventDefault();
    if (this.reviewForm.valid) {
      let review = this.reviewForm.value;
      this.review.emit({ value: review });
      this.reviewForm.setValue({
       stars:5,
       author:'',
       review:''
      });
      this.errors['email'] = '';
      this.toggleForm();
    }
  }

}
