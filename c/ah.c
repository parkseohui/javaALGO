//아마도 최대값을 구할것같다
#include<stdio.h>
get_max(int a[], int n)
{
  int i;
  int tmp=a[0];
  for(i=1;i<n;i++){
    if(a[i]>tmp)
    {
      tmp=a[i];
    }
  }
  return tmp;
}

int main(){
  int score[5]={3,4,1,6,2}

  printf("최대값 = %d",max(score, 5));

  return 0;
}
