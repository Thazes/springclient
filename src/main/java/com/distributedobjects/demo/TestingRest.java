package com.distributedobjects.demo;

import com.distributedobjects.demo.model.Attachment;
import com.distributedobjects.demo.model.Department;
import com.distributedobjects.demo.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestingRest implements CommandLineRunner {
    private final FeignRestClient feignRestClient;

    public TestingRest(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }
    @Override
    public void run(String... args) throws Exception {
    //    Attachment deleted = feignRestClient.deleteDepartment(new Department(27,6,12));
     //   Student student=feignRestClient.registerStudent(new Student(94568,"Humphrey"));
    }
}
