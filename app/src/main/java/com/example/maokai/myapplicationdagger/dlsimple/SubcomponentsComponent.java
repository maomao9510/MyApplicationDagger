package com.example.maokai.myapplicationdagger.dlsimple;

import com.example.maokai.myapplicationdagger.dlsimple.module.SubcomponentsModule;
import com.example.maokai.myapplicationdagger.presenter.SubcomponentsPresenter;
import dagger.Subcomponent;

/**
 * Created by maokai on 2017/10/26
 */
@Subcomponent(modules = SubcomponentsModule.class)
public interface SubcomponentsComponent {

  //  void inject(SubcomponentsPresenter subcomponentsPresenter);
  SubcomponentsPresenter getSubcomponentsPresenter();
}
