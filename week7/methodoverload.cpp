#include <iostream>
using namespace std;
class Sum{
    public:
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
};
int main(){
    
    Sum obj;
    cout << "add(int 17, int 9) : " << obj.add(17,9) << endl;
    cout << "add(double 42.12, double 12.32) : " << obj.add(42.12,12.32) << endl;
    cout << "add(int 40, int 9, int 14) : " << obj.add(40,9,14) << endl;
    
}
