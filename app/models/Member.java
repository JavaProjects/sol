package models;

import java.util.Date;

import siena.DateTime;
import siena.*;
import siena.embed.Embedded;
import siena.embed.*;

@EmbeddedMap
public class Member   {

	public String title;
	public String firstName;
	public String lastName;
	public String email;
	@DateTime
	public Date dob; 
	
	public String address;  
	
	public Member(String title, String firstName, String  lastName, Date dob, String address) {
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.address = address;
	}

}
