package iostreams.serialization;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class Person {
    public final String name;
    public int age;
    public static int maxAge = 150;

}
