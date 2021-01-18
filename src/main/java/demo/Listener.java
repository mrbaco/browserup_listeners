package demo;

import com.browserup.bup.filters.ResponseFilter;
import com.browserup.bup.util.HttpMessageContents;
import com.browserup.bup.util.HttpMessageInfo;
import io.netty.handler.codec.http.HttpResponse;

public class Listener implements ResponseFilter {

	@Override
	public void filterResponse(HttpResponse response, HttpMessageContents contents, HttpMessageInfo messageInfo) {

	}
}