package rikkeisoft.androidtraining.willer.di.module.auth;

import androidx.lifecycle.ViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import rikkeisoft.androidtraining.willer.di.ViewModelKey;
import rikkeisoft.androidtraining.willer.ui.auth.viewmodel.AuthViewModel;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);

}
