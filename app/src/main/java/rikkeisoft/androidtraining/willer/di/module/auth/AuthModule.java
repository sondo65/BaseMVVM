package rikkeisoft.androidtraining.willer.di.module.auth;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import rikkeisoft.androidtraining.willer.data.remote.api.AuthApi;

@Module
public abstract class AuthModule {

    @Provides
    static AuthApi provideSessionApi(Retrofit retrofit){
        return retrofit.create(AuthApi.class);
    }

}