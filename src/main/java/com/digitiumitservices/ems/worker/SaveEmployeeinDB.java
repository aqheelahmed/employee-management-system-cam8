package com.digitiumitservices.ems.worker;

import org.springframework.stereotype.Component;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;

@Component
public class SaveEmployeeinDB {

	@JobWorker(type = "save-employee-db")
	public void handleSaveEmp(JobClient client, ActivatedJob job) {
		System.out.println("hello");

	}

}
