package com.cachecats.meituan.di.components;

import android.app.Application;
import android.content.Context;

import com.cachecats.meituan.MyApplication;
import com.cachecats.meituan.app.home.HomeFragmentContract;
import com.cachecats.meituan.di.modules.ActivityModule;
import com.cachecats.meituan.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by solo on 2018/1/10.
 */

@Singleton
@Component(modules = {ApplicationModule.class, ActivityModule.class})
public interface ApplicationComponent {

    void inject(MyApplication application);

    Application application();

    Context context();

    HomeFragmentContract.Presenter homeFragmentPresenter();

    HomeFragmentContract.View homeFragmentContract();


}