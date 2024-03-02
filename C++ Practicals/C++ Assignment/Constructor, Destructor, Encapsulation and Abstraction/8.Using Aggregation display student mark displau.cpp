/* Write a C++ program to implement a class called Student that has private
member variables for name, class, roll number, and marks. Include
member functions to calculate the grade based on the marks and display
the student's information. Accept address from each student implement
using of aggregation  */ 

#include <iostream>
#include <string>
using namespace std;

//Address class created
class Address {
public:
	//data members declared
    string street;
    string city;
    string state;
    string country;
    string zipcode;
//Setters
    void setAddress(string s, string c, string st, string co, string z) {
        street = s;
        city = c;
        state = st;
        country = co;
        zipcode = z;
    }
    
    //displayAddress function used

    void displayAddress() {
        cout << "Address: " << street << " " << city << " " << state << " " << country << " " << zipcode << endl;
    }
};

class Student {
private:
    string name;
    string className;
    int rollNumber;
    float marks;
    char grade;

public:
    void setData(string n, string cn, int rn, float m, char g) {
        name = n;
        className = cn;
        rollNumber = rn;
        marks = m;
        grade = g;
    }

//Calculate Grade function created 
    void calculateGrade() {
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else if (marks >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
    }

    void displayInfo() {
        cout << "Name: " << name << endl;
        cout << "Class: " << className << endl;
        cout << "Roll Number: " << rollNumber << endl;
        cout << "Marks: " << marks << endl;
        cout << "Grade: " << grade << endl;
    }
    
	//Aggregation used 
    void setAddress(Address& addr) {
        addr.displayAddress();
    }
};

int main() {
    Student student1; // Object created
    student1.setData("Arumugam", "10th", 101, 85.5, ' '); // Object with function
    student1.calculateGrade();

    Address address1; //
    address1.setAddress("55 ", "HariColony", "Ahmedabad", "Gujarat", "380008");

   
    student1.displayInfo();
    cout << endl;
    student1.setAddress(address1);

    return 0;
}

