package com.urvi.dao;

import java.util.ArrayList;

import com.urvi.pojo.User;

public class UserDAO {
ArrayList<User> userlist;
public UserDAO(){
userlist=new ArrayList<>();
userlist.add(new User("urvi","java","Admin"));
userlist.add(new User("kajal","sql","User"));
userlist.add(new User("shweta","sql","Admin"));
}
public String getUserType(String userName,String password) 
{
	for(User user:userlist)
	{
		if(user.getUserName().equals(userName) && user.getPassword().equals(password))
		{
			return user.getUserType();
		}
	}
	return "invalid";
}
}