package io.github.jhcpokemon.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public static final String TAG = "MY_SERVICE";

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.i(TAG, "On Bind");
        return new Binder();
    }

    @Override
    public void onCreate() {
        Log.i(TAG, "On Create");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "On Destroy");
        super.onDestroy();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.i(TAG, "Un Bind");
        return super.onUnbind(intent);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG,"On Start Command");
        return super.onStartCommand(intent, flags, startId);
    }
}
