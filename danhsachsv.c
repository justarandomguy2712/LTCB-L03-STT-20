#include <stdio.h>
#include <string.h>
#define MAX 100
typedef struct {
    char Ho_ten[50];
    int Tuoi;
    float Diem_TB;
} SinhVien;
void ghiFile(SinhVien ds[], int n) {
    FILE *f = fopen("DSACH.C", "w");
    if (f == NULL) {
        printf("Khong mo duoc file!\n");
        return;
    }

    fprintf(f, "%-5s %-20s %-10s %-10s\n", "STT", "Ho ten", "Tuoi", "Diem TB");
    for (int i = 0; i < n; i++) {
        fprintf(f, "%-5d %-20s %-10d %-10.2f\n", i + 1, ds[i].Ho_ten, ds[i].Tuoi, ds[i].Diem_TB);
    }
    fclose(f);
    printf("Da ghi danh sach vao file DSACH.C\n");
}

void inDanhSach(SinhVien ds[], int n) {
    printf("%-5s %-20s %-10s %-10s\n", "STT", "Ho ten", "Tuoi", "Diem TB");
    for (int i = 0; i < n; i++) {
        printf("%-5d %-20s %-10d %-10.2f\n", i + 1, ds[i].Ho_ten, ds[i].Tuoi, ds[i].Diem_TB);
    }
}
int timViTriTheoTen(SinhVien ds[], int n, char ten[]) {
    for (int i = 0; i < n; i++) {
        if (strcmp(ds[i].Ho_ten, ten) == 0)
            return i;
    }
    return -1;
}
int main() {
    SinhVien ds[MAX];
    int n;
    printf("Nhap so sinh vien: ");
    scanf("%d", &n);
    getchar();

    for (int i = 0; i < n; i++) {
        printf("Nhap sinh vien thu %d:\n", i + 1);
        printf("Ho ten: "); gets(ds[i].Ho_ten);
        printf("Tuoi: "); scanf("%d", &ds[i].Tuoi);
        printf("Diem TB: "); scanf("%f", &ds[i].Diem_TB);
        getchar(); // xóa newline
    }

    ghiFile(ds, n);
    inDanhSach(ds, n);
    SinhVien sv_moi;
    char ten_chen[50];
    printf("\nNhap ten sinh vien muon chen vao truoc: ");
    gets(ten_chen);
    int vt = timViTriTheoTen(ds, n, ten_chen);
    if (vt == -1) {
        printf("Khong tim thay sinh vien co ten %s.\n", ten_chen);
    } else {
        printf("Nhap thong tin sinh vien moi:\n");
        printf("Ho ten: "); gets(sv_moi.Ho_ten);
        printf("Tuoi: "); scanf("%d", &sv_moi.Tuoi);
        printf("Diem TB: "); scanf("%f", &sv_moi.Diem_TB);
        getchar();
        for (int i = n; i > vt; i--) {
            ds[i] = ds[i - 1];
        }
        ds[vt] = sv_moi;
        n++;
        printf("Da chen sinh vien.\n");
        ghiFile(ds, n);
        inDanhSach(ds, n);
    }
    char ten_xoa[50];
    printf("\nNhap ten sinh vien muon xoa: ");
    gets(ten_xoa);
    vt = timViTriTheoTen(ds, n, ten_xoa);
    if (vt == -1) {
        printf("Khong tim thay sinh vien can xoa.\n");
    } else {
        for (int i = vt; i < n - 1; i++) {
            ds[i] = ds[i + 1];
        }
        n--;
        printf("Da xoa sinh vien.\n");
        ghiFile(ds, n);
        inDanhSach(ds, n);
    }
    char ten_sua[50];
    printf("\nNhap ten sinh vien muon sua: ");
    gets(ten_sua);
    vt = timViTriTheoTen(ds, n, ten_sua);
    if (vt == -1) {
        printf("Khong tim thay sinh vien can sua.\n");
    } else {
        printf("Nhap tuoi moi: "); scanf("%d", &ds[vt].Tuoi);
        printf("Nhap diem TB moi: "); scanf("%f", &ds[vt].Diem_TB);
        printf("Da cap nhat thong tin sinh vien.\n");
        ghiFile(ds, n);
        inDanhSach(ds, n);
    }
    return 0;
}
