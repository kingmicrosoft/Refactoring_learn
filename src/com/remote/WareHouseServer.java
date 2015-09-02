package com.remote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;

/**
 * Created by wenchai on 2015/7/23.
 */
public class WareHouseServer {
    public WareHouseServer() {
    }


    public static void main(String[] args) throws RemoteException, NamingException {
    WareHouse house=new WareHouseImpl();
        Context namingContext=new InitialContext();
        namingContext.bind("rmi:remote ",house);
        System.out.print("wating for invocation of client");
    }


}
