/* Assume that the test results of a batch of students are stored in three different
classes. Class Students are storing the roll number. Class Test stores the
marks obtained in two subjects and class result contains the total marks
obtained in the test. The class result can inherit the details of the marks
obtained in the test and roll number of students. (Multilevel Inheritance) */

#include <iostream>

using namespace std;

//Student class created
class Students {
//Data members
public:
    int rollNumber;

    void setRollNumber(int roll) {
        rollNumber = roll;
    }
};

//Multilevel Inheritance used
class Test : public Students {
public:
	
    int subject1Marks;
    int subject2Marks;

    void setMarks(int sub1, int sub2) {
        subject1Marks = sub1;
        subject2Marks = sub2;
    }
};
//Multilevel Inheritance used
class Result : public Test {
    
	int totalMarks;

public:
   
   void calculateTotalMarks() {
        totalMarks = subject1Marks + subject2Marks;
    }

    void displayResult() {
        cout << "Roll Number: " << rollNumber << endl;
        cout << "Subject 1 Marks: " << subject1Marks << endl;
        cout << "Subject 2 Marks: " << subject2Marks << endl;
        cout << "Total Marks: " << totalMarks << endl;
    }
};

int main() {
    Result studentResult;

    studentResult.setRollNumber(6015);
    studentResult.setMarks(80, 85);
    studentResult.calculateTotalMarks();
    studentResult.displayResult();

    return 0;
}

