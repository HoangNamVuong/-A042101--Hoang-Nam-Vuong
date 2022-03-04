import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormControl, FormGroup, NgForm, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Student } from '../model/Student';
import { StudentService } from '../service/student.service';

@Component({
  selector: 'app-student-create',
  templateUrl: './student-create.component.html',
  styleUrls: ['./student-create.component.css']
})
export class StudentCreateComponent implements OnInit {
  student: Student = new Student(6,"nam vuong","1212-12-12",9);

  studentForm: FormGroup;

  constructor(private studentService: StudentService, private router: Router) {
    this.studentForm = new FormGroup({
      id: new FormControl("0",[Validators.required]),
      name: new FormControl("name",[Validators.required, Validators.minLength(10)]),
      dayOfBirth: new FormControl(),
      point: new FormControl(),
    })
   }

  ngOnInit(): void {
  }

  createStudent() {
    this.studentService.createStudent(this.studentForm.value).subscribe();
    this.router.navigate([""]);
  }

}
