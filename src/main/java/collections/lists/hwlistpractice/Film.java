package collections.lists.hwlistpractice;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Film {
    private final String name;
    private final String mainActor;
    private final int Time;

    public String getName() {
        return this.name;
    }

    public String getMainActor() {
        return this.mainActor;
    }

    public int getTime() {
        return this.Time;
    }

    public String toString() {
        return "Film{name=" + this.getName() + ", mainActor=" + this.getMainActor() + ", Time=" + this.getTime() + "}";
    }



}


