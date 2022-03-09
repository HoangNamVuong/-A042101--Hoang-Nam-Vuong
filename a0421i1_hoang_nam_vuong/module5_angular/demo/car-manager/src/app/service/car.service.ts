import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Car } from '../model/car';

@Injectable({
  providedIn: 'root'
})
export class CarService {
  public apiURL = "http://localhost:3000/cars"
  carList = [];

  constructor(private http: HttpClient) { }

  createCar(value: Car): Observable<any> {
    return this.http.post<any>(this.apiURL,value)
  }

  findAll(): Observable<Car[]> {
    return this.http.get<Car[]>(this.apiURL);
  }

  findById(id: number): Observable<any>{
    return this.http.get<any>(this.apiURL+"/"+id);
  }

  updateCar(value: Car): Observable<any> {
    return this.http.patch<any>(this.apiURL + "/" + value.id, value);
  }

  deleteCar(id: number): Observable<any> {
    return this.http.delete<any>(this.apiURL + "/" + id);
  }
}
