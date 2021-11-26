package services.impl;

import models.Employee;
import services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
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
        System.out.println("Enter level: ");
        String level = scanner.nextLine();
        System.out.println("Enter position: ");
        String position = scanner.nextLine();
        System.out.println("Enter salary: ");
        int salary = Integer.parseInt(scanner.nextLine());
        employeeList.add(new Employee(id,name,age,sex,idCard,phoneNumber,email,level,position,salary));
    }

    @Override
    public void edit() {
        try {
            System.out.println("Enter id want edit: ");
            int id = Integer.parseInt(scanner.nextLine());
            Employee employee = findById(id);
            System.out.println("you want edit employee? " + employee.getName()
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
                System.out.println("8. level ");
                System.out.println("9. position ");
                System.out.println("10.salary ");
                System.out.println("11.return");
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
                            employee.setId(Integer.parseInt(scanner.nextLine()));
                            display();
                            break;
                        }
                        case 2 : {
                            System.out.println("Enter name: ");
                            employee.setName(scanner.nextLine());
                            display();
                            break;
                        }
                        case 3 : {
                            System.out.println("Enter age: ");
                            employee.setAge(Integer.parseInt(scanner.nextLine()));
                            display();
                            break;
                        }
                        case 4 : {
                            System.out.println("Enter sex: ");
                            employee.setSex(scanner.nextLine());
                            display();
                            break;
                        }
                        case 5 : {
                            System.out.println("Enter idCard: ");
                            employee.setIdCard(scanner.nextLine());
                            display();
                            break;
                        }
                        case 6 : {
                            System.out.println("Enter phone number: ");
                            employee.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                            display();
                            break;
                        }
                        case 7 : {
                            System.out.println("Enter email: ");
                            employee.setEmail(scanner.nextLine());
                            display();
                            break;
                        }
                        case 8 : {
                            System.out.println("Enter level: ");
                            employee.setLevel(scanner.nextLine());
                            display();
                            break;
                        }
                        case 9 : {
                            System.out.println("Enter position: ");
                            employee.setPosition(scanner.nextLine());
                            display();
                            break;
                        }
                        case 10 : {
                            System.out.println("Enter salary: ");
                            employee.setId(Integer.parseInt(scanner.nextLine()));
                            display();
                            break;
                        }
                        case 11 : {
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

            Employee employee = findById(id);

            System.out.println("you want delete employee? " + employee.getName()
                    + "\n yes"
                    +"\n no");
            if (scanner.nextLine().equals("yes")) {
                employeeList.remove(employee);
            }else {
                display();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Employee findById(int id) throws NullPointerException {
        Employee employee = null;
        for (int i =0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employee = employeeList.get(i);
            }
        }
        if (employee == null) {
            throw new NullPointerException("not thing");
        }
        return employee;
    }
}
