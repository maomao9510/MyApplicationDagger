package com.example.maokai.myapplicationdagger;

import android.app.Application;
import com.example.maokai.myapplicationdagger.dlsimple.ApplicationComponent;
import com.example.maokai.myapplicationdagger.dlsimple.DaggerApplicationComponent;
import com.example.maokai.myapplicationdagger.dlsimple.module.ApplicationModule;

/**
 * Created by maokai on 2017/10/24
 */

public class DemoApplication extends Application{

  private ApplicationComponent applicationComponent;
  @Override
  public void onCreate() {
    super.onCreate();
    applicationComponent= DaggerApplicationComponent.builder()
        .applicationModule(new ApplicationModule(this))//这里不设置会报错：Caused by: java.lang.IllegalStateException: com.example.maokai.myapplicationdagger.dlsimple.module.ApplicationModule must be set
        .build();
  }
  public ApplicationComponent getAppComponent() {
    return applicationComponent;
  }
}
