package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hrms_employees")
public class Image {
	@Id
	@Column(name = "empl_id")
	private int emplId;

	@Column(name = "empl_photo")
	private String emplPhoto;

	// Getters and Setters

	public int getEmplId() {
		return emplId;
	}

	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}

	public String getEmplPhoto() {
		return emplPhoto;
	}

	public void setEmplPhoto(String emplPhoto) {
		this.emplPhoto = emplPhoto;
	}
}
