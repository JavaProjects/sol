package models;

import siena.Column;
import siena.Id;
import siena.Model;
import siena.Query;
import siena.core.Many;
import siena.core.Owned;
import siena.embed.Embedded;
/**
 * 
 * 
 * @author revo
 *
 */
public class Mentor  extends Model  {
	
	@Id
	public Long id;
	
	@Embedded
	public Member member;
	
	// mentor belongs to this hub -> this is one side of the one to many relation (a hub has many mentors)
	@Column("hub")
	public Hub hub;
	
	
	@Owned(mappedBy="mentor")
	public Many<Learner> learners;
	
	static Query< Mentor> all() {
        return Model.all( Mentor.class);
    }

}
