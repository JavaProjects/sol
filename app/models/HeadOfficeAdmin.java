package models;

import siena.*;
import siena.embed.*;

public class HeadOfficeAdmin extends Model {
	@Id
	public Long id;
	
	@Embedded
	public Member member;
	
	static Query<HeadOfficeAdmin> all() {
        return Model.all(HeadOfficeAdmin.class);
    }

}
