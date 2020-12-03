package com.util;

import java.util.UUID;

@SuppressWarnings("all")
public class IDUtil {
    public static String getId(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
