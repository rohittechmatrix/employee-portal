import {Component, ViewChild} from '@angular/core';
import {animate, state, style, transition, trigger} from '@angular/animations';
import { MatSort, MatTableDataSource, MatPaginator } from '@angular/material';
import { ApiService } from './api.service';
import { Employee } from './employee';

@Component({
  selector: 'app-root',
  styleUrls: ['./app.component.css'],
  templateUrl: './app.component.html',
  animations: [
    trigger('detailExpand', [
      state('collapsed', style({height: '0px', minHeight: '0', display: 'none'})),
      state('expanded', style({height: '*'})),
      transition('expanded <=> collapsed', animate('225ms cubic-bezier(0.4, 0.0, 0.2, 1)')),
    ]),
  ],
})

export class AppComponent {
  constructor(private apiService: ApiService) {}
  dataSource = new MatTableDataSource();
  columnsToDisplay = ['id', 'name', 'salary', 'hireDate'];

  expandedElement: Employee;
  @ViewChild(MatSort) sort: MatSort;
  @ViewChild(MatPaginator) paginator: MatPaginator;
  ngOnInit() {
    this.apiService.getEmployees().subscribe(
      data => {
        this.dataSource.data = data;
      }
    );
    this.dataSource.sort = this.sort;
    this.dataSource.paginator = this.paginator;
    }
}