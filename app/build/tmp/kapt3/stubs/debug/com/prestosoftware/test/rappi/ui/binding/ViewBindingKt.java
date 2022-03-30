package com.prestosoftware.test.rappi.ui.binding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.BindingAdapter;
import co.lujun.androidtagview.TagContainerLayout;
import com.bumptech.glide.Glide;
import com.prestosoftware.test.rappi.data.api.Api;
import com.prestosoftware.test.rappi.models.Keyword;
import com.prestosoftware.test.rappi.models.Resource;
import com.prestosoftware.test.rappi.models.entity.Movie;
import com.prestosoftware.test.rappi.util.KeywordListMapper;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a&\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tH\u0007\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a&\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000f2\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n\u0018\u00010\tH\u0007\u00a8\u0006\u0011"}, d2 = {"bindBackDrop", "", "view", "Landroid/widget/ImageView;", "movie", "Lcom/prestosoftware/test/rappi/models/entity/Movie;", "bindMapKeywordList", "Lco/lujun/androidtagview/TagContainerLayout;", "resource", "Lcom/prestosoftware/test/rappi/models/Resource;", "", "Lcom/prestosoftware/test/rappi/models/Keyword;", "bindReleaseDate", "Landroid/widget/TextView;", "bindVisibilityByResource", "Landroid/view/View;", "", "app_debug"})
public final class ViewBindingKt {
    
    @androidx.databinding.BindingAdapter(value = {"visibilityByResource"})
    public static final void bindVisibilityByResource(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    com.prestosoftware.test.rappi.models.Resource<? extends java.util.List<? extends java.lang.Object>> resource) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"mapKeywordList"})
    public static final void bindMapKeywordList(@org.jetbrains.annotations.NotNull()
    co.lujun.androidtagview.TagContainerLayout view, @org.jetbrains.annotations.Nullable()
    com.prestosoftware.test.rappi.models.Resource<? extends java.util.List<com.prestosoftware.test.rappi.models.Keyword>> resource) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"bindReleaseDate"})
    public static final void bindReleaseDate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.models.entity.Movie movie) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"bindBackDrop"})
    public static final void bindBackDrop(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.models.entity.Movie movie) {
    }
}