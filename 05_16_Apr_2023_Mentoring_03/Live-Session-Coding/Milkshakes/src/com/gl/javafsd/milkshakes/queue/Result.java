package com.gl.javafsd.milkshakes.queue;

public class Result {

	private int noOfSeconds;
	private String status;
	
	public Result() {
		status = "NOT_DONE";
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getNoOfSeconds() {
		return noOfSeconds;
	}

	public void setNoOfSeconds(int noOfSeconds) {
		this.noOfSeconds = noOfSeconds;
	}
	
	public void incrementBy(int seconds) {
		
		noOfSeconds = noOfSeconds + seconds;
	}
}
