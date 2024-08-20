#include<list>
#include <iostream>
using namespace std;

void displayList(const list<int> &xyz) {
    
  for (list<int>::const_iterator it = xyz.begin(); it!=xyz.end(); it++) {
int max = 0;
    if (*it >max) {
      max = *it;
      
    } cout << max << ", ";
    
  }
  // VERY IMPORTANT CONCEPT IF YOU ARE NOT PUTTING AND & SING THEN
               // THIS FUNCTION WILL MAKE COPY OF PROVIDED LIST AND WILL WORK ON
  // THAT WWHICH will MAKE YOUR PROGRAM SLOW AND IT WILL CONSUME ALOT OF YOUR
  // SYSTEM RESOURCES BUT IF YOU PUT & SIGN WITH THE LIST OR ANY VALUE YOU ARE
  // PASSING TO THE FUNCTION IT WILL TELL THE FUNCTION THAT THIS VALUE IS THE
  // ORIGNAL VALUE NOT THE COPY THUS IT BETTER TO MAKE THE VALUE CONSTANT 
  //THUS IT WONT GET MODIFIED DURING ANY OEPRATION EXECUTION 


  
}


int main() {
  /*
list<int> myList;
  myList.push_back(10);
  myList.push_back(20);
  myList.push_back(30);
  myList.push_front(40);

      for (list<int>::iterator it = myList.begin(); it != myList.end(); it++){
          cout<<*it<<endl;
}
*/
  list<int> allPlayers={2,9,6,7,3,1,4,8,3,2,9,5,1,};
  list<int> beginners; //rating 1-5
  list<int> pros;      // rating 6-10

  for (list<int>::iterator it = allPlayers.begin(); it != allPlayers.end(); it++) {

    if (*it <= 5) {
      beginners.push_front(*it);
    } else {
      pros.push_front(*it);
        }
  
  }
cout << "beginners: " << endl;
  for (list<int>::iterator b = beginners.begin(); b != beginners.end();b++) {
    cout << *b << ", ";
  }
  cout << endl;
   cout << "pros"  << endl;
  for (list<int>::iterator p = pros.begin(); p != pros.end(); p++){
    cout << *p << ", ";
  }
        cout << "function impl" << endl;           
  displayList(beginners);
}

/*
List is a dynamic allocation of memory


*/