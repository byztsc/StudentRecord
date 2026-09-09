import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class StudentDAO {
    // INSERT
    public static void insertStudent(StudentRecord student) {
        String sql = "INSERT INTO students(id, name, major) VALUES(?, ?,
                ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, student.getId());
            pstmt.setString(2, student.getName());
            pstmt.setString(3, student.getMajor());
            pstmt.executeUpdate();
            System.out.println("Record inserted into database.");
        } catch (Exception e) {
            System.out.println("Error inserting record: " +
                    e.getMessage());
        }
    }
    // SELECT
    public static void viewStudents() {
        String sql = "SELECT * FROM students";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("major")
                );
            }
        } catch (Exception e) {
            System.out.println("Error retrieving records: " +
                    e.getMessage());
        }
    }
}
