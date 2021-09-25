package controllers;

import services.CustomerService;
import services.impl.CustomerServiceImpl;
import services.impl.EmployeeServiceImpl;
import services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("Menu");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking  Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter your number want choice:");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
                    displayEmployeeManagement();
                    break;
                case 2:
                    displayCustomerManagement();
                    break;
                case 3:
                    displayFacilityManagement();
                    break;
                case 4:
                   displayBookingManagement();
                    break;
                case 5:
                   displayPromotionManagement();
                    break;
                case 6:
                    System.exit(6);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    public static void displayEmployeeManagement() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1 : {
                    employeeService.display();
                    break;
                }
                case 2 : {
                    employeeService.addNew();
                    break;
                }
                case 3 : {
                    employeeService.edit();
                    break;
                }
                case 4 : {
                    displayMainMenu();
                    break;
                }
                default: {
                    System.out.println("Wrong choice");
                }
            }
        }
    }

    public static void displayCustomerManagement() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customers");
            System.out.println("3. Edit customers");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1 : {
                    customerService.display();
                    break;
                }
                case 2 : {
                    customerService.addNew();
                    break;
                }
                case 3 : {
                    customerService.edit();
                    break;
                }
                case 4 : {
                    displayMainMenu();
                    break;
                }
                default: {
                    System.out.println("Wrong choice");
                }
            }
        }
    }

    public static void displayFacilityManagement() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1 : {
                    facilityService.display();
                    break;
                }
                case 2 : {
                    addNewFacility();
                    break;
                }
                case 3 : {
                    
                    break;
                }
                case 4 : {
                    displayMainMenu();
                    break;
                }
                default: {
                    System.out.println("Wrong choice");
                }
            }
        }
    }

    public static void addNewFacility() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
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

    public static void displayBookingManagement() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list booking");
            System.out.println("2. Add new booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1 :

            }
        }
    }

    public static void displayPromotionManagement() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1 :

            }
        }
    }
}
