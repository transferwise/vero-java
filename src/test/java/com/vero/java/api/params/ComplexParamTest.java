package com.vero.java.api.params;

/**
 * @author szagriichuk.
 */
public abstract class ComplexParamTest extends BaseParamTest<VeroData<String>> {
    @Override
    VeroData<String> getParamValue() {
        VeroData<String> data = new VeroData<>();
        data.add("test", "test1");
        return data;
    }
}
