package org.example.springtask;

import org.example.springtask.Models.Course;
import org.example.springtask.Services.CourseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringTaskApplication {

    public static void main(String[] args) {

          SpringApplication.run(SpringTaskApplication.class, args);

//        ApplicationContext context = SpringApplication.run(SpringTaskApplication.class, args);
//        var coursesService = context.getBean(CourseService.class);
//        List<Course> courses = coursesService.getRecommendedCourses();
//
//        for(Course course : courses) {
//            System.out.println("\nCourse id: " + course.getId());
//            System.out.println("Course name: " + course.getName());
//        }
    }

}
