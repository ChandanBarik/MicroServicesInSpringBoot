/**
 * 
 */
package com.accountmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chandan
 *
 */
@RestController
@RequestMapping("/account")
public class AccountManagementController {

	@GetMapping("/status")
	public String status() {
		return "Account Management is Up";
	}
}
