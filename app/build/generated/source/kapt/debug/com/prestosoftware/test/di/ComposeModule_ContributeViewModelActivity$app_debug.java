package com.prestosoftware.test.di;

import com.prestosoftware.test.rappi.util.compose.ViewModelActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ComposeModule_ContributeViewModelActivity$app_debug.ViewModelActivitySubcomponent.class
)
public abstract class ComposeModule_ContributeViewModelActivity$app_debug {
  private ComposeModule_ContributeViewModelActivity$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(ViewModelActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ViewModelActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface ViewModelActivitySubcomponent extends AndroidInjector<ViewModelActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ViewModelActivity> {}
  }
}
