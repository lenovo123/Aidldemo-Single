package com.yuan.aidldemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {

    public MyService() {
    }

    private IBinder binder = new IMyAidlInterface.Stub() {

        @Override
        public String getName(String userid) throws RemoteException {
            return "name from process and server";
        }
    };

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }
}
