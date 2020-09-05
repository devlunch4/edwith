#include <stdio.h>

void cough(void)
{
    printf("cough\n");
}

int main(void)
{
 for (int i = 0; i < 3; i++)
 {
    cough();
}
}
