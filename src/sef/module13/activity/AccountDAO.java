package sef.module13.activity;

import java.util.List;

import com.bootcamp.starterapp.jdbc.DatabaseConnectionManager;

public interface AccountDAO {

	public List<Account> findAccount(String firstName, String lastName) throws AccountDAOException;
	
	
	/**
	 * Returns a specific account that matches the specified ID
	 * 
	 * @param id the id of the account
	 * @return an account that matches the ID specified, null if no match is found
	 * 
	 * @throws AccountDAOException when a problem occurs during search
	 */
	public Account findAccount(int id) throws AccountDAOException;
	
	
	
	/**
	 * Adds a new account based on the values passed
	 * 
	 * @param firstName the first name of the account
	 * @param lastName the last name of the account
	 * @param email the email of the account
	 * 
	 * @return true if a row was inserted	 
	 * 
	 * @throws AccountDAOException thrown when a problem occurs during search
	 */
	public boolean insertAccount(String firstName, String lastName, String email) throws AccountDAOException;
	
}