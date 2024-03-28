package ch19.urlEX;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlEx {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.hrd.go.kr/hrdp/ma/pmmao/newIndexRenewal.do");
		System.out.println(url.getHost()); // 도메인
		System.out.println(url.getPath()); // .do로 끝나면 스프링으로 개발

		// 네트워크 + 입출력시스템
		InputStream in = url.openStream();
		// 보조 스트림 추가
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		int data = 0;
		while ((data = br.read()) != -1) {
			System.out.print((char) data);
		}

		// URLConnection
		URLConnection con = url.openConnection();
		BufferedReader br2 = new BufferedReader(new InputStreamReader(con.getInputStream()));

		int data2 = 0;
		while ((data = br.read()) != -1) {
			System.out.print((char) data2);
		}

	}

}
