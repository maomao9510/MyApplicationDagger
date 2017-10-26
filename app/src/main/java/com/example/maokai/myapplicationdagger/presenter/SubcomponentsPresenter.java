package com.example.maokai.myapplicationdagger.presenter;

import com.example.maokai.myapplicationdagger.net.ServerApi;
import com.example.maokai.myapplicationdagger.view.ifview.IFSubcomponentsView;
import javax.inject.Inject;

/**
 * Created by maokai on 2017/10/26
 */

public class SubcomponentsPresenter {

  private IFSubcomponentsView ifSubcomponentsView;
  private ServerApi serverApi;

  @Inject
  public SubcomponentsPresenter(IFSubcomponentsView subcomponentsView, ServerApi serverApi) {
    this.ifSubcomponentsView = subcomponentsView;
    this.serverApi = serverApi;
  }

  public void getDataFromNet() {
    String data = serverApi.getSubcomponentsData();
    ifSubcomponentsView.getNetDataOk(data);
  }
}
