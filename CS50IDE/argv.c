#include <cs50.h>
#include <stdio.h>

int main(int argc, string argv[])
{
    if (argc == 2)
    {
        printf("hello, %s\n", argv[1]);
    }
    else
    {
        printf("hello, world\n");
    }
}
// 실행시 ./argv 스페이스 다음 "문자열" 입력을 하면 hello, "문자열" 문장이 출력된다