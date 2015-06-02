package com.pennmutual.services.xml;

public class YNBooleanAdapterStatic {
    public static Boolean parseStringToBoolean(String s) {
        return s == null ? null : s.toUpperCase().equals( "Y" );
    }

    public static String printStringToBoolean(Boolean c) {
        return c == null ? null : c ? "Y" : "N";
    }
}