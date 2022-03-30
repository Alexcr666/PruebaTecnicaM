package com.prestosoftware.test.rappi.ui.binding;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.prestosoftware.test.rappi.models.Resource;
import com.prestosoftware.test.rappi.models.Video;
import com.prestosoftware.test.rappi.models.entity.Movie;
import com.prestosoftware.test.rappi.ui.movie.upcoming.MovieUpcomingListAdapter;
import com.prestosoftware.test.rappi.ui.movie.VideoListAdapter;
import com.prestosoftware.test.rappi.ui.movie.popular.MoviePopularListAdapter;
import com.prestosoftware.test.rappi.ui.movie.topRated.MovieTopListAdapter;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005H\u0007\u001a&\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005H\u0007\u001a&\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005H\u0007\u001a&\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0018\u00010\u0005H\u0007\u00a8\u0006\f"}, d2 = {"bindAdapterMoviePopularList", "", "view", "Landroidx/recyclerview/widget/RecyclerView;", "resource", "Lcom/prestosoftware/test/rappi/models/Resource;", "", "Lcom/prestosoftware/test/rappi/models/entity/Movie;", "bindAdapterMovieTopList", "bindAdapterMovieUpcomingList", "bindAdapterVideoList", "Lcom/prestosoftware/test/rappi/models/Video;", "app_debug"})
public final class RecyclerViewBindingKt {
    
    @androidx.databinding.BindingAdapter(value = {"adapterMoviePopularList"})
    public static final void bindAdapterMoviePopularList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable()
    com.prestosoftware.test.rappi.models.Resource<? extends java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>> resource) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"adapterMovieTopList"})
    public static final void bindAdapterMovieTopList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable()
    com.prestosoftware.test.rappi.models.Resource<? extends java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>> resource) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"adapterMovieList"})
    public static final void bindAdapterMovieUpcomingList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable()
    com.prestosoftware.test.rappi.models.Resource<? extends java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>> resource) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"adapterVideoList"})
    public static final void bindAdapterVideoList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable()
    com.prestosoftware.test.rappi.models.Resource<? extends java.util.List<com.prestosoftware.test.rappi.models.Video>> resource) {
    }
}