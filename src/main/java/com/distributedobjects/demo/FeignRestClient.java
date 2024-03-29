package com.distributedobjects.demo;

import com.distributedobjects.demo.model.Attachment;
import com.distributedobjects.demo.model.Department;
import com.distributedobjects.demo.model.Matching;
import com.distributedobjects.demo.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@FeignClient(name = "Humphrey",url="http://10.51.10.111",configuration = FeignConfiguration.class)
public interface FeignRestClient {



    //@RequestMapping(method = RequestMethod.POST,value = "companies/{companyId}/attachments")
    //Attachment requestAttachment(@PathVariable int companyId, @RequestParam(name = "studentid")int studentId);

    //@RequestMapping(method = RequestMethod.PATCH,value = "companies/{companyId}/attachments")
    //Attachment requestdepartment(@PathVariable(name = "companyId")int companyId,
       //                          @RequestParam(name = "studentId")int studentId,
      //                           @RequestParam(name = "departmentId")int departmentId);

    //@RequestMapping(method = RequestMethod.DELETE,value ="departments" )
   // Attachment deleteDepartment(Department department);
    @RequestMapping(method = RequestMethod.POST,value = "students")
    Student registerStudent(@RequestBody Student student);

    @RequestMapping(method = RequestMethod.POST,value = "matches")
    Date requestDate(@PathVariable String gender,@RequestParam(name="studentid")int studentId);

    @RequestMapping(method = RequestMethod.PATCH,value ="matches")
    Matching denymatching(@PathVariable(name = "matchId")int MatchId,
                          @RequestParam(name="studentId")int studentId,
                          @RequestParam(name = "gender")String gender);
    @RequestMapping(method = RequestMethod.PUT,value = "dates")
    Date changedate(@RequestBody Date date);
}
