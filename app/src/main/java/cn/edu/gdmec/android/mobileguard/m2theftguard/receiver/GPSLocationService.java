package cn.edu.gdmec.android.mobileguard.m2theftguard.receiver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class GPSLocationService extends Service {
    public GPSLocationService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
