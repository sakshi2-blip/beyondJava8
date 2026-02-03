import java.util.Optional;
import java.util.stream.Stream;

public class Ques1 {
    public static void main(String[] args){
        Optional<String> opt = Optional.of("Hello");
        Stream<String> stream = opt.stream();
    }

}
