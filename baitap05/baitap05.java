package baitap05;

import java.util.Scanner;

public class baitap05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CategoryManagement categoryManagement = new CategoryManagement();
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1: Thêm danh mục");
            System.out.println("2: Hiển thị danh mục");
            System.out.println("3: Cập nhật danh mục");
            System.out.println("4: Xóa danh mục");
            System.out.println("5: Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine().trim());

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID danh mục: ");
                    int id = Integer.parseInt(scanner.nextLine().trim());
                    System.out.print("Nhập tên danh mục: ");
                    String name = scanner.nextLine().trim();
                    System.out.print("Nhập mô tả danh mục: ");
                    String description = scanner.nextLine().trim();
                    categoryManagement.addCategory(new Category(id, name, description));
                    System.out.println("Danh mục đã được thêm.");
                    break;
                case 2:
                    Category [] categories = categoryManagement.findAll();
                    System.out.println("Danh sách danh mục:");
                    for(Category category : categories) {
                        System.out.println(category);
                    }
                    break;
                case 3:
                    System.out.println("Nhập Id cần cập nhập");
                    int update = Integer.parseInt(scanner.nextLine().trim());
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine().trim();
                    System.out.print("Nhập mô tả mới: ");
                    String newDescription = scanner.nextLine().trim();
                    categoryManagement.updateCategory(new Category(update, newName, newDescription));
                    System.out.println("Danh mục đã được cập nhật.");
                    break;
                case 4:
                    System.out.print("Nhập ID danh mục cần xóa: ");
                    int delete = Integer.parseInt(scanner.nextLine().trim());
                    categoryManagement.deleteById(delete);

                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }

        } while (choice != 5);
    }
}
