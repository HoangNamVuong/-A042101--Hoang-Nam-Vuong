import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Car } from '../model/car';
import { CarService } from '../service/car.service';

@Component({
  selector: 'app-car-list',
  templateUrl: './car-list.component.html',
  styleUrls: ['./car-list.component.css']
})
export class CarListComponent implements OnInit {
  carList = [];
  car: Car;
  search: FormGroup;
  constructor(private carService: CarService, private router: Router) { 
    this.search = new FormGroup({
      id: new FormControl()
    })
    carService.findAll().subscribe(next => {
      this.carList = next; 
    });
  }

  ngOnInit(): void {
  }

  detailCar(product: any) {
    this.router.navigate(["/car",this.car.id]);
  }

  createCar(event: any) {
    this.carService.createCar(event);
  }

  updateCar(car: any) {
    this.router.navigate(["/car/update",car.id]);
  }

  searchCar() {
    this.carService.findById(Number(this.search.value.id)).subscribe(next => {
      this.carList = [];
      this.carList.push(next);
    })
  }

  deleteCar(car: any) {
    this.carService.deleteCar(car.id).subscribe(next => {
      this.carService.findAll().subscribe(next => {
        this.carList = next; 
      });
    });
  }
}
