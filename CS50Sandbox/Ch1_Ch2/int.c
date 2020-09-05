#include <cs50.h>
#include <stdio.h>

int main(void)
{
   int age = get_int ("what's your age?\n");
   int days = age *365;
   printf("You are ar least %i days old.\n", days);

}
