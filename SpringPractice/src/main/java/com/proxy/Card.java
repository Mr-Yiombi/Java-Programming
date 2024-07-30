package com.proxy;

public class Card implements PayInterface {
	
	@Override
	public void payment() {
		System.out.println("카드으로 결제한다");
	}
}
