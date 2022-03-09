import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Product } from '../model/Product';
import { ProductService } from '../service/product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  productList = [];
  product: Product;
  search: FormGroup;
  constructor(private productService: ProductService, private router: Router) { 
    this.search = new FormGroup({
      id: new FormControl()
    })
    productService.findAll().subscribe(next => {
      console.log(next)
      this.productList = next; 
    });
  }

  ngOnInit(): void {
  }

  detailProduct(product: any) {
    this.router.navigate(["/product",product.id]);
  }

  createProduct(event: any) {
    this.productService.createProduct(event);
  }

  updateProduct(product: any) {
    this.router.navigate(["/product/update",product.id]);
  }

  searchProduct() {
    this.productService.findById(Number(this.search.value.id)).subscribe(next => {
      this.productList = [];
      this.productList.push(next);
    })
  }

  deleteProduct(product: any) {
    this.productService.deleteProduct(product.id).subscribe(next => {
      this.productService.findAll().subscribe(next => {
        this.productList = next; 
      });
    });
  }
}
