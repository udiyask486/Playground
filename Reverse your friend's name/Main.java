#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
  ios::sync_with_stdio(false);
  cin.tie(0);
  //Type your code here
  string name;
  getline(cin,name);
  for(string::iterator i = name.end()-1; i >= name.begin() ;i--)
    cout<<*i;
  cout<<endl;
}