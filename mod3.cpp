#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
    string n ;
    cout<<"Enter the string \n";
    cin>>n;
    int count1=0,count0=0;
    for(int i =0;i<n.size();i++){
        if(n[i]=='1'){
            count1++;
        }else{
        count0++;}
    }
    if(count1%3==0||count0%3==0){
        cout<<"Accepted \n";
    }
    else{
        cout<<"Not Accepted \n";
    }


}
