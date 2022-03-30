package com.prestosoftware.test.rappi.data.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.prestosoftware.test.rappi.models.Keyword;
import com.prestosoftware.test.rappi.models.Video;
import com.prestosoftware.test.rappi.models.entity.Movie;
import com.prestosoftware.test.rappi.util.IntegerListConverter;
import com.prestosoftware.test.rappi.util.KeywordListConverter;
import com.prestosoftware.test.rappi.util.VideoListConverter;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Movie> __insertionAdapterOfMovie;

  private final KeywordListConverter __keywordListConverter = new KeywordListConverter();

  private final VideoListConverter __videoListConverter = new VideoListConverter();

  private final IntegerListConverter __integerListConverter = new IntegerListConverter();

  private final EntityDeletionOrUpdateAdapter<Movie> __updateAdapterOfMovie;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovie = new EntityInsertionAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Movie` (`id`,`title`,`page`,`category`,`popularity`,`poster_path`,`adult`,`overview`,`release_date`,`keywords`,`videos`,`genre_ids`,`original_title`,`original_language`,`backdrop_path`,`vote_count`,`video`,`vote_average`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        stmt.bindLong(3, value.getPage());
        if (value.getCategory() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCategory());
        }
        stmt.bindDouble(5, value.getPopularity());
        if (value.getPoster_path() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPoster_path());
        }
        final int _tmp;
        _tmp = value.getAdult() ? 1 : 0;
        stmt.bindLong(7, _tmp);
        if (value.getOverview() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOverview());
        }
        if (value.getRelease_date() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getRelease_date());
        }
        final String _tmp_1;
        _tmp_1 = __keywordListConverter.fromList(value.getKeywords());
        if (_tmp_1 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __videoListConverter.fromList(value.getVideos());
        if (_tmp_2 == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, _tmp_2);
        }
        final String _tmp_3;
        _tmp_3 = __integerListConverter.fromList(value.getGenre_ids());
        if (_tmp_3 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, _tmp_3);
        }
        if (value.getOriginal_title() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getOriginal_title());
        }
        if (value.getOriginal_language() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getOriginal_language());
        }
        if (value.getBackdrop_path() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getBackdrop_path());
        }
        stmt.bindLong(16, value.getVote_count());
        final int _tmp_4;
        _tmp_4 = value.getVideo() ? 1 : 0;
        stmt.bindLong(17, _tmp_4);
        stmt.bindDouble(18, value.getVote_average());
      }
    };
    this.__updateAdapterOfMovie = new EntityDeletionOrUpdateAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Movie` SET `id` = ?,`title` = ?,`page` = ?,`category` = ?,`popularity` = ?,`poster_path` = ?,`adult` = ?,`overview` = ?,`release_date` = ?,`keywords` = ?,`videos` = ?,`genre_ids` = ?,`original_title` = ?,`original_language` = ?,`backdrop_path` = ?,`vote_count` = ?,`video` = ?,`vote_average` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        stmt.bindLong(3, value.getPage());
        if (value.getCategory() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCategory());
        }
        stmt.bindDouble(5, value.getPopularity());
        if (value.getPoster_path() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPoster_path());
        }
        final int _tmp;
        _tmp = value.getAdult() ? 1 : 0;
        stmt.bindLong(7, _tmp);
        if (value.getOverview() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOverview());
        }
        if (value.getRelease_date() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getRelease_date());
        }
        final String _tmp_1;
        _tmp_1 = __keywordListConverter.fromList(value.getKeywords());
        if (_tmp_1 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __videoListConverter.fromList(value.getVideos());
        if (_tmp_2 == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, _tmp_2);
        }
        final String _tmp_3;
        _tmp_3 = __integerListConverter.fromList(value.getGenre_ids());
        if (_tmp_3 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, _tmp_3);
        }
        if (value.getOriginal_title() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getOriginal_title());
        }
        if (value.getOriginal_language() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getOriginal_language());
        }
        if (value.getBackdrop_path() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getBackdrop_path());
        }
        stmt.bindLong(16, value.getVote_count());
        final int _tmp_4;
        _tmp_4 = value.getVideo() ? 1 : 0;
        stmt.bindLong(17, _tmp_4);
        stmt.bindDouble(18, value.getVote_average());
        stmt.bindLong(19, value.getId());
      }
    };
  }

  @Override
  public void insertAll(final List<Movie> movies) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovie.insert(movies);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateMovie(final Movie movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfMovie.handle(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Movie getMovie(final int id) {
    final String _sql = "SELECT * FROM MOVIE WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfPage = CursorUtil.getColumnIndexOrThrow(_cursor, "page");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
      final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
      final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
      final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
      final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
      final int _cursorIndexOfKeywords = CursorUtil.getColumnIndexOrThrow(_cursor, "keywords");
      final int _cursorIndexOfVideos = CursorUtil.getColumnIndexOrThrow(_cursor, "videos");
      final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "genre_ids");
      final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
      final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
      final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
      final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
      final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
      final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
      final Movie _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final int _tmpPage;
        _tmpPage = _cursor.getInt(_cursorIndexOfPage);
        final String _tmpCategory;
        _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        final float _tmpPopularity;
        _tmpPopularity = _cursor.getFloat(_cursorIndexOfPopularity);
        final String _tmpPoster_path;
        _tmpPoster_path = _cursor.getString(_cursorIndexOfPosterPath);
        final boolean _tmpAdult;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfAdult);
        _tmpAdult = _tmp != 0;
        final String _tmpOverview;
        _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
        final String _tmpRelease_date;
        _tmpRelease_date = _cursor.getString(_cursorIndexOfReleaseDate);
        final List<Keyword> _tmpKeywords;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfKeywords);
        _tmpKeywords = __keywordListConverter.fromString(_tmp_1);
        final List<Video> _tmpVideos;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfVideos);
        _tmpVideos = __videoListConverter.fromString(_tmp_2);
        final List<Integer> _tmpGenre_ids;
        final String _tmp_3;
        _tmp_3 = _cursor.getString(_cursorIndexOfGenreIds);
        _tmpGenre_ids = __integerListConverter.fromString(_tmp_3);
        final String _tmpOriginal_title;
        _tmpOriginal_title = _cursor.getString(_cursorIndexOfOriginalTitle);
        final String _tmpOriginal_language;
        _tmpOriginal_language = _cursor.getString(_cursorIndexOfOriginalLanguage);
        final String _tmpBackdrop_path;
        _tmpBackdrop_path = _cursor.getString(_cursorIndexOfBackdropPath);
        final int _tmpVote_count;
        _tmpVote_count = _cursor.getInt(_cursorIndexOfVoteCount);
        final boolean _tmpVideo;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfVideo);
        _tmpVideo = _tmp_4 != 0;
        final float _tmpVote_average;
        _tmpVote_average = _cursor.getFloat(_cursorIndexOfVoteAverage);
        _result = new Movie(_tmpId,_tmpTitle,_tmpPage,_tmpCategory,_tmpPopularity,_tmpPoster_path,_tmpAdult,_tmpOverview,_tmpRelease_date,_tmpKeywords,_tmpVideos,_tmpGenre_ids,_tmpOriginal_title,_tmpOriginal_language,_tmpBackdrop_path,_tmpVote_count,_tmpVideo,_tmpVote_average);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<Movie>> getMovieList(final int page) {
    final String _sql = "SELECT * FROM Movie WHERE page = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, page);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Movie"}, false, new Callable<List<Movie>>() {
      @Override
      public List<Movie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPage = CursorUtil.getColumnIndexOrThrow(_cursor, "page");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfKeywords = CursorUtil.getColumnIndexOrThrow(_cursor, "keywords");
          final int _cursorIndexOfVideos = CursorUtil.getColumnIndexOrThrow(_cursor, "videos");
          final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "genre_ids");
          final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Movie _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final int _tmpPage;
            _tmpPage = _cursor.getInt(_cursorIndexOfPage);
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final float _tmpPopularity;
            _tmpPopularity = _cursor.getFloat(_cursorIndexOfPopularity);
            final String _tmpPoster_path;
            _tmpPoster_path = _cursor.getString(_cursorIndexOfPosterPath);
            final boolean _tmpAdult;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfAdult);
            _tmpAdult = _tmp != 0;
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final String _tmpRelease_date;
            _tmpRelease_date = _cursor.getString(_cursorIndexOfReleaseDate);
            final List<Keyword> _tmpKeywords;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfKeywords);
            _tmpKeywords = __keywordListConverter.fromString(_tmp_1);
            final List<Video> _tmpVideos;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfVideos);
            _tmpVideos = __videoListConverter.fromString(_tmp_2);
            final List<Integer> _tmpGenre_ids;
            final String _tmp_3;
            _tmp_3 = _cursor.getString(_cursorIndexOfGenreIds);
            _tmpGenre_ids = __integerListConverter.fromString(_tmp_3);
            final String _tmpOriginal_title;
            _tmpOriginal_title = _cursor.getString(_cursorIndexOfOriginalTitle);
            final String _tmpOriginal_language;
            _tmpOriginal_language = _cursor.getString(_cursorIndexOfOriginalLanguage);
            final String _tmpBackdrop_path;
            _tmpBackdrop_path = _cursor.getString(_cursorIndexOfBackdropPath);
            final int _tmpVote_count;
            _tmpVote_count = _cursor.getInt(_cursorIndexOfVoteCount);
            final boolean _tmpVideo;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfVideo);
            _tmpVideo = _tmp_4 != 0;
            final float _tmpVote_average;
            _tmpVote_average = _cursor.getFloat(_cursorIndexOfVoteAverage);
            _item = new Movie(_tmpId,_tmpTitle,_tmpPage,_tmpCategory,_tmpPopularity,_tmpPoster_path,_tmpAdult,_tmpOverview,_tmpRelease_date,_tmpKeywords,_tmpVideos,_tmpGenre_ids,_tmpOriginal_title,_tmpOriginal_language,_tmpBackdrop_path,_tmpVote_count,_tmpVideo,_tmpVote_average);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Movie>> getMoviesByCategory(final String category, final int page) {
    final String _sql = "SELECT * FROM Movie WHERE page = ? AND category LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, page);
    _argIndex = 2;
    if (category == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, category);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"Movie"}, false, new Callable<List<Movie>>() {
      @Override
      public List<Movie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPage = CursorUtil.getColumnIndexOrThrow(_cursor, "page");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfKeywords = CursorUtil.getColumnIndexOrThrow(_cursor, "keywords");
          final int _cursorIndexOfVideos = CursorUtil.getColumnIndexOrThrow(_cursor, "videos");
          final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "genre_ids");
          final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Movie _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final int _tmpPage;
            _tmpPage = _cursor.getInt(_cursorIndexOfPage);
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final float _tmpPopularity;
            _tmpPopularity = _cursor.getFloat(_cursorIndexOfPopularity);
            final String _tmpPoster_path;
            _tmpPoster_path = _cursor.getString(_cursorIndexOfPosterPath);
            final boolean _tmpAdult;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfAdult);
            _tmpAdult = _tmp != 0;
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final String _tmpRelease_date;
            _tmpRelease_date = _cursor.getString(_cursorIndexOfReleaseDate);
            final List<Keyword> _tmpKeywords;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfKeywords);
            _tmpKeywords = __keywordListConverter.fromString(_tmp_1);
            final List<Video> _tmpVideos;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfVideos);
            _tmpVideos = __videoListConverter.fromString(_tmp_2);
            final List<Integer> _tmpGenre_ids;
            final String _tmp_3;
            _tmp_3 = _cursor.getString(_cursorIndexOfGenreIds);
            _tmpGenre_ids = __integerListConverter.fromString(_tmp_3);
            final String _tmpOriginal_title;
            _tmpOriginal_title = _cursor.getString(_cursorIndexOfOriginalTitle);
            final String _tmpOriginal_language;
            _tmpOriginal_language = _cursor.getString(_cursorIndexOfOriginalLanguage);
            final String _tmpBackdrop_path;
            _tmpBackdrop_path = _cursor.getString(_cursorIndexOfBackdropPath);
            final int _tmpVote_count;
            _tmpVote_count = _cursor.getInt(_cursorIndexOfVoteCount);
            final boolean _tmpVideo;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfVideo);
            _tmpVideo = _tmp_4 != 0;
            final float _tmpVote_average;
            _tmpVote_average = _cursor.getFloat(_cursorIndexOfVoteAverage);
            _item = new Movie(_tmpId,_tmpTitle,_tmpPage,_tmpCategory,_tmpPopularity,_tmpPoster_path,_tmpAdult,_tmpOverview,_tmpRelease_date,_tmpKeywords,_tmpVideos,_tmpGenre_ids,_tmpOriginal_title,_tmpOriginal_language,_tmpBackdrop_path,_tmpVote_count,_tmpVideo,_tmpVote_average);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
