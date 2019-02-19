package com.example.musan.googlelocationlistenner.reminder_Folder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by musanna Bayazid on 17/06/18.
 */

public class AlarmReceiver extends BroadcastReceiver {

    String TAG = "AlarmReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub

        if (intent.getAction() != null && context != null) {
            if (intent.getAction().equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED)) {
                // Set the alarm here.
                Log.d(TAG, "onReceive: BOOT_COMPLETED");
                com.example.musan.googlelocationlistenner.reminder_Folder.LocalData localData = new com.example.musan.googlelocationlistenner.reminder_Folder.LocalData(context);
                NotificationScheduler.setReminder(context, com.example.musan.googlelocationlistenner.reminder_Folder.AlarmReceiver.class, localData.get_hour(), localData.get_min());
                return;
            }
        }

        Log.d(TAG, "onReceive: ");

        //Trigger the notification
        NotificationScheduler.showNotification(context, com.example.musan.googlelocationlistenner.reminder_Folder.MainActivity.class,
                "You Got New Massages ", "Tap  to View");

    }
}


