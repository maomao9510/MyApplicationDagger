package com.example.maokai.myapplicationdagger.dlsimple.module;

import android.content.Context;
import com.example.maokai.myapplicationdagger.net.ServerApi;
import com.example.maokai.myapplicationdagger.net.ServerApiImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by maokai on 2017/10/24
 */
@Module
public class ApplicationModule {
  private final Context mAppContext;

  public ApplicationModule(Context context) {
    mAppContext = context.getApplicationContext();
  }

  @Provides
  Context provideAppContext() {
    return mAppContext;
  }
  @Singleton
  @Provides
  ServerApi provideServerApi(Context context) {
    return new ServerApiImpl(context);
  }
}
