package rikkeisoft.androidtraining.willer.ui.base;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import rikkeisoft.androidtraining.willer.di.component.DaggerAppComponent;

public class BaseApplication extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
