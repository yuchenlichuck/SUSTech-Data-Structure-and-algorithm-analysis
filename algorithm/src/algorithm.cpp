//============================================================================
// Name        : algorithm.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================
#include <iostream>
using namespace std;
int main()
{
int a;
cin >> a;
for (int i=0;i<a;i++) {
int b;int c;
cin >>b;
cin >>c;
int arr[b];
if (bs(arr,b,c)==-1){
cout << "NO";
}
else cout<<"YES";
}
}

int bs(int array[], int n, int target) {
	int low = 0, high = n, middle = 0;
	while(low < high) {
		middle = (low + high)/2;
		if(target == array[middle]) {
			return middle;
		} else if(target < array[middle]) {
			high = middle;
		} else if(target > array[middle]) {
			low = middle + 1;
		}
	}
	return -1;
}
