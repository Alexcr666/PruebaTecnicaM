package com.prestosoftware.test.rappi.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.prestosoftware.test.TestApplication;
import com.prestosoftware.test.rappi.models.Resource;
import com.prestosoftware.test.rappi.models.entity.Movie;
import com.prestosoftware.test.rappi.repository.MovieRepository;
import com.prestosoftware.test.rappi.util.AbsentLiveData;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007J\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007J\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eJ\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/prestosoftware/test/rappi/ui/main/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "movieRepository", "Lcom/prestosoftware/test/rappi/repository/MovieRepository;", "(Lcom/prestosoftware/test/rappi/repository/MovieRepository;)V", "moviePopularListLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/prestosoftware/test/rappi/models/Resource;", "", "Lcom/prestosoftware/test/rappi/models/entity/Movie;", "getMoviePopularListLiveData", "()Landroidx/lifecycle/LiveData;", "moviePopularLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "movieTopListLiveData", "getMovieTopListLiveData", "movieTopLiveData", "movieUpcomingListLiveData", "getMovieUpcomingListLiveData", "movieUpcomingLiveData", "getMoviePopularListValues", "getMovieTopListValues", "getMovieUpcomingListValues", "postMoviePopularPage", "", "page", "postMovieTopPage", "postMovieUpcomingPage", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> moviePopularLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>>> moviePopularListLiveData = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> movieTopLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>>> movieTopListLiveData = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> movieUpcomingLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>>> movieUpcomingListLiveData = null;
    private final com.prestosoftware.test.rappi.repository.MovieRepository movieRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>>> getMoviePopularListLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>>> getMovieTopListLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>>> getMovieUpcomingListLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>> getMoviePopularListValues() {
        return null;
    }
    
    public final void postMoviePopularPage(int page) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>> getMovieTopListValues() {
        return null;
    }
    
    public final void postMovieTopPage(int page) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>> getMovieUpcomingListValues() {
        return null;
    }
    
    public final void postMovieUpcomingPage(int page) {
    }
    
    @javax.inject.Inject()
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.repository.MovieRepository movieRepository) {
        super();
    }
}