package org.max.seminar;

import org.hibernate.query.Query;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.max.demo.EmployeeEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientTest extends AbstractTest {

    @Test
    void getClients_whenValid_shouldReturn() throws SQLException {
        //given
        String sql = "Select * from client";
        Statement stmt  = getConnection().createStatement();
        int count = 0;
        //when
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            count++;
        }
        //then
        Assertions.assertEquals(3, count);
    }

    @Test
    void getCountTestORM() {
        //given
        //when
        final Query query = getSession().createSQLQuery("Select * from client")
                .addEntity(ClientEntity.class);
        Assertions.assertEquals(3, query.getResultList().size());
    }


    @ParameterizedTest
    @CsvSource({"1, Иванов", "2, Петров", "3, Сидоров"})
    void getClientById_whenValid_shouldReturn(int id, String lastName) throws SQLException {
        //given
        String sql = "SELECT * FROM client WHERE client_id=" + id;
        Statement stmt  = getConnection().createStatement();
        String nameRes = "";
        //when
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            nameRes = rs.getString(3);
        }
        //then
        Assertions.assertEquals(lastName, nameRes);
    }
}
