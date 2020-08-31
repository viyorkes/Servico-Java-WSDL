package br.com.estoque.ws;

import java.util.List;

import javax.jws.WebService;

import br.com.estoque.model.item.Item;
import br.com.estoque.model.item.ItemDao;



@WebService
public class EstoqueWS {

private ItemDao dao  = new ItemDao();




public List<Item> getItens(){
	
	List<Item> list= dao.allItens();
	return list;
	
	
}


}
