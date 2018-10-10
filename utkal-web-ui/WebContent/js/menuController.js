
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


function loadOrderManagementpage(){
	getAllCustomerNames();
	$("#mainContainer").load("./pages/order/manageOrder.html");
}

function loadManagePayment(){
	getAllCustomerNames();
	$("#mainContainer").load("./pages/payment/payment.html");
	
}

function loadJarDefaulterPage(){
	$("#mainContainer").load("./pages/defaulters/jarDefaulters.html");
}

function loadOrderHistory(){
	getAllCustomerNames();
	$("#mainContainer").load("./pages/order/orderHistory.html");
}
