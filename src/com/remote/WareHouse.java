package com.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by wenchai on 2015/7/23.
 */
public interface WareHouse extends Remote {
    double getPrice(int weight) throws RemoteException;
}
