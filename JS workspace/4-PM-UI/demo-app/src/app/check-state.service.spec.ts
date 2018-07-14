import { TestBed, inject } from '@angular/core/testing';

import { CheckStateService } from './check-state.service';

describe('CheckStateService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [CheckStateService]
    });
  });

  it('should be created', inject([CheckStateService], (service: CheckStateService) => {
    expect(service).toBeTruthy();
  }));
});
