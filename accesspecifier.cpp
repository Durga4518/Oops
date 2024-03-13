#include<iostream>
using namespace std;
class AccessSpecifierDemo{
    private:
        int priVar;
    protected:
        int proVar;
    public:
        int pubVar;
    void setVar(int priValue ,int proValue ,int pubValue)
    {
        priVar=priValue;
        proVar=proValue;
        pubVar=pubValue;

    }
    void getVar(){
        cout<<"private : " <<priVar<<endl;
        cout<<"protected : " <<proVar<<endl;
        cout<<"public : " <<pubVar<<endl;

    }
};
int main(){
    AccessSpecifierDemo obj;
    obj.setVar(47,17,52);
    obj.getVar();
    return 0;

}
