import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormGroup, NgForm } from '@angular/forms';
import { Student } from '../model/Student';

@Component({
  selector: 'app-student-create',
  templateUrl: './student-create.component.html',
  styleUrls: ['./student-create.component.css']
})
export class StudentCreateComponent implements OnInit {
  student: Student = new Student(6,"nam vuong","1212-12-12",9);

  @Output() submitCreate = new EventEmitter();

  studentForm: FormGroup;
  constructor() {
    this.studentForm = new FormGroup()
   }

  ngOnInit(): void {
  }

  createStudent(registerForm: NgForm) {
    console.log(this.student)
    this.submitCreate.emit(registerForm.value);
  }

}
