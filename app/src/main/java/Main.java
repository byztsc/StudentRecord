public class Main {
    public static void main(String[] args) {
        DatabaseSetup.createTable();
        StudentRecord s1 = new StudentRecord(1, "Martin", "Computer
                Science");
                StudentRecord s2 = new StudentRecord(2, "Ana", "Cybersecurity");
        FileManager.saveToFile(s1);
        FileManager.saveToFile(s2);
        StudentDAO.insertStudent(s1);
        StudentDAO.insertStudent(s2);
        System.out.println("Students in database:");
        StudentDAO.viewStudents();
    }
}
