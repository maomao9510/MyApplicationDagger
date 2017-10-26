package com.example.maokai.myapplicationdagger.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.example.maokai.myapplicationdagger.R;
import com.example.maokai.myapplicationdagger.dlsimple.ApplicationComponent;
import com.example.maokai.myapplicationdagger.dlsimple.DaggerApplicationComponent;
import com.example.maokai.myapplicationdagger.dlsimple.SubcomponentsComponent;
import com.example.maokai.myapplicationdagger.dlsimple.module.ApplicationModule;
import com.example.maokai.myapplicationdagger.dlsimple.module.SubcomponentsModule;
import com.example.maokai.myapplicationdagger.presenter.SubcomponentsPresenter;
import com.example.maokai.myapplicationdagger.view.ifview.IFModelInjectView;
import com.example.maokai.myapplicationdagger.view.ifview.IFSubcomponentsView;

/**
 * Created by maokai on 2017/10/20
 */

public class SubcomponentsActivity extends AppCompatActivity implements IFSubcomponentsView {

  private SubcomponentsPresenter subcomponentsPresenter;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ApplicationComponent applicationComponent = DaggerApplicationComponent.builder()
        .applicationModule(new ApplicationModule(this))
        .build();
    SubcomponentsComponent subcomponentsComponent = applicationComponent.plus(new SubcomponentsModule(this));
    subcomponentsPresenter = subcomponentsComponent.getSubcomponentsPresenter();

    setContentView(R.layout.activity_subcomponents);
    findViewById(R.id.bt_activity_subcomponents).setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        subcomponentsPresenter.getDataFromNet();
      }
    });

  }

  @Override
  public void getNetDataOk(String netData) {
    Toast.makeText(getApplicationContext(), netData, Toast.LENGTH_LONG).show();
  }


}
