#include<iostream>
#include <stack>
using namespace std;
int main()
{
  ios :: sync_with_stdio(false);
  cin.tie(0);
  //Type your code
  stack<int> st;
  string s;
  bool cond = true;
  cin>>s;
  for(int i =0;i < s.size();i++)
  {
    if(s[i] == '(')
      st.push(')');
    else if ( s[i] == '{')
		st.push('}');
    else if(s[i] == '[')
      	st.push(']');
    else if(st.empty())
    {	
      	cond = false;
      	cout<<"Not Balanced"<<endl;
      	break;
    }
    else
    {
        while(s[i] != st.top())
        {
          st.pop();
          if(st.empty())
          {
            break;
            cout<<"Not Balanced"<<endl;
          }
        }
      if (s[i] == st.top())
        st.pop();
    }
  }
  if ((st.empty()) && cond)
    cout<<"Balanced"<<endl;
  else if(cond)
    cout<<"Not Balanced"<<endl;
  
  return 0;
}