import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { StudentService } from '../service/student.service';

@Component({
  selector: 'app-student-update',
  templateUrl: './student-update.component.html',
  styleUrls: ['./student-update.component.css']
})
export class StudentUpdateComponent implements OnInit {
  studentForm: FormGroup;

  student: any;
  constructor(private studentService: StudentService,private activateRouter: ActivatedRoute, private router: Router) {
    this.activateRouter.paramMap.subscribe(next => {
      const id = next.get("id");
      studentService.findById(Number(id)).subscribe(next => {
        this.student = next;

        this.studentForm = new FormGroup({
          id: new FormControl(this.student.id,[Validators.required]),
          name: new FormControl(this.student.name,[Validators.required, Validators.minLength(10)]),
          dayOfBirth: new FormControl(this.student.dayOfBirth),
          point: new FormControl(this.student.point),
        })
      });
    })
   }

  ngOnInit(): void {
  }

  updateStudent() {
    this.studentService.updateStudent(this.studentForm.value).subscribe();
    this.router.navigate([""]);
  }
}
