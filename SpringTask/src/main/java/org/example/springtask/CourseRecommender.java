package org.example.springtask;

import org.example.springtask.Models.Course;

import java.util.List;

public interface CourseRecommender {
    List<Course> recommendedCourses();
    public void addCourse(Course course);
    public void updateCourse(Course course);
    public void deleteCourse(int id);
}
