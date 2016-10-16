import {Component} from '@angular/core';
import {AppState} from '../app.service';

declare var require: any;

@Component({
  selector: 'qna-login',
  templateUrl: 'login.component.html',
  styles: [ require('./login.component.scss').toString() ]
})

export class LoginComponent{
  constructor(public appState: AppState) {
    this.isLoggedIn = appState.get('isLoggedIn');
  }

  ngOnInit() {
    console.log('Start Login component');
  }

  isLoggedIn : boolean;
}
