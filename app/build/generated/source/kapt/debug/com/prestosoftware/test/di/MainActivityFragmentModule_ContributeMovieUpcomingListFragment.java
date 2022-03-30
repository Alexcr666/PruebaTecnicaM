package com.prestosoftware.test.di;

import com.prestosoftware.test.rappi.ui.movie.upcoming.MovieUpcomingListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      MainActivityFragmentModule_ContributeMovieUpcomingListFragment
          .MovieUpcomingListFragmentSubcomponent.class
)
public abstract class MainActivityFragmentModule_ContributeMovieUpcomingListFragment {
  private MainActivityFragmentModule_ContributeMovieUpcomingListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MovieUpcomingListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MovieUpcomingListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MovieUpcomingListFragmentSubcomponent
      extends AndroidInjector<MovieUpcomingListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MovieUpcomingListFragment> {}
  }
}
