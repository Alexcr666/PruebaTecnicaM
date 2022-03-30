package com.prestosoftware.test.rappi.ui.movie.topRated;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.prestosoftware.test.R;
import com.prestosoftware.test.databinding.FragmentTopMovieBinding;
import com.prestosoftware.test.rappi.models.Status;
import com.prestosoftware.test.rappi.models.entity.Movie;
import com.prestosoftware.test.rappi.ui.main.MainActivityViewModel;
import com.prestosoftware.test.rappi.ui.movie.detail.MovieDetailActivity;
import com.prestosoftware.test.rappi.util.compose.ViewModelFragment;
import com.skydoves.baserecyclerviewadapter.RecyclerViewPaginator;
import kotlinx.android.synthetic.main.fragment_popular_movie.*;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006!"}, d2 = {"Lcom/prestosoftware/test/rappi/ui/movie/topRated/MovieTopListFragment;", "Lcom/prestosoftware/test/rappi/util/compose/ViewModelFragment;", "Lcom/prestosoftware/test/rappi/ui/movie/topRated/MovieTopListViewHolder$Delegate;", "()V", "binding", "Lcom/prestosoftware/test/databinding/FragmentTopMovieBinding;", "viewModel", "Lcom/prestosoftware/test/rappi/ui/main/MainActivityViewModel;", "getViewModel", "()Lcom/prestosoftware/test/rappi/ui/main/MainActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initializeUI", "", "loadMore", "page", "", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "movie", "Lcom/prestosoftware/test/rappi/models/entity/Movie;", "onViewCreated", "view", "app_debug"})
public final class MovieTopListFragment extends com.prestosoftware.test.rappi.util.compose.ViewModelFragment implements com.prestosoftware.test.rappi.ui.movie.topRated.MovieTopListViewHolder.Delegate {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.prestosoftware.test.databinding.FragmentTopMovieBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    private final com.prestosoftware.test.rappi.ui.main.MainActivityViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void initializeUI() {
    }
    
    private final void loadMore(int page) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.models.entity.Movie movie) {
    }
    
    public MovieTopListFragment() {
        super();
    }
}