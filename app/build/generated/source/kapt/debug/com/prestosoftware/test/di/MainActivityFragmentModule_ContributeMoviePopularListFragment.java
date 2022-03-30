package com.prestosoftware.test.di;

import com.prestosoftware.test.rappi.ui.movie.popular.MoviePopularListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      MainActivityFragmentModule_ContributeMoviePopularListFragment
          .MoviePopularListFragmentSubcomponent.class
)
public abstract class MainActivityFragmentModule_ContributeMoviePopularListFragment {
  private MainActivityFragmentModule_ContributeMoviePopularListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MoviePopularListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MoviePopularListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MoviePopularListFragmentSubcomponent
      extends AndroidInjector<MoviePopularListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MoviePopularListFragment> {}
  }
}
