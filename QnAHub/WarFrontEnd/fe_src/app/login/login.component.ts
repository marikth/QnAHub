import {Component} from '@angular/core';

declare var require: any;

@Component({
  selector: 'qna-login',
  templateUrl: 'login.component.html',
  styles: [ require('./login.component.scss').toString() ]
})

export class LoginComponent{

}
