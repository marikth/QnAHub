import { Component } from '@angular/core';
<<<<<<< HEAD
=======
import {AppState} from './app.service';

>>>>>>> origin/add-material2

declare var require: any;

@Component({
  selector: 'app',
  templateUrl: './app.component.html',
<<<<<<< HEAD
  styleUrls: ['./app.component.css']
})
export class AppComponent {

=======
  styles: [ require('./app.component.scss').toString() ]
})
export class AppComponent {
  constructor(public appState: AppState) {
    this.isLoggedIn = appState.get('isLoggedIn');
  }
  isLoggedIn : boolean;
>>>>>>> origin/add-material2
}
