package com.revature.shoeapp.beans;

import java.sql.Date;

public class Message {
	
	private Integer messageid;
	private Integer user1id;
	private Integer user2id;
	private String message;
	private Date timestamp;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(Integer messageid, Integer user1id, Integer user2id, String message, Date timestamp) {
		super();
		this.messageid = messageid;
		this.user1id = user1id;
		this.user2id = user2id;
		this.message = message;
		this.timestamp = timestamp;
	}
	public Message(Integer user1id, Integer user2id, String message, Date timestamp) {
		super();
		this.user1id = user1id;
		this.user2id = user2id;
		this.message = message;
		this.timestamp = timestamp;
	}
	public Integer getMessageid() {
		return messageid;
	}
	public void setMessageid(Integer messageid) {
		this.messageid = messageid;
	}
	public Integer getUser1id() {
		return user1id;
	}
	public void setUser1id(Integer user1id) {
		this.user1id = user1id;
	}
	public Integer getUser2id() {
		return user2id;
	}
	public void setUser2id(Integer user2id) {
		this.user2id = user2id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((messageid == null) ? 0 : messageid.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + ((user1id == null) ? 0 : user1id.hashCode());
		result = prime * result + ((user2id == null) ? 0 : user2id.hashCode());
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
		Message other = (Message) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (messageid == null) {
			if (other.messageid != null)
				return false;
		} else if (!messageid.equals(other.messageid))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (user1id == null) {
			if (other.user1id != null)
				return false;
		} else if (!user1id.equals(other.user1id))
			return false;
		if (user2id == null) {
			if (other.user2id != null)
				return false;
		} else if (!user2id.equals(other.user2id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Message [messageid=" + messageid + ", user1id=" + user1id + ", user2id=" + user2id + ", message="
				+ message + ", timestamp=" + timestamp + "]";
	}
	
	
}
