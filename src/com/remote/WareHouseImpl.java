package com.remote;

import java.rmi.RemoteException;

/**
 * Created by wenchai on 2015/7/23.
 */
public class WareHouseImpl implements  WareHouse{

    public WareHouseImpl() throws RemoteException{
    }


    @Override
    public double getPrice(int weight) throws RemoteException{
        return weight*10;
    }
}
