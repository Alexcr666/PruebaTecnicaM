package com.prestosoftware.test.rappi.models;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.prestosoftware.test.rappi.data.response.ErrorEnvelope;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001f*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u001fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0007H\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006 "}, d2 = {"Lcom/prestosoftware/test/rappi/models/Resource;", "T", "", "status", "Lcom/prestosoftware/test/rappi/models/Status;", "data", "message", "", "onLastPage", "", "(Lcom/prestosoftware/test/rappi/models/Status;Ljava/lang/Object;Ljava/lang/String;Z)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "errorEnvelope", "Lcom/prestosoftware/test/rappi/data/response/ErrorEnvelope;", "getErrorEnvelope", "()Lcom/prestosoftware/test/rappi/data/response/ErrorEnvelope;", "setErrorEnvelope", "(Lcom/prestosoftware/test/rappi/data/response/ErrorEnvelope;)V", "getMessage", "()Ljava/lang/String;", "getOnLastPage", "()Z", "getStatus", "()Lcom/prestosoftware/test/rappi/models/Status;", "equals", "o", "hashCode", "", "toString", "Companion", "app_debug"})
public final class Resource<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private com.prestosoftware.test.rappi.data.response.ErrorEnvelope errorEnvelope;
    @org.jetbrains.annotations.NotNull()
    private final com.prestosoftware.test.rappi.models.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final T data = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    private final boolean onLastPage = false;
    public static final com.prestosoftware.test.rappi.models.Resource.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.prestosoftware.test.rappi.data.response.ErrorEnvelope getErrorEnvelope() {
        return null;
    }
    
    public final void setErrorEnvelope(@org.jetbrains.annotations.Nullable()
    com.prestosoftware.test.rappi.data.response.ErrorEnvelope p0) {
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object o) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.prestosoftware.test.rappi.models.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final boolean getOnLastPage() {
        return false;
    }
    
    public Resource(@org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.models.Status status, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    java.lang.String message, boolean onLastPage) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\u000bJ)\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u00052\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/prestosoftware/test/rappi/models/Resource$Companion;", "", "()V", "error", "Lcom/prestosoftware/test/rappi/models/Resource;", "T", "msg", "", "data", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/prestosoftware/test/rappi/models/Resource;", "loading", "(Ljava/lang/Object;)Lcom/prestosoftware/test/rappi/models/Resource;", "success", "onLastPage", "", "(Ljava/lang/Object;Z)Lcom/prestosoftware/test/rappi/models/Resource;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.prestosoftware.test.rappi.models.Resource<T> success(@org.jetbrains.annotations.Nullable()
        T data, boolean onLastPage) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.prestosoftware.test.rappi.models.Resource<T> error(@org.jetbrains.annotations.NotNull()
        java.lang.String msg, @org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.prestosoftware.test.rappi.models.Resource<T> loading(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}