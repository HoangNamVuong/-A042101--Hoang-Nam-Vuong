import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Student } from '../model/Student';
import { StudentService } from '../service/student.service';

@Component({
  selector: 'app-student-info',
  templateUrl: './student-info.component.html',
  styleUrls: ['./student-info.component.css']
})
export class StudentInfoComponent implements OnInit {
  student: any;
  
  constructor(private activateRouter: ActivatedRoute, private studentService: StudentService) {
    this.activateRouter.paramMap.subscribe(next => {
      const id = next.get("id");
      studentService.findById(Number(id)).subscribe(next => {
        this.student = next;
      });
    },error => {

    },() => {

    })
   }

  ngOnInit(): void {
  }

}
