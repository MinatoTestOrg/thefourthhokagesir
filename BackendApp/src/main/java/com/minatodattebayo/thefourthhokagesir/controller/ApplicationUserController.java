package com.minatodattebayo.thefourthhokagesir.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import com.vs.rappit.base.factory.InstanceFactory;
import com.minatodattebayo.thefourthhokagesir.base.controller.ApplicationUserBaseController;
import com.minatodattebayo.thefourthhokagesir.service.IApplicationUserService;
import com.minatodattebayo.thefourthhokagesir.service.ApplicationUserService;
import com.minatodattebayo.thefourthhokagesir.model.ApplicationUser;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping(path = "/rest/applicationusers/", produces = "application/json")
public class ApplicationUserController extends ApplicationUserBaseController<IApplicationUserService<ApplicationUser>, ApplicationUser> {

	public ApplicationUserController(ApplicationUserService applicationUserService) {
		super(applicationUserService);
	}
	
		
	
	
}
