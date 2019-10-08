package rikkeisoft.androidtraining.willer.data.remote.api;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rikkeisoft.androidtraining.willer.data.remote.model.User;

public interface AuthApi {

    @GET("users/{id}")
    Flowable<User> getUser(
            @Path("id") int id
    );
}
