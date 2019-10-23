package com.senlainc.ignathick.Task5;

public class Task5 {

    private String value;
    private String mirrorValue = "";

    public Task5(String s) {
        value = s;
        createMirrorString();
    }

    public String getValue() {
        return value;
    }

    public String getMirrorValue() {
        return mirrorValue;
    }

    private void createMirrorString() {

        char [] MyAr = value.toCharArray();

        for (int i=MyAr.length-1; i>=0; i--) {
            mirrorValue += MyAr[i];
        }
    }

    public Boolean isPalindrome(){
        if (value.equals(mirrorValue)) {
            return true;
        } else {
            return false;
        }
    }

}
