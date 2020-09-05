#include <cs50.h>
#include <stdio.h>

int main(void)
{
    float price = get_float("What's the price\n");
    //  가격에 소수점이 있을수 있으므로 float로 설정(미국)
    printf("Your total is %.2f.\n", price * 1.0625);
    //  %.2f 소수점 2자리만 보기
    //  1.0625 세금 포함한 총 가격 계산
}

