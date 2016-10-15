

package com.restapi.constants;

public class QueryConstants {
    
    public static final String getUserDetails = "SELECT * FROM test.user";
    
    public static final String insertUser = "insert into "
            + "test.user(id, name, age, profession, process_status)"
            + "values(?,?,?,?,?)";
    
}
