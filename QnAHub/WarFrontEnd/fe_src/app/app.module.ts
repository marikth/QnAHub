import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MaterialModule } from '@angular/material';
import { Routes, RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppComponent }   from './app.component';
import { ToolbarComponent } from './toolbar/toolbar.component';
import { SideBarComponent } from './side-bar/side-bar.component';
import { DevTestComponent } from './dev-test/dev-test.component';
import { LoginComponent } from './login/login.component';

import { Logger } from './logger.service';
import { AppState } from './app.service';

const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'dev-test',  component: DevTestComponent },
  { path: 'login',  component: LoginComponent }
];

const APP_PROVIDERS = [
  Logger,
  AppState,
];

@NgModule({
  imports:      [
    FormsModule,
    ReactiveFormsModule,
    BrowserModule,
    MaterialModule.forRoot(),
    RouterModule.forRoot(routes, { useHash: true })
   ],
  declarations: [
    AppComponent,
    DevTestComponent,
    ToolbarComponent,
    SideBarComponent,
    LoginComponent
   ],
  bootstrap:    [ AppComponent ],
  providers: APP_PROVIDERS
})
export class AppModule {
  constructor(public appState: AppState) {
    appState.set('isLoggedIn', false);
  }

  ngOnInit() {
    console.log('Start QnA component');
  }
}
