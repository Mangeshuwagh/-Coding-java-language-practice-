#include <stdio.h>
void main()
{
    char ch;
    printf("Enter the charater and check the charater is vowel or not\n");

    scanf("%c", &ch);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
    {

        /* code */
        printf("Charater is vowel %c", ch);
    }
    else
    {
        printf("Charater is not vowels%c: ", ch);
    }
}