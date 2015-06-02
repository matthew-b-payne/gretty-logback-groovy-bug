package com.pennmutual.services.xml;

public class YNBooleanAdapterDefaultFalseStatic {
    public static Boolean parseStringToBoolean(String s) {
        return s == null ? false : s.toUpperCase().equals("Y");
    }

    public static String printStringToBoolean(Boolean c) {
        return c == null ? "N" : c ? "Y" : "N";
    }
}