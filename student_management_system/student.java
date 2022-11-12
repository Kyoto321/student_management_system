package school.management.system;

/**
* Created by Ayo Bankole on 19/10/2022.
* This class is responsible for keeping track of students info.
*
 */

 public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int fessTotal;

    /** 
    * The role of constructor is to create a new student object 
    * by initializing the values(params)
    */
    public Student(int id, string name, int grade) {
        
        this.feesPaid = 0;
        this.fessTotal = 3000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    // Not going to alter 'students name' and 'students ID'

    /** To upgrade student grade */
    public void setGrade(int grade) {
        this.grade=grade;
    }

    /** To update the fees 
    *  i.e add fees to to the fees paid
    *  school recieves the fund
    */
    public void payFees(int fees) {
        fessPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /** To @return Id, name, grade, feesPaid & feesTotal */

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    /** Updates fees with selected amount(params) as fees */
    public void updateFeesPaid(int fees) {
        //feesPaid = feesPaid + fees;
        fessPaid+=fees;

    }

    /** return remaining fees */
    public int getRemainingFees () {
        return feesTotal - feesPaid;
    }

/** Overide the display of output result in terminal */
    @override
    public String toString() {
        return "Student's name :" + name + "Total fees paid so far $" + feesPaid;
    }
 
 }