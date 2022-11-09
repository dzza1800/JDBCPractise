package com.qa.project.finance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {
    //Main setup but not used yet, will be inherited so dw about this section, it was for teaching the people in my group cos they were confused.    
	DBConfig db = new DBConfig();
    Statement stmt = null;
    Connection conn = db.connect();
}