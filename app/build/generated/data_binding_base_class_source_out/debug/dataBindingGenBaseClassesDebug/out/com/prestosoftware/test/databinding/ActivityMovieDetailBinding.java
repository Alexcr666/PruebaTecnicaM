package com.prestosoftware.test.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.prestosoftware.test.rappi.models.entity.Movie;
import com.prestosoftware.test.rappi.ui.movie.detail.MovieDetailViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMovieDetailBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final LayoutMovieDetailBodyBinding detailBody;

  @NonNull
  public final LayoutMovieDetailHeaderBinding detailHeader;

  @NonNull
  public final ImageView movieDetailPoster;

  @NonNull
  public final Toolbar movieDetailToolbar;

  @Bindable
  protected Movie mMovie;

  @Bindable
  protected MovieDetailViewModel mViewModel;

  protected ActivityMovieDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appBarLayout, LayoutMovieDetailBodyBinding detailBody,
      LayoutMovieDetailHeaderBinding detailHeader, ImageView movieDetailPoster,
      Toolbar movieDetailToolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBarLayout = appBarLayout;
    this.detailBody = detailBody;
    setContainedBinding(this.detailBody);;
    this.detailHeader = detailHeader;
    setContainedBinding(this.detailHeader);;
    this.movieDetailPoster = movieDetailPoster;
    this.movieDetailToolbar = movieDetailToolbar;
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
  public static ActivityMovieDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_movie_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMovieDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMovieDetailBinding>inflateInternal(inflater, com.prestosoftware.test.R.layout.activity_movie_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMovieDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_movie_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMovieDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMovieDetailBinding>inflateInternal(inflater, com.prestosoftware.test.R.layout.activity_movie_detail, null, false, component);
  }

  public static ActivityMovieDetailBinding bind(@NonNull View view) {
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
  public static ActivityMovieDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMovieDetailBinding)bind(component, view, com.prestosoftware.test.R.layout.activity_movie_detail);
  }
}
