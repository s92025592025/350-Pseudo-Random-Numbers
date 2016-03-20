#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int countCycle(int Z, int I, int M, int L);

int main(){
	int Z, I, M, L;
	for(int s = 1;; s++){
		cin >> Z >> I >> M >> L;
		if(Z == 0 && I == 0 && M == 0 && L == 0){break;}
		cout << "Case " << s << ": " << countCycle(Z, I, M, L) 
		<< endl;
	}
	
	return 0;
}

int countCycle(int Z, int I, int M, int L){
	vector<int> list;
	while(find(list.begin(), list.end(), L) == list.end()){
		list.push_back(L);
		L = (Z * L + I) % M;
	}
	
	return list.end() - find(list.begin(), list.end(), L);
}
