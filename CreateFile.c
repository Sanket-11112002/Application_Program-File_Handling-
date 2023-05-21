#include<stdio.h>
#include<unistd.h>    // universal standard
#include<fcntl.h>
#include<stdlib.h>

int main()
{
    char Name[30];
    int FD = 0;

    printf("Enter file name that you want to Create :\n");
    scanf("%s",Name);

    FD = creat(Name,0777);
    if(FD == -1)
    {
        printf("Unable to create file\n");
    }
    else{
        printf("File is succesfully created\n");
    }
    
    return 0;
}
