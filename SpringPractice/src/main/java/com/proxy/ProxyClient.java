package com.proxy;

public class ProxyClient {
	public static void main(String[] agrs) {
		//proxy를 생성하고, interface에 대입
		PayInterface pay = new PayProxy(new Card());
		
		pay.payment();
		test(null, null);
	}
	
	private static int test(String a, String b) {
		if(a == null || b == null) {
			return 0;
		}
		return a.length() + b.length();
		
	}
}
