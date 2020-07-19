package com.app.model;

public class Command {
	private int id;
	private String commandDetails;
	private Activity activity;
	private Users user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommandDetails() {
		return commandDetails;
	}

	public void setCommandDetails(String commandDetails) {
		this.commandDetails = commandDetails;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Command(String commandDetails, Activity activity, Users user) {
		this.commandDetails = commandDetails;
		this.activity = activity;
		this.user = user;
	}

	public Command() {
	}

}
