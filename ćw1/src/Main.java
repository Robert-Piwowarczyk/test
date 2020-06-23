import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Integer a = null;

        if(a!= null){
            Integer result = a + 3;
            System.out.println(result);
        }
        //----------------------------------------------

        Optional.ofNullable(null);
        Optional.empty();
    }
    //------------------------------------------------

    Optional<Integer> integer1 = Optional.empty();
    Optional.of(1)
    .map(number -> number + 3)
    .ifPresent(System.out::println);

    Integer b = null;
    Optional.ofNullable(b)
    .map(number -> number + 3)
    .ifPresent(System.out::println);
}
