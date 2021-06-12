/**
 * 
 */
package com.shad.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Matthew Werner
 * playing around with RequestParam...
 */

@RestController

public class HomeController {
	
	// set up the default route
	// this says anything after the q is part of the query and that q is not required for the page to load	
	@RequestMapping(value = "/")
	String getName(@RequestParam(value="name", defaultValue="human") String name ){
		return "Hello " + name;
	}
}
