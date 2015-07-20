package com.pages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

@SuppressWarnings("deprecation")
public class GruyerePage {

	private static String Url = "http://google-gruyere.appspot.com/910808698420/login?uid=roxana&pw=test1";
	private static String UrlCreateSnippet = "http://google-gruyere.appspot.com//910808698420/newsnippet2?snippet=";
	private HttpClient client;

	public GruyerePage() {
		client = new DefaultHttpClient();
	}

	public void Login() {

		HttpGet Request = new HttpGet(Url);

		try {
			HttpResponse response = client.execute(Request);
			BufferedReader rd = new BufferedReader(new InputStreamReader(
					response.getEntity().getContent()));

			String line = "";
			while ((line = rd.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void CreateSnippets(String messageSnippet) {

		HttpGet Request = new HttpGet(UrlCreateSnippet + messageSnippet);

		try {
			HttpResponse response = client.execute(Request);
			BufferedReader rd = new BufferedReader(new InputStreamReader(
					response.getEntity().getContent()));

			String line = "";
			while ((line = rd.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}