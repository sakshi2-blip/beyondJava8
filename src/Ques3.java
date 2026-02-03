import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques3 {
    public static void main(String[] args){
        List<String> list = Stream.of("A" , "B" , "c")
                .collect(Collectors.toUnmodifiableList());
    }
}
