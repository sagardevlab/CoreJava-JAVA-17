package StringInternals;

public class jsonString {
    public static void main(String[] args){


        //this is the way to store multi line text block, java 15 feature
        String json = """
                {
                    "name" : "Sagar",
                    "age" : 23
                }
                """;

        //this internally becomes similar like - String json = "{\n \"name\": \"Sagar\"\n}";
        /* 
        - it preserves new lines and indentations

        - after initial """ opening quotes, we must end that line and start writing inputs from next line

        - UserFul for - JSON, SQL queries, HTML, XML, multiline messages
        */
        System.out.println(json);
    }
}
