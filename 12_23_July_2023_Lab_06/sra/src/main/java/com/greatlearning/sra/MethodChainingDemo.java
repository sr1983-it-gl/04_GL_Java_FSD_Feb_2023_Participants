package com.greatlearning.sra;

public class MethodChainingDemo {

	// user.githubaccount.repositories.project
	
	public static void main(String[] args) {
		
		User user = new User();
		
		user.gitHubAccount().getRepository().getFiles();
	}
}

class User {
	
	GitHubAccount gitHubAccount(){
		return null;
	}
}

class GitHubAccount {
	
	Repository getRepository(){
		return null;
	}
}

class Repository {
	
	String[] getFiles(){
		return null;
	}
}
