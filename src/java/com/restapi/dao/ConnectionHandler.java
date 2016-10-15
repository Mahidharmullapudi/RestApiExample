
package com.restapi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionHandler {

    private ConnectionHandler(){
        
    }
    
    public static Connection getConnection() throws Exception{
        DataSource dataSource;
        try {            
            dataSource = (DataSource) new InitialContext().lookup("jdbc/test");
            System.out.println("The datasource");
        } catch (NamingException e) {
            throw new ExceptionInInitializerError(e);
        }
        try{
             return dataSource.getConnection();
        } catch(SQLException sqle){
            throw sqle;
        }
            
    }
    
    public static void close(Connection conn) throws SQLException{
        if(conn!=null){
            conn.close();
        }
        
    }

    public static void close(PreparedStatement pstmt) throws SQLException{
        if(pstmt!=null){
            pstmt.close();
        }
    }
    
    public static void close(ResultSet rs) throws SQLException{
        if(rs!=null){
            rs.close();
        }
    }
    
}
