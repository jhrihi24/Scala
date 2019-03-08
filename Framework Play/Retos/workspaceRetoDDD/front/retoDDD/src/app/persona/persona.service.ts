import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';

import { Persona } from './estructura-persona';
import { Respuesta } from './estructura-respuesta';

const httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
}

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

    private personaUrl = 'http://localhost:9000/';

    constructor(private http: HttpClient) { }

    getPersonas (): Observable<Respuesta> {        
        return this.http.get<Respuesta>(this.personaUrl+"obtenerTodos").pipe(
            catchError(this.handleError<Respuesta>('getPersonas'))
        );
    }

    addPersona (persona: Persona): Observable<Respuesta> {
        return this.http.post<Respuesta>(this.personaUrl+"insertarPersona", persona, httpOptions).pipe(
            catchError(this.handleError<Respuesta>('addPersona'))
        );
    }

    updatePersona (persona: Persona): Observable<Respuesta> {
        return this.http.put<Respuesta>(this.personaUrl+"modificarPersona", persona, httpOptions).pipe(
            catchError(this.handleError<Respuesta>('updatePersona'))
        );
    }
    
    deletePersona (persona: Persona): Observable<Respuesta> {
        return null;
        /*return this.http.delete<Respuesta>(this.personaUrl+"eliminarPersona/"+persona.id, persona, httpOptions).pipe(
            catchError(this.handleError<Respuesta>('deletePersona'))
        );*/
    }

    private handleError<T> (operation = 'operation', result?: T) {
      return (error: any): Observable<T> => {
        console.error(error); // log to console instead
        return of(result as T);
      };
   }
}