#include <stdio.h>
#include <math.h>
int main (){
	float a,b,c,d,e,f,dx,dy,D;
	scanf("%f%f%f%f%f%f",&a,&b,&c,&d,&e,&f);
	float x,y;
	D=a*e-b*d;
	dx=c*e-f*b;
	dy=a*f-c*d;
	if(d!=0){
		printf("He co cap nghiem duy nhat");
		x=dx/D;
		y=dy/D;
		printf(" :(%.2f,%.2f)",x,y);
	} else if(dx==0 && dy==0){
		printf("He phuong trinh co vo so nghiem");	
	} else {
		printf("He phuong trinh vo nghiem");
	}
}
