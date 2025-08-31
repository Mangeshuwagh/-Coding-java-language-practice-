#include <stdio.h>
#include <conio.h>

void main()
{
    int num;
    printf("Enter the number Mangesh And Check number is prime or not: ");

    scanf("%d", &num);
    printf("Show the number:%d ", num);

    int count = 0;
    for (int i = 1; i <= num; i++)
    {
        if (num % i == 0)
        {
            count++;
            /* code */
        }
    }

    if (count == 2)
    {
        printf("Number is Prime:  %d", num);
        /* code */
    }
    else
    {
        printf("Number is not Prime: %d", num);
    }
}