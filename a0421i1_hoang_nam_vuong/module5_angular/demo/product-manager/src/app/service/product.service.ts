import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../model/Product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  public apiURL = "http://localhost:3000/products"
  productList = [];

  constructor(private http: HttpClient) {

  }

  createProduct(value: Product): Observable<any> {
    return this.http.post<any>(this.apiURL, value);
  }

  findAll(): Observable<Product[]> {
    return this.http.get<Product[]>(this.apiURL);
  }

  findById(id: number): Observable<any> {
    return this.http.get<any>(this.apiURL + "/" + id);
  }

  updateProduct(value: Product): Observable<any> {
    return this.http.patch<any>(this.apiURL + "/" + value.id, value);
  }

  deleteProduct(id: number): Observable<any> {
    return this.http.delete<any>(this.apiURL + "/" + id);
  }

}

