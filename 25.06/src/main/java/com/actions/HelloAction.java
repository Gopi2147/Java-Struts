package com.actions;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.forms.FirstForm;
public class HelloAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
//		return super.execute(mapping, form, request, response);
		FirstForm firstform= (FirstForm) form;
		request.setAttribute("oldvalue", firstform.getMessage());
		firstform.setMessage("This is updated");
		request.setAttribute("first", "Hip Hop");
		return mapping.findForward("success");
	}	
}
