import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { CarService } from '../service/car.service';

@Component({
  selector: 'app-car-update',
  templateUrl: './car-update.component.html',
  styleUrls: ['./car-update.component.css']
})
export class CarUpdateComponent implements OnInit {

  carForm: FormGroup;
  car: any;

  constructor(private carService: CarService, private activateRouter: ActivatedRoute, private router: Router) { 
    this.activateRouter.paramMap.subscribe(next => {
      const id = next.get("id");
      carService.findById(Number(id)).subscribe(next => {
        this.car = next;

        this.carForm = new FormGroup({
          id: new FormControl(this.car.id, [Validators.required]),
          name: new FormControl(this.car.name, [Validators.required, Validators.minLength(10)]),
          type: new FormControl(this.car.type, [Validators.required]),
          start: new FormControl(this.car.start, [Validators.required]),
          end: new FormControl(this.car.end, [Validators.required]),
          phone: new FormControl(this.car.phone, [Validators.required]),
          email: new FormControl(this.car.email, [Validators.required]),
          time: new FormControl(this.car.time, [Validators.required])
        })
      });
    })
  }

  ngOnInit(): void {
  }

  updateCar() {
    this.carService.updateCar(this.carForm.value).subscribe();
    this.router.navigate([""]);// put in subscribe()
  }
}
