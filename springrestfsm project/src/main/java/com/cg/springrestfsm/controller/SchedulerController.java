
package com.cg.springrestfsm.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springrestfsm.dto.SchedulerBean;
import com.cg.springrestfsm.dto.SchedulerResponse;
import com.cg.springrestfsm.service.SchedulerService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class SchedulerController {
	@Autowired
	SchedulerService service;

	@PostMapping(path = "/add-scheduler", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public SchedulerResponse addScheduler(@RequestBody SchedulerBean bean) {
		SchedulerResponse response = new SchedulerResponse();
		if (service.addScheduler(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Scheduler added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Scheduler id already exists");
		}
		return response;
	}

	@GetMapping(path = "/search-scheduler/{scheduleid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public SchedulerResponse searchScheduler(@PathVariable("scheduleid") int scheduleid) {
		SchedulerResponse response = new SchedulerResponse();
		SchedulerBean bean = service.searchScheduler(scheduleid);
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("scheduler found");
			response.setScheduler(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Scheduler id does not exist");
		}
		return response;
	}

	@GetMapping(path = "/view-allSchedulers", produces = MediaType.APPLICATION_JSON_VALUE)
	public SchedulerResponse getScheduler() {
		SchedulerResponse response = new SchedulerResponse();
		List<SchedulerBean> list = service.getScheduler();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Scheduler found");
			response.setScheduler(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;

	}

	@DeleteMapping(path = "/delete-scheduler/{scheduleid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public SchedulerResponse deleteScheduler(@PathVariable("scheduleid") int scheduleid) {
		SchedulerResponse response = new SchedulerResponse();
		if (service.deleteScheduler(scheduleid)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Scheduler deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Scheduler not found");
		}
		return response;
	}

	@PutMapping(path = "/modify-scheduler", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public SchedulerResponse modifyScheduler(@RequestBody int scheduleid, SchedulerBean bean) {
		SchedulerResponse response = new SchedulerResponse();
		if (service.modifyScheduler(scheduleid, bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Scheduler modified");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("scheduler already exists");
		}
		return response;
	}
}
