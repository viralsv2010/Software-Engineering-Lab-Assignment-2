

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "LoginBean")
@SessionScoped

public class LoginBean {

	String username;
	String password;
	
	public String getUsername(){
		return username;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}
	
	public String ValidateUser()
	{
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin"))
		{
			clear();
			return "matched";
		}
		else
		{
			clear();
			return "unmatched";
		}
	}
	
	public void clear(){
		setPassword(null);
		setUsername(null);
	}
}
