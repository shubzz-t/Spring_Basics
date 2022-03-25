package springbasic.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher")
public class Teacher {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
      private int id;
	
	@Column(name = "name")
      private String name;
	
	@Column(name = "email")
      private String email;

	public Teacher(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Teacher(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Teacher() {
		
	}
	
	
}
