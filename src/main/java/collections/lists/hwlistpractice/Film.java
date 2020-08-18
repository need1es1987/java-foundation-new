package collections.lists.hwlistpractice;


import lombok.AllArgsConstructor;

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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Film)) return false;
        final Film other = (Film) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$mainActor = this.getMainActor();
        final Object other$mainActor = other.getMainActor();
        if (this$mainActor == null ? other$mainActor != null : !this$mainActor.equals(other$mainActor)) return false;
        if (this.getTime() != other.getTime()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Film;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $mainActor = this.getMainActor();
        result = result * PRIME + ($mainActor == null ? 43 : $mainActor.hashCode());
        result = result * PRIME + this.getTime();
        return result;
    }

    public String toString() {
        return "Film{name=" + this.getName() + ", mainActor=" + this.getMainActor() + ", Time=" + this.getTime() + "}";
    }
}


