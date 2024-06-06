package com.infosys;

//import com.infosys.pojo.Task;//only Task class is imported...
//import com.infosys.pojo.User;//only User class is imported...

import com.infosys.pojo.*;//here with ".*" will import all the classes from the "com.infosys.pojo" package...


class Car {
	
	int i = 4;
	
	public void printUsername() {
		User user = new User();
		System.out.println(user.username);
		
		Task task = new Task();
		System.out.println(task.taskId);
	}

}
