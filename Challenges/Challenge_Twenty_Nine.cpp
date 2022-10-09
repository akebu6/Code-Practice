/**************************************************************************************************************************************************************
* QUESTION
* There is an integer as input. Output True if its value is within the interval (−15,12]∪(14,17)∪[19,+∞)
* (−15,12]∪(14,17)∪[19,+∞)
* , otherwise print False (case sensitive).
*
* Please note the different brackets, which are used to specify intervals. The problem uses semi-open and open intervals. You can read more about them in the Wikipedia.
*
* The union sign means a union of intervals. A shortlist of intervals:
***************************************************************************************************************************************************************/

// SOLUTION

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