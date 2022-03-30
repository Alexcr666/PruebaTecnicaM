package com.prestosoftware.test.databinding;
import com.prestosoftware.test.R;
import com.prestosoftware.test.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutMovieDetailBodyBindingImpl extends LayoutMovieDetailBodyBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutMovieDetailBodyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private LayoutMovieDetailBodyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (co.lujun.androidtagview.TagContainerLayout) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.detailBodyRecyclerViewTrailers.setTag(null);
        this.detailBodySummary.setTag(null);
        this.detailBodyTags.setTag(null);
        this.detailBodyTrailers.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
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
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelVideoListLiveData((androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.Video>>>) object, fieldId);
            case 1 :
                return onChangeViewModelKeywordListLiveData((androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.Keyword>>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelVideoListLiveData(androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.Video>>> ViewModelVideoListLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelKeywordListLiveData(androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.Keyword>>> ViewModelKeywordListLiveData, int fieldId) {
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
        java.lang.String movieOverview = null;
        androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.Video>>> viewModelVideoListLiveData = null;
        com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.Video>> viewModelVideoListLiveDataGetValue = null;
        com.prestosoftware.test.rappi.ui.movie.detail.MovieDetailViewModel viewModel = mViewModel;
        com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.Keyword>> viewModelKeywordListLiveDataGetValue = null;
        androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.Keyword>>> viewModelKeywordListLiveData = null;

        if ((dirtyFlags & 0x14L) != 0) {



                if (movie != null) {
                    // read movie.overview
                    movieOverview = movie.getOverview();
                }
        }
        if ((dirtyFlags & 0x1bL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.videoListLiveData
                        viewModelVideoListLiveData = viewModel.getVideoListLiveData();
                    }
                    updateLiveDataRegistration(0, viewModelVideoListLiveData);


                    if (viewModelVideoListLiveData != null) {
                        // read viewModel.videoListLiveData.getValue()
                        viewModelVideoListLiveDataGetValue = viewModelVideoListLiveData.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.keywordListLiveData
                        viewModelKeywordListLiveData = viewModel.getKeywordListLiveData();
                    }
                    updateLiveDataRegistration(1, viewModelKeywordListLiveData);


                    if (viewModelKeywordListLiveData != null) {
                        // read viewModel.keywordListLiveData.getValue()
                        viewModelKeywordListLiveDataGetValue = viewModelKeywordListLiveData.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.prestosoftware.test.rappi.ui.binding.RecyclerViewBindingKt.bindAdapterVideoList(this.detailBodyRecyclerViewTrailers, viewModelVideoListLiveDataGetValue);
            com.prestosoftware.test.rappi.ui.binding.ViewBindingKt.bindVisibilityByResource(this.detailBodyTrailers, viewModelVideoListLiveDataGetValue);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.detailBodySummary, movieOverview);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.prestosoftware.test.rappi.ui.binding.ViewBindingKt.bindMapKeywordList(this.detailBodyTags, viewModelKeywordListLiveDataGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.videoListLiveData
        flag 1 (0x2L): viewModel.keywordListLiveData
        flag 2 (0x3L): movie
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}