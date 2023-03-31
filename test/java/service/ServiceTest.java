package service;

import domain.Student;
import repository.NotaXMLRepo;
import repository.StudentXMLRepo;
import repository.TemaXMLRepo;
import validation.NotaValidator;
import validation.StudentValidator;
import validation.TemaValidator;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    StudentXMLRepo studentXMLRepo = new StudentXMLRepo( "D:\\FACULTATE\\AN3SEM2\\SSVV\\lab\\Lab1\\Lab1Maven\\lab1\\fisiere\\Studenti.xml");
    StudentValidator studentValidator = new StudentValidator();

    TemaXMLRepo temaXMLRepo = new TemaXMLRepo("D:\\FACULTATE\\AN3SEM2\\SSVV\\lab\\Lab1\\Lab1Maven\\lab1\\fisiere\\Teme.xml");

    TemaValidator temaValidator = new TemaValidator();

    NotaXMLRepo notaXMLRepo = new NotaXMLRepo("D:\\FACULTATE\\AN3SEM2\\SSVV\\lab\\Lab1\\Lab1Maven\\lab1\\fisiere\\Note.xml");
    NotaValidator notaValidator = new NotaValidator(studentXMLRepo, temaXMLRepo);


    Service testService = new Service(studentXMLRepo, studentValidator,
            temaXMLRepo, temaValidator,  notaXMLRepo,  notaValidator);
    @org.junit.jupiter.api.Test
    void addStudentPositiveIDs() {
        Student student1 = new Student("1", "Nume Student 1", 123,"email1@abc.com");
        Student student2 = new Student("2", "Nume Student 2", 123,"email2@abc.com");
        Student student3 = new Student("3", "Nume Student 3", 123,"email3@abc.com");
        Student student4 = new Student("4", "Nume Student 4", 123,"email4@abc.com");
        assertEquals(testService.addStudent(student1), student1);
        assertEquals(testService.addStudent(student2), student2);
        assertEquals(testService.addStudent(student3), student3);
        assertEquals(testService.addStudent(student4), student4);

    }

}