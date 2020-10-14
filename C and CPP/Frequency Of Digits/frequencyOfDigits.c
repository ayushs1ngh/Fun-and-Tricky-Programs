#include <stdio.h>

int main()
{
    int n,a[100],c=0,i,max=0;
    printf("Enter the size of array : ");
    scanf("%d",&n);
    printf("Enter the elements of array : ");
    for(int i=0 ; i<n ; i++)
     scanf("%d",&a[i]);
    for(int j=0 ; j<n ; j++)
    {
        for( i=0 ; i<n ; i++)
        {
            if(j>i && a[j]==a[i])
             break;
            if(a[j]==a[i])
            {
                c++;
            }
        }
        if(j>i && a[j]==a[i])
         continue;
        else
         printf("Frequency of %d : %d\n",a[j],c);
        c=0;
    }
    return 0;
}

