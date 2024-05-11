package com.nt.REST;


import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MsgRestController {

	@GetMapping("/add")
	public int gitAd(@RequestParam int p, @RequestParam int q) {
	    return p+q;
	}

	@GetMapping("/mul")
	public int gitMul(@RequestParam int p1, @RequestParam int p2) {
	    return p1*p2;
	}
	
	
	

}
