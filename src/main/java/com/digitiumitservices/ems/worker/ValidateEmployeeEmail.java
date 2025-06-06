package com.digitiumitservices.ems.worker;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.digitiumitservices.ems.repository.EmployeeRepository;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.exception.ZeebeBpmnError;

@Component
public class ValidateEmployeeEmail {

	@Autowired
	private EmployeeRepository employeeRepository;

	@JobWorker(type = "validate-employee-email", autoComplete = false)
	public void handleValidEmployeeEmail(JobClient client, ActivatedJob job) {

		Map<String, Object> variables = job.getVariablesAsMap();

		String Email = (String) variables.get("empEmail");

		if (employeeRepository.findByEmpEmail(Email).isPresent()) {

			throw new ZeebeBpmnError("InputErrorNotification", "Email already exists in the system.");
		}
		client.newCompleteCommand(job.getKey()).send().join();
	}

}
