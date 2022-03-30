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

public abstract class FragmentPopularMovieBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerView;

  @Bindable
  protected MainActivityViewModel mViewModel;

  protected FragmentPopularMovieBinding(Object _bindingComponent, View _root, int _localFieldCount,
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
  public static FragmentPopularMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_popular_movie, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPopularMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPopularMovieBinding>inflateInternal(inflater, com.prestosoftware.test.R.layout.fragment_popular_movie, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPopularMovieBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_popular_movie, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPopularMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPopularMovieBinding>inflateInternal(inflater, com.prestosoftware.test.R.layout.fragment_popular_movie, null, false, component);
  }

  public static FragmentPopularMovieBinding bind(@NonNull View view) {
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
  public static FragmentPopularMovieBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPopularMovieBinding)bind(component, view, com.prestosoftware.test.R.layout.fragment_popular_movie);
  }
}
