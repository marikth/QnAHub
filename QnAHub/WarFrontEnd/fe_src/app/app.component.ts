import { Component } from '@angular/core';
import {AppState} from './app.service';

declare var require: any;

@Component({
  selector: 'app',
  templateUrl: './app.component.html',
  styles: [ require('./app.component.scss').toString() ]
})
export class AppComponent {
  constructor(public appState: AppState) {
    this.isLoggedIn = appState.get('isLoggedIn');
  }
  isLoggedIn : boolean;
}
