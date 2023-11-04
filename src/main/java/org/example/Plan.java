package org.example;

import netscape.javascript.JSObject;

public class Plan {
    String id;
    String name;
    JSObject features;
    String planCode;

    public Plan(String id, String name, JSObject features, String planCode) {
        this.id = id;
        this.name = name;
        this.features = features;
        this.planCode = planCode;
    }
}
