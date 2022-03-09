import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CarCreateComponent } from './car-create/car-create.component';
import { CarListComponent } from './car-list/car-list.component';
import { CarUpdateComponent } from './car-update/car-update.component';


const routes: Routes = [
  {path:"", component: CarListComponent},
  {path:"car/create", component: CarCreateComponent},
  {path:"car/update/:id",component: CarUpdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
