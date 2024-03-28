package design.strategy;

import java.net.URLEncoder;

public class Utf8Encoding implements EncodingStrategy {

	@Override
	public String encode(String msg) {
		String result = "";
		try {
			result = URLEncoder.encode(msg, "UTF-8");

		} catch (Exception e) {

		}
		return result;
	}

}
