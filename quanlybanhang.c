#include <stdio.h>

typedef struct {
    char tenHang[50];
    int donGia;
    int soLuong;
    int thanhTien;
} MatHang;

int main() {
    int n;
    MatHang ds[100];
    FILE *fout;

    printf("Nhap so luong mat hang: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        getchar(); 
        printf("Ten hang: "); gets(ds[i].tenHang);
        printf("Don gia: "); scanf("%d", &ds[i].donGia);
        printf("So luong: "); scanf("%d", &ds[i].soLuong);
        ds[i].thanhTien = ds[i].donGia * ds[i].soLuong;
    }

    fout = fopen("SO_LIEU.C", "w");
    if (!fout) {
        printf("Khong mo duoc file.\n");
        return 1;
    }

    fprintf(fout, "%-5s %-15s %-10s %-10s %-10s\n", "STT", "Ten Hang", "Don gia", "So luong", "Thanh tien");
    int tong = 0;
    for (int i = 0; i < n; i++) {
        fprintf(fout, "%-5d %-15s %-10d %-10d %-10d\n", i + 1, ds[i].tenHang, ds[i].donGia, ds[i].soLuong, ds[i].thanhTien);
        tong += ds[i].thanhTien;
    }
    fprintf(fout, "\nTong tien: %d\n", tong);
    fclose(fout);
    printf("Da ghi vao file SO_LIEU.C\n");

    return 0;
}
