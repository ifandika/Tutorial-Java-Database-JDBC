package com.javadbase.id;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.javadbase.id.connection.ConnectToDBase;
import org.junit.Test;

import java.sql.SQLException;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() throws SQLException {
        assertEquals(new ConnectToDBase().connect(
                "jdbc:mysql://localhost:3306",
                "root",
                "mifandika"
        ), true);
    }
}
