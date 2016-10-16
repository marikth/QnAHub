import { Component } from '@angular/core';


declare var require: any;

@Component({
  selector: 'app',
  templateUrl: './app.component.html',
  styles: [ require('./app.component.scss').toString() ]
})
export class AppComponent {

}
