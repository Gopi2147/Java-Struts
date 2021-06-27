package com.jsp.framework;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "mb")
@RequestScoped
public class MessageBean {
	private String message="INDIA INDIA INDIA";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
