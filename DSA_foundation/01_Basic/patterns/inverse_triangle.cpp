// *	*	*	*	*	
// *	*	*	*	
// *	*	*	
// *	*	
// *	

#include <iostream>
using namespace std;

void printInverseTriangle(int row)
{ int nst=row;
    for(int r=1 ; r<=row ; r++)
    {
        for(int cst=1; cst<=nst; cst++)
        {
            cout <<"*\t" ;
        }
        nst--;
        cout<<endl;
    }
}

int main(int argc, char **argv){
    int n;
    cin >> n;
    printInverseTriangle(n);
    return 0;
}
