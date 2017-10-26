package com.example.maokai.myapplicationdagger.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.example.maokai.myapplicationdagger.R;
import com.example.maokai.myapplicationdagger.dlsimple.ConstructorInjectComponent;
import com.example.maokai.myapplicationdagger.dlsimple.DaggerConstructorInjectComponent;
import com.example.maokai.myapplicationdagger.presenter.ConstructorInjectPresenter;
import javax.inject.Inject;

/**
 * Created by maokai on 2017/10/20
 */

public class ConstructorInjectActivity extends AppCompatActivity {

  @Inject
  public ConstructorInjectPresenter mConstructorInjectPresenter;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_constructor_inject);
    //方法1
    ConstructorInjectComponent constructorInjectComponent = DaggerConstructorInjectComponent.builder().build();
    String natData2 = constructorInjectComponent.getConstructorInjectPresenter().getNetData();
    //方法2
    DaggerConstructorInjectComponent.create().inject(this);
    String natData = mConstructorInjectPresenter.getNetData();

    Toast.makeText(this, natData2, Toast.LENGTH_LONG).show();
  }
}
