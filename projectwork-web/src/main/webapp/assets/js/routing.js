app.config(function($routeProvider){
	
	$routeProvider.when("/",{
		templateUrl:"/projectwork-web/resources/partial/auction.html",
		controller:"auctionListController"
	}).when("/productPage/:oid",{
		templateUrl:"/projectwork-web/resources/partial/productPage.html",
		controller:"productPageController"
	})
	
});