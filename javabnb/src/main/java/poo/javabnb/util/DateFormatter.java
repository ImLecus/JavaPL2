
package poo.javabnb.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatter {
    private static final SimpleDateFormat originalFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
    private static final SimpleDateFormat targetFormat = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);

    
    
    /**
     * @param originalDateStr the date to be reformated
     * @return 
     */
    public static String reformatDate(String originalDateStr) {
        try{
        Date date = originalFormat.parse(originalDateStr);
        return targetFormat.format(date);}
        catch(Exception e){
            return "00 000";
        }
    }
}