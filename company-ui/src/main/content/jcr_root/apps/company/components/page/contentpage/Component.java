package apps.company.components.page.contentpage;

import com.adobe.cq.sightly.WCMUse;
import com.day.cq.wcm.api.Page;

public class Component extends WCMUse 
{
    private String currentPageTitle;
    private String currentPageName;
    private String currentPagePath;
    private int currentPageDepth;
    private String pageDescription;
    
    @Override
    
    public void activate() throws Exception
    
    {
        final Page currentPage = getCurrentPage();
        currentPageTitle = currentPage.getTitle();
        currentPageName = currentPage.getName();
        currentPagePath = currentPage.getPath();
        currentPageDepth = currentPage.getDepth();
        pageDescription = getProperties().get("description", "No description exists");
    }
    
    public String getCurrentPageTitle() 
    {
        return currentPageTitle;
    }
    
    public String getCurrentPageName() 
    {
        return currentPageName;
    }
    
    public String getCurrentPagePath() 
    {
        return currentPagePath;
    }
    
    public int getCurrentPageDepth() 
    {
        return currentPageDepth;
    }
    
    public String getPageDescription() 
    {
        return pageDescription;
    }
}    
    
    