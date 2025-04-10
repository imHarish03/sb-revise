package io.lab.imHarish03.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.lab.imHarish03.exception.EmployeeAlreadyExistsException;
import io.lab.imHarish03.exception.EmployeeNotFoundException;
import io.lab.imHarish03.model.Employee;
import io.lab.imHarish03.notification.NotificationService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    private final ObjectProvider<NotificationService> notificationProvider;

    public EmployeeController(@Qualifier("slackService") ObjectProvider<NotificationService> notificationProvider) {
        this.notificationProvider = notificationProvider;
    }

    /**
     * Retrieves employee information.
     *
     * @return employee details
     * @throws EmployeeNotFoundException if the employee is not found
     */
    @GetMapping
    public int getEmploe() {
        // Currently, this method throws an exception indicating the employee is not available
        throw new EmployeeNotFoundException("Emp not available", 204);
    }

    /**
     * Creates a new employee.
     *
     * @param employee the employee object which will be created
     * @return the new employee id
     * @throws EmployeeAlreadyExistsException if the employee already exists
     */
    @PostMapping
    public int createEmployee(@RequestBody @Valid Employee employee) {
        // Check if the employee already exists
        if (employee.getName().equals("Hari")) {
            throw new EmployeeAlreadyExistsException("Please provide non existing name");
        }
        // employee added
        notificationProvider.getIfAvailable().sendNotification("New Employee Added: " + employee.getName());
        return 1;
    }

}
