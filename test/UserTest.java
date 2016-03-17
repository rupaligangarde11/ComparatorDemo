import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserTest {
    @org.junit.Test
    public void shouldSortUsers() throws Exception {

        User user1 = new User("mr.z","password1234");
        User user2 = new User("mr.y", "password12");
        User user3 = new User("mr.x", "password12");

        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        Collections.sort(users);


        assertThat(users.get(0),is(user3));
        assertThat(users.get(1),is(user2));
        assertThat(users.get(2),is(user1));
    }


    @Test
    public void shouldCompareStringValuesByIgnoringTheCase() throws Exception {

        String string1 = "tcase";
        String string2 = "Zcase";

        List<String> values = new ArrayList<String>();

        values.add(string1);
        values.add(string2);

        Collections.sort(values, new Comparator<String>() {
            @Override
            public int compare(String string1, String string2) {
                return string1.compareToIgnoreCase(string2);
            }
        });

        assertThat(values.get(0),is("tcase"));
        assertThat(values.get(1),is("Zcase"));
    }
}
