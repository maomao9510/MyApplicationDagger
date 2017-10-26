package com.example.maokai.myapplicationdagger.dlsimple.module;

import com.example.maokai.myapplicationdagger.net.ServerApi;
import com.example.maokai.myapplicationdagger.presenter.DependenciesPresenter;
import com.example.maokai.myapplicationdagger.view.ifview.IFDependenciesView;
import dagger.Module;
import dagger.Provides;

/**
 * Created by maokai on 2017/10/24
 */
@Module
public class DependenciesModule {
  private IFDependenciesView ifDependenciesView;

  public DependenciesModule(IFDependenciesView ifDependenciesView) {
    this.ifDependenciesView = ifDependenciesView;
  }
  @Provides
  public IFDependenciesView provideIFDependenciesView(){
    return ifDependenciesView;
  }
  @Provides
  public DependenciesPresenter provideDependenciesPresenter(ServerApi serverApi){
    return new DependenciesPresenter(ifDependenciesView, serverApi);
  }

}
