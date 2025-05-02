package com.javaex.ex09;

public class StringUtil {
    
	public static String concatString(String[] strArray) {
       
		StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strArray.length; i++) {
            sb.append(strArray[i]);
        }

        return sb.toString();
        
    }

}
