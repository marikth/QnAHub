// For vendors for example jQuery, Lodash, angular2-jwt just import them here unless you plan on
// chunking vendors files for async loading. You would need to import the async loaded vendors
// at the entry point of the async loaded file. Also see custom-typings.d.ts as you also need to
// run `typings install x` where `x` is your module

// TODO(gdi2290): switch to DLLs
declare var System: any;
declare var module: { id: string };
declare var require: any;
// Angular 2
import '@angular/core';
import '@angular/common';
import '@angular/compiler';
import '@angular/platform-browser';
import '@angular/platform-browser-dynamic';
import '@angular/http';
import '@angular/router';
import '@angular/forms';
// other libraries
import 'rxjs';
// // RxJS
import 'core-js/client/shim';
import 'reflect-metadata';
import 'zone.js';

import 'ts-helpers';





// if ('production' === ENV) {
//   // Production
//
//
// } else {
//   // Development
//
// }
