package br.com.estoque.ws;
	
	import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
	
	import br.com.estoque.model.item.Item;
	import br.com.estoque.model.item.ItemDao;
import br.com.estoque.model.item.ItensList;
	
	
	
	@WebService
	public class EstoqueWS {
	
	private ItemDao dao  = new ItemDao();
	
	
	
	@WebMethod(operationName="allItens")
	@WebResult(name ="itens")
	public ItensList getItens(){
		
		List<Item> list= dao.allItens();
		return new ItensList(list);
		
		
	}
	
	
	}
