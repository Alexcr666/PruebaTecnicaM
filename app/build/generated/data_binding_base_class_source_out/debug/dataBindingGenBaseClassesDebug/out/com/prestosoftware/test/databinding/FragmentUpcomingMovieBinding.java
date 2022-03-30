package com.prestosoftware.test.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.prestosoftware.test.rappi.ui.main.MainActivityViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentUpcomingMovieBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerView;

  @Bindable
  protected MainActivityViewModel mViewModel;

  protected FragmentUpcomingMovieBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerView = recyclerView;
  }

  public abstract void setViewModel(@Nullable MainActivityViewModel viewModel);

  @Nullable
  public MainActivityViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentUpcomingMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_upcoming_movie, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUpcomingMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentUpcomingMovieBinding>inflateInternal(inflater, com.prestosoftware.test.R.layout.fragment_upcoming_movie, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentUpcomingMovieBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_upcoming_movie, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUpcomingMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentUpcomingMovieBinding>inflateInternal(inflater, com.prestosoftware.test.R.layout.fragment_upcoming_movie, null, false, component);
  }

  public static FragmentUpcomingMovieBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentUpcomingMovieBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentUpcomingMovieBinding)bind(component, view, com.prestosoftware.test.R.layout.fragment_upcoming_movie);
  }
}
