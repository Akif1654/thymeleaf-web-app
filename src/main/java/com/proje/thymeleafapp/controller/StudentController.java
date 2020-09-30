package com.proje.thymeleafapp.controller;

import com.proje.thymeleafapp.models.Student;
import com.proje.thymeleafapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /*
    @RequestMapping("/getAll")//RestController
    public List<Student> getAll(){
        return studentService.getAll();
    }
    */


    @RequestMapping("/getAll") // Controller
    public String getAll(Model model) {
        List<Student> students = studentService.getAll();
        model.addAttribute("students", students);

        String userName = "akif16";
        model.addAttribute("userName", userName);

        return "students";
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Optional<Student> getOne(Integer id) {
        return studentService.getOne(id);
    }

    @PostMapping(value = "/addNew")
    public String addNew(Student student) {
        studentService.addNew(student);
        return "redirect:/students/getAll";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Student student) {
        studentService.update(student);
        return "redirect:/students/getAll";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Student student) {
        studentService.delete(student);
        return "redirect:/students/getAll";
    }


    /*
    @RequestMapping("/getAllByDepartment/{department}")//RestController
    public List<Student> getAllByDepartment(ModelMap map, @PathVariable String department){

        List<Student> students = studentService.getAllByDepartment(department);
        map.addAttribute("myStudents",students);
        return students;
    }
     */


    @RequestMapping("/getAllByDepartment/{department}") //Controller
    public String getAllByDepartment(ModelMap map, @PathVariable String department) {

        List<Student> students = studentService.getAllByDepartment(department);
        map.addAttribute("myStudents", students);
        return "students";
    }

}
