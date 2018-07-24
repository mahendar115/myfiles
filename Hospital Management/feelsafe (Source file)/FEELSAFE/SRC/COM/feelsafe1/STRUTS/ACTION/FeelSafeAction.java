/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.feelsafe1.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import com.feelsafe.struts.form.FeelSafeForm;

import feelsafeLogic.FeelSafeLogic;

/** 
 * MyEclipse Struts
 * Creation date: 03-01-2008
 * 
 * XDoclet definition:
 * @struts.action path="/feelSafe" name="feelSafeForm" input="/index.jsp" scope="request" validate="true"
 */
public class FeelSafeAction extends DispatchAction {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	
	public ActionForward login(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");

		return mapping.findForward("login");
	}

	public ActionForward loginpage(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		feelSafeForm.setErrorMessage("");
		//------------- Check the username and password from the database --------------
		
		FeelSafeLogic feelSafeLogic=new FeelSafeLogic();
		feelSafeForm.setErrorMessage("");
		if(feelSafeLogic.verifyUser(feelSafeForm.getUsername(), feelSafeForm.getPassword())==2)
			return mapping.findForward("employee");
		else if(feelSafeLogic.verifyUser(feelSafeForm.getUsername(), feelSafeForm.getPassword())==0)
			return mapping.findForward("patientdetails");
		feelSafeForm.setUsername("");
		feelSafeForm.setPassword("");
		feelSafeForm.setErrorMessage("Invalid User");
		return mapping.findForward("login");
		
/*		
		
		if(feelSafeForm.getUsername().equals("feelsafe")&&feelSafeForm.getPassword().equals("feelsafe"))
			return mapping.findForward("employee");
		feelSafeForm.setUsername("");
		feelSafeForm.setPassword("");
		feelSafeForm.setErrorMessage("Invalid User");
		return mapping.findForward("login");*/
	}
	
	public ActionForward admin1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		
		return mapping.findForward("adminlogin");
	}
	
	public ActionForward admin11(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		FeelSafeLogic feelSafeLogic=new FeelSafeLogic();
		feelSafeForm.setErrorMessage("");
		if(feelSafeLogic.verifyUser(feelSafeForm.getUsername(), feelSafeForm.getPassword())==1)
			return mapping.findForward("adminmainpage");
		feelSafeForm.setUsername("");
		feelSafeForm.setPassword("");
		feelSafeForm.setErrorMessage("Invalid User");
		return mapping.findForward("adminlogin");
	}


	public ActionForward newuser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		FeelSafeLogic feelSafeLogic=new FeelSafeLogic();
		feelSafeForm.setErrorMessage("");
		if(feelSafeLogic.addNewEmployee(feelSafeForm.getUserid(), feelSafeForm.getPassword(), feelSafeForm.getFirstname(), feelSafeForm.getLastname(), feelSafeForm.getPermanentaddress(), feelSafeForm.getPhonenumber(), Integer.valueOf(feelSafeForm.getSex()), feelSafeForm.getNationality(), feelSafeForm.getTextverification(), 0, feelSafeForm.getConsultinghours(), feelSafeForm.getQualification(), feelSafeForm.getSpecialist())==1)
			feelSafeForm.setErrorMessage("User Name Created Successfully");
		else
			feelSafeForm.setErrorMessage("User Name Already Exixts (Create with New User Name)");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("login");
		//--------------- Create a new user in the database --------------
	}
	
	public ActionForward employees(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Coding for the login users --------------
		return mapping.findForward("login");
	}
	
	public ActionForward frontofficemanager(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("frontofficemanager");
	}

	public ActionForward doctordetails(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("doctordetails");
	}
	
	public ActionForward doctordetails1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("doctordetails");
	}

	public ActionForward healthawareness(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("healthawareness");
	}
	
	public ActionForward healthawareness1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("healthawareness");
	}
	
	public ActionForward systemreports(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("systemreport");
	}
	
	
	
	
	public ActionForward appointmentscheduling(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("appointmentscheduling");
	}
	
	public ActionForward appointmentscheduling1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		FeelSafeLogic feelSafeLogic=new FeelSafeLogic();
		if(feelSafeLogic.appointmentScheduling(feelSafeForm.getPatientname(), Integer.valueOf(feelSafeForm.getPatientage()), Integer.valueOf(feelSafeForm.getPatientsex()), feelSafeForm.getPatienthealthproblem(), feelSafeForm.getPatientdate(), request.getParameter("patienttime"))==1)
			feelSafeForm.setErrorMessage("Appointment OK");
		else
			feelSafeForm.setErrorMessage("No Appointment");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("appointmentscheduling");
	}

	public ActionForward appointmentrescheduling(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("appointmentrescheduling");
	}

	public ActionForward patientinformation(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("login");
	}
	
	public ActionForward roomassignment(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("login");
	}

	
	
	
	
	public ActionForward appointmentreports(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("appointmentreports");
	}
	
	public ActionForward appointmentreports1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("appointmentreports");
	}
	
	public ActionForward loginerrors(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("login");
	}
	
	public ActionForward billgeneration(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("login");
	}
	
	public ActionForward addnewequipment(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("addnewequipment");
	}
	
	public ActionForward addnewequipment1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		FeelSafeLogic feelSafeLogic=new FeelSafeLogic();
		if(feelSafeLogic.addNewEquipment(feelSafeForm.getEquipmentname(), Float.valueOf(feelSafeForm.getEquipmentfees()))==1)
			feelSafeForm.setErrorMessage("Equipment Added Successfully");
		else
			feelSafeForm.setErrorMessage("Equipment Not Added");
		
		//------------- Check the username and password from the database --------------
		return mapping.findForward("addnewequipment");
	}

	public ActionForward addemployee(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		System.out.println("Checking...");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("newuseradmin");
	}

	public ActionForward addemployee1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FeelSafeForm feelSafeForm = (FeelSafeForm) form;// TODO Auto-generated method stub
		FeelSafeLogic feelSafeLogic=new FeelSafeLogic();
		feelSafeForm.setErrorMessage("");
		if(feelSafeLogic.addNewEmployee(feelSafeForm.getUserid(), feelSafeForm.getPassword(), feelSafeForm.getFirstname(), feelSafeForm.getLastname(), feelSafeForm.getPermanentaddress(), feelSafeForm.getPhonenumber(), Integer.valueOf(feelSafeForm.getSex()), feelSafeForm.getNationality(), feelSafeForm.getTextverification(), Integer.valueOf(feelSafeForm.getType()), feelSafeForm.getConsultinghours(), feelSafeForm.getQualification(), feelSafeForm.getSpecialist())==1)
			feelSafeForm.setErrorMessage("User Name Created Successfully");
		else
			feelSafeForm.setErrorMessage("User Name Already Exixts (Create with New User Name)");
		//------------- Check the username and password from the database --------------
		return mapping.findForward("newuseradmin");
	}
	


	
	
	

	

}