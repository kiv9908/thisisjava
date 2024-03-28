package design.strategy;

import java.net.URLEncoder;

public class EUCkrEncoding implements EncodingStrategy {

	@Override
	public String encode(String msg) {
		String result = "";
		try {
			result = URLEncoder.encode(msg, "EUC-KR");

		} catch (Exception e) {

		}
		return result;
	}

}
