import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { PersonaRoutingModule } from './persona-routing.module';
import { FormComponent } from './form/form.component';
import { TablaComponent } from './tabla/tabla.component';

@NgModule({
  declarations: [FormComponent, TablaComponent],
  imports: [
    CommonModule,
    PersonaRoutingModule,   
    FormsModule,    
    HttpClientModule,
    NgbModule.forRoot()
  ]
})
export class PersonaModule { }
