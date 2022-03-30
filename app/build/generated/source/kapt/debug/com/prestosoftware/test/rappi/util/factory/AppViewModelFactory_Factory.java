// Generated by Dagger (https://dagger.dev).
package com.prestosoftware.test.rappi.util.factory;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;

public final class AppViewModelFactory_Factory implements Factory<AppViewModelFactory> {
  private final Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelsProvider;

  public AppViewModelFactory_Factory(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelsProvider) {
    this.viewModelsProvider = viewModelsProvider;
  }

  @Override
  public AppViewModelFactory get() {
    return new AppViewModelFactory(viewModelsProvider.get());
  }

  public static AppViewModelFactory_Factory create(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelsProvider) {
    return new AppViewModelFactory_Factory(viewModelsProvider);
  }

  public static AppViewModelFactory newInstance(
      Map<Class<? extends ViewModel>, Provider<ViewModel>> viewModels) {
    return new AppViewModelFactory(viewModels);
  }
}
