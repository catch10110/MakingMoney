package org.tracking.money.util;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class RestHelper {
	private static final HttpClient httpClient = HttpClientBuilder.create().build();
	
	public static HttpResponse getRequest(String base, HttpGet getRequest) throws ClientProtocolException, IOException {
		return httpClient.execute(getRequest);
	}
}
