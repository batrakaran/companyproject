
"use strict";

/**
 * Title component JS backing script
 */
use(function () {
    
    // TODO: change currentStyle to wcm.currentStyle
    
    var CONST = {
        PROP_TITLE: "jcr:title",
        PROP_PAGE_TITLE: "pageTitle",
    }
    
    var title = {};
    
    // The actual title content
    title.text = granite.resource.properties[CONST.PROP_TITLE]
            || wcm.currentPage.properties[CONST.PROP_PAGE_TITLE]
            || wcm.currentPage.properties[CONST.PROP_TITLE]
            || wcm.currentPage.name;
    
    // Adding the constants to the exposed API
    title.CONST = CONST;
    
    return title;
    
});
