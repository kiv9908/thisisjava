package design.proxy;

public class AopBrowser implements Browser {

	private String url;
	private WebSite site;
	private Runnable start;
	private Runnable end;

	public AopBrowser(String url, Runnable start, Runnable end) {
		this.url = url;
		this.start = start;
		this.end = end;

	}

	@Override
	public WebSite rendering() {
		start.run();

		if (site == null) {
			System.out.println("렌더링");
			site = new WebSite(this.url);
		}
		System.out.println("캐싱");
		end.run();
		return site;
	}

}
