import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Student } from '../model/Student';
import { StudentService } from '../service/student.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
studentList = [];
student: Student;
search: FormGroup;
  constructor(private studentService: StudentService, private router: Router,) {
    this.search = new FormGroup({
      id: new FormControl()
    })
    studentService.findAll().subscribe(next => {
      console.log(next)
      this.studentList = next; 
    });
   }

  ngOnInit(): void {
  }

  detailStudent(student: any) {
    this.router.navigate(["/student",student.id]);
  }

  createStudent(event: any) {
    this.studentService.createStudent(event);
  }

  updateStudent(student: any) {
    this.router.navigate(["/student/update",student.id]);
  }

  searchStudent() {
    this.studentService.findById(Number(this.search.value.id)).subscribe(next => {
      this.studentList = [];
      this.studentList.push(next);
    })
  }

  deleteStudent(student: any) {
    console.log(student)
    this.studentService.deleteStudent(student.id).subscribe(next => {
      this.studentService.findAll().subscribe(next => {
        console.log(next)
        this.studentList = next; 
      });
    });
  }
}
