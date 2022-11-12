package school.management.system;

/**
* Created by Ayo Bankole on 19/10/2022.
* This class is responsible for keeping track of teachers info.
*
 */

 public class Teacher {
    private int id;
    private String name;
    private int salary;
    private in salaryEarned;

    /** Create a constructor */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /** To get the id, name and salary */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    /** Update/Set the salary */
    public void setSalary(int salary) {
        this.salary=salary;
    }

    /** Adds to teachers salary/salaryEarned, to remove money earned from school */
    public void receiveSalary(int salary)
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);


    /** Overide the display of output result in terminal */
    @override
    public String toString() {
        return "Teacher's name :" + name + "Total salary earned so far $" + salaryEarned ;
    }
 }
