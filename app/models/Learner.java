package models;


import siena.*;
import siena.embed.*;
import siena.embed.Embedded.Mode;

public class Learner extends Model {
	
	@Id
	public Long id;
	
	@Embedded(mode=Mode.NATIVE)
	public Member member;
	
	// mentor assigned to this learner
	@Column("mentor")
	public Mentor mentor;
	
	// learner belongs to this hub -> this is one side of the one to many relation (a hub has many learners)
	@Column("hub")
	public Hub hub;
	
	public static Query<Learner> all() {
        return Model.all(Learner.class);
    }

}
