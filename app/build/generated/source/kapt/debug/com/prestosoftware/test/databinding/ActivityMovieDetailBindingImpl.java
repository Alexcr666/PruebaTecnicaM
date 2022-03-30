package com.prestosoftware.test.databinding;
import com.prestosoftware.test.R;
import com.prestosoftware.test.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMovieDetailBindingImpl extends ActivityMovieDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(2, 
            new String[] {"layout_movie_detail_header", "layout_movie_detail_body"},
            new int[] {3, 4},
            new int[] {com.prestosoftware.test.R.layout.layout_movie_detail_header,
                com.prestosoftware.test.R.layout.layout_movie_detail_body});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appBarLayout, 5);
        sViewsWithIds.put(R.id.movie_detail_toolbar, 6);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMovieDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityMovieDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.appbar.AppBarLayout) bindings[5]
            , (com.prestosoftware.test.databinding.LayoutMovieDetailBodyBinding) bindings[4]
            , (com.prestosoftware.test.databinding.LayoutMovieDetailHeaderBinding) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (androidx.appcompat.widget.Toolbar) bindings[6]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.movieDetailPoster.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        detailHeader.invalidateAll();
        detailBody.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (detailHeader.hasPendingBindings()) {
            return true;
        }
        if (detailBody.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.movie == variableId) {
            setMovie((com.prestosoftware.test.rappi.models.entity.Movie) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.prestosoftware.test.rappi.ui.movie.detail.MovieDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMovie(@Nullable com.prestosoftware.test.rappi.models.entity.Movie Movie) {
        this.mMovie = Movie;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.movie);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.prestosoftware.test.rappi.ui.movie.detail.MovieDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        detailHeader.setLifecycleOwner(lifecycleOwner);
        detailBody.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDetailHeader((com.prestosoftware.test.databinding.LayoutMovieDetailHeaderBinding) object, fieldId);
            case 1 :
                return onChangeDetailBody((com.prestosoftware.test.databinding.LayoutMovieDetailBodyBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDetailHeader(com.prestosoftware.test.databinding.LayoutMovieDetailHeaderBinding DetailHeader, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDetailBody(com.prestosoftware.test.databinding.LayoutMovieDetailBodyBinding DetailBody, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.prestosoftware.test.rappi.models.entity.Movie movie = mMovie;

        if ((dirtyFlags & 0x14L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            com.prestosoftware.test.rappi.ui.binding.ViewBindingKt.bindBackDrop(this.movieDetailPoster, movie);
        }
        executeBindingsOn(detailHeader);
        executeBindingsOn(detailBody);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): detailHeader
        flag 1 (0x2L): detailBody
        flag 2 (0x3L): movie
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}