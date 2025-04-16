#include <stdio.h>
#include <string.h>

typedef struct {
    char ten[50];
    int donGia;
    int soLuong;
    int thanhTien;
} MatHang;

void sapXepTheoTen(MatHang mh[], int n) {
    for (int i = 0; i < n - 1; ++i)
        for (int j = i + 1; j < n; ++j)
            if (strcmp(mh[i].ten, mh[j].ten) > 0) {
                MatHang temp = mh[i];
                mh[i] = mh[j];
                mh[j] = temp;
            }
}

int main() {
    int n;
    printf("Nhap so luong mat hang: ");
    scanf("%d", &n);
    MatHang mh[n];

    for (int i = 0; i < n; ++i) {
        printf("Mat hang %d:\n", i + 1);
        printf("Ten: "); getchar(); gets(mh[i].ten);
        printf("Don gia: "); scanf("%d", &mh[i].donGia);
        printf("So luong: "); scanf("%d", &mh[i].soLuong);
        mh[i].thanhTien = mh[i].donGia * mh[i].soLuong;
    }

    sapXepTheoTen(mh, n);

    int tong = 0;
    printf("\n%-5s %-15s %-10s %-10s %-12s\n", "STT", "Ten Hang", "Don gia", "So luong", "Thanh tien");
    for (int i = 0; i < n; ++i) {
        printf("%-5d %-15s %-10d %-10d %-12d\n", i + 1, mh[i].ten, mh[i].donGia, mh[i].soLuong, mh[i].thanhTien);
        tong += mh[i].thanhTien;
    }
    printf("\nTong tien: %d\n", tong);

    return 0;
}
