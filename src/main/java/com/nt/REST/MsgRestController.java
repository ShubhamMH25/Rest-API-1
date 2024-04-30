package com.nt.REST;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.binding.Customer;

@RestController
public class MsgRestController {

	public MsgRestController() {
		System.out.println("MsgRestController.MsgRestController()");
	}
	
	@GetMapping("/")
	public ResponseEntity<String> getWelcomeMsg(){
		
		String msg="Welcome";
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public String getGreetMsg()
	{
		String msg="Good morring";
		
		return msg;
	}
	
	@GetMapping(value = "/obj", produces = {"application/xml", "application/json"})
	public Customer custmor() {
		
		Customer c=new Customer();
		
		c.setEmail("Shubham3@gmail.com");
		c.setName("Shubham");
		c.setGender("Male");
		
		return c;
	}
	

}
