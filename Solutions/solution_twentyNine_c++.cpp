#include <iostream>

using namespace std;

int main(){
    int num1;
    cin>>num1;
    bool checker = false;
    if(num1 > -15 && num1 <= 12){
        checker = true;
    }else if(num1 > 14 && num1 < 17){
        checker = true;
    }else if(num1 >= 19){
        checker =true;
    }
    if(checker){
        cout<<"True"<<endl;
    }else{
        cout<<"False"<<endl;
    }
    return 0;
}
