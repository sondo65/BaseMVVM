package rikkeisoft.androidtraining.willer.di.component;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import rikkeisoft.androidtraining.willer.di.module.ActivityBuildersModule;
import rikkeisoft.androidtraining.willer.di.module.AppModule;
import rikkeisoft.androidtraining.willer.di.module.ViewModelFactoryModule;
import rikkeisoft.androidtraining.willer.ui.base.BaseApplication;

@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class,
                AppModule.class,
                ViewModelFactoryModule.class,
        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
