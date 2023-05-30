import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SILab2Test {

    @Test
    public void testFunctionWithValidUser() {
        User user = new User("user", "123_pass#", "veda003@finki.ukim.mk");
        List<User> allUsers = new ArrayList<>();
        assertTrue(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunctionWithInvalidUser() {
        User user = new User(null, "weak", "veda003@finki.ukim.mk");
        List<User> allUsers = new ArrayList<>();
        assertFalse(SILab2.function(user, allUsers));
    }
}
