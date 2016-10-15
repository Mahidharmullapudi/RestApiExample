package com.restapi.bd;

import com.restapi.User;
import com.restapi.dao.UserDao;
import java.sql.SQLException;
import java.util.List;

public class UserBd {

    public List<User> getUserDetails() throws SQLException, Exception {
        UserDao userdao = new UserDao();
        List<User> list;
        list = userdao.getUserDetails();
        System.out.println("the size of the list inside UserBd: " +list.size());
        return list;

    }

    public void addUser(User user) throws SQLException, Exception{
        UserDao userdao = new UserDao();
        userdao.addUser(user);
    }

}
