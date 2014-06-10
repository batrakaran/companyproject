package apps.company.components.parameterexample;

import com.day.cq.wcm.api.Page;
import com.adobe.cq.sightly.WCMUse;

public class Parameter extends WCMUse {
    
    private String fullName;
    
    @Override 
    
    public void activate() throws Exception
    {
        final Page currentPage = getCurrentPage();
    }
    
    public String getFullName () 
    {
        return get ("firstName", String.class) + " " + get("lastName", String.class);
    }
}