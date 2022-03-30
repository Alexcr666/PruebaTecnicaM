package com.prestosoftware.test.rappi.ui.movie;

import android.view.View;
import com.bumptech.glide.Glide;
import com.github.florent37.glidepalette.BitmapPalette;
import com.github.florent37.glidepalette.GlidePalette;
import com.prestosoftware.test.rappi.data.api.Api;
import com.prestosoftware.test.rappi.models.Video;
import com.skydoves.baserecyclerviewadapter.BaseViewHolder;
import kotlinx.android.synthetic.main.item_video.view.*;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0002J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/prestosoftware/test/rappi/ui/movie/VideoListViewHolder;", "Lcom/skydoves/baserecyclerviewadapter/BaseViewHolder;", "view", "Landroid/view/View;", "delegate", "Lcom/prestosoftware/test/rappi/ui/movie/VideoListViewHolder$Delegate;", "(Landroid/view/View;Lcom/prestosoftware/test/rappi/ui/movie/VideoListViewHolder$Delegate;)V", "video", "Lcom/prestosoftware/test/rappi/models/Video;", "getView", "()Landroid/view/View;", "bindData", "", "data", "", "drawItem", "onClick", "v", "onLongClick", "", "Delegate", "app_debug"})
public final class VideoListViewHolder extends com.skydoves.baserecyclerviewadapter.BaseViewHolder {
    private com.prestosoftware.test.rappi.models.Video video;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View view = null;
    private final com.prestosoftware.test.rappi.ui.movie.VideoListViewHolder.Delegate delegate = null;
    
    @java.lang.Override()
    public void bindData(@org.jetbrains.annotations.NotNull()
    java.lang.Object data) {
    }
    
    private final void drawItem() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public boolean onLongClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getView() {
        return null;
    }
    
    public VideoListViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.ui.movie.VideoListViewHolder.Delegate delegate) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/prestosoftware/test/rappi/ui/movie/VideoListViewHolder$Delegate;", "", "onItemClicked", "", "video", "Lcom/prestosoftware/test/rappi/models/Video;", "app_debug"})
    public static abstract interface Delegate {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        com.prestosoftware.test.rappi.models.Video video);
    }
}