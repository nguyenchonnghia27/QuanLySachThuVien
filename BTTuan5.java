import java.util.Scanner;

public class BTTuan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] maSach = new String[100];
        String[] tenSach = new String[100];
        String[] tacGia = new String[100];
        int[] namXB = new int[100];
        double[] donGia = new double[100];
        int[] soLuong = new int[100];
        int n = 0;
        int chon;
        do {
            System.out.println("\n===== QUAN LY THU VIEN =====");
            System.out.println("1. Nhap sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tinh tong so luong va gia tri sach");
            System.out.println("4. Tim sach theo ma");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    System.out.print("Nhap so sach: ");
                    int them = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < them; i++) {
                        System.out.println("\nNhap sach thu " + (n + 1));
                        System.out.print("Ma sach: ");
                        maSach[n] = sc.nextLine();
                        System.out.print("Ten sach: ");
                        tenSach[n] = sc.nextLine();
                        System.out.print("Tac gia: ");
                        tacGia[n] = sc.nextLine();
                        System.out.print("Nam xuat ban: ");
                        namXB[n] = sc.nextInt();
                        System.out.print("Don gia: ");
                        donGia[n] = sc.nextDouble();
                        System.out.print("So luong: ");
                        soLuong[n] = sc.nextInt();
                        sc.nextLine();
                        n++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nMa sach: " + maSach[i]);
                        System.out.println("Ten sach: " + tenSach[i]);
                        System.out.println("Tac gia: " + tacGia[i]);
                        System.out.println("Nam xuat ban: " + namXB[i]);
                        System.out.println("Don gia: " + donGia[i]);
                        System.out.println("So luong: " + soLuong[i]);
                    }
                    break;
                case 3:
                    int tongSoLuong = 0;
                    double tongGiaTri = 0;
                    for (int i = 0; i < n; i++) {
                        tongSoLuong += soLuong[i];
                        tongGiaTri += donGia[i] * soLuong[i];
                    }
                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;
                case 4:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    boolean timThay = false;
                    for (int i = 0; i < n; i++) {
                        if (maSach[i].equals(maTim)) {
                            System.out.println("Ma sach: " + maSach[i]);
                            System.out.println("Ten sach: " + tenSach[i]);
                            System.out.println("Tac gia: " + tacGia[i]);
                            System.out.println("Nam xuat ban: " + namXB[i]);
                            System.out.println("Don gia: " + donGia[i]);
                            System.out.println("So luong: " + soLuong[i]);
                            timThay = true;
                        }
                    }
                    if (timThay == false) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 5);
        sc.close();
    }
}