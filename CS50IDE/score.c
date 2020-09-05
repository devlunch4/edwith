#include <cs50.h>
#include <stdio.h>

int main(void)
{
    
    int score1 = 72;
    int score2 = 73;
    int score3 = 33;

    printf("Average : %i\n", (score1 + score2 + score3) / 3);

    // 위의 코딩을 좀더 개선된 디자인으로 표현
    int scores[3];
    scores[0] = 72;
    scores[1] = 73;
    scores[2] = 33;

    printf("Average[] : %i\n", (scores[0] + scores[1] + scores[2]) / 3);
    
    

}