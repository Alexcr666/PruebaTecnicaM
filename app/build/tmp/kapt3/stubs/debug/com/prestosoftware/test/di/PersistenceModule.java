package com.prestosoftware.test.di;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.room.Room;
import com.prestosoftware.test.TestApplication;
import com.prestosoftware.test.rappi.data.db.MovieDao;
import com.prestosoftware.test.rappi.data.db.TestDb;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/prestosoftware/test/di/PersistenceModule;", "", "()V", "provideDatabase", "Lcom/prestosoftware/test/rappi/data/db/TestDb;", "application", "Landroid/app/Application;", "provideMovieDao", "Lcom/prestosoftware/test/rappi/data/db/MovieDao;", "database", "app_debug"})
@dagger.Module()
public final class PersistenceModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.prestosoftware.test.rappi.data.db.TestDb provideDatabase(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.prestosoftware.test.rappi.data.db.MovieDao provideMovieDao(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    com.prestosoftware.test.rappi.data.db.TestDb database) {
        return null;
    }
    
    public PersistenceModule() {
        super();
    }
}