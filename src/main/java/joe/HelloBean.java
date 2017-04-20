package joe;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;
import java.util.Calendar;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;

	public String getName() {
		System.out.println("Time=" + Calendar.getInstance().getTime());
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}