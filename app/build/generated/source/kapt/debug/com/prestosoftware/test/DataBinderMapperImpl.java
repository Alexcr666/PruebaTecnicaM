package com.prestosoftware.test;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.prestosoftware.test.databinding.ActivityMovieDetailBindingImpl;
import com.prestosoftware.test.databinding.FragmentPopularMovieBindingImpl;
import com.prestosoftware.test.databinding.FragmentTopMovieBindingImpl;
import com.prestosoftware.test.databinding.FragmentUpcomingMovieBindingImpl;
import com.prestosoftware.test.databinding.LayoutMovieDetailBodyBindingImpl;
import com.prestosoftware.test.databinding.LayoutMovieDetailHeaderBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMOVIEDETAIL = 1;

  private static final int LAYOUT_FRAGMENTPOPULARMOVIE = 2;

  private static final int LAYOUT_FRAGMENTTOPMOVIE = 3;

  private static final int LAYOUT_FRAGMENTUPCOMINGMOVIE = 4;

  private static final int LAYOUT_LAYOUTMOVIEDETAILBODY = 5;

  private static final int LAYOUT_LAYOUTMOVIEDETAILHEADER = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.prestosoftware.test.R.layout.activity_movie_detail, LAYOUT_ACTIVITYMOVIEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.prestosoftware.test.R.layout.fragment_popular_movie, LAYOUT_FRAGMENTPOPULARMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.prestosoftware.test.R.layout.fragment_top_movie, LAYOUT_FRAGMENTTOPMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.prestosoftware.test.R.layout.fragment_upcoming_movie, LAYOUT_FRAGMENTUPCOMINGMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.prestosoftware.test.R.layout.layout_movie_detail_body, LAYOUT_LAYOUTMOVIEDETAILBODY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.prestosoftware.test.R.layout.layout_movie_detail_header, LAYOUT_LAYOUTMOVIEDETAILHEADER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMOVIEDETAIL: {
          if ("layout/activity_movie_detail_0".equals(tag)) {
            return new ActivityMovieDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_movie_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPOPULARMOVIE: {
          if ("layout/fragment_popular_movie_0".equals(tag)) {
            return new FragmentPopularMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_popular_movie is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTOPMOVIE: {
          if ("layout/fragment_top_movie_0".equals(tag)) {
            return new FragmentTopMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_top_movie is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUPCOMINGMOVIE: {
          if ("layout/fragment_upcoming_movie_0".equals(tag)) {
            return new FragmentUpcomingMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_upcoming_movie is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTMOVIEDETAILBODY: {
          if ("layout/layout_movie_detail_body_0".equals(tag)) {
            return new LayoutMovieDetailBodyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_movie_detail_body is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTMOVIEDETAILHEADER: {
          if ("layout/layout_movie_detail_header_0".equals(tag)) {
            return new LayoutMovieDetailHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_movie_detail_header is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "movie");
      sKeys.put(2, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_movie_detail_0", com.prestosoftware.test.R.layout.activity_movie_detail);
      sKeys.put("layout/fragment_popular_movie_0", com.prestosoftware.test.R.layout.fragment_popular_movie);
      sKeys.put("layout/fragment_top_movie_0", com.prestosoftware.test.R.layout.fragment_top_movie);
      sKeys.put("layout/fragment_upcoming_movie_0", com.prestosoftware.test.R.layout.fragment_upcoming_movie);
      sKeys.put("layout/layout_movie_detail_body_0", com.prestosoftware.test.R.layout.layout_movie_detail_body);
      sKeys.put("layout/layout_movie_detail_header_0", com.prestosoftware.test.R.layout.layout_movie_detail_header);
    }
  }
}
