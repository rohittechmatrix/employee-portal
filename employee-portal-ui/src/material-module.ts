import {DragDropModule} from '@angular/cdk/drag-drop';
import {ScrollingModule} from '@angular/cdk/scrolling';
import {CdkTableModule} from '@angular/cdk/table';
import {CdkTreeModule} from '@angular/cdk/tree';
import {NgModule} from '@angular/core';
import {
  MatTableModule,
  MatSortModule,
  MatPaginatorModule
} from '@angular/material';

@NgModule({
  exports: [
    CdkTableModule,
    CdkTreeModule,
    DragDropModule,
    MatTableModule,
    MatSortModule,
    ScrollingModule,
    MatPaginatorModule
  ]
})
export class MaterialModule {}