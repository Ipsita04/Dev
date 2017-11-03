package se.ericsson.internal.in8.api.crm.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.wordnik.swagger.annotations.Api;

@RestController
@Api(value = "crm api", description = "in8 CRM API for handling CRM tickets")
@RequestMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
public class ActivityController {

	
	@RequestMapping(value = "", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String addActivities() {
		return "hiiiii111111111";
	}
	
	
}
