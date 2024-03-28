package design.proxy;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
	public static void main(String[] args) {
		Browser chrome = new Chrome("www.naver.com");
		chrome.rendering();
		chrome.rendering();
		chrome.rendering();
		chrome.rendering();

		Browser chrome2 = new ChromeCache("www.naver.com");
		chrome2.rendering();
		chrome2.rendering();
		chrome2.rendering();
		chrome2.rendering();
		chrome2.rendering();

		AtomicLong start = new AtomicLong();
		AtomicLong end = new AtomicLong();

		Browser aop = new AopBrowser("www.naver.com", () -> {
			System.out.println("시작");
			start.set(System.nanoTime());
		},

				() -> {
					System.out.println("끝");
					end.set(System.nanoTime());
					System.out.println(end.get() - start.get());
				});

		aop.rendering();
		aop.rendering();
		aop.rendering();
		aop.rendering();

	}
}
