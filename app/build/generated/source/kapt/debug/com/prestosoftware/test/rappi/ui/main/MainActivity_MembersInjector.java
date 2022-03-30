// Generated by Dagger (https://dagger.dev).
package com.prestosoftware.test.rappi.ui.main;

import androidx.fragment.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> fragmentInjectorProvider;

  public MainActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> fragmentInjectorProvider) {
    this.fragmentInjectorProvider = fragmentInjectorProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> fragmentInjectorProvider) {
    return new MainActivity_MembersInjector(fragmentInjectorProvider);}

  @Override
  public void injectMembers(MainActivity instance) {
    injectFragmentInjector(instance, fragmentInjectorProvider.get());
  }

  public static void injectFragmentInjector(MainActivity instance,
      DispatchingAndroidInjector<Fragment> fragmentInjector) {
    instance.fragmentInjector = fragmentInjector;
  }
}
