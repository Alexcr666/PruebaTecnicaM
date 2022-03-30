package com.prestosoftware.test.rappi.data.api;

import androidx.lifecycle.LiveData;
import com.prestosoftware.test.rappi.models.entity.Movie;
import com.prestosoftware.test.rappi.data.response.KeywordListResponse;
import com.prestosoftware.test.rappi.data.response.MovieListResponse;
import com.prestosoftware.test.rappi.data.response.VideoListResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * REST API access points
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\'J(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0007H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/prestosoftware/test/rappi/data/api/MovieService;", "", "fetchKeywords", "Landroidx/lifecycle/LiveData;", "Lcom/prestosoftware/test/rappi/data/api/ApiResponse;", "Lcom/prestosoftware/test/rappi/data/response/KeywordListResponse;", "id", "", "fetchVideos", "Lcom/prestosoftware/test/rappi/data/response/VideoListResponse;", "getMovieDetail", "Lcom/prestosoftware/test/rappi/models/entity/Movie;", "movieId", "", "getMoviesByCategory", "Lcom/prestosoftware/test/rappi/data/response/MovieListResponse;", "category", "page", "app_debug"})
public abstract interface MovieService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{category}")
    public abstract androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.data.api.ApiResponse<com.prestosoftware.test.rappi.data.response.MovieListResponse>> getMoviesByCategory(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "category")
    java.lang.String category, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{movieId}")
    public abstract androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.entity.Movie> getMovieDetail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "movieId")
    java.lang.String movieId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/{movie_id}/keywords")
    public abstract androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.data.api.ApiResponse<com.prestosoftware.test.rappi.data.response.KeywordListResponse>> fetchKeywords(@retrofit2.http.Path(value = "movie_id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/{movie_id}/videos")
    public abstract androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.data.api.ApiResponse<com.prestosoftware.test.rappi.data.response.VideoListResponse>> fetchVideos(@retrofit2.http.Path(value = "movie_id")
    int id);
}