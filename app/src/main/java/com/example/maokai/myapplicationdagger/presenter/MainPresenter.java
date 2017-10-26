package com.example.maokai.myapplicationdagger.presenter;

import android.content.Context;
import android.widget.Toast;
import com.example.maokai.myapplicationdagger.dao.PersonDao;
import javax.inject.Inject;

/**
 * Created by maokai on 2017/10/20
 */

public class MainPresenter {
  private PersonDao personDao;
  // 用@Inject注解，相当于告诉Dagger需要实例化MainPresenter的时候，请调用这个构造方法，注意：PersonDao方法的构造函数也要加入@inject注解
  @Inject
  public MainPresenter(PersonDao personDao){
    this.personDao=personDao;
  }

  public void showToast(Context context){
    Toast.makeText(context,"我注入成功啦。。。",Toast.LENGTH_LONG).show();
  }
}
