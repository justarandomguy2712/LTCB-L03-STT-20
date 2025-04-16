#include <stdio.h>

#define MAX 100

int main() {
    int a[MAX][MAX], b[MAX][MAX], c[MAX][MAX];
    int m, n, p;
    FILE *fout;

    printf("Nhap so dong ma tran A: ");
    scanf("%d", &m);
    printf("Nhap so cot ma tran A = so dong ma tran B: ");
    scanf("%d", &n);
    printf("Nhap so cot ma tran B: ");
    scanf("%d", &p);

    printf("Nhap ma tran A:\n");
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
            scanf("%d", &a[i][j]);

    printf("Nhap ma tran B:\n");
    for (int i = 0; i < n; i++)
        for (int j = 0; j < p; j++)
            scanf("%d", &b[i][j]);


    for (int i = 0; i < m; i++)
        for (int j = 0; j < p; j++) {
            c[i][j] = 0;
            for (int k = 0; k < n; k++)
                c[i][j] += a[i][k] * b[k][j];
        }


    fout = fopen("TICH_MT.C", "w");
    if (fout == NULL) {
        printf("Khong mo duoc file.\n");
        return 1;
    }
    fprintf(fout, "Ma tran tich:\n");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < p; j++)
            fprintf(fout, "%d ", c[i][j]);
        fprintf(fout, "\n");
    }
    fclose(fout);
    printf("Da ghi ket qua vao file TICH_MT.C\n");

    return 0;
}
