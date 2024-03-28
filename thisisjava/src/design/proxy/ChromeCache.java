package design.proxy;

public class ChromeCache implements Browser {

	private String url;
	private WebSite site;

	public ChromeCache(String url) {
		this.url = url;
	}

	@Override
	public WebSite rendering() {
		if (site == null) {
			System.out.println("웹사이트 렌더링");
			site = new WebSite(this.url);
		}
		System.out.println("캐싱");
		return site;
	}

}
