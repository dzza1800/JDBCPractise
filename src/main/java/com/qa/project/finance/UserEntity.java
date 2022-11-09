package com.qa.project.finance;

public class UserEntity {
	
	int id; //heroes

	private String Username; //heroes
	private String Password; //heroes
	public UserEntity() {
		
	}
	public UserEntity(int id, String Username, String Password) {
		this.id = id;
		this.Username = Username;
		this.Password = Password;
	}
	public UserEntity(String Username, String Password) {
		this.Username = Username;
		this.Password = Password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		result = prime * result + ((Username == null) ? 0 : Username.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserEntity other = (UserEntity) obj;
		if (Password == null) {
			if (other.Password != null)
				return false;
		} else if (!Password.equals(other.Password))
			return false;
		if (Username == null) {
			if (other.Username != null)
				return false;
		} else if (!Username.equals(other.Username))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", Username=" + Username + ", Password=" + Password + "]";
	}
	
	
}