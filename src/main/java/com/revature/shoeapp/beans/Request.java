package com.revature.shoeapp.beans;

public class Request {
	
	private Integer requestid;
	private Integer user1id;
	private Integer user2id;
	private Integer shoe1id;
	private Integer shoe2id;
	private String comment;
	
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Request(Integer requestid, Integer user1id, Integer user2id, Integer shoe1id, Integer shoe2id,
			String comment) {
		super();
		this.requestid = requestid;
		this.user1id = user1id;
		this.user2id = user2id;
		this.shoe1id = shoe1id;
		this.shoe2id = shoe2id;
		this.comment = comment;
	}

	public Request(Integer user1id, Integer user2id, Integer shoe1id, Integer shoe2id, String comment) {
		super();
		this.user1id = user1id;
		this.user2id = user2id;
		this.shoe1id = shoe1id;
		this.shoe2id = shoe2id;
		this.comment = comment;
	}

	public Integer getRequestid() {
		return requestid;
	}

	public void setRequestid(Integer requestid) {
		this.requestid = requestid;
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

	public Integer getShoe1id() {
		return shoe1id;
	}

	public void setShoe1id(Integer shoe1id) {
		this.shoe1id = shoe1id;
	}

	public Integer getShoe2id() {
		return shoe2id;
	}

	public void setShoe2id(Integer shoe2id) {
		this.shoe2id = shoe2id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((requestid == null) ? 0 : requestid.hashCode());
		result = prime * result + ((shoe1id == null) ? 0 : shoe1id.hashCode());
		result = prime * result + ((shoe2id == null) ? 0 : shoe2id.hashCode());
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
		Request other = (Request) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (requestid == null) {
			if (other.requestid != null)
				return false;
		} else if (!requestid.equals(other.requestid))
			return false;
		if (shoe1id == null) {
			if (other.shoe1id != null)
				return false;
		} else if (!shoe1id.equals(other.shoe1id))
			return false;
		if (shoe2id == null) {
			if (other.shoe2id != null)
				return false;
		} else if (!shoe2id.equals(other.shoe2id))
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
		return "Request [requestid=" + requestid + ", user1id=" + user1id + ", user2id=" + user2id + ", shoe1id="
				+ shoe1id + ", shoe2id=" + shoe2id + ", comment=" + comment + "]";
	}

	
	
}
