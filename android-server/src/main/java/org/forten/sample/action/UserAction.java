package org.forten.sample.action;

import java.util.ArrayList;
import java.util.List;

import org.forten.sample.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserAction {
	@RequestMapping("listAll")
	public @ResponseBody List<User> listAll() {
		List<User> list = new ArrayList<User>();

		User u1 = new User(1, "Tom", 25, "aaa@lkj.com");
		User u2 = new User(2, "Mike", 35, "bbb@lkj.com");
		User u3 = new User(3, "Mary", 15, "ccc@lkj.com");
		User u4 = new User(4, "Jack", 26, "ddd@lkj.com");
		User u5 = new User(5, "Helen", 38, "eee@lkj.com");
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		list.add(u5);

		return list;
	}

	@RequestMapping("save")
	public @ResponseBody User save(@RequestBody User user) {
		System.out.println(user);
		return user;
	}
}
