package br.com.estoque.model.item;

import java.util.ArrayList;
import java.util.List;

public class ItemValidator {

	private Item item;

	public ItemValidator(Item item) {
		this.item = item;
	}

	public void validate() {
		List<String> erros = new ArrayList<>();
		
		String code = item.getCode();
		if(isEmpty(code) || code.length() != 3){
			erros.add("code invalido");
		}

		String name = item.getName();
		if(isEmpty(name) || name.length() < 3){
			erros.add("name invalido");
		}
		
		int quantity = item.getQuantity();
		if(quantity <= 0){
			erros.add("quantity invalida");
		}
		
		String type = item.getType();
		if(isEmpty(type) || !ItemType.existe(type)) {
			erros.add("type invalido");
		}
		
		if(!erros.isEmpty()){
//			throw new RuntimeException("argg"); 

			throw new ItemValidatorException(erros); 
		}
	}

	private boolean isEmpty(String valor) {
		return valor == null || valor.isEmpty();
	}

}
