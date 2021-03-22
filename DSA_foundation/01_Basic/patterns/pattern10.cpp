//          *	
//  	*	   	*	
//  *			    *
//  	*		*
//  	 	*	
#include <iostream>
using namespace std;

void printPattern10(int row)
{
    int nsp1 = row/2;                                  
    int nsp2 = -1 ;                                              
    for(int r=1 ; r<=row ; r++)
    {
        for(int csp=1 ; csp<=nsp1 ; csp++)
        {
            cout<<"\t";
        }
         cout<<"*\t";
        for(int csp=1 ; csp<=nsp2 ; csp++)
        {
            cout<<"\t";
        }
        if(nsp2!=-1)
        {
            cout<<"*\t";
        }
        if(r<=row/2)
        {
            nsp1--;
            nsp2+=2;
        }
        else
        {
            nsp1++;
            nsp2-=2;
        }
        cout<<endl;
    }
}
int main(int argc, char **argv){
    int n;
    cin >> n;
    printPattern10(n);
    return 0;
}


