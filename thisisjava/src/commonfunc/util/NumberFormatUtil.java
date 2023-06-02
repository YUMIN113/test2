package commonfunc.util;

import java.text.DecimalFormat;

public class NumberFormatUtil {
	
	public static String toDecimalFormat(int price) {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(price);
	}
	
	
	public static String toDecimalFormat(long price) {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(price);
	}

}
