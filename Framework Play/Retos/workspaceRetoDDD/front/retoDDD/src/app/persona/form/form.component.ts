import { Component, OnInit } from '@angular/core';

import { Persona } from '../estructura-persona';
import { PersonaService } from '../persona.service'

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {
        
   persona: Persona = {
        id: 0,
        documento: '',
        nombres: '',
        apellidos: '',
        fecha_nacimiento: '',
        telefono: '',
   };
    
   personasIngresadas: Persona[];
    
   showSuccess: boolean = false;
   mensajeSuccess: string;
   showDanger: boolean = false;
   mensajeDanger: string;
    
  constructor(private personaService: PersonaService) { }

  ngOnInit() {
  }
    
  limpiarRegistroPersona(): void{
      this.persona.id = 0;
      this.persona.documento= '';
      this.persona.nombres= '';
      this.persona.apellidos= '';
      this.persona.fecha_nacimiento='';
      this.persona.telefono= '';
  }
    
  insertarPersona(): void{
      this.personaService.addPersona(this.persona).subscribe( respuesta =>{
        if(respuesta.success){
            this.mostrarMensajeSuccess(respuesta.mensaje, true);
            this.getPersonas();
            this.limpiarRegistroPersona();
        }else{
            this.mostrarMensajeDanger(respuesta.mensaje, true);
        }
     });
  }
  
  modificarPersona(): void{
      this.personaService.updatePersona(this.persona).subscribe(respuesta => {
        if(respuesta.success){
            this.mostrarMensajeSuccess(respuesta.mensaje, true);
            this.getPersonas();
            this.limpiarRegistroPersona();
        }else{
            this.mostrarMensajeDanger(respuesta.mensaje, true);
        }
      })
  }
  
  getPersonas(): void {
        this.personaService.getPersonas().subscribe(respuesta =>{
            if (respuesta.success) {
                this.personasIngresadas = respuesta.data;
            } else {
                this.personasIngresadas = [];
            }
        });
  }
  
  mostrarMensajeSuccess(mensaje: string, mostrar: boolean): void {
      this.mensajeSuccess = mensaje;
      this.showSuccess = mostrar;
  }

  mostrarMensajeDanger(mensaje: string, mostrar: boolean): void {
    this.mensajeDanger = mensaje;
    this.showDanger = mostrar;
  }

}
