package com.prestosoftware.test.di;

import com.prestosoftware.test.rappi.util.compose.ViewModelFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ComposeModule_ContributeViewModelFragment$app_debug.ViewModelFragmentSubcomponent.class
)
public abstract class ComposeModule_ContributeViewModelFragment$app_debug {
  private ComposeModule_ContributeViewModelFragment$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(ViewModelFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ViewModelFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ViewModelFragmentSubcomponent extends AndroidInjector<ViewModelFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ViewModelFragment> {}
  }
}
