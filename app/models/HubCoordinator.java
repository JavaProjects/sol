package models;

import siena.Id;
import siena.Model;
import siena.Query;
import siena.core.One;
import siena.core.Owned;
import siena.embed.Embedded;

public class HubCoordinator  extends Model {
	
	@Id
	public Long id;
	
	@Embedded
	public Member member;
	
	// hub coordinator owns one hub ( one to one relation). Owner or parent object is the 
	// hub coordinator and the child object is the hub ( a hub is owned by a hub coordinator)
	@Owned(mappedBy="hubCoordinator")
	public One<Hub> hub;
	
	public static Query< HubCoordinator> all() {
        return Model.all( HubCoordinator.class);
    }
	
	public Hub getHub() {
		 return hub.get();
		
	}

}
	