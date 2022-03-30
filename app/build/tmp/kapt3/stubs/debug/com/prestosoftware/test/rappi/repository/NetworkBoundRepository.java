package com.prestosoftware.test.rappi.repository;

import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import com.prestosoftware.test.rappi.data.api.ApiResponse;
import com.prestosoftware.test.rappi.data.mappers.NetworkResponseMapper;
import com.prestosoftware.test.rappi.models.Resource;
import com.prestosoftware.test.rappi.data.response.NetworkResponseModel;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u0003*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00052\u00020\u0006B\u0007\b\u0000\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\fJ\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0002J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00110\fH%J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\fH%J\r\u0010\u0013\u001a\u00028\u0002H%\u00a2\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H%J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00028\u0001H%\u00a2\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0003J\u0017\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00018\u0000H%\u00a2\u0006\u0002\u0010 R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/prestosoftware/test/rappi/repository/NetworkBoundRepository;", "ResultType", "RequestType", "Lcom/prestosoftware/test/rappi/data/response/NetworkResponseModel;", "Mapper", "Lcom/prestosoftware/test/rappi/data/mappers/NetworkResponseMapper;", "", "()V", "result", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/prestosoftware/test/rappi/models/Resource;", "asLiveData", "Landroidx/lifecycle/LiveData;", "fetchFromNetwork", "", "loadedFromDB", "fetchService", "Lcom/prestosoftware/test/rappi/data/api/ApiResponse;", "loadFromDb", "mapper", "()Lcom/prestosoftware/test/rappi/data/mappers/NetworkResponseMapper;", "onFetchFailed", "message", "", "saveFetchData", "items", "(Lcom/prestosoftware/test/rappi/data/response/NetworkResponseModel;)V", "setValue", "newValue", "shouldFetch", "", "data", "(Ljava/lang/Object;)Z", "app_debug"})
public abstract class NetworkBoundRepository<ResultType extends java.lang.Object, RequestType extends com.prestosoftware.test.rappi.data.response.NetworkResponseModel, Mapper extends com.prestosoftware.test.rappi.data.mappers.NetworkResponseMapper<? super RequestType>> {
    private final androidx.lifecycle.MediatorLiveData<com.prestosoftware.test.rappi.models.Resource<ResultType>> result = null;
    
    private final void fetchFromNetwork(androidx.lifecycle.LiveData<ResultType> loadedFromDB) {
    }
    
    @androidx.annotation.MainThread()
    private final void setValue(com.prestosoftware.test.rappi.models.Resource<? extends ResultType> newValue) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.models.Resource<ResultType>> asLiveData() {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    protected abstract void saveFetchData(@org.jetbrains.annotations.NotNull()
    RequestType items);
    
    @androidx.annotation.MainThread()
    protected abstract boolean shouldFetch(@org.jetbrains.annotations.Nullable()
    ResultType data);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    protected abstract androidx.lifecycle.LiveData<ResultType> loadFromDb();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    protected abstract androidx.lifecycle.LiveData<com.prestosoftware.test.rappi.data.api.ApiResponse<RequestType>> fetchService();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    protected abstract Mapper mapper();
    
    @androidx.annotation.MainThread()
    protected abstract void onFetchFailed(@org.jetbrains.annotations.Nullable()
    java.lang.String message);
    
    public NetworkBoundRepository() {
        super();
    }
}