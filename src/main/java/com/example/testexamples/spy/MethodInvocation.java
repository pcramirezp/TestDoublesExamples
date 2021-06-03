package com.example.testexamples.spy;

import java.util.ArrayList;
import java.util.List;

public class MethodInvocation {

    private List<Object> params = new ArrayList<>();
    private Object returnedValue = null;
    private String method;

    public List<Object> getParams() {
        return params;
    }

    public MethodInvocation addParam(Object parm){
        getParams().add(parm);
        return this;
    }

    public Object getReturnedValue() {
        return returnedValue;
    }

    public MethodInvocation setReturnedValue(Object returnedValue) {
        this.returnedValue = returnedValue;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public MethodInvocation setMethod(String method) {
        this.method = method;
        return this;
    }
}
