package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Users {
	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "password")
	private String password;

	@Column(name = "fullName")
	private String fullName;

	@Column(name = "email")
	private String email;

	@Column(name = "admin")
	private boolean admin;

	public Users() {
		super();
	}

	public Users(String id, String password, String fullName, String email, boolean admin) {
		super();
		this.id = id;
		this.password = password;
		this.fullName = fullName;
		this.email = email;
		this.admin = admin;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
}
