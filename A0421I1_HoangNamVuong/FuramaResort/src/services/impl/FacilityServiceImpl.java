package services.impl;

import models.*;
import services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility,Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service " + element.getKey() + " number of times rented " + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("Enter facility id: ");
        int facilityId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter service name: ");
        String serviceName = scanner.nextLine();
        System.out.println("Enter use area: ");
        int useArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rental price: ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter maximum people: ");
        int maximumNumberPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rental type: ");
        String rentalType = scanner.nextLine();
        System.out.println("Enter standard villa: ");
        String standardVilla = scanner.nextLine();
        System.out.println("Enter pool area: ");
        int poolArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number of floors: ");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(facilityId,serviceName,useArea,rentalPrice,maximumNumberPeople,rentalType,standardVilla,poolArea,numberOfFloors);
        facilityIntegerMap.put(villa,0);
    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter facility id: ");
        int facilityId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter service name: ");
        String serviceName = scanner.nextLine();
        System.out.println("Enter use area: ");
        int useArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rental price: ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter maximum people: ");
        int maximumNumberPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rental type: ");
        String rentalType = scanner.nextLine();
        System.out.println("Enter standard room: ");
        String standardRoom = scanner.nextLine();
        System.out.println("Enter number of floors: ");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        House house = new House(facilityId,serviceName,useArea,rentalPrice,maximumNumberPeople,rentalType,standardRoom,numberOfFloors);
        facilityIntegerMap.put(house,0);
    }

    @Override
    public void addNewRoom() {
        System.out.println("Enter facility id: ");
        int facilityId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter service name: ");
        String serviceName = scanner.nextLine();
        System.out.println("Enter use area: ");
        int useArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rental price: ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter maximum people: ");
        int maximumNumberPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rental type: ");
        String rentalType = scanner.nextLine();
        System.out.println("Enter free service included: ");
        String freeServiceIncluded = scanner.nextLine();
        Room room = new Room(facilityId,serviceName,useArea,rentalPrice,maximumNumberPeople,rentalType,freeServiceIncluded);
        facilityIntegerMap.put(room,0);
    }
}
