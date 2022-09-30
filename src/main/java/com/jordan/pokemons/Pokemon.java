package com.jordan.pokemons;

import java.util.ArrayList;

public class Pokemon {

	private int id;
	private Name name;
	private ArrayList<String> type;
	private Base base;

	public Pokemon(int id, Name name, ArrayList type, Base base) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.base = base;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public ArrayList getType() {
		return type;
	}

	public void setType(ArrayList type) {
		this.type = type;
	}

	public Base getBase() {
		return base;
	}

	public void setBase(Base base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Pokemon{" + "id=" + id + ", name=" + name.toString() + ", type=" + type + ", base=" + base.toString()
				+ '}';
	}
}
