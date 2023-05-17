package practice17;

public class DateDotUtil {

	
	public static String dotDate(String date) {
		String year = date.substring(0, 4);
        String month = date.substring(4, 6);
        String day = date.substring(6, 8);
        
        return year + "." + month + "." + day;
	}
	
	public static String dashDate(String date) {
		String year = date.substring(0, 4);
        String month = date.substring(4, 6);
        String day = date.substring(6, 8);
        
        return year + "-" + month + "-" + day;
	}
	
}
