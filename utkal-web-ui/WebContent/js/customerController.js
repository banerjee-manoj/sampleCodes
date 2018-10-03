 

function saveCustomer(){
	
	
	
	alert('saveCustomer');
}

function validateCustomerForm(){
	alert('validateCustomerForm');
	if($("#customerName").val() == ""){
		alert("Please Provide Customer Name");
		return false;
	} else
	if($("#mobileNumber").val()==""){
		alert("Please Provide Mobile Number");
		return false;
	}else
	if($("#address").val()==""){
		alert("Please Provide Address");
		return false;
	}else
	if($("#customerType").val()==""){
		alert("Please Provide Customer Type");
		return false;
	}else
	if($("#securityDeposit").val()==""){
		alert("Please Provide Security Deposit");
		return false;
	}else
	if($("#normalJarRate").val()==""){
		alert("Please Provide Jar Rate");
		return false;
	}
	saveCustomer();
}

var countries;
function getAllCustomerNames(){
$.ajax({
	
	 type: 'GET',
     url : 'http://localhost:8082/api/customer/customerList',
     crossdomain: true,
     beforeSend : function(){console.log("before send");},
     complete: function() {
     console.log('complete..');},
     success: function(resp, status) {console.log("Success");
     console.log(resp);
     countries=resp;
     autocomplete(document.getElementById("customerNameSearch"), countries);},
     error: function(resp, status) {console.log("Error");}
    
	
});
}

function getCustomerByName(){
	
	var customerName=$("#customerNameSearch").val();
	
	$.ajax({
		
		 type: 'GET',
	     url : 'http://localhost:8082/api/customer/customerByName/'+customerName,
	     crossdomain: true,
	     beforeSend : function(){console.log("before send");},
	     complete: function() {
	     console.log('complete..');},
	     success: function(resp, status) {console.log("Success");
	     console.log(resp);
	     $("#customerName").val(resp.customeName);
	     $("#customerSearchResultDiv").show();
	    },
	     error: function(resp, status) {console.log("Error");}
	    
		
	});
}

function getAllCustomer(){
	$.ajax({
		
		 type: 'GET',
	     url : 'http://localhost:8082/api/customer/getAllCustomer',
	     crossdomain: true,
	     beforeSend : function(){console.log("before send");},
	     complete: function() {
	     console.log('complete..');},
	     success: function(resp, status) {console.log("Success");
	     
		  var trHtml = ''; 
	      $.each(resp,function(i,item){
	    trHtml += "<tr><td>"+item.customerId+"</td><td>"+item.customeName+"</td>" +
	    "<td>"+item.customerMobileNumber+"</td>"+
"<td><button class='btn btn-primary btn-sm'>Delete</button>&nbsp;" +
"<button class='btn btn-primary btn-sm'>Details</button></td></tr>";
	    });
	      $('#allCustomerTable').append(trHtml);
	      $('#allCustomerTable').DataTable();
	    },
	     error: function(resp, status) {console.log("Error");}
	    
		
	});
}




