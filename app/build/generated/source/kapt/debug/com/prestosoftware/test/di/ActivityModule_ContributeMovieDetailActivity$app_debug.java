package com.prestosoftware.test.di;

import com.prestosoftware.test.rappi.ui.movie.detail.MovieDetailActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModule_ContributeMovieDetailActivity$app_debug.MovieDetailActivitySubcomponent.class
)
public abstract class ActivityModule_ContributeMovieDetailActivity$app_debug {
  private ActivityModule_ContributeMovieDetailActivity$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(MovieDetailActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MovieDetailActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface MovieDetailActivitySubcomponent extends AndroidInjector<MovieDetailActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MovieDetailActivity> {}
  }
}
