import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SchoolClasses {
    public static void main(String[] args) {
        Map<String, String> classroomStudents = new HashMap<>();

        classroomStudents.put("1-A", "Anna Kareninan");
        classroomStudents.put("3-B", "Blair Waldorf");
        classroomStudents.put("1-F", "Baran Yılmaz");
        classroomStudents.put("2-F", "Ceren Uçar");
        classroomStudents.put("2-D", "Oblomov Antuan an");
        classroomStudents.put("6-A", "Lisbeth Salender");

        ArrayList<String> keys = new ArrayList<>(classroomStudents.keySet());
        ArrayList<String> values = new ArrayList<>(classroomStudents.values());

        for (int i = 0; i < values.size(); i++) {
            String fullName = values.get(i);
            String[] nameParts = fullName.split(" ");
            String firstName = nameParts[0];
            String secondName = nameParts.length > 1 ? nameParts[1] : "";
            
            if (firstName.endsWith("an") || secondName.endsWith("an")) {
                String classCode = keys.get(i);
                System.out.println("Sınıf: " + classCode + ", Öğrenci: " + fullName);
            }
        }
    }
}
