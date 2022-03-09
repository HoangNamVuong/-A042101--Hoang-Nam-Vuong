import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CarService } from '../service/car.service';

@Component({
  selector: 'app-car-create',
  templateUrl: './car-create.component.html',
  styleUrls: ['./car-create.component.css']
})
export class CarCreateComponent implements OnInit {

  carForm: FormGroup;

  constructor(private carService: CarService, private router: Router) { 
    this.carForm = new FormGroup({
      id: new FormControl("0",[Validators.required]),
      name: new FormControl("",[Validators.required, Validators.minLength(10)]),
      type: new FormControl("",[Validators.required]),
      start: new FormControl("",[Validators.required]),
      end: new FormControl("",[Validators.required]),
      phone: new FormControl("",[Validators.required]),
      email: new FormControl("",[Validators.required]),
      time: new FormControl("",[Validators.required])
    })
  }

  ngOnInit(): void {
  }

  createCar() {
    this.carService.createCar(this.carForm.value).subscribe();
    this.router.navigate([""]);
  }
}
