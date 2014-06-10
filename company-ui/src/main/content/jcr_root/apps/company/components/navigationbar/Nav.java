package apps.company.components.navigationbar;

import com.adobe.cq.sightly.WCMUse;
import com.day.cq.wcm.api.Page;

import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.day.text.Text;
import com.day.cq.wcm.api.PageFilter;
import com.day.cq.wcm.api.Page;
import com.day.cq.commons.Doctype;
import org.apache.commons.lang.StringEscapeUtils;

public class Nav extends WCMUse {

    private List<Page> pages = new ArrayList<Page>();

    @Override
    public void activate() throws Exception {
        final Page currentPage = getCurrentPage();
        Page navRootPage = getPageManager().getPage(getProperties().get("start", "/content/company/en"));

        if (navRootPage != null) {
            Iterator<Page> children = navRootPage.listChildren(new PageFilter());
            while (children.hasNext())
                pages.add(children.next());
        }
    }

    public List<Page> getPages() {
        return pages;
    }
}