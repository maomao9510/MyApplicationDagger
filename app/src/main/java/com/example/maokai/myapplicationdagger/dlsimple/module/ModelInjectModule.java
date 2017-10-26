package com.example.maokai.myapplicationdagger.dlsimple.module;

import com.example.maokai.myapplicationdagger.view.ifview.IFModelInjectView;
import dagger.Module;
import dagger.Provides;

/**
 * Created by maokai on 2017/10/20
 */
@Module
public class ModelInjectModule {

  private IFModelInjectView ifModelInjectView;

  public ModelInjectModule(IFModelInjectView ifModelInjectView) {
    this.ifModelInjectView = ifModelInjectView;
  }

  @Provides
  public IFModelInjectView provideModelInjectView() {
    return ifModelInjectView;
  }
}
