package com.example.maokai.myapplicationdagger.dlsimple.module;

import com.example.maokai.myapplicationdagger.view.ifview.IFSubcomponentsView;
import dagger.Module;
import dagger.Provides;

/**
 * Created by maokai on 2017/10/26
 */
@Module
public class SubcomponentsModule {

  private IFSubcomponentsView ifSubcomponentsView;

  public SubcomponentsModule(IFSubcomponentsView ifSubcomponentsView) {
    this.ifSubcomponentsView = ifSubcomponentsView;
  }

  @Provides
  public IFSubcomponentsView provideSubcomponentsView() {
    return ifSubcomponentsView;
  }
}
