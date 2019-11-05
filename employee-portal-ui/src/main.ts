import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';
import { environment } from './environments/environment';

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));

// import './polyfills';

// import {HttpClientModule} from '@angular/common/http';
// import {NgModule} from '@angular/core';
// import {FormsModule, ReactiveFormsModule} from '@angular/forms';
// import {MatNativeDateModule} from '@angular/material';
// import {BrowserModule} from '@angular/platform-browser';
// import {platformBrowserDynamic} from '@angular/platform-browser-dynamic';
// import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
// import {MaterialModule} from './material-module';

// import {AppComponent} from './app/app.component';
// import { ApiService } from './app/api.service';

// @NgModule({
//   imports: [
//     BrowserModule,
//     BrowserAnimationsModule,
//     FormsModule,
//     HttpClientModule,
//     MaterialModule,
//     MatNativeDateModule,
//     ReactiveFormsModule,
//   ],
//   entryComponents: [AppComponent],
//   declarations: [AppComponent],
//   bootstrap: [AppComponent],
//   providers: [ApiService]
// })
// export class AppModule {}

// platformBrowserDynamic().bootstrapModule(AppModule);


// /**  Copyright 2018 Google Inc. All Rights Reserved.
//     Use of this source code is governed by an MIT-style license that
//     can be found in the LICENSE file at http://angular.io/license */