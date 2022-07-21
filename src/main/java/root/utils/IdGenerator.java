package root.utils;

public class IdGenerator {
    private static int id;

    public static Integer getId() {
        return id++;
    }
}
