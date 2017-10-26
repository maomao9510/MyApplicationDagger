package com.example.maokai.myapplicationdagger.presenter;

import com.example.maokai.myapplicationdagger.dao.PersonDao;
import com.example.maokai.myapplicationdagger.view.ifview.IFModelInjectView;
import javax.inject.Inject;

/**
 * Created by maokai on 2017/10/20
 */

public class ModelInjectPresenter {

  private IFModelInjectView ifModelInjectView;
  private PersonDao personDao;

  @Inject
  public ModelInjectPresenter(IFModelInjectView ifModelInjectView, PersonDao personDao) {
    this.ifModelInjectView = ifModelInjectView;
    this.personDao = personDao;
  }

  public void getNetData(){
    String netData=personDao.getNetData();
    ifModelInjectView.getNetDataOk(netData);
  }
}
