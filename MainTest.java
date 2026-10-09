package hocsinh;

public class MainTest {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Tao sinh vien
        Student s1 = new Student(
                "SV000001", "Nguyen An", 20, 3.5,
                "an@gmail.com");

        Student s2 = new Student(
                "SV000002", "Tran Binh", 21, 3.0,
                "binh@gmail.com");

        Student s3 = new Student(
                "SV000003", "Le An", 19, 3.8,
                "le.an@gmail.com");

        Student s4 = new Student(
                "SV000004", "Pham Minh", 22, 2.7,
                "minh@gmail.com");

        // Them sinh vien
        System.out.println("=== THEM SINH VIEN ===");
        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);
        manager.addStudent(s4);
        manager.displayAll();

        // Kiem tra trung ID
        System.out.println("\n=== KIEM TRA TRUNG ID ===");
        System.out.println(manager.addStudent(
                new Student("SV000001", "Ten Khac", 20,
                        3.2, "khac@gmail.com")));

        // Tim kiem theo ten
        System.out.println("\n=== TIM KIEM TEN AN ===");
        Student[] found = manager.searchByName("An");
        for (Student s : found) {
            System.out.println(s);
        }

        // Cap nhat sinh vien
        System.out.println("\n=== CAP NHAT SINH VIEN ===");
        Student updated = new Student(
                "SV000002", "Tran Binh", 22, 3.9,
                "binh.new@gmail.com");

        System.out.println(
                "Cap nhat: "
                + manager.updateStudent("SV000002", updated));
        manager.displayAll();

        // Xoa sinh vien
        System.out.println("\n=== XOA SINH VIEN SV000003 ===");
        System.out.println(
                "Xoa: " + manager.removeStudent("SV000003"));
        manager.displayAll();

        // Sap xep GPA tang dan
        System.out.println("\n=== SAP XEP GPA TANG DAN ===");
        manager.sortByGpa();
        manager.displayAll();
    }
}
