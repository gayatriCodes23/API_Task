package com.concerto.user_authentication.entities;

public enum Role {
	ADMIN("Administrator"), USER("Regular User"), GUEST("Guest");

	private final String description;

	Role(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
