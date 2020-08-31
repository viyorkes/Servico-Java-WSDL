package br.com.estoque.model.item;

import java.util.List;

public class ItensList {

	private List<Item> itens;

	public ItensList(List<Item> itens) {
		this.itens = itens;
	}

	ItensList() {
	}
	
	public List<Item> getItens() {
		return itens;
	}
	
}
