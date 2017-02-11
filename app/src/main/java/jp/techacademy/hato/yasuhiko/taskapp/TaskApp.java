package jp.techacademy.hato.yasuhiko.taskapp;

import android.app.Application;
import android.util.Log;

import io.realm.Realm;

/**
 * Created by hatoy37 on 2/8/17.
 */

public class TaskApp extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        Realm.init(this);

        Log.d("TaskApp", "onCreate");
    }
}
