package com.prestosoftware.test.di;

import com.prestosoftware.test.rappi.ui.movie.upcoming.MovieUpcomingListFragment;
import com.prestosoftware.test.rappi.ui.movie.popular.MoviePopularListFragment;
import com.prestosoftware.test.rappi.ui.movie.topRated.MovieTopListFragment;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/prestosoftware/test/di/MainActivityFragmentModule;", "", "()V", "contributeMoviePopularListFragment", "Lcom/prestosoftware/test/rappi/ui/movie/popular/MoviePopularListFragment;", "contributeMovieTopListFragment", "Lcom/prestosoftware/test/rappi/ui/movie/topRated/MovieTopListFragment;", "contributeMovieUpcomingListFragment", "Lcom/prestosoftware/test/rappi/ui/movie/upcoming/MovieUpcomingListFragment;", "app_debug"})
@dagger.Module()
public abstract class MainActivityFragmentModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.prestosoftware.test.rappi.ui.movie.popular.MoviePopularListFragment contributeMoviePopularListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.prestosoftware.test.rappi.ui.movie.topRated.MovieTopListFragment contributeMovieTopListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.prestosoftware.test.rappi.ui.movie.upcoming.MovieUpcomingListFragment contributeMovieUpcomingListFragment();
    
    public MainActivityFragmentModule() {
        super();
    }
}