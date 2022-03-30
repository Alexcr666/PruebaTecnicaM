package com.prestosoftware.test.databinding;
import com.prestosoftware.test.R;
import com.prestosoftware.test.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentUpcomingMovieBindingImpl extends FragmentUpcomingMovieBinding  {

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
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUpcomingMovieBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentUpcomingMovieBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.prestosoftware.test.rappi.ui.main.MainActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.prestosoftware.test.rappi.ui.main.MainActivityViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMovieUpcomingListLiveData((androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMovieUpcomingListLiveData(androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>>> ViewModelMovieUpcomingListLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>> viewModelMovieUpcomingListLiveDataGetValue = null;
        androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<java.util.List<com.prestosoftware.test.rappi.models.entity.Movie>>> viewModelMovieUpcomingListLiveData = null;
        com.prestosoftware.test.rappi.ui.main.MainActivityViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.movieUpcomingListLiveData
                    viewModelMovieUpcomingListLiveData = viewModel.getMovieUpcomingListLiveData();
                }
                updateLiveDataRegistration(0, viewModelMovieUpcomingListLiveData);


                if (viewModelMovieUpcomingListLiveData != null) {
                    // read viewModel.movieUpcomingListLiveData.getValue()
                    viewModelMovieUpcomingListLiveDataGetValue = viewModelMovieUpcomingListLiveData.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.prestosoftware.test.rappi.ui.binding.RecyclerViewBindingKt.bindAdapterMovieUpcomingList(this.recyclerView, viewModelMovieUpcomingListLiveDataGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.movieUpcomingListLiveData
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}