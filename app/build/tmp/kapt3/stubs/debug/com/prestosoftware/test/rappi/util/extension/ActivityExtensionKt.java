package com.prestosoftware.test.rappi.util.extension;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.prestosoftware.test.R;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0003*\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\u0004H\u0002\u001a\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u001c\u0010\u0010\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u00a8\u0006\u0013"}, d2 = {"checkIsMaterialVersion", "", "applyToolbarMargin", "", "Landroidx/appcompat/app/AppCompatActivity;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "circularRevealedAtCenter", "Landroid/app/Activity;", "view", "Landroid/view/View;", "getStatusBarSize", "", "requestGlideListener", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "simpleToolbarWithHome", "title_", "", "app_debug"})
public final class ActivityExtensionKt {
    
    public static final boolean checkIsMaterialVersion() {
        return false;
    }
    
    public static final void circularRevealedAtCenter(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$circularRevealedAtCenter, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.bumptech.glide.request.RequestListener<android.graphics.drawable.Drawable> requestGlideListener(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$requestGlideListener, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public static final void simpleToolbarWithHome(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$simpleToolbarWithHome, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar toolbar, @org.jetbrains.annotations.NotNull()
    java.lang.String title_) {
    }
    
    public static final void applyToolbarMargin(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$applyToolbarMargin, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar toolbar) {
    }
    
    private static final int getStatusBarSize(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$getStatusBarSize) {
        return 0;
    }
}