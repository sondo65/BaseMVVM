package rikkeisoft.androidtraining.willer.di.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import rikkeisoft.androidtraining.willer.di.module.auth.AuthModule;
import rikkeisoft.androidtraining.willer.di.module.auth.AuthViewModelsModule;
import rikkeisoft.androidtraining.willer.ui.auth.activity.AuthActivity;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();
}
