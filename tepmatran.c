#include <stdio.h>

int main() {
    int m, n;
    printf("Nhap so hang m: ");
    scanf("%d", &m);
    printf("Nhap so cot n: ");
    scanf("%d", &n);

    int A[m][n], B[m][n], C[m][n];

    printf("Nhap ma tran A:\n");
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++) {
            printf("A[%d][%d] = ", i, j);
            scanf("%d", &A[i][j]);
        }

 
    printf("Nhap ma tran B:\n");
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++) {
            printf("B[%d][%d] = ", i, j);
            scanf("%d", &B[i][j]);
        }


    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
            C[i][j] = A[i][j] + B[i][j];

    
    FILE *f = fopen("CONG_MT.C", "w");
    if (f == NULL) {
        printf("Khong the mo tep de ghi.\n");
        return 1;
    }

    fprintf(f, "Ma tran A:\n");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++)
            fprintf(f, "%d ", A[i][j]);
        fprintf(f, "\n");
    }

    fprintf(f, "\nMa tran B:\n");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++)
            fprintf(f, "%d ", B[i][j]);
        fprintf(f, "\n");
    }

    fprintf(f, "\nMa tran C = A + B:\n");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++)
            fprintf(f, "%d ", C[i][j]);
        fprintf(f, "\n");
    }

    fclose(f);
    printf("Da ghi ket qua vao tep CONG_MT.C\n");

    return 0;
}
