package bank.management.system;

import java.sql.*;

public class Con {
    Connection connection;
    Statement statement;

    public Con(){
        try{

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem1","root","Ssa$182358p");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
