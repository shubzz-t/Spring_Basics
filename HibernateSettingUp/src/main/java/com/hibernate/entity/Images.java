package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Images")
@Table(name = "Images")
public class Images {
	@Id
	@Column(name = "id")
	int id;
	@Column(name = "filename")
	String filename;
//	@Column(name = "caption")
//	String caption;

	public int getId() {
		return id;
	}

	public Images(String filename) {
		this.filename = filename;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

//	public String getCaption() {
//		return caption;
//	}
//
//	public void setCaption(String caption) {
//		this.caption = caption;
//	}

}
