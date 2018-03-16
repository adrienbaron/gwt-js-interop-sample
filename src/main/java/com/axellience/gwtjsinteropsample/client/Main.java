package com.axellience.gwtjsinteropsample.client;

import com.google.gwt.core.client.EntryPoint;
import elemental2.core.Function;
import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLDivElement;
import jsinterop.base.JsPropertyMap;

public class Main implements EntryPoint
{
    public void onModuleLoad()
    {
        Parent parent = new Parent();
        Child child = new Child();

        HTMLDivElement divElement = (HTMLDivElement) DomGlobal.document.createElement("div");
        divElement.innerHTML += "<b>From GWT</b><br/><br/>";
        divElement.innerHTML += "Parent property: " + parent.parentName + "<br/>";
        divElement.innerHTML += "Child parent property: " + child.parentName + "<br/>";
        divElement.innerHTML += "Child property: " + child.childName + "<br/>";

        DomGlobal.document.body.appendChild(divElement);

        // Call on ready
        ((JsPropertyMap<Function>) DomGlobal.window).get("onGWTReady").call();
    }
}