#include <stdio.h>
int main (){
	int year,month;
	scanf("%d%d",&month,&year);
	if(year<0|| month<1 || month>12){
		return 1;
	} else if (month==2){
		if(year %4==0 && year%100!=0){
			printf("Thang 2 nam %d co 29 ngay",year);
		} else {
			printf("Thang 2 nam %d co 28 ngay",year);
		}
	} else if (month==4 || month==6 || month == 9 || month==11){
		printf("Thang %d nam %d co 30 ngay",month,year);
	} else {
		printf("Thang %d nam %d co 31 ngay",month,year);
	}
		
	}
