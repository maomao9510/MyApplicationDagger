package com.example.maokai.myapplicationdagger.dlsimple;

import com.example.maokai.myapplicationdagger.dlsimple.module.ApplicationModule;
import com.example.maokai.myapplicationdagger.dlsimple.module.SubcomponentsModule;
import com.example.maokai.myapplicationdagger.net.ServerApi;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by maokai on 2017/10/24
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

  //  void inject(DemoApplication demoApplication);
  ServerApi getServerApi();

  //下面是测试Subcomponents的功能
  SubcomponentsComponent plus(SubcomponentsModule subcomponentsModule);
}
