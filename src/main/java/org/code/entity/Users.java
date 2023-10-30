package org.code.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * users
 * @author admin
 */
@Data
public class Users implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * username
	 */
	private String username;
	/**
	 * password
	 */
	private String password;
	/**
	 * enabled
	 */
	private Boolean enabled;

	/**
	 * Users
	 * @param username username
	 * @param password password
	 * @param enabled  enabled
	 */
	public Users(String username, String password, Boolean enabled) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}
}