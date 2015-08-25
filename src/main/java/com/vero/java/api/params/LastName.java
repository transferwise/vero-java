package com.vero.java.api.params;

/**
 * @author szagriichuk.
 */
public class LastName extends StringParam {
    public LastName(String param) {
        super(param);
    }

    @Override
    public String name() {
        return "lastname";
    }
}
