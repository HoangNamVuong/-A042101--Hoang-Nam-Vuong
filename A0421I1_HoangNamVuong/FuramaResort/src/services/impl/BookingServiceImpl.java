package services.impl;

import models.Booking;
import models.Customer;
import models.Facility;
import services.BookingService;
import utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    static List<Customer> customerList = new ArrayList<>();

    static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        customerList.add(new Customer(1,"vuong",26,"nam","2252",0234452,"hnv@gmail.com","vip","danang"));
        customerList.add(new Customer(2,"namvuong",25,"nam","42042",024,"ahs@gmail.com","normal","danang1"));
    }

    @Override
    public void display() {

    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

}
