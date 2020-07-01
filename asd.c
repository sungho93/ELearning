#include "global.h"

#include "model.h"

#include "stu_service.h"

#include "stu_file.h"

// Forward declaration.

void displayMenu();
int main()
{
    displayMenu();
    return 0;
} bcbc
c3d3
asdasd
void displayMenu()
{
    int option = 0;
    do
    {
        printf("*********Menu*********\n");
        printf("1 Add Student Info\n");
        printf("2 Display Student Info\n");
        printf("3 Search Student Info\n");
        printf("4 Save Student Info\n");
        printf("5 Read Student Info\n");
        printf("0 Exit System\n");
        printf("**********************\n");
        printf("Please enter your option(0~5): ");
        scanf("%d", &option);
        switch(option)
        {
            case 0:
                break;
            case 1:
                addStudentInfo();
                break;
            case 2:
                displayStudentInfo();
                break;
            case 3:
                searchStudentInfo();
                break;
            case 4:
                saveStudentInfo();
                break;
            case 5:
                readStudentInfo();
                break;
        }
    }while(option != 0);
}
