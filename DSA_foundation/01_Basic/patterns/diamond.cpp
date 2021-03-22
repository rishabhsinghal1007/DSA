// 		    *	
// 	    *	*	*	
//  *	*	*	*	*	
// 	    *	*	*	
// 		    *	
#include <iostream>
using namespace std;

void printDiamond(int row)
{
    int nst = 1;                                  
    int nsp = row/2 ;                                              
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
        if(r<=row/2)
        {
            nst+=2;
            nsp--;
        }
        else
        {
            nst-=2;
            nsp++;
        }
        cout<<endl;
    }
}
int main(int argc, char **argv){

    printDiamond(7);
    return 0;
}