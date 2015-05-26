package com.humanbooster.zobi.business;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Login {
	private String login;
	private String password;

	private ArrayList<String> USER_TYPE = new ArrayList<String>() {{
	    add("admin");
	    add("veto");
	    add("soigneur");
	}};

	private ArrayList<String> joe = new ArrayList<String>() {{
	    add("joe");
	    add("dalton");
	    add("admin");
	}};

	private ArrayList<String> spider = new ArrayList<String>() {{
	    add("spider");
	    add("man");
	    add("veto");
	}};

	private ArrayList<String> luke = new ArrayList<String>() {{
	    add("luke");
	    add("skywalker");
	    add("soigneur");
	}};

	private ArrayList<ArrayList<String>> USER_LIST = new ArrayList<ArrayList<String>>() {{
	    add(joe);
	    add(spider);
	    add(luke);
	}};

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String validate() {

		for (ArrayList<String>  account : USER_LIST ) {
			if ((login.equals(account.get(0))) && (password.equals(account.get(1)))) {
				return account.get(2).toString();
			}
		}
		return "nok";
	}

}
