#include <cs50.h>
#include <stdio.h>

int main(int argc, string argv[])
{
    if(argc != 2)
    {
        printf("missing command-line argument\n");
        return 1;
    }
    printf("hello, %s\n", argv[0]);
    return 0;
}
// 앞에 만든 argv.c 에서 값이 있다면 이에 따른 것을 출력하는것
// 실행문 뒤에 앞서 적은 이름을 타이핑하면 헬로 이름 출력
// 실행문 뒤에 아무것도 이력을 안하면 미싱~ 출력
