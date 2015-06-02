package com.pennmutual.services.xml;

public class YNBooleanAdapterDefaultTrueStatic {
    public static Boolean parseStringToBoolean(String s) {
        return s == null ? true : s.toUpperCase().equals("Y");
    }

    public static String printStringToBoolean(Boolean c) {
        return c == null ? "Y" : c ? "Y" : "N";
    }
}