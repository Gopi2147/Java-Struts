package com.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.forms.PersonForm;

public class DataAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
//		return super.execute(mapping, form, request, response);
		return mapping.findForward("success");
	}
	public ActionForward store(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
       System.out.println("Store got invoked");
		// TODO Auto-generated method stub
        PersonForm person=(PersonForm)form;
        request.setAttribute("empID", person.getEmpID());
        request.setAttribute("name", person.getName());
        request.setAttribute("city", person.getCity());
        request.setAttribute("designation", person.getDesignation());
		return mapping.findForward("result");
	}
}
