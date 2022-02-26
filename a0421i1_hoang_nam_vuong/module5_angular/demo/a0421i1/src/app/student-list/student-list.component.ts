import { Component, OnInit } from '@angular/core';
import { Student } from '../model/Student';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
studentList = [];
student: Student;
  constructor() {
    this.studentList.push(new Student(2,"vuong","1212/12/12",8))
    this.studentList.push(new Student(3,"nam","1212/12/12",7))
    this.studentList.push(new Student(4,"hoang","1212/12/12",9))
   }

  ngOnInit(): void {
  }

  detailStudent(student: any) {
    this.student = student;
  }

  createStudent(event: any) {
    this.studentList.push(event);
  }
}
