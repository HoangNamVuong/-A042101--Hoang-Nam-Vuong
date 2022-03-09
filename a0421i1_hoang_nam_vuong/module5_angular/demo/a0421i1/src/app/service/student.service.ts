import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from '../model/Student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  public apiURL = "http://localhost:3000/students"
  studentList = [];

  constructor(private http: HttpClient) {
  
   }

   createStudent(value: Student): Observable<any> {
     return this.http.post<any>(this.apiURL,value)
   }

   findAll(): Observable<Student[]> {
     return this.http.get<Student[]>(this.apiURL);
   }

   findById(id: number): Observable<any>{
     return this.http.get<any>(this.apiURL+"/"+id);
   }

   updateStudent(value: Student): Observable<any> {
     return this.http.patch<any>(this.apiURL + "/" + value.id, value);
   }

   deleteStudent(id: number): Observable<any> {
     return this.http.delete<any>(this.apiURL + "/" + id);
   }

}
