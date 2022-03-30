package com.prestosoftware.test.rappi.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.prestosoftware.test.rappi.data.api.ApiResponse;
import com.prestosoftware.test.rappi.data.api.MovieService;
import com.prestosoftware.test.rappi.data.db.MovieDao;
import com.prestosoftware.test.rappi.data.mappers.KeywordResponseMapper;
import com.prestosoftware.test.rappi.data.mappers.MovieResponseMapper;
import com.prestosoftware.test.rappi.data.mappers.VideoResponseMapper;
import com.prestosoftware.test.rappi.models.Keyword;
import com.prestosoftware.test.rappi.models.Resource;
import com.prestosoftware.test.rappi.models.Video;
import com.prestosoftware.test.rappi.data.response.KeywordListResponse;
import com.prestosoftware.test.rappi.data.response.MovieListResponse;
import com.prestosoftware.test.rappi.data.response.VideoListResponse;
import com.prestosoftware.test.rappi.models.entity.Movie;
import timber.log.Timber;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b2\u0006\u0010\f\u001a\u00020\rJ(\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\t0\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rJ \u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\n0\t0\b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/prestosoftware/test/rappi/repository/MovieRepository;", "Lcom/prestosoftware/test/rappi/repository/Repository;", "service", "Lcom/prestosoftware/test/rappi/data/api/MovieService;", "movieDao", "Lcom/prestosoftware/test/rappi/data/db/MovieDao;", "(Lcom/prestosoftware/test/rappi/data/api/MovieService;Lcom/prestosoftware/test/rappi/data/db/MovieDao;)V", "loadKeywordList", "Landroidx/lifecycle/LiveData;", "Lcom/prestosoftware/test/rappi/models/Resource;", "", "Lcom/prestosoftware/test/rappi/models/Keyword;", "id", "", "loadMovies", "Lcom/prestosoftware/test/rappi/models/entity/Movie;", "category", "", "page", "loadVideoList", "Lcom/prestosoftware/test/rappi/models/Video;", "app_debug"})
@javax.inject.Singleton()
public final class MovieRepository implements com.prestosoftware.test.rappi.repository.Repository {
    private final com.prestosoftware.test.rappi.data.api.MovieService service = null;
    private final com.prestosoftware.test.rappi.data.db.MovieDao movieDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>>> loadMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String category, int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.Keyword>>> loadKeywordList(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.Video>>> loadVideoList(int id) {
        return null;
    }
    
    @javax.inject.Inject()
    public MovieRepository(@org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.data.api.MovieService service, @org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.data.db.MovieDao movieDao) {
        super();
    }
}