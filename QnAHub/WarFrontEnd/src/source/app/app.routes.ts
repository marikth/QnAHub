import { Routes, RouterModule } from '@angular/router';
import { Home } from './home';
import { About } from './about';
import { AdminConsole } from './admin_console';
import { NoContent } from './no-content';

import { DataResolver } from './app.resolver';


export const ROUTES: Routes = [
  { path: '',      component: Home },
  { path: 'home',  component: Home },
  { path: 'about', component: About },
  { path: 'admin_console', component: AdminConsole },
  {
    path: 'detail', loadChildren: () => System.import('./+detail')
  },
  { path: '**',    component: NoContent },
];
