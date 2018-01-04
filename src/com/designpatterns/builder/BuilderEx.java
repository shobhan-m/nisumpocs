package com.designpatterns.builder;

public class BuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User.UserBuilder("shobhan", "mamidala")
			    .age(30)
			    .phone("994850990")
			    .address("hyderabad  500045")
			    .build();
			 
			    System.out.println(user1);
			 
			    User user2 = new User.UserBuilder("Jack", "Reacher")
			    .age(40)
			    .phone("5655")
			    //no address
			    .build();
			 
			    System.out.println(user2);
			 
			    User user3 = new User.UserBuilder("harish", "sure")
			    //No age
			    //No phone
			    //no address
			    .build();
			 
			    System.out.println(user3);

	}

}
