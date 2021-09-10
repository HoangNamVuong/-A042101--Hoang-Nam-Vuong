package lesson12_java_collection_framework.exercise.use_arrayList_LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private  static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList;
    static {
        productList = new ArrayList<>();
        productList.add(new Product(1,"Car","50000$"));
        productList.add(new Product(2,"House","500000$"));
        productList.add(new Product(3,"Book","50$"));
        productList.add(new Product(4,"Dog","500$"));
    }

    public static void displayMenu() {
        int choice = 0;
        while (true) {
            System.out.println("Choose:" +
                    " \n 1. display " +
                    " \n 2. add " +
                    " \n 3. remove " +
                    " \n 4. edit " +
                    " \n 5. exit ");
            choice = scanner.nextInt();
            scanner.skip("\\R");
            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
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
