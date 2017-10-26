package com.example.maokai.myapplicationdagger.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.example.maokai.myapplicationdagger.R;
import com.example.maokai.myapplicationdagger.dlsimple.DaggerMainComponent;
import com.example.maokai.myapplicationdagger.dlsimple.MainComponent;
import com.example.maokai.myapplicationdagger.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity {

  // 注意，不能被private修饰
  //  @Inject
  //  public MainPresenter mMainPresenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    findViewById(R.id.bt_constructor).setOnClickListener(new MyOnClickListener());
    findViewById(R.id.bt_model).setOnClickListener(new MyOnClickListener());
    findViewById(R.id.bt_dependencies).setOnClickListener(new MyOnClickListener());
    findViewById(R.id.bt_subcomponents).setOnClickListener(new MyOnClickListener());

    //    MainComponent mainComponent = DaggerMainComponent.builder().build();
    //    MainPresenter mainPresenter = mainComponent.getMainPresenter();
    //    mainPresenter.showToast(this);

    //    DaggerMainComponent.create().inject(this);
    //    mMainPresenter.showToast(this);
  }

  private class MyOnClickListener implements OnClickListener {

    @Override
    public void onClick(View view) {
      Intent intent = null;
      switch (view.getId()) {
        case R.id.bt_constructor:
          intent = new Intent(getApplicationContext(), ConstructorInjectActivity.class);
          break;
        case R.id.bt_model:
          intent = new Intent(getApplicationContext(), ModelInjectActivity.class);
          break;
        case R.id.bt_dependencies:
          intent = new Intent(getApplicationContext(), DependenciesActivity.class);
          break;
        case R.id.bt_subcomponents:
          intent = new Intent(getApplicationContext(), SubcomponentsActivity.class);
          break;
      }
      if (intent != null) {
        startActivity(intent);
      }
    }
  }
}
