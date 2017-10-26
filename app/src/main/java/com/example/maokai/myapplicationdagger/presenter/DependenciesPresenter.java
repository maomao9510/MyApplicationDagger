package com.example.maokai.myapplicationdagger.presenter;

import com.example.maokai.myapplicationdagger.net.ServerApi;
import com.example.maokai.myapplicationdagger.view.ifview.IFDependenciesView;
import javax.inject.Inject;

/**
 * Created by maokai on 2017/10/24
 */

public class DependenciesPresenter {

  private IFDependenciesView ifDependenciesView;
  private ServerApi serverApi;
  @Inject
  public DependenciesPresenter(IFDependenciesView ifDependenciesView, ServerApi serverApi) {
    this.ifDependenciesView = ifDependenciesView;
    this.serverApi = serverApi;
  }

  public String getDataFromNet() {
    return serverApi.getData();
  }
}
