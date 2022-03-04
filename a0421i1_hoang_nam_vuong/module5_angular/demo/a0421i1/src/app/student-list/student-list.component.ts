import { Component, OnInit } from '@angular/core';
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
  constructor(private studentService: StudentService, private router: Router) {
    studentService.findAll().subscribe(next => {
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
}
