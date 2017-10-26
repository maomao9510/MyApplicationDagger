package com.example.maokai.myapplicationdagger.dlsimple;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import javax.inject.Scope;

/**
 * Created by maokai on 2017/10/26
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {

}
