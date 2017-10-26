package com.example.maokai.myapplicationdagger.net;

import android.content.Context;

/**
 * Created by maokai on 2017/10/24
 */

public class ServerApiImpl implements ServerApi {
  public ServerApiImpl(Context context){

  }

  @Override
  public String getData() {
    return "dependencies成功了哈";
  }

  @Override
  public String getSubcomponentsData() {
    return "Subcomponents成功了哈";
  }
}
