package br.com.estoque.model.user;

import java.util.Date;

public class TokenUser {

	private String token;
	private Date validateDate;
	
	//JAX-B precisa desse construtor
	TokenUser() {
	}

	public TokenUser(String token, Date validateDate) {
		this.token = token;
		this.validateDate = validateDate;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getvalidateDate() {
		return validateDate;
	}

	public void setvalidateDate(Date validateDate) {
		this.validateDate = validateDate;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TokenUser other = (TokenUser) obj;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TokenUser [token=" + token + ", validateDate=" + validateDate + "]";
	}
}
