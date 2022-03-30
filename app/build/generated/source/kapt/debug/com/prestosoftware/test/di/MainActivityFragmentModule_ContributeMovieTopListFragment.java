package com.prestosoftware.test.di;

import com.prestosoftware.test.rappi.ui.movie.topRated.MovieTopListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      MainActivityFragmentModule_ContributeMovieTopListFragment.MovieTopListFragmentSubcomponent
          .class
)
public abstract class MainActivityFragmentModule_ContributeMovieTopListFragment {
  private MainActivityFragmentModule_ContributeMovieTopListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MovieTopListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MovieTopListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MovieTopListFragmentSubcomponent extends AndroidInjector<MovieTopListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MovieTopListFragment> {}
  }
}
