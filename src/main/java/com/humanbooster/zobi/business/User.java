package com.humanbooster.zobi.business;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class User {
	private ArrayList<String> USER_TYPE = new ArrayList<String>() {
		{
			add("admin");
			add("veto");
			add("soigneur");
		}
	};

	private String lastname;
	private String firstname;
	private String login;
	private String password;
	private String retypepassword;
	private String userType;

	public ArrayList<String> getUSER_TYPE() {
		return USER_TYPE;
	}

	public void setUSER_TYPE(ArrayList<String> uSER_TYPE) {
		USER_TYPE = uSER_TYPE;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

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

	public String getRetypepassword() {
		return retypepassword;
	}

	public void setRetypepassword(String retypepassword) {
		this.retypepassword = retypepassword;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String validate() {
		return "ok";
	}

	public void validatePassword(FacesContext context, UIComponent component,
			Object value) {
		password = String.valueOf(value);
	}

	public void validateRetypepassword(FacesContext context,
			UIComponent component, Object value) throws ValidatorException {
		retypepassword = String.valueOf(value);
		if (!password.equals(retypepassword)) {
			throw new ValidatorException(new FacesMessage());
		}
	}
}
