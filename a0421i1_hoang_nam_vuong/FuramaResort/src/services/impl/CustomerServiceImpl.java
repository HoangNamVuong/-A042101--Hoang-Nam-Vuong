package services.impl;

import javafx.scene.transform.Scale;
import models.Customer;
import models.Employee;
import services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService{
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter sex: ");
        String sex = scanner.nextLine();
        System.out.println("Enter idCard: ");
        String idCard = scanner.nextLine();
        System.out.println("Enter phone number: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter customer type: ");
        String customerType = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        customerList.add(new Customer(id,name,age,sex,idCard,phoneNumber,email,customerType,address));
    }

    @Override
    public void edit() {
        try {
            System.out.println("Enter id want edit: ");
            int id = Integer.parseInt(scanner.nextLine());
            Customer customer = findById(id);
            System.out.println("you want edit employee? " + customer.getName()
                    + "\n yes"
                    +"\n no");
            if (scanner.nextLine().equals("yes")) {
                System.out.println("choise");
                System.out.println("1. id ");
                System.out.println("2. name ");
                System.out.println("3. age ");
                System.out.println("4. sex ");
                System.out.println("5. idCard ");
                System.out.println("6. phone number ");
                System.out.println("7. email ");
                System.out.println("8. customer type ");
                System.out.println("9.address ");
                System.out.println("10.return");
                int choice = -1;

                while (choice != 0) {
                    try {
                        choice = Integer.parseInt(scanner.nextLine());
                    }catch (NumberFormatException e) {
                        System.out.println("Enter wrong, Enter again");
                    }
                    switch (choice) {
                        case 1 : {
                            System.out.println("Enter id: ");
                            customer.setId(Integer.parseInt(scanner.nextLine()));
                            display();
                            break;
                        }
                        case 2 : {
                            System.out.println("Enter name: ");
                            customer.setName(scanner.nextLine());
                            display();
                            break;
                        }
                        case 3 : {
                            System.out.println("Enter age: ");
                            customer.setAge(Integer.parseInt(scanner.nextLine()));
                            display();
                            break;
                        }
                        case 4 : {
                            System.out.println("Enter sex: ");
                            customer.setSex(scanner.nextLine());
                            display();
                            break;
                        }
                        case 5 : {
                            System.out.println("Enter idCard: ");
                            customer.setIdCard(scanner.nextLine());
                            display();
                            break;
                        }
                        case 6 : {
                            System.out.println("Enter phone number: ");
                            customer.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                            display();
                            break;
                        }
                        case 7 : {
                            System.out.println("Enter email: ");
                            customer.setEmail(scanner.nextLine());
                            display();
                            break;
                        }
                        case 8 : {
                            System.out.println("Enter customer type: ");
                            customer.setCustomerType(scanner.nextLine());
                            display();
                            break;
                        }
                        case 9 : {
                            System.out.println("Enter address: ");
                            customer.setAddress(scanner.nextLine());
                            display();
                            break;
                        }
                        case 10 : {
                            return;
                        }
                        default: {
                            System.out.println("Enter wrong");
                        }
                    }
                }
            }else {
                display();
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter wrong id, please enter again: ");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete() {
        try {
            System.out.println("Enter id want delete: ");
            int id = Integer.parseInt(scanner.nextLine());

            Customer customer = findById(id);

            System.out.println("you want delete employee? " + customer.getName()
                    + "\n yes"
                    +"\n no");
            if (scanner.nextLine().equals("yes")) {
                customerList.remove(customer);
            }else {
                display();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Customer findById(int id) throws NullPointerException {
        Customer customer = null;
        for (int i =0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                customer = customerList.get(i);
            }
        }
        if (customer == null) {
            throw new NullPointerException("not thing");
        }
        return customer;
    }
}
