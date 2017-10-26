package com.example.maokai.myapplicationdagger.dao;

import javax.inject.Inject;

/**
 * Created by maokai on 2017/10/20
 */

public class PersonDao {
  @Inject
  public PersonDao(){

  }
  public String getNetData(){
    return "我是从网络请求的";
  }
}
