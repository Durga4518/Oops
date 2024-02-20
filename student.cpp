#include<iostream>
using namespace std;
class student{
     public:
        string fullName;
        int rollNum;
        double semPercentage;
        string collegeName;
        int collegeCode;
        student(){
            cout<<"Constuctor has been created"<<endl;
        }
        ~student(){
            cout<<"Its completed"<<endl;
        }
};
int main()
{
   student prasad;
   prasad.fullName="Durga";
   prasad.rollNum=47;
   prasad.semPercentage=85;
   prasad.collegeName="MVGR";
   prasad.collegeCode=33;
   cout<<"Name of the student is "<<prasad.fullName<<endl;
   cout<<"Rollno of the student is "<<prasad.rollNum<<endl;
   cout<<"Sempercantege of the student is "<<prasad.semPercentage<<endl;
   cout<<"Collegename of the student is "<<prasad.collegeName<<endl;
   cout<<"Collegecode of the student is "<<prasad.collegeCode<<endl;
}
