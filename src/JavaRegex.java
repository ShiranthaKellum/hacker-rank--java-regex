import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class JavaRegex {
    private static final String ipRegex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> ipList = bufferedReader.lines()
                .takeWhile(input -> !input.isEmpty())
                .collect(Collectors.toList());

        ipList.stream()
                .map(ip -> Pattern.matches(ipRegex, ip)? "true": "false")
                .forEach(System.out::println);
    }
}
