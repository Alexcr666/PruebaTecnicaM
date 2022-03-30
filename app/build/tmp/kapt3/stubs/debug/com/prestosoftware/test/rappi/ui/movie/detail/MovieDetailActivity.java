package com.prestosoftware.test.rappi.ui.movie.detail;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.prestosoftware.test.R;
import com.prestosoftware.test.rappi.data.api.Api;
import com.prestosoftware.test.databinding.ActivityMovieDetailBinding;
import com.prestosoftware.test.rappi.models.Video;
import com.prestosoftware.test.rappi.models.entity.Movie;
import com.prestosoftware.test.rappi.ui.movie.VideoListAdapter;
import com.prestosoftware.test.rappi.ui.movie.VideoListViewHolder;
import com.prestosoftware.test.rappi.util.compose.ViewModelActivity;
import kotlinx.android.synthetic.main.activity_movie_detail.*;
import kotlinx.android.synthetic.main.layout_movie_detail_body.*;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/prestosoftware/test/rappi/ui/movie/detail/MovieDetailActivity;", "Lcom/prestosoftware/test/rappi/util/compose/ViewModelActivity;", "Lcom/prestosoftware/test/rappi/ui/movie/VideoListViewHolder$Delegate;", "()V", "binding", "Lcom/prestosoftware/test/databinding/ActivityMovieDetailBinding;", "getBinding", "()Lcom/prestosoftware/test/databinding/ActivityMovieDetailBinding;", "binding$delegate", "Lkotlin/Lazy;", "vm", "Lcom/prestosoftware/test/rappi/ui/movie/detail/MovieDetailViewModel;", "getVm", "()Lcom/prestosoftware/test/rappi/ui/movie/detail/MovieDetailViewModel;", "vm$delegate", "getMovieFromIntent", "Lcom/prestosoftware/test/rappi/models/entity/Movie;", "initializeUI", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "video", "Lcom/prestosoftware/test/rappi/models/Video;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "Companion", "app_debug"})
public final class MovieDetailActivity extends com.prestosoftware.test.rappi.util.compose.ViewModelActivity implements com.prestosoftware.test.rappi.ui.movie.VideoListViewHolder.Delegate {
    private final kotlin.Lazy vm$delegate = null;
    private final kotlin.Lazy binding$delegate = null;
    private static final java.lang.String movieId = "movie";
    public static final com.prestosoftware.test.rappi.ui.movie.detail.MovieDetailActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.prestosoftware.test.rappi.ui.movie.detail.MovieDetailViewModel getVm() {
        return null;
    }
    
    private final com.prestosoftware.test.databinding.ActivityMovieDetailBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initializeUI() {
    }
    
    private final com.prestosoftware.test.rappi.models.entity.Movie getMovieFromIntent() {
        return null;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onItemClicked(@org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.models.Video video) {
    }
    
    public MovieDetailActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/prestosoftware/test/rappi/ui/movie/detail/MovieDetailActivity$Companion;", "", "()V", "movieId", "", "startActivityModel", "", "context", "Landroid/content/Context;", "movie", "Lcom/prestosoftware/test/rappi/models/entity/Movie;", "app_debug"})
    public static final class Companion {
        
        public final void startActivityModel(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.prestosoftware.test.rappi.models.entity.Movie movie) {
        }
        
        private Companion() {
            super();
        }
    }
}