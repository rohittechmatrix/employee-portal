import { Injectable } from "@angular/core";
import { Observable } from 'rxjs';
import { map, } from 'rxjs/operators';

import { HttpHeaders, HttpClient } from '@angular/common/http';

const endpoint = 'http://localhost:9090/employees';

const headers: HttpHeaders = new HttpHeaders({
  'Content-Type': 'application/json',
  'Accept': 'application/json'
})

@Injectable()
export class ApiService {

  constructor(private http: HttpClient) { }

  getEmployees(): Observable<any> {
    return this.http.get(endpoint, { headers }).pipe(
      map(this.extractData));
  }

  getEmployeeDetails(id): Observable<any> {
    return this.http.get(endpoint + '/' + id).pipe(map(this.extractData));
  }

  private extractData(res: Response) {
    let body = res;
    return body || {};
  }
}