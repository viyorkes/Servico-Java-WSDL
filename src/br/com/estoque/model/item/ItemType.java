package br.com.estoque.model.item;

import javax.xml.bind.annotation.XmlEnumValue;

public enum ItemType {

	@XmlEnumValue("Livro")
	LIVRO("Livro"), 
	@XmlEnumValue("Celular")
	CELULAR("Celular"),
	@XmlEnumValue("Tablet")
	TABLET("Tablet");
	
	private String name;

	ItemType(String name) { 
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static boolean existe(String valor) {
		try{
			//joga IllegalArgumentException caso nao exista
			ItemType.valueOf(valor.toUpperCase());
		}catch(IllegalArgumentException e) {
			return false;
		}
		return true;
	}
}
