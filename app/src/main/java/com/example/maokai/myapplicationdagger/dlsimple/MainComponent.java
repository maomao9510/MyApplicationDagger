package com.example.maokai.myapplicationdagger.dlsimple;

import com.example.maokai.myapplicationdagger.presenter.MainPresenter;
import dagger.Component;

/**
 * Created by maokai on 2017/10/20
 *
 * Component必须是interface；
 * 里面的方法：
 * 1。返回值为空，有一个参数：查找参数中被@Inject注解的成员变量
 * ，并尝试获取相应的实例（通过Module的provide方法或@Inject注解的构造方法new出新的实例）
 * ，把实例赋给参数的成员变量
 * 2。返回值非空，参数为空：获取相应实例并返回
 * 3。返回值是Component，参数是Moduld，通过该方法可以创建SubComponent实例
 */

@Component
public interface MainComponent {
   //这个方法就是去注解的目标类中查询需要注解的属性，然后调用属性的构造方法去创建对象
//   void inject(MainActivity activity);

   //这个方法返回的是MainPresenter，当调用这个方法时dagger会去查找MainPresenter,创建对象完成注入
   MainPresenter getMainPresenter();
}
