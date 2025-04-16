#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Node {
    char hoTen[50];
    int tuoi;
    float diemTB;
    struct Node* next;
} Node;

Node* taoNode(char ten[], int tuoi, float diem) {
    Node* p = (Node*)malloc(sizeof(Node));
    strcpy(p->hoTen, ten);
    p->tuoi = tuoi;
    p->diemTB = diem;
    p->next = NULL;
    return p;
}

void chenTruoc(Node** head, char truocTen[], Node* newNode) {
    if (*head == NULL || strcmp((*head)->hoTen, truocTen) == 0) {
        newNode->next = *head;
        *head = newNode;
        return;
    }
    Node* p = *head;
    while (p->next != NULL && strcmp(p->next->hoTen, truocTen) != 0) {
        p = p->next;
    }
    if (p->next != NULL) {
        newNode->next = p->next;
        p->next = newNode;
    } else {
        printf("Khong tim thay sinh vien co ten %s.\n", truocTen);
    }
}

void xoaSinhVien(Node** head, char ten[]) {
    Node* temp = *head, *prev = NULL;
    while (temp != NULL && strcmp(temp->hoTen, ten) != 0) {
        prev = temp;
        temp = temp->next;
    }
    if (temp == NULL) {
        printf("Khong tim thay sinh vien de xoa.\n");
        return;
    }
    if (prev == NULL) {
        *head = temp->next;
    } else {
        prev->next = temp->next;
    }
    free(temp);
}

void inDanhSach(Node* head) {
    printf("\n%-5s %-20s %-10s %-10s\n", "STT", "Ho ten", "Tuoi", "Diem TB");
    int i = 1;
    while (head != NULL) {
        printf("%-5d %-20s %-10d %-10.2f\n", i++, head->hoTen, head->tuoi, head->diemTB);
        head = head->next;
    }
}

int main() {
    Node* head = NULL;
    int chon;
    do {
        printf("\n1. Them SV\n2. Chen SV truoc SV khac\n3. Xoa SV\n4. In danh sach\n0. Thoat\nChon: ");
        scanf("%d", &chon);
        getchar(); // clear buffer
        if (chon == 1) {
            char ten[50]; int tuoi; float diem;
            printf("Nhap ho ten: "); gets(ten);
            printf("Tuoi: "); scanf("%d", &tuoi);
            printf("Diem TB: "); scanf("%f", &diem);
            Node* newNode = taoNode(ten, tuoi, diem);
            newNode->next = head;
            head = newNode;
        } else if (chon == 2) {
            char ten[50], truocTen[50]; int tuoi; float diem;
            printf("Nhap ho ten can chen: "); gets(ten);
            printf("Tuoi: "); scanf("%d", &tuoi);
            printf("Diem TB: "); scanf("%f", &diem); getchar();
            printf("Chen truoc SV ten: "); gets(truocTen);
            Node* newNode = taoNode(ten, tuoi, diem);
            chenTruoc(&head, truocTen, newNode);
        } else if (chon == 3) {
            char ten[50];
            printf("Nhap ten sinh vien muon xoa: "); gets(ten);
            xoaSinhVien(&head, ten);
        } else if (chon == 4) {
            inDanhSach(head);
        }
    } while (chon != 0);

    return 0;
}
