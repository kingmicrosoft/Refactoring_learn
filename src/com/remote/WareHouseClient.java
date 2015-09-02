package com.remote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.util.Enumeration;

/**
 * Created by wenchai on 2015/7/23.
 */
public class WareHouseClient {
    public WareHouseClient() {
    }

    public static void main(String[] args) throws NamingException, RemoteException {
        Context namingContext=new InitialContext();
        Enumeration<NameClassPair> e=namingContext.list("rmi://localhost/");
        while (e.hasMoreElements()){

            System.out.print(e.nextElement().getName());
        }
        String url="rmi://localhost/central_warehouse";
        WareHouse centralHourse= (WareHouse) namingContext.lookup(url);
        double price=centralHourse.getPrice(100);
        System.out.print(price);

    }



}
