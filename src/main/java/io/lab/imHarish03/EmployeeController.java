package io.lab.imHarish03;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.lab.imHarish03.exception.EmployeeAlreadyExistsException;
import io.lab.imHarish03.exception.EmployeeNotFoundException;
import io.lab.imHarish03.exception.InvalidInputException;
import io.lab.imHarish03.model.Employee;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@GetMapping
	public int getEmploe() {
		throw new EmployeeNotFoundException("Emp not available", 204);
	}
	
	@PostMapping
	public int createEMployee(@RequestBody @Valid Employee employee) {
		
		if(employee.getName().equals("Hari")) {
			throw new EmployeeAlreadyExistsException ("Please provide non existing name");
		}
		
		return 1;
	}

}
