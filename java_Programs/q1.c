#include<stdio.h>
int fact(int n){
    int f = 1;
    for(int i = 1; i <= n; i++){
        f = f * i;
    }
    return f;
}
int main(){
    for(int i = 1; i <= 20; i++){
        int t = i, sum = 0;
        while(t > 0){
            sum += fact(t % 10);
            t = t / 10;
        }
        if(sum == i){
            printf("%d ", i);
        }
    }
    return 0;
}