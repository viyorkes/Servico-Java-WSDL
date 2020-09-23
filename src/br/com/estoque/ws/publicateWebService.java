package br.com.estoque.ws;

import javax.xml.ws.Endpoint;

public class publicateWebService {

	
	
	
	public static void main(String[] args) {
		
		EstoqueWS implementationWS = new EstoqueWS();
		String URL = "http://localhost:8081/estoquews";

		System.out.println("EstoqueWS rodando: " + URL);

		// associando URL com a implementacao
		Endpoint.publish(URL, implementationWS);
	}
}
