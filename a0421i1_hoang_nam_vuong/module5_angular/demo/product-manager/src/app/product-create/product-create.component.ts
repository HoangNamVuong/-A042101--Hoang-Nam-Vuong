import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ProductService } from '../service/product.service';

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {

  productForm: FormGroup;

  constructor(private productService: ProductService, private router: Router) { 
    this.productForm = new FormGroup({
      id: new FormControl("0",[Validators.required]),
      name: new FormControl("",[Validators.required, Validators.minLength(10)]),
      description: new FormControl("",[Validators.required]),
      price: new FormControl("",[Validators.required]),
    })
  }

  ngOnInit(): void {
  }

  createProduct() {
    this.productService.createProduct(this.productForm.value).subscribe();
    this.router.navigate([""]);
  }
}
