package sef.module13.activity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bootcamp.starterapp.jdbc.DatabaseConnectionManager;

public class AccountDAOImpl implements AccountDAO {

    private Connection conn;
    private DatabaseConnectionManager databaseConnectionManager;

    public AccountDAOImpl(Connection conn) {
        this.conn = conn;
    }

    public AccountDAOImpl(DatabaseConnectionManager databaseConnectionManager) {
        this.databaseConnectionManager = databaseConnectionManager;
    }

    public List<Account> findAccount(String firstName, String lastName) throws AccountDAOException {
        String findAccountQuery = "SELECT * FROM ACCOUNT WHERE FIRST_NAME = ? OR LAST_NAME = ? ORDER BY ID ASC";
        List<Account> accounts = new ArrayList<>();
        try {
            PreparedStatement statement = databaseConnectionManager.getConnection().prepareStatement(findAccountQuery);
            statement.setString(1, firstName);
            statement.setString(2, lastName);

            ResultSet rows = statement.executeQuery();

            while (rows.next()) {
                // int accountID = rows.getInt(1);
                // String accountFirstName = rows.getString(2);
                // String accountLastName = rows.getString(3);
                // String accountEmail = rows.getString(4);

                // accounts.add(new AccountImpl(accountID, accountFirstName,
                // accountLastName, accountEmail));
                accounts.add(new AccountImpl(rows.getInt(1), rows.getString(2), rows.getString(3), rows.getString(4)));
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return accounts;
    }

    public Account findAccount(int id) throws AccountDAOException {
        AccountImpl account = null;
        try {
            PreparedStatement statement = databaseConnectionManager.getConnection().prepareStatement("SELECT * FROM ACCOUNT WHERE ID = ?");
            statement.setInt(1, id);
            ResultSet rows = statement.executeQuery();
            while (rows.next()) {
                account = new AccountImpl(rows.getInt(1), rows.getString(2), rows.getString(3), rows.getString(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;
    }

    public boolean insertAccount(String firstName, String lastName, String email) throws AccountDAOException {
        String insertAccountQuery = "INSERT INTO ACCOUNT VALUES (Account_SEQ.nextval,?,?,?)";
        int i = 0;
        try {

            PreparedStatement statement = conn.prepareStatement(insertAccountQuery);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, email);

            i = statement.executeUpdate();
            conn.commit();

        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }

        return i > 0;
    }

}
