package examination;

import lesson12_java_collection_framework.exercise.use_arrayList_LinkedList.Product;
import lesson12_java_collection_framework.exercise.use_arrayList_LinkedList.ProductNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        displayMenu();
    }
    private  static Scanner scanner = new Scanner(System.in);
    private static List<ImportProduct> importProducts = new ArrayList<>();
    private static List<ExportProduct> exportProducts = new ArrayList<>();

    public static void displayMenu() {
        boolean check = true;
        while (check) {
            System.out.println("Menu");
            System.out.println("1. Add new");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Find");
            System.out.println("5. Exit");
            System.out.println("Enter your number want choice:");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    deleteProduct();
                    break;
                case 3:
                    displayProducts();
                    break;
                case 4:

                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter Wrong.");
            }
        }
    }

    public static void displayProducts() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public static void addProduct() {
        int id = -1;
        if (productList.isEmpty()) {
            id = 1;
        }else {
            id = productList.get(productList.size()-1).getId() + 1;
        }
//        scanner.skip("\\R");
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter price");
        String price = scanner.nextLine();
        productList.add(new Product(id,name,price));
    }

    public static void addImportProduct() {
        int id = -1;
        if (productList.isEmpty()) {
            id = 1;
        }else {
            id = productList.get(productList.size()-1).getId() + 1;
        }
        System.out.println("Enter id: ");
        int idProduct = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter idCard: ");
        int idCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price");
        String price = scanner.nextLine();
        System.out.println("Enter quanity: ");
        int quanity = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter producer");
        String producer = scanner.nextLine();
        System.out.println("Enter importPrice");
        String importPrice = scanner.nextLine();
        System.out.println("Enter importProvince");
        String importProvince = scanner.nextLine();
        System.out.println("Enter importTax");
        String importTax = scanner.nextLine();
        ImportProduct importProduct = new ImportProduct(id,idCard,name,price,quanity,producer,importPrice,importProvince,importTax);
        productList.add(importProduct);
    }

    public static void addExportProduct() {
        int id = -1;
        if (productList.isEmpty()) {
            id = 1;
        }else {
            id = productList.get(productList.size()-1).getId() + 1;
        }
//        scanner.skip("\\R");
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter price");
        String price = scanner.nextLine();
        productList.add(new Product(id,name,price));
    }

    public static void addNewProduct() {
        examination.Product facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Add new villa");
            System.out.println("2. Add new house");
            System.out.println("3. Add new room");
            System.out.println("4. Return to menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1 : {
                    facilityService.addNewVilla();
                    displayFacilityManagement();
                    break;
                }
                case 2 : {
                    facilityService.addNewHouse();
                    displayFacilityManagement();
                    break;
                }
                case 3 : {
                    facilityService.addNewRoom();
                    displayFacilityManagement();
                    break;
                }
                case 4 : {
                    displayFacilityManagement();
                }
                default: {
                    System.out.println("Wrong choice");
                }
            }
        }
    }

    public static void deleteProduct() {
        try {
            System.out.println("enter id want delete: ");
            int id = Integer.parseInt(scanner.nextLine());

            Product product = findById(id);

            System.out.println("you want delete product? " + product.getNameProduct()
                    + "\n yes"
                    +"\n no");
            if (scanner.nextLine().equals("yes")) {
                productList.remove(product);
            }else {
                displayMenu();
            }
        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Product findById(int id) throws ProductNotFoundException {
        Product product = null;
        for (int i =0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                product = productList.get(i);
            }
        }
        if (product == null) {
            throw new ProductNotFoundException("not thing");
        }
        return product;
    }
}
