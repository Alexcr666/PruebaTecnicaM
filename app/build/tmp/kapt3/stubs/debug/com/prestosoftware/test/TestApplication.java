package com.prestosoftware.test;

import com.prestosoftware.test.di.DaggerAppComponent;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import timber.log.Timber;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0016R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006\u000b"}, d2 = {"Lcom/prestosoftware/test/TestApplication;", "Ldagger/android/DaggerApplication;", "()V", "appComponent", "error/NonExistentClass", "Lerror/NonExistentClass;", "applicationInjector", "Ldagger/android/AndroidInjector;", "onCreate", "", "Companion", "app_debug"})
public final class TestApplication extends dagger.android.DaggerApplication {
    private final java.lang.Object appComponent = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY = "3739b2bf12fe7aa4fe62cc73a340d764";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LG = "en-US";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_URL = "https://api.themoviedb.org/3/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BD_NAME = "movies";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CATEGORY_POPULAR = "popular";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CATEGORY_TOP = "top_rated";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CATEGORY_UPCOMING = "upcoming";
    public static final com.prestosoftware.test.TestApplication.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected dagger.android.AndroidInjector<? extends dagger.android.DaggerApplication> applicationInjector() {
        return null;
    }
    
    public TestApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/prestosoftware/test/TestApplication$Companion;", "", "()V", "API_KEY", "", "API_LG", "API_URL", "BD_NAME", "CATEGORY_POPULAR", "CATEGORY_TOP", "CATEGORY_UPCOMING", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}