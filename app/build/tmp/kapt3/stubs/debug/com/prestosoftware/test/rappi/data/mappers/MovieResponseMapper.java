package com.prestosoftware.test.rappi.data.mappers;

import com.prestosoftware.test.rappi.data.response.MovieListResponse;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/prestosoftware/test/rappi/data/mappers/MovieResponseMapper;", "Lcom/prestosoftware/test/rappi/data/mappers/NetworkResponseMapper;", "Lcom/prestosoftware/test/rappi/data/response/MovieListResponse;", "()V", "onLastPage", "", "response", "app_debug"})
public final class MovieResponseMapper implements com.prestosoftware.test.rappi.data.mappers.NetworkResponseMapper<com.prestosoftware.test.rappi.data.response.MovieListResponse> {
    
    @java.lang.Override()
    public boolean onLastPage(@org.jetbrains.annotations.NotNull()
    com.prestosoftware.test.rappi.data.response.MovieListResponse response) {
        return false;
    }
    
    public MovieResponseMapper() {
        super();
    }
}