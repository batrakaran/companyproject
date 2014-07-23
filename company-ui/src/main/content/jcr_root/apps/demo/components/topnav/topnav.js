use(function() {
	log.error("Hello World!!" +currentPage.getName());
    return {
		   root: currentPage.getAbsoluteParent(2)
    };
});