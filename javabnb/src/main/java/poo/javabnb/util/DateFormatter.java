/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.javabnb.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatter {
    private static final SimpleDateFormat originalFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
    private static final SimpleDateFormat targetFormat = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);

    public static String reformatDate(String originalDateStr) {
        try{
        Date date = originalFormat.parse(originalDateStr);
        return targetFormat.format(date);}
        catch(Exception e){
            return "00 000";
        }
    }
}