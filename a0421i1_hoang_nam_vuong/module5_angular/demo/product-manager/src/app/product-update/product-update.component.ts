import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductService } from '../service/product.service';

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {

  productForm: FormGroup;
  product: any;

  constructor(private productService: ProductService, private activateRouter: ActivatedRoute, private router: Router) {
    this.activateRouter.paramMap.subscribe(next => {
      const id = next.get("id");
      productService.findById(Number(id)).subscribe(next => {
        this.product = next;

        this.productForm = new FormGroup({
          id: new FormControl(this.product.id, [Validators.required]),
          name: new FormControl(this.product.name, [Validators.required, Validators.minLength(10)]),
          description: new FormControl(this.product.description),
          price: new FormControl(this.product.price)
        })
      });
    })
  }

  ngOnInit(): void {
  }

  updateProduct() {
    this.productService.updateProduct(this.productForm.value).subscribe();
    this.router.navigate([""]);
  }
}
