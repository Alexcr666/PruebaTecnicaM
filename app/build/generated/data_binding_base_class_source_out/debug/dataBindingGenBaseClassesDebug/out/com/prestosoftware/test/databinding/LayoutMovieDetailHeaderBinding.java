package com.prestosoftware.test.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.prestosoftware.test.rappi.models.entity.Movie;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutMovieDetailHeaderBinding extends ViewDataBinding {
  @NonNull
  public final TextView detailHeaderRelease;

  @NonNull
  public final RatingBar detailHeaderStar;

  @NonNull
  public final TextView detailHeaderTitle;

  @Bindable
  protected Movie mMovie;

  protected LayoutMovieDetailHeaderBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView detailHeaderRelease, RatingBar detailHeaderStar,
      TextView detailHeaderTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.detailHeaderRelease = detailHeaderRelease;
    this.detailHeaderStar = detailHeaderStar;
    this.detailHeaderTitle = detailHeaderTitle;
  }

  public abstract void setMovie(@Nullable Movie movie);

  @Nullable
  public Movie getMovie() {
    return mMovie;
  }

  @NonNull
  public static LayoutMovieDetailHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_movie_detail_header, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutMovieDetailHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutMovieDetailHeaderBinding>inflateInternal(inflater, com.prestosoftware.test.R.layout.layout_movie_detail_header, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutMovieDetailHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_movie_detail_header, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutMovieDetailHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutMovieDetailHeaderBinding>inflateInternal(inflater, com.prestosoftware.test.R.layout.layout_movie_detail_header, null, false, component);
  }

  public static LayoutMovieDetailHeaderBinding bind(@NonNull View view) {
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
  public static LayoutMovieDetailHeaderBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (LayoutMovieDetailHeaderBinding)bind(component, view, com.prestosoftware.test.R.layout.layout_movie_detail_header);
  }
}
