package com.forms;

import org.apache.struts.action.ActionForm;

public class FirstForm extends ActionForm{
String message= "Hello World";

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

}
