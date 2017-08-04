package app;

import org.apache.struts.action.*;
import javax.servlet.http.*;
import java.io.*;

public class RegisterAction extends Action {
	public ActionForward perform(ActionMapping mapping, ActionForm form, HttpServletRequest req,
			HttpServletResponse res) {
		// ��Cast the form to the RegisterForm
		RegisterForm rf = (RegisterForm) form;
		String username = rf.getUsername();
		String password1 = rf.getPassword1();
		String password2 = rf.getPassword2();
		// ��Apply business logic
		if (password1.equals(password2)) {
			try {
				// ��Return ActionForward for success
				UserDirectory.getInstance().setUser(username, password1);
				return mapping.findForward("success");
			} catch (UserDirectoryException e) {
				return mapping.findForward("failure");
			}
		}
		// ��Return ActionForward for failure
		return mapping.findForward("failure");
	}
}