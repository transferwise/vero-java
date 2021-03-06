package com.vero.java.api.params;

import com.vero.java.serializer.Serializer;

/**
 * Complex parameter which serializes input {@link VeroData} into string.
 * Should be used for all complex parameters in Vero API. Such as :
 * <br>
 * {@code data} {@link Data}
 * <br>
 * {@code changes} {@link Changes}
 *  <br>
 * and so on.
 *
 * @author szagriichuk.
 */
public abstract class ComplexParam extends StringParam {
    public ComplexParam(VeroData param) {
        super(Serializer.serialize(param));
    }
}
