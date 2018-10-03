
function loadCreateCustomerPage(){
	
	
	$("#mainContainer").load("./pages/customer/addCustomer.html");
}


function loadSearchCustomerPage(){
	
	getAllCustomerNames();
	$("#mainContainer").load("./pages/customer/searchCustomer.html");
}


function loadAllCustomerPage(){
	$("#mainContainer").load("./pages/customer/showAllCustomer.html");
	getAllCustomer();
}