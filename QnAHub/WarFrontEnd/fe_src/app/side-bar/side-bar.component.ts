import {Component} from '@angular/core';

declare var require: any;

@Component({
  selector: 'qnahub-side-bar',
  templateUrl: 'side-bar.component.html',
})

export class SideBarComponent{
  links: any[] = [
    { name :'Login', href : './login'},
    { name :'Dev Test', href : './dev-test'}  
  ]
}
