package br.com.estoque.model.item;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item {

	private String code;
	private String name;
	private String type;
	private int quantity;

	Item() {
		super();
	}

	public Item(String code, String name, String type, int quantity) {
		super();
		this.code = code;
		this.name = name;
		this.type = type;
		this.quantity = quantity;
	}

	Item(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return this.code.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Item item = (Item)obj;
		return this.code.equals(item.code);
	}
	
	@Override
	public String toString() {
		return "Item [code=" + code + ", name=" + name + ", type=" + type + ", quantity="
				+ quantity + "]";
	}

	public static class Builder {
		
		private String code;
		private String name;
		private String type;
		private int quantity;
		
		public Builder comName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder comType(String type) {
			this.type = type;
			return this;
		}
		
		public Builder comCode(String code) {
			this.code = code;
			return this;
		}
		
		public Builder comQuantity(int quantity) {
			this.quantity = quantity;
			return this;
		}
		
		public Item build() {
			return new Item(this.code,this.name,this.type,this.quantity);
		}
		
	}
	
}
