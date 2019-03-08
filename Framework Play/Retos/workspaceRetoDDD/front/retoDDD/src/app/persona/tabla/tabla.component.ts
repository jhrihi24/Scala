import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

import { Persona } from '../estructura-persona';
import { PersonaService } from '../persona.service'

@Component({
  selector: 'app-tabla',
  templateUrl: './tabla.component.html',
  styleUrls: ['./tabla.component.css']
})
export class TablaComponent implements OnInit {
    
    @Input() personasList: Persona[];    
    @Output() personaModificar= new EventEmitter();
    @Output() showMensajeSuccess = new EventEmitter();
    @Output() escribirMensajeSuccess = new EventEmitter();
    @Output() showMensajeDanger = new EventEmitter();
    @Output() escribirMensajeDanger = new EventEmitter();
    
    constructor(private personaService: PersonaService) { }

    ngOnInit() {
        this.getPersonas()
    }
    
    getPersonas(): void {
        this.personaService.getPersonas().subscribe(respuesta =>{
            if (respuesta.success) {
                this.personasList = respuesta.data;
            } else {
                this.personasList = [];
            }
        });
    }
    
    eliminarPersona(persona: Persona): void {
        this.mostrarMensajeDanger('', false);
        this.mostrarMensajeSuccess('', false);
        this.personaService.deletePersona(persona).subscribe( respuesta =>{
            if(respuesta.success){
                this.mostrarMensajeSuccess(respuesta.mensaje, true);
                this.quitarPersona(persona);
            }
        });
    }
    
    quitarPersona(persona: Persona): void {
        this.personasList= this.personasList.filter(h => h !== persona);
    }
    
    modificarPersona(persona: Persona): void{        
        this.personaModificar.emit(persona)
    }

    mostrarMensajeSuccess(mensaje: string, mostrar: boolean): void {
      this.escribirMensajeSuccess.emit(mensaje);
      this.showMensajeSuccess.emit(mostrar);
    }

    mostrarMensajeDanger(mensaje: string, mostrar: boolean): void {
      this.escribirMensajeDanger.emit(mensaje);
      this.showMensajeDanger.emit(mostrar);
    }

}
