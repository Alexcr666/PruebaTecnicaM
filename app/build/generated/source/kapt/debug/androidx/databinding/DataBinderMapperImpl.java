package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.prestosoftware.test.DataBinderMapperImpl());
  }
}
