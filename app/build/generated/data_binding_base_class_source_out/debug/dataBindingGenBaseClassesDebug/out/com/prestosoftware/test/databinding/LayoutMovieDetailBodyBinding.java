package com.prestosoftware.test.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import co.lujun.androidtagview.TagContainerLayout;
import com.prestosoftware.test.rappi.models.entity.Movie;
import com.prestosoftware.test.rappi.ui.movie.detail.MovieDetailViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutMovieDetailBodyBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView detailBodyRecyclerViewTrailers;

  @NonNull
  public final TextView detailBodySummary;

  @NonNull
  public final TagContainerLayout detailBodyTags;

  @NonNull
  public final TextView detailBodyTrailers;

  @Bindable
  protected Movie mMovie;

  @Bindable
  protected MovieDetailViewModel mViewModel;

  protected LayoutMovieDetailBodyBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView detailBodyRecyclerViewTrailers, TextView detailBodySummary,
      TagContainerLayout detailBodyTags, TextView detailBodyTrailers) {
    super(_bindingComponent, _root, _localFieldCount);
    this.detailBodyRecyclerViewTrailers = detailBodyRecyclerViewTrailers;
    this.detailBodySummary = detailBodySummary;
    this.detailBodyTags = detailBodyTags;
    this.detailBodyTrailers = detailBodyTrailers;
  }

  public abstract void setMovie(@Nullable Movie movie);

  @Nullable
  public Movie getMovie() {
    return mMovie;
  }

  public abstract void setViewModel(@Nullable MovieDetailViewModel viewModel);

  @Nullable
  public MovieDetailViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static LayoutMovieDetailBodyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_movie_detail_body, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutMovieDetailBodyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutMovieDetailBodyBinding>inflateInternal(inflater, com.prestosoftware.test.R.layout.layout_movie_detail_body, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutMovieDetailBodyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_movie_detail_body, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutMovieDetailBodyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutMovieDetailBodyBinding>inflateInternal(inflater, com.prestosoftware.test.R.layout.layout_movie_detail_body, null, false, component);
  }

  public static LayoutMovieDetailBodyBinding bind(@NonNull View view) {
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
  public static LayoutMovieDetailBodyBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutMovieDetailBodyBinding)bind(component, view, com.prestosoftware.test.R.layout.layout_movie_detail_body);
  }
}
