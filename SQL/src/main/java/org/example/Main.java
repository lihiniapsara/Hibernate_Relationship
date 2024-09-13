package org.example;

import Config.FactoryConfiguration;
import Entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        NativeQuery query=session.createNativeQuery("select * from customer");
        //insert,update,delete,SearchBy
        query.addEntity(Customer.class);
        List<Customer> customerList=query.list();
        for (Customer customer:customerList){
            System.out.println(customer);
        }



        transaction.commit();
        session.close();
    }
}