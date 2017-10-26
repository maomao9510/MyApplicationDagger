package com.example.maokai.myapplicationdagger.dlsimple;

import com.example.maokai.myapplicationdagger.dlsimple.module.ModelInjectModule;
import com.example.maokai.myapplicationdagger.view.ModelInjectActivity;
import dagger.Component;

/**
 * Created by maokai on 2017/10/20
 */
@Component(modules = ModelInjectModule.class)
public interface ModelInjectComponent {
  void inject(ModelInjectActivity activity);
}
