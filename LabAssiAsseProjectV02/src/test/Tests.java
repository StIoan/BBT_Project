// package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import service.Service;
import domain.Student;
// import repository;
// import static org.mockito.Mockito.*;

public class Tests {

    private Service studentService;
    private Student student;

    @Before
    public void setUp() {
        studentService = new Service(null, null, null, null, null, null);
    }

    @Test
    public void testAddNewStudent() {
        // Student newStudent = new Student("John", "Doe", "john.doe@example.com");
        // when(studentFileRepository.save(newStudent)).thenReturn(null);

        // assertNull(studentService.addStudent(newStudent));
        // verify(studentValidator, times(1)).validate(newStudent);
        // verify(studentFileRepository, times(1)).save(newStudent);
    }

    @Test
    public void testAddExistingStudent() {
        // Student existingStudent = new Student("Jane", "Doe", "jane.doe@example.com");
        // when(studentFileRepository.save(existingStudent)).thenReturn(existingStudent);

        // Student result = studentService.addStudent(existingStudent);
        // assertNotNull(result);
        // assertEquals(existingStudent, result);
        // verify(studentValidator, times(1)).validate(existingStudent);
        // verify(studentFileRepository, never()).save(existingStudent);
    }
}
