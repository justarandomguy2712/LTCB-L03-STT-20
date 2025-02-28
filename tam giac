#include <stdio.h>
#include <math.h>

int main() {
    int a, b, c;
    scanf("%d%d%d", &a, &b, &c);

    if (a + b > c && a + c > b && b + c > a) {
        if (a == b && b == c) {
            printf("Tam giac deu");
        } else if ((a == b || a == c || b == c) && (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)) {
            printf("Tam giac vuong can");
        } else if (a == b || a == c || b == c) {
            printf("Tam giac can");
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            printf("Tam giac vuong");
        } else {
            printf("Tam giac thuong");
        }
    } else {
        printf("invalid");
    }
    printf("\nChu vi tam giac la: %d",a+b+c);
    int p=(a+b+c)/2;
    float S=sqrt(p*(p-a)*(p-b)*(p-c));
    printf("\nDien tich tam giac la: %.2f",S);
}
