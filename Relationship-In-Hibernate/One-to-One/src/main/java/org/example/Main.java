package org.example;

import Config.FactoryConfiguration;
import Entity.Address;
import Entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Address address=new Address();
        address.setAid(1);
        address.setNo("238/6");
        address.setRoad("Thanthirimulla");
        address.setCity("Panadura");

        Customer customer=new Customer();
        customer.setId(1);
        customer.setName("Lihini");
        customer.setAddress(address);

        Session session=FactoryConfiguration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();
        session.save(address);
        session.save(customer);
        transaction.commit();
        session.close();
    }
}