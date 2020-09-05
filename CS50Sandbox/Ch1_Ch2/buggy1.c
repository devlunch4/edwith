#include <stdio.h>
#include <cs50.h>

//help50 make "class명" 디버그 가능
//help50 make buggy1

/// 단축키 [Ctrl + L] == 터미널의 clear

int main(void)
{
    string name = get_string ("What's your name?\n");
    printf("hello, %s\n", name);
}


