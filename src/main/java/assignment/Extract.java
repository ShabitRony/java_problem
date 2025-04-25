package assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract {
        public static void main(String[] args) {
            String html = "<!DOCTYPE html>" +
                    "<html lang=\"ne\">" +
                    "<head>" +
                    "    <meta charset=\"UTF-8\">" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
                    "    <title>Transactions</title>" +
                    "</head>" +
                    "<body>" +
                    "    <div>" +
                    "        <div class=\"button\">" +
                    "            <p>Transaction Id: TXN1234</p>" +
                    "        </div>" +
                    "    </div>" +
                    "</body>" +
                    "</html>";
            Pattern pattern = Pattern.compile("Transaction Id: \\w+");
            Matcher matcher = pattern.matcher(html);

            if (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
