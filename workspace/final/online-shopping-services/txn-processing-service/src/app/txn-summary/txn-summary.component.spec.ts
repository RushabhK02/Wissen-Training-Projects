import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TxnSummaryComponent } from './txn-summary.component';

describe('TxnSummaryComponent', () => {
  let component: TxnSummaryComponent;
  let fixture: ComponentFixture<TxnSummaryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TxnSummaryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TxnSummaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
