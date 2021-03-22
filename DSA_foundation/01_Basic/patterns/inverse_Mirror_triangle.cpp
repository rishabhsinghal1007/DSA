//  *	*	*	*	*	
// 	    *	*	*	*	
// 		    *	*	*	
// 			    *	*	
// 				    *   
#include <iostream>
using namespace std;

void printInverseMirrorTriangle(int row)
{
    int nst = row;                                  
    int nsp = 0 ;                                              
    for(int r=1 ; r<=row ; r++)
    {
        for(int csp=1 ; csp<=nsp ; csp++)
        {
            cout<<"\t";
        }
        for(int cst=1 ; cst<=nst ; cst++)
        {
            cout<<"*\t";
        }
        nst--;
        nsp++;
        cout<<endl;
    }
}
int main(int argc, char **argv){
    int n;
    cin >> n;
    printInverseMirrorTriangle(n);
    return 0;
}