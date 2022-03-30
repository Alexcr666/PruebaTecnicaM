package com.prestosoftware.test.di;

import androidx.annotation.NonNull;
import com.prestosoftware.test.TestApplication;
import com.prestosoftware.test.rappi.data.api.MovieService;
import com.prestosoftware.test.rappi.data.api.RequestInterceptor;
import com.prestosoftware.test.rappi.util.LiveDataCallAdapterFactory;
import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.io.File;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0004H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/prestosoftware/test/di/NetworkModule;", "", "()V", "provideHttpClient", "Lokhttp3/OkHttpClient;", "provideMovieService", "Lcom/prestosoftware/test/rappi/data/api/MovieService;", "retrofit", "Lretrofit2/Retrofit;", "provideRetrofit", "okHttpClient", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.prestosoftware.test.rappi.data.api.MovieService provideMovieService(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
}