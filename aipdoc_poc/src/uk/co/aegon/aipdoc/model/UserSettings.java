package uk.co.aegon.aipdoc.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "AIPDOC_USER_SETTINGS")
public class UserSettings {
	@Id
	@Column(name = "USER_ID")
	String userId;
	@Column(name = "CREATION_DATE")
	Date creationDate;
	@Column(name = "EMAIL_PREFERENCE")
	char emailPreference;
	@Column(name = "LAST_EMAIL_SENT_TIME")
	Date lastEmailSentDate;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public char getEmailPreference() {
		return emailPreference;
	}
	public void setEmailPreference(char emailPreference) {
		this.emailPreference = emailPreference;
	}
	public Date getLastEmailSentDate() {
		return lastEmailSentDate;
	}
	public void setLastEmailSentDate(Date lastEmailSentDate) {
		this.lastEmailSentDate = lastEmailSentDate;
	}

}
