package com.example.tests;

import org.junit.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import static org.junit.Assert.*;

public class DbTest {
    @Test
    public void h2Sample() throws Exception {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "sa", "");
        Statement st = conn.createStatement();
        st.execute("CREATE TABLE users(id INT PRIMARY KEY, name VARCHAR(255));");
        st.execute("INSERT INTO users VALUES(1, 'alice');");
        ResultSet rs = st.executeQuery("SELECT name FROM users WHERE id=1");
        assertTrue(rs.next());
        assertEquals("alice", rs.getString("name"));
        conn.close();
    }
}
