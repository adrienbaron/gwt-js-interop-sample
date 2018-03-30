package com.axellience.gwtjsinteropsample.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public interface Parent
{
    @JsOverlay
    default String getParentName() {
        return "Parent";
    }
}
