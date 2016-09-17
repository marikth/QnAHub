import { ActivatedRoute } from '@angular/router';
import { Component } from '@angular/core';
import { inject, TestBed } from '@angular/core/testing';

// Load the implementations that should be tested
import { AdminConsole } from './admin_console.component';

describe('AdminConsole', () => {
  // provide our implementations or mocks to the dependency injector
  beforeEach(() => TestBed.configureTestingModule({
    providers: [
      // provide a better mock
      {
        provide: ActivatedRoute,
        useValue: {
          data: {
            subscribe: (fn) => fn({
              yourData: 'yolo'
            })
          }
        }
      },
      AdminConsole
    ]
  }));

  it('should log ngOnInit', inject([AdminConsole], (console) => {
    spyOn(console, 'log');
    expect(console.log).not.toHaveBeenCalled();

    console.ngOnInit();
    expect(console.log).toHaveBeenCalled();
  }));

});
