	/* Write a C++ Program display Student Mark sheet using Multiple inheritance */ 

#include <iostream>
#include <string>

using namespace std;

// Base class for personal information

class PersonalInfo 
{

private:
    string name;
    int rollNumber;

public:
    PersonalInfo(string n, int r)
    {
    	name = n;
    	rollNumber = r;
	}

    void displayInfo()
	{
        cout << "Name: " << name << endl;
        cout << "Roll Number: " << rollNumber << endl;
    }
};

// Base class for marks

class Marks {
public:
    
	int marks[5];


    Marks(int m1, int m2, int m3) 
	{
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
        
    }

    void displayMarks() 
	{
        cout << "Marks:" << endl;
        for (int i = 0; i < 3; i++) 
		{
            cout << "Subject " << (i + 1) << ": " << marks[i] << endl;
        }
    }
};

// Derived class using multiple inheritance
class StudentMarkSheet : public PersonalInfo, public Marks {
    string grade;

public:
    
	StudentMarkSheet(string name, int rollNumber, int m1, int m2, int m3)
        : PersonalInfo(name, rollNumber), Marks(m1, m2, m3) 
		{
        calculateGrade();
    }

    void calculateGrade() 
	{
        int totalMarks = 0;
        
        for (int i = 0; i < 3; i++) 
		{
            totalMarks += marks[i];
        }
        
		float average = totalMarks / 3.0;

        if (average >= 100)
            grade = "A+";
        else if (average >= 95)
            grade = "A";
        else if (average >= 90)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";
    }

    void display() {
        displayInfo();
        displayMarks();
        cout << "Grade: " << grade << endl;
    }
};

int main() {
    // Create a student mark sheet object
    StudentMarkSheet student("Arumugam", 6015, 75, 50, 82);

    // Display the student mark sheet
    student.display();

    return 0;
}


