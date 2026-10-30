import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String maSach, tenSach, tacGia;

int namXuatBan, soLuong;

double donGia;

System.out.print("Nhap ma sach: ");

maSach = sc.nextLine();


System.out.print("Nhap ten sach: ");

tenSach = sc.nextLine();


System.out.print("Nhap tac gia: ");

tacGia = sc.nextLine();


System.out.print("Nhap nam xuat ban: ");

namXuatBan = Integer.parseInt(sc.nextLine());


System.out.print("Nhap don gia: ");

donGia = Double.parseDouble(sc.nextLine());


System.out.print("Nhap so luong: ");

soLuong = Integer.parseInt(sc.nextLine());

System.out.println("\n===== THONG TIN SACH =====");

System.out.println("Ma sach: " + maSach);

System.out.println("Ten sach: " + tenSach);

System.out.println("Tac gia: " + tacGia);

System.out.println("Nam xuat ban: " + namXuatBan);

System.out.println("Don gia: " + donGia);

System.out.println("So luong: " + soLuong);


boolean checkGia = donGia > 0;

boolean checkSoLuong = soLuong >= 0;

boolean checkNamXB = (namXuatBan > 0 && namXuatBan <= 2026);



System.out.println("\n--- Kiem tra dieu kien (Bai 1) ---");

System.out.println("- Kiem tra don gia (> 0): " + (checkGia ? "Hop le" : "Khong hop le"));

System.out.println("- Kiem tra so luong (>= 0): " + (checkSoLuong ? "Hop le" : "Khong hop le"));

System.out.println("- Kiem tra nam xuat ban: " + (checkNamXB ? "Hop le" : "Khong hop le"));


System.out.println("\n--- Phan loai gia (Bai 2) ---");

if (donGia < 50000) {

System.out.println("Phan loai gia: Sách giá thấp");

} else if (donGia >= 50000 && donGia <= 100000) {

System.out.println("Phan loai gia: Sách giá trung bình");

} else if (donGia > 100000 && donGia <= 200000) {

System.out.println("Phan loai gia: Sách giá cao");

} else {

System.out.println("Phan loai gia: Sách giá đặc biệt");

}


System.out.println("\n--- Phan loai ton kho (Bai 3) ---");

if (soLuong == 0) {

System.out.println("Tinh trang ton kho: Hết sách");

} else if (soLuong >= 1 && soLuong <= 5) {

System.out.println("Tinh trang ton kho: Sắp hết");

} else if (soLuong >= 6 && soLuong <= 20) {

System.out.println("Tinh trang ton kho: Còn ít");

} else {

System.out.println("Tinh trang ton kho: Còn nhiều");

}



System.out.println("\n--- Chon loai sach (Bai 4) ---");

System.out.println("1. Sách giáo khoa");

System.out.println("2. Sách tham khảo");

System.out.println("3. Sách chuyên ngành");

System.out.println("4. Sách khác");

System.out.print("Nhap lua chon (1-4): ");

int loaiSach = Integer.parseInt(sc.nextLine());



System.out.print("Loai sach: ");

switch (loaiSach) {

case 1:

System.out.println("Sách giáo khoa");

break;

case 2:

System.out.println("Sách tham khảo");

break;

case 3:

System.out.println("Sách chuyên ngành");

break;

case 4:

System.out.println("Sách khác");

break;

default:

System.out.println("Lựa chọn không hợp lệ!");

}