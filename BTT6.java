import java.util.ArrayList;
import java.util.Scanner;

class SachT6 {
    private String maSach;
    private String tenSach;
    private double gia;
    private int soLuong;

    public SachT6(String maSach, String tenSach, double gia, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTenSach() { return tenSach; }
    public void setTenSach(String tenSach) { this.tenSach = tenSach; }

    public double getGia() { return gia; }
    public void setGia(double gia) { this.gia = gia; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach + " | Ten sach: " + tenSach + " | Gia: " + gia + " | So luong: " + soLuong);
    }
}

public class BTT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SachT6> danhSachSach = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- QUAN LY THU VIEN - TUAN 6 ---");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim kiem sach theo ma");
            System.out.println("4. Xoa sach theo ma");
            System.out.println("5. Sua thông tin sach theo ma");
            System.out.println("6. Tinh tong so luong sach");
            System.out.println("7. Tinh tong gia tri sach trong thu vien");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon cau ban: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String maSach = scanner.nextLine();
                    System.out.print("Nhap ten sach: ");
                    String tenSach = scanner.nextLine();
                    System.out.print("Nhap gia sach: ");
                    double gia = scanner.nextDouble();
                    System.out.print("Nhap so luong sach: ");
                    int soLuong = scanner.nextInt();
                    scanner.nextLine();

                    danhSachSach.add(new SachT6(maSach, tenSach, gia, soLuong));
                    System.out.println("-> Them sach thanh cong!");
                    break;

                case 2:
                    System.out.println("\n--- DANH SACH SACH TRONG THU VIEN ---");
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Thu vien hien tai khong co sach nao!");
                        } else {
                        for (SachT6 s : danhSachSach) {
                            s.hienThiThongTin();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = scanner.nextLine();
                    boolean found = false;
                    for (SachT6 s : danhSachSach) {
                        if (s.getMaSach().equalsIgnoreCase(maTim)) {
                            s.hienThiThongTin();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("-> Khong tim thay sach voi ma: " + maTim);
                    }
                    break;

                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = scanner.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).getMaSach().equalsIgnoreCase(maXoa)) {
                            danhSachSach.remove(i);
                            removed = true;
                            System.out.println("-> Xoa sach thanh cong!");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("-> Khong tim thay sach voi ma: " + maXoa);
                    }
                    break;

                case 5:
                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = scanner.nextLine();
                    boolean edited = false;
                    for (SachT6 s : danhSachSach) {
                        if (s.getMaSach().equalsIgnoreCase(maSua)) {
                            System.out.print("Nhap ten sach moi: ");
                            s.setTenSach(scanner.nextLine());
                            System.out.print("Nhap gia moi: ");
                            s.setGia(scanner.nextDouble());
                            System.out.print("Nhap so luong moi: ");
                            s.setSoLuong(scanner.nextInt());
                            scanner.nextLine();

                            System.out.println("-> Cap nhat thong tin sach thanh cong!");
                            edited = true;
                            break;
                        }
                    }
                    if (!edited) {
                        System.out.println("-> Khong tim thay sach voi ma: " + maSua);
                    }
                    break;

                case 6:
                    int tongSoLuong = 0;
                    for (SachT6 s : danhSachSach) {
                        tongSoLuong += s.getSoLuong();
                        }
                    System.out.println("-> TTong so luong sach trong thu vien: " + tongSoLuong);
                    break;

                case 7:
                    double tongGiaTri = 0;
                    for (SachT6 s : danhSachSach) {
                        tongGiaTri += s.getGia() * s.getSoLuong();
                    }
                    System.out.println("-> Tong gia tri kho sach: " + tongGiaTri);
                    break;

                case 8:
                    System.out.println("-> Thoat chuong trinh");
                    break;

                default:
                    System.out.println("-> Lua chon khong hop le! Vui long chon lai.");
                    break;
            }
        } while (choice != 8);

        scanner.close();
    }
}