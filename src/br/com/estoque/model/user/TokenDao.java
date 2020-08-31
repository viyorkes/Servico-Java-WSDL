package br.com.estoque.model.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;


public class TokenDao {

	private static Map<TokenUser, User> USERS = new LinkedHashMap<>();

	public TokenDao() {
		popularUSERSNoMapa();
	}
	
	public boolean ehValido(TokenUser user) {
		return USERS.containsKey(user);
	}
	
	private void popularUSERSNoMapa() {
		USERS.put(new TokenUser("AAA", parseDate("31/12/2015")), new User.Builder().comName("Nico").comLogin("nico").comPassword("pass").build());
		USERS.put(new TokenUser("BBB", parseDate("31/12/2015")), new User.Builder().comName("Flavio").comLogin("flavio").comPassword("pass").build());
		USERS.put(new TokenUser("CCC", parseDate("31/12/2015")), new User.Builder().comName("Fabio").comLogin("fabio").comPassword("pass").build());
		USERS.put(new TokenUser("DDD", parseDate("31/12/2015")), new User.Builder().comName("Romulo").comLogin("Romulo").comPassword("pass").build());
	}


	private Date parseDate(String dataComoString) {
		try {
			return new SimpleDateFormat("dd/MM/yyyy").parse(dataComoString);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}



}
