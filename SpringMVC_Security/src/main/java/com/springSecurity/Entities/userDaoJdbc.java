package com.springSecurity.Entities;
	
	public class userDaoJdbc {
		
	
		private String username;
		
		private String password;
	
		private int enabled=1;

		public int getEnabled() {
			return enabled;
		}

		public void setEnabled(int enabled) {
			this.enabled = enabled;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public userDaoJdbc() {

		}

		@Override
		public String toString() {
			return "users [ username=" + username + ", password=" + password + "]";
		}

		public userDaoJdbc(String username, String password) {
			this.username = username;
			this.password = password;
		}

	

}
