package com.prestosoftware.test.rappi.data.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;
import com.prestosoftware.test.rappi.models.entity.Movie;

/**
 * Interface for database access for Movie related operations.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00072\u0006\u0010\t\u001a\u00020\u0005H\'J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0005H\'J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\'J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0003H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/prestosoftware/test/rappi/data/db/MovieDao;", "", "getMovie", "Lcom/prestosoftware/test/rappi/models/entity/Movie;", "id", "", "getMovieList", "Landroidx/lifecycle/LiveData;", "", "page", "getMoviesByCategory", "category", "", "insertAll", "", "movies", "updateMovie", "movie", "app_debug"})
public abstract interface MovieDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM MOVIE WHERE id = :id")
    public abstract com.prestosoftware.test.rappi.models.entity.Movie getMovie(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Movie WHERE page = :page")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>> getMovieList(int page);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Movie WHERE page = :page AND category LIKE :category")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>> getMoviesByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, int page);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.prestosoftware.test.rappi.models.entity.Movie> movies);
    
    @androidx.room.Update()
    public abstract void updateMovie(@org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.models.entity.Movie movie);
}