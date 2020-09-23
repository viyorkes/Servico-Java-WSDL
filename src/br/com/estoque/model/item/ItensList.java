package br.com.estoque.model.item;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ItensList {
	
	@XmlElement(name ="item")
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
