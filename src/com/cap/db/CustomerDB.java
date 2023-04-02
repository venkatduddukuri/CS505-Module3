package com.cap.db;

import com.cap.model.Customer;

public class CustomerDB {

    public static Customer getCustomer(int id){
        if(id == 1007){
         return new Customer("Customer1","Add1","city1","1234451");
        }else if(id == 1008){
            return new Customer("Customer2","Add2","city3","1234452");
        }else if(id == 1009){
            return new Customer("Customer3","Add3","city3","1234453");
        }
        return new Customer();
    }
}
