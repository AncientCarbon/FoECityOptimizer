package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader {
    List<String> variables = new ArrayList<>();
    List<Integer> values = new ArrayList<>();
    public Reader() {
    }

    private void extractData(String input, List<String> variables, List<Integer> values) {

        Pattern pattern = Pattern.compile("\"(x|y)\":(\\d+)");

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String variable = matcher.group(1);
            int value = Integer.parseInt(matcher.group(2));

            variables.add(variable);
            values.add(value);
        }
    }

    public ArrayList<Object> getData(String input) {

        extractData(input, variables, values);

        for (int i = 0; i < variables.size(); i++) {
            System.out.printf("%s=%d%n", variables.get(i), values.get(i));
        }
        return null;
    }
}
