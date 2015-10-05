package joe;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
@SessionScoped
public class SessionInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	public String getSessionId() {
		HttpSession session = getHttpSession();
		String sessionId = session.getId();
		return sessionId;
	}

	private HttpSession getHttpSession() {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
		return session;
	}

}
