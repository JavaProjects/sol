package models;

import java.util.List;

import siena.*;
import siena.core.Many;
import siena.core.Owned;
import siena.embed.*;

public class Hub  extends Model {
	
	@Id
	public Long id;
	
	public String address;
	
	public Double latitude;
	public Double longitude;
	
	// this is child object owned by hub coordinator 
	// this reference is required in One<T> relation
	@Column("hubCoordinator")
	public HubCoordinator hubCoordinator;
	
	@Owned(mappedBy="hub")
	public Many<Learner> learners;
	
	// a hub has many mentors -> one to many relation -> hub is parent (owner) and mentor is child
	@Owned(mappedBy="hub")
	public Many<Mentor> mentors;
	
	public static Query< Hub> all() {
        return Model.all( Hub.class);
    }
	
	
}
