package com.prestosoftware.test.rappi.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.prestosoftware.test.rappi.models.entity.Movie;
import com.prestosoftware.test.rappi.util.IntegerListConverter;
import com.prestosoftware.test.rappi.util.KeywordListConverter;
import com.prestosoftware.test.rappi.util.VideoListConverter;

/**
 * Movie database description.
 */
@androidx.room.TypeConverters(value = {com.prestosoftware.test.rappi.util.IntegerListConverter.class, com.prestosoftware.test.rappi.util.KeywordListConverter.class, com.prestosoftware.test.rappi.util.VideoListConverter.class})
@androidx.room.Database(entities = {com.prestosoftware.test.rappi.models.entity.Movie.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/prestosoftware/test/rappi/data/db/TestDb;", "Landroidx/room/RoomDatabase;", "()V", "movieDao", "Lcom/prestosoftware/test/rappi/data/db/MovieDao;", "app_debug"})
public abstract class TestDb extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.prestosoftware.test.rappi.data.db.MovieDao movieDao();
    
    public TestDb() {
        super();
    }
}