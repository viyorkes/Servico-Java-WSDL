package br.com.estoque.model.item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class ItemDao {

	private static Map<String, Item> ITENS = new LinkedHashMap<>();

	public ItemDao() {
		popularItensNoMapa();
	}
	
	public void cadastrar(Item item) {
		ITENS.put(item.getCode(), item);
	}

	public ArrayList<Item> allItens(List<Filter> Filters) {
		
		ArrayList<Item> resultados = new ArrayList<Item>();
		Collection<Item> allItens = ITENS.values();

		if (Filters == null || Filters.isEmpty()) {
			resultados.addAll(allItens);
			return resultados;
		}
		
		for(Filter Filter : Filters) {
			for (Item item : allItens) {
				
				String tipe = Filter.getType().getName();
				String name = Filter.getName();
				
				if(itemPossuiTipo(item, tipe) && itemPossuiNome(item, name)){
					resultados.add(item);
				}
			}
		}
		
		return resultados;
	}

	//este método existe apenas para facilitar o primeiro exercicio que não usa o Filter
	public ArrayList<Item> allItens() {
		return new ArrayList<>(ITENS.values());
	}
	
	private boolean itemPossuiNome(Item item, String nome) {
		return item.getName().contains(nome);
	}

	private boolean itemPossuiTipo(Item item, String tipo) {
		return item.getType().equals(tipo);
	}
	
	public Item quantidadeDo(String codigo) {
		return ITENS.get(codigo);
	}
	

	
	private void popularItensNoMapa() {
		ITENS.put("MEA", new Item.Builder().comCode("MEA").comName("MEAN").comType("Livro").comQuantity(5).build());
		ITENS.put("MEA", new Item.Builder().comCode("SEO").comName("SEO na Prática").comType("Livro").comQuantity(4).build());
		ITENS.put("RUB", new Item.Builder().comCode("RUB").comName("Jogos com Ruby").comType("Livro").comQuantity(8).build());
		ITENS.put("GAL", new Item.Builder().comCode("GAL").comName("Galaxy Tab").comType("Tablet").comQuantity(3).build());
		ITENS.put("IP4", new Item.Builder().comCode("IP4").comName("IPhone 4 C").comType("Celular").comQuantity(7).build());
		ITENS.put("IP5", new Item.Builder().comCode("IP5").comName("IPhone 5").comType("Celular").comQuantity(3).build());
		ITENS.put("IP6", new Item.Builder().comCode("IP6").comName("IPhone 6 S").comType("Celular").comQuantity(10).build());
		ITENS.put("MOX", new Item.Builder().comCode("MOX").comName("Moto X").comType("Celular").comQuantity(6).build());
		ITENS.put("MOG", new Item.Builder().comCode("MOG").comName("Moto G").comType("Celular").comQuantity(8).build());
		ITENS.put("MXX", new Item.Builder().comCode("MXX").comName("Moto MAXX").comType("Celular").comQuantity(2).build());
	}



}
