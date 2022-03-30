package com.prestosoftware.test.rappi.data.mappers;

import com.prestosoftware.test.rappi.data.response.NetworkResponseModel;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/prestosoftware/test/rappi/data/mappers/NetworkResponseMapper;", "FROM", "Lcom/prestosoftware/test/rappi/data/response/NetworkResponseModel;", "", "onLastPage", "", "response", "(Lcom/prestosoftware/test/rappi/data/response/NetworkResponseModel;)Z", "app_debug"})
public abstract interface NetworkResponseMapper<FROM extends com.prestosoftware.test.rappi.data.response.NetworkResponseModel> {
    
    public abstract boolean onLastPage(@org.jetbrains.annotations.NotNull()
    FROM response);
}