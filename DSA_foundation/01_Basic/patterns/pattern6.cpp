// *	*	*		*	*	*	
// *	*				*	*	
// *						*	
// *	*				*	*	
// *	*	*		*	*	*
#include <iostream>
using namespace std;

void printPattern6(int row)
{
    int nst = (row+1)/2;                                  
    int nsp = 1 ;                                              
    for(int r=1 ; r<=row ; r++)
    {
        for(int cst=1 ; cst<=nst ; cst++)
        {
            cout<<"*\t";
        }
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
            nst--;
            nsp+=2;
        }
        else
        {
            nst++;
            nsp-=2;
        }
        cout<<endl;
    }
}
int main(int argc, char **argv){
    int n;
    cin >> n;
    printPattern6(n);
    return 0;
}


