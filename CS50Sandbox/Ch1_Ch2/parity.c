#include <cs50.h>
#include <stdio.h>
//  짝수 홀수 구분하기
int main(void)
{
    int n = get_int("n: ");

    if (n % 2 == 0)
    {
        printf("even\n");
        //  짝수
    }
    else if (n % 2 == 1)
    {
        printf("odd\n");
        //홀수
    }
}
