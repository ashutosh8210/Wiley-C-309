package com.pack.ch09;

import org.springframework.web.client.RestTemplate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestTemplate template=new RestTemplate();
		System.out.println(template.getForObject("http://localhost:8080/Spring_Restful/welcome",String.class));

	}

}
