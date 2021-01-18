package demo;

import com.browserup.bup.BrowserUpProxy;
import com.browserup.bup.BrowserUpProxyServer;

public class ProxyServer {

	public static void main(String[] args) {
		BrowserUpProxy proxy = new BrowserUpProxyServer();
		proxy.addResponseFilter(new Listener());

		proxy.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		proxy.stop();
	}

}