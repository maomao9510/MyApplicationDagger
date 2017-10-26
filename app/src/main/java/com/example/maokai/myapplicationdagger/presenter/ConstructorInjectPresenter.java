package com.example.maokai.myapplicationdagger.presenter;

import com.example.maokai.myapplicationdagger.dao.PersonDao;
import javax.inject.Inject;

/**
 * Created by maokai on 2017/10/20
 */

public class ConstructorInjectPresenter {

  private PersonDao mPersonDao;

  @Inject
  public ConstructorInjectPresenter(PersonDao personDao) {
    this.mPersonDao = personDao;
  }

  public String getNetData(){
    return mPersonDao.getNetData();
  }
}
