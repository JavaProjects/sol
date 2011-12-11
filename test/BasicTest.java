import java.util.Date;
import java.util.List;

import models.Hub;
import models.HubCoordinator;
import models.Learner;
import models.Member;

import org.junit.Before;
import org.junit.Test;

import play.modules.siena.SienaFixtures;
import play.test.UnitTest;
import siena.Model;

public class BasicTest extends UnitTest {
	
	Member[] members = {new Member("Mr.", "John", "Last", new Date(), "123 Main Street Sydney Australia"  ),
												new Member("Miss", "Jane", "Smith", new Date(), "544 Cruise Street Sydney Australia")
	
											};
	@Before
	public void setUp() {
		SienaFixtures.deleteDatabase(); 
		SienaFixtures.loadModels("data.yml");

	}

    @Test
    public void aVeryImportantThingToTest() {
        assertEquals(2, 1 + 1);
    }
    
    @Test
    public void createAndRetrieveLearner() {
    	
    	 List<Learner>  list= Learner.all().filter("member.firstName", "Jane").fetch(10);
         assert(list.size() > 0);
         
         Learner learner = list.get(0);
         assertEquals("Jane", learner.member.firstName);
         
         Learner r = Model.getByKey(Learner.class, learner.id);
         assertNotNull(r);
         assertEquals("Fonda", r.member.lastName);
    	
    }
    
    @Test
    public void createAndRetrieveHubAndHubCoordinator() {
    	
    	List<HubCoordinator>  list= HubCoordinator.all().fetch(10);
        assert(list.size() > 0);
    	
        HubCoordinator hc = list.get(0);
        
        assertEquals("Edward", hc.member.firstName);
        
        List<Hub>  hubs= Hub.all().fetch(10);
        assert(hubs.size() > 0);
        
        Hub hub = hubs.get(0);
        
        assertEquals("2345 W. 24th Street Townsville", hub.address);
        
        HubCoordinator hc2 = Model.getByKey(HubCoordinator.class, hc.id);
        assertNotNull(hc2);
        
        Hub  hub2 = Model.getByKey(Hub.class, hub.id);
        assertNotNull(hub2);
        
        // from hubCoordinator gets the hub that belongs to this hubCoordinator
        Hub  hub3 = hc2.getHub();
        assertNotNull(hub3);
        assertEquals("2345 W. 24th Street Townsville", hub3.address);
        
    }
    
    @Test
    public void assignLearnerToHub() {
    	
        List<Hub>  hubs= Hub.all().fetch(10);
        assert(hubs.size() > 0);
        
        Hub hub = hubs.get(0);
        
        assertEquals("2345 W. 24th Street Townsville", hub.address);
        
        List<Learner>  learners= Learner.all().filter("member.firstName", "Jane").fetch(10);
        assert(learners.size() > 0);
        
        Learner learner =learners.get(0);
        assertEquals("Jane", learner.member.firstName);
    	
        // assign above learner to above hub
        hub.learners.asList().add(learner);
        
        hub.save();  
        
        // now this learner has associated hub
        Hub hub2 = learner.hub;
        
        assertNotNull(hub2);
        
        assertEquals("2345 W. 24th Street Townsville", hub2.address);
    	
    }
    
    
    /*@Test
    public void createAndRetrieveLearner() {
    	
        // Create a new learner and save it
    	Learner learner = new Learner();
        learner.member =members[0];  
        learner.insert();
        
        assertNotNull(learner.id);
        
        // Now queries are working
       List<Learner>  list= Learner.all().filter("member.firstName", "John").fetch(10);
       assert(list.size() > 0);
       assertEquals("John", list.get(0).member.firstName);
        
        Learner r = Model.getByKey(Learner.class, learner.id);
        assertNotNull(r);
        assertEquals("John", r.member.firstName);

        
    }
    
    @Test
    public void createAndRetrieveHub() {
    	
        HubCoordinator hc = new  HubCoordinator();
        
        Hub hub = new Hub();
        hub.address = "2345 W. 24th Street Townsville ";
        hc.hub .set(hub);
        hc.save(); // also saves the child ( hub)
        
        HubCoordinator hc2 = Model.getByKey(HubCoordinator.class, hc.id);
        assertNotNull(hc2);
        
        Hub  hub2 = Model.getByKey(Hub.class, hub.id);
        assertNotNull(hub2);
        
    }
    
    @Test
    public void assignLearnerToHub() {
    	
        // Create a new learner and save it
    	Learner learner = new Learner();
        learner.member =members[0];  
        
        HubCoordinator hc = new  HubCoordinator();
        
        Hub hub = new Hub();
        hub.address = "2345 W. 24th Street Townsville ";
        hc.hub .set(hub);
        hc.save(); // also saves the child ( hub)
        
        HubCoordinator hc2 = Model.getByKey(HubCoordinator.class, hc.id);
        assertNotNull(hc2);
        
        Hub  hub2 = Model.getByKey(Hub.class, hub.id);
        assertNotNull(hub2);
        
        // assign a learner to a hub
        hub2.learners.asList().add(learner);
        
        hub2.save();  // should also save the new learner created
        
        Learner r = Model.getByKey(Learner.class, learner.id);
        assertNotNull(r);
        
    }*/
    
    

}
