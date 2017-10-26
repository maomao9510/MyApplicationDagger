package com.example.maokai.myapplicationdagger.dlsimple;

import com.example.maokai.myapplicationdagger.presenter.ConstructorInjectPresenter;
import com.example.maokai.myapplicationdagger.view.ConstructorInjectActivity;
import dagger.Component;

/**
 * Created by maokai on 2017/10/20
 */
@Component
public interface ConstructorInjectComponent {
  void inject(ConstructorInjectActivity activity);
  ConstructorInjectPresenter getConstructorInjectPresenter();
}
