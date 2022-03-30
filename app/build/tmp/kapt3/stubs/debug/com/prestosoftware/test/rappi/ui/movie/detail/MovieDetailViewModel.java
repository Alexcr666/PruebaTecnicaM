package com.prestosoftware.test.rappi.ui.movie.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.prestosoftware.test.rappi.models.Keyword;
import com.prestosoftware.test.rappi.models.Resource;
import com.prestosoftware.test.rappi.models.Video;
import com.prestosoftware.test.rappi.repository.MovieRepository;
import com.prestosoftware.test.rappi.util.AbsentLiveData;
import timber.log.Timber;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eR#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/prestosoftware/test/rappi/ui/movie/detail/MovieDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/prestosoftware/test/rappi/repository/MovieRepository;", "(Lcom/prestosoftware/test/rappi/repository/MovieRepository;)V", "keywordListLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/prestosoftware/test/rappi/models/Resource;", "", "Lcom/prestosoftware/test/rappi/models/Keyword;", "getKeywordListLiveData", "()Landroidx/lifecycle/LiveData;", "movieIdLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "videoListLiveData", "Lcom/prestosoftware/test/rappi/models/Video;", "getVideoListLiveData", "postMovieId", "", "id", "app_debug"})
public final class MovieDetailViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> movieIdLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.Keyword>>> keywordListLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.Video>>> videoListLiveData = null;
    private final com.prestosoftware.test.rappi.repository.MovieRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.Keyword>>> getKeywordListLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.Video>>> getVideoListLiveData() {
        return null;
    }
    
    public final void postMovieId(int id) {
    }
    
    @javax.inject.Inject()
    public MovieDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.repository.MovieRepository repository) {
        super();
    }
}