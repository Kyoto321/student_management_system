package school.management.system;

import java.util.List;

/**
* Created by Ayo Bankole on 19/10/2022.
* This class is responsible for keeping track of teachers info.
* Create an ArrayList to cover the number of teachers, students.
*
*/

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
    * Constructor
    * Automatically updates when a new school object is created with params
    */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /** Return the list of teachers in the school */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /** Add teacher to the school 
    *   param(teacher) the teacher to be added
    */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /** Return the list of teachers in the school */
    public List<Student> getStudents() {
        return students;
    }

    /** Add teacher to the school */
    public void setStudents(Student students) {
        students.add(student)
    }

    /** Return total money earned */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /** Adds to total money earned 
    *  params(MoneyEarned) to be added to totalMoneyEarned
    */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /** Returns total money spent */
    public int getTotalMoneySpent() {
        return totalMoneySpent
    }

    /** Update money spent i.e given out to teachers(salary)
    *  params(MoneySpent) is the money spent by school
    */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

}








