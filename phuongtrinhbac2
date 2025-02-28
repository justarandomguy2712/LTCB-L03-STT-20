#include <stdio.h>
#include <math.h>
int main (){
	int a,b,c;
	float x1,x2;
	scanf("%d%d%d",&a,&b,&c);
	if(a==0){
		return 1;
	}
	int denta=pow(b,2)-4*a*c;
	if(denta<0){
		printf("Phuong trinh vo nghiem");
	} else if (denta==0){
		x1=x2=(float)(-b)/2*a;
		printf("%.4f",x1);
	} else {
		x1=(-b+sqrt(denta))/(2*a);
		x2=(-b-sqrt(denta))/(2*a);
		printf("\n%.4f",x1);
		printf("\n%.4f",x2);
	}
}
