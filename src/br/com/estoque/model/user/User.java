package br.com.estoque.model.user;

public class User {

	private String name;
	private String login;
	private String password;
	
	User(String name, String login, String password) {
		this.name = name;
		this.login = login;
		this.password = password;
	}

	public String getname() {
		return name;
	}

	public String getLogin() {
		return login;
	}

	public String getpassword() {
		return password;
	}
	
	public static class Builder {
		
		private String name;
		private String login;
		private String password;
		
		public Builder comName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder comLogin(String login) {
			this.login = login;
			return this;
		}
		
		public Builder comPassword(String password) {
			this.password = password;
			return this;
		}
		
		public User build() {
			return new User(name,login,password);
		}
	}
}
	
	