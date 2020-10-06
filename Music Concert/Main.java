#include<iostream>
using namespace std;
int main(){
  ios::sync_with_stdio(false);
  cin.tie(0);
  // Type your code here
  int n,*ptr = NULL;
  
  cin>>n;
  ptr = (int *)malloc(n*sizeof(int));
  int cnt = 0;
  for(int i = 0;i < n; i++)
  {
    cin>>*(ptr+i);
    if ((*(ptr+i))%2)
      cnt += 1;
  }
  cout<<cnt<<endl<<n-cnt<<endl;
  return 0;
}