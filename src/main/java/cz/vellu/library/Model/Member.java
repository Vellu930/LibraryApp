
package cz.vellu.library.Model;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Member implements Serializable {
    
    private static final long SerialUID = 767676L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int member_id;
    
    private String name;
    
    
    
    
}
