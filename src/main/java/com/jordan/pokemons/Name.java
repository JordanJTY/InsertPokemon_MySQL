package com.jordan.pokemons;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Name {

	@SerializedName(value = "english")
	@Expose
	private String english;
	@SerializedName(value = "japanese")
	@Expose
	private String japanese;
	@SerializedName(value = "chinese")
	@Expose
	private String chinese;
	@SerializedName(value = "french")
	@Expose
	private String french;

	public Name(String english, String japanese, String chinese, String french) {
		this.english = english;
		this.japanese = japanese;
		this.chinese = chinese;
		this.french = french;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getJapanese() {
		return japanese;
	}

	public void setJapanese(String japanese) {
		this.japanese = japanese;
	}

	public String getChinese() {
		return chinese;
	}

	public void setChinese(String chinese) {
		this.chinese = chinese;
	}

	public String getFrench() {
		return french;
	}

	public void setFrench(String french) {
		this.french = french;
	}

	@Override
	public String toString() {
		return "{english=" + english + ", japanese=" + japanese + ", chinese=" + chinese + ", french=" + french + '}';
	}

}
