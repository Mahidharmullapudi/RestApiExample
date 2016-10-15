package com.restapi.dao;

import com.restapi.User;
import java.sql.Connection;
import java.sql.SQLException;
import com.restapi.constants.QueryConstants;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public List<User> getUserDetails() throws SQLException, Exception {
        String query = QueryConstants.getUserDetails;
        List<User> list = new ArrayList<>();
        User user;
        try {
            Connection conn = ConnectionHandler.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                user = new User();
                user.setId(rs.getString("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                user.setProfession(rs.getString("profession"));
                user.setProcess_status(rs.getString("process_status"));
                System.out.println(user.toString());
                list.add(user);
            }

        } catch (Exception ex) {
            throw ex;
        }

        return list;

    }

    public void addUser(User user) throws Exception{
        String query = QueryConstants.insertUser;
        Connection conn = null;
        PreparedStatement pstmt = null;
            
        try {
            conn = ConnectionHandler.getConnection();
            pstmt = conn.prepareStatement(query);
            
            pstmt.setString(1, user.getId());
            pstmt.setString(2, user.getName());
            pstmt.setInt(3, user.getAge());
            pstmt.setString(4, user.getProfession());
            pstmt.setString(5, user.getProcess_status());
            
            pstmt.executeUpdate();
            
        } catch (Exception ex) {
            throw ex;
        } finally{
            ConnectionHandler.close(pstmt);
            ConnectionHandler.close(conn);            
        }        
    }

}
