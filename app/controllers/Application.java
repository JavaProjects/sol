package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

import siena.*;

public class Application extends Controller {

    public static void index() {
    	
    	/*Member[] members = {new Member("Mr.", "John", "Last", new Date(), "123 Main Street Sydney Australia"  ),
				new Member("Miss", "Jane", "Smith", new Date(), "544 Cruise Street Sydney Australia")

			};
    	
    	Member m =  members[0];  
        Learner learner = new Learner();
        learner.member = m;
        learner.insert();
        
        
       // Learner bob3 = Model.all(Learner.class).filter("member", members[0]).get();
        
        
        // need to find why below Siena queries not woring
       List<Learner>  l2 = Learner.all().filter("member.firstName", "John").fetch(10);
       // List<Learner>  l2 = Learner.all().fetch(10);
       
       System.out.println("size of l2 list  : " +  l2.size());
        //System.out.println("size of list  : " +  learner.id);
        
        
        //System.out.println("size of list  : " + bob3.id);
        
        Learner r = Model.getByKey(Learner.class, learner.id);
        
        System.out.println("r first name  : " + r.member.firstName);*/
    	
        render();
    }

}