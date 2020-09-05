#include <cs50.h>
#include <stdio.h>

//  평균 계산 함수 : 배열의 길이와 배열을 입력으로 받는다
//                   함수 안에서 배열의 길이만큼 루프를 돈다
float average (int length, int array[])
{
    int sum = 0;
    for (int i = 0; i < length; i++)
    {
        sum += array[i];
    }
    return (float) sum / (float) length;
}

int main(void)
{
    //  사용자로부터 점수 입력 수를 입력
    int n = get_int("Number of scores: ");

    //  점수 배열 선언 및 사용자로부터 값 입력
    int scores[n];

    for (int i = 0; i < n; i++)
    {
        scores[i] = get_int("Score %i: ", i+1);
    }

    //  평균 출력
    printf("Average : %.1f\n", average(n, scores));
}

