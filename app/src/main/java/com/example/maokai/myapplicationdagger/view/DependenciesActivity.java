package com.example.maokai.myapplicationdagger.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.example.maokai.myapplicationdagger.DemoApplication;
import com.example.maokai.myapplicationdagger.R;
import com.example.maokai.myapplicationdagger.dlsimple.DaggerDependenciesComponent;
import com.example.maokai.myapplicationdagger.dlsimple.DependenciesComponent;
import com.example.maokai.myapplicationdagger.dlsimple.module.DependenciesModule;
import com.example.maokai.myapplicationdagger.presenter.DependenciesPresenter;
import com.example.maokai.myapplicationdagger.view.ifview.IFDependenciesView;
import javax.inject.Inject;

/**
 * Created by maokai on 2017/10/20
 */

public class DependenciesActivity extends AppCompatActivity implements IFDependenciesView {

  @Inject
  public DependenciesPresenter dependenciesPresenter;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    DependenciesComponent dependenciesComponent=DaggerDependenciesComponent.builder()
        .dependenciesModule(new DependenciesModule(this))
        .applicationComponent(((DemoApplication)getApplication()).getAppComponent())
        .build();
    dependenciesComponent.inject(this);

    setContentView(R.layout.activity_dependencies);
    findViewById(R.id.bt_activity_dependencies).setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        String dataString=dependenciesPresenter.getDataFromNet();
        Toast.makeText(getApplicationContext(),dataString,Toast.LENGTH_LONG).show();
      }
    });
  }

}
