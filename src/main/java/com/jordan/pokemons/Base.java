package com.jordan.pokemons;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Base {

	@SerializedName(value = "HP")
	@Expose
	private int hp;
	@SerializedName(value = "Attack")
	@Expose
	private int attack;
	@SerializedName(value = "Defense")
	@Expose
	private int defense;
	@SerializedName(value = "Sp. Attack")
	@Expose
	private int sp_attack;
	@SerializedName(value = "Sp. Defense")
	@Expose
	private int sp_defense;
	@SerializedName(value = "Speed")
	@Expose
	private int speed;

	public Base(int hp, int attack, int defense, int sp_attack, int sp_defense, int speed) {
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.sp_attack = sp_attack;
		this.sp_defense = sp_defense;
		this.speed = speed;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getSp_attack() {
		return sp_attack;
	}

	public void setSp_attack(int sp_attack) {
		this.sp_attack = sp_attack;
	}

	public int getSp_defense() {
		return sp_defense;
	}

	public void setSp_defense(int sp_defense) {
		this.sp_defense = sp_defense;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "{hp=" + hp + ", attack=" + attack + ", defense=" + defense + ", sp_attack=" + sp_attack
				+ ", sp_defense=" + sp_defense + ", speed=" + speed + '}';
	}

}
