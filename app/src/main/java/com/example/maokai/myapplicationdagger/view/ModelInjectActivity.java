package com.example.maokai.myapplicationdagger.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.example.maokai.myapplicationdagger.R;
import com.example.maokai.myapplicationdagger.dlsimple.DaggerModelInjectComponent;
import com.example.maokai.myapplicationdagger.dlsimple.ModelInjectComponent;
import com.example.maokai.myapplicationdagger.dlsimple.module.ModelInjectModule;
import com.example.maokai.myapplicationdagger.presenter.ModelInjectPresenter;
import com.example.maokai.myapplicationdagger.view.ifview.IFModelInjectView;
import javax.inject.Inject;

/**
 * Created by maokai on 2017/10/20
 */

public class ModelInjectActivity extends AppCompatActivity implements IFModelInjectView {

  @Inject
  public ModelInjectPresenter modelInjectPresenter;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_model_inject);
    ModelInjectComponent modelInjectComponent = DaggerModelInjectComponent.builder()
        .modelInjectModule(new ModelInjectModule(this))
        .build();
    modelInjectComponent.inject(this);

    findViewById(R.id.bt_activity_model_inject).setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        modelInjectPresenter.getNetData();
      }
    });
  }

  @Override
  public void getNetDataOk(String netData) {
    Toast.makeText(getApplicationContext(), netData, Toast.LENGTH_LONG).show();
  }



}
