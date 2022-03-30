package com.prestosoftware.test.rappi.ui.movie.upcoming;

import android.view.View;
import com.prestosoftware.test.R;
import com.prestosoftware.test.rappi.models.Resource;
import com.prestosoftware.test.rappi.models.entity.Movie;
import com.skydoves.baserecyclerviewadapter.BaseAdapter;
import com.skydoves.baserecyclerviewadapter.BaseViewHolder;
import com.skydoves.baserecyclerviewadapter.SectionRow;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/prestosoftware/test/rappi/ui/movie/upcoming/MovieUpcomingListAdapter;", "Lcom/skydoves/baserecyclerviewadapter/BaseAdapter;", "delegate", "Lcom/prestosoftware/test/rappi/ui/movie/upcoming/MovieUpcomingListViewHolder$Delegate;", "(Lcom/prestosoftware/test/rappi/ui/movie/upcoming/MovieUpcomingListViewHolder$Delegate;)V", "addMovieList", "", "resource", "Lcom/prestosoftware/test/rappi/models/Resource;", "", "Lcom/prestosoftware/test/rappi/models/entity/Movie;", "layout", "", "sectionRow", "Lcom/skydoves/baserecyclerviewadapter/SectionRow;", "viewHolder", "Lcom/skydoves/baserecyclerviewadapter/BaseViewHolder;", "view", "Landroid/view/View;", "app_debug"})
public final class MovieUpcomingListAdapter extends com.skydoves.baserecyclerviewadapter.BaseAdapter {
    private final com.prestosoftware.test.rappi.ui.movie.upcoming.MovieUpcomingListViewHolder.Delegate delegate = null;
    
    public final void addMovieList(@org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.models.Resource<? extends java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>> resource) {
    }
    
    @java.lang.Override()
    protected int layout(@org.jetbrains.annotations.NotNull()
    com.skydoves.baserecyclerviewadapter.SectionRow sectionRow) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.skydoves.baserecyclerviewadapter.BaseViewHolder viewHolder(int layout, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public MovieUpcomingListAdapter(@org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.ui.movie.upcoming.MovieUpcomingListViewHolder.Delegate delegate) {
        super();
    }
}