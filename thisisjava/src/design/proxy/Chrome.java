package design.proxy;

public class Chrome implements Browser {

	private String url;

	public Chrome(String url) {
		this.url = url;
	}

	@Override
	public WebSite rendering() {
		System.out.println("웹 사이트 렌더링");
		WebSite site = new WebSite(this.url);
		return site;
	}

}
