package com.senlainc.ignathick.Task6;

public class Task6 {

    private String Value;

    public Task6(String value) {
        Value = value;
    }

    public String getValue() {
        return Value;
    }

    public String removeNumbers(){
        return Value.replaceAll("[0-9]", "");
    }
}
