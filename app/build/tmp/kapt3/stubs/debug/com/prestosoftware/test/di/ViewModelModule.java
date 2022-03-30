package com.prestosoftware.test.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.prestosoftware.test.rappi.ui.movie.detail.MovieDetailViewModel;
import com.prestosoftware.test.rappi.ui.main.MainActivityViewModel;
import com.prestosoftware.test.rappi.util.factory.AppViewModelFactory;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH!\u00a2\u0006\u0002\b\u000bJ\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH!\u00a2\u0006\u0002\b\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/prestosoftware/test/di/ViewModelModule;", "", "()V", "bindMainActivityViewModels", "Landroidx/lifecycle/ViewModel;", "mainActivityViewModel", "Lcom/prestosoftware/test/rappi/ui/main/MainActivityViewModel;", "bindMainActivityViewModels$app_debug", "bindMovieDetailViewModel", "movieDetailViewModel", "Lcom/prestosoftware/test/rappi/ui/movie/detail/MovieDetailViewModel;", "bindMovieDetailViewModel$app_debug", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/prestosoftware/test/rappi/util/factory/AppViewModelFactory;", "bindViewModelFactory$app_debug", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.prestosoftware.test.rappi.ui.main.MainActivityViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindMainActivityViewModels$app_debug(@org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.ui.main.MainActivityViewModel mainActivityViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.prestosoftware.test.rappi.ui.movie.detail.MovieDetailViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindMovieDetailViewModel$app_debug(@org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.ui.movie.detail.MovieDetailViewModel movieDetailViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory$app_debug(@org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.util.factory.AppViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}