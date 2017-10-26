package com.example.maokai.myapplicationdagger.dlsimple;

import com.example.maokai.myapplicationdagger.dlsimple.module.DependenciesModule;
import com.example.maokai.myapplicationdagger.view.DependenciesActivity;
import dagger.Component;

/**
 * Created by maokai on 2017/10/24
 *
 * 通过dependencies，在被依赖的Component暴露的对象，在子Component中是可见的。这个是什么意思呢？意思有两个：
 * 被依赖Component接口暴露的对象，可以添加到依赖者的依赖图中 Component接口没有暴露的对象，依赖者是不可见的 对于第一点应该比较好理解，就像这个栗子，MainPresenterComponent生成MainPresenter需要ServerApi，而ApplicationComponent中有接口暴露了ServerApi，所以MainPresenterComponent可以获得ServerApi
 * 对于第二点，假设MainPresenter还需要传入一个Context对象，我们注意到，ApplicationModule是可以提供Context的，那MainPresenterComponent能不能通过ApplicationComponent获取Context实例？
 * 答案是不行的，因为ApplicationComponent没有暴露这个对象。想要获取Context，除非ApplicationComponent中再添加一个getContext的方法。
 */
@ActivityScope
@Component(dependencies = {ApplicationComponent.class}
    , modules = {DependenciesModule.class})
public interface DependenciesComponent {

  void inject(DependenciesActivity activity);
}
