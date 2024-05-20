package Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@Autowired
	DAO obj;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user() {
		return "User";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String DAO() {
		obj.getName();
		return "User";
	}

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String User() {
		return "UserForm";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@Autowired
	public String form(User user) {
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		return "Welcome";
	}
}
