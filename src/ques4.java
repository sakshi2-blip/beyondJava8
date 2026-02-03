public class ques4 {

    public static void main(String[] args) {

        // repeat()
        String repeatStr = "Hi ";
        System.out.println("repeat(): " + repeatStr.repeat(3));
        // Output: Hi Hi Hi


        //  trim()
        String trimStr = "   Hello Java   ";
        System.out.println("trim(): '" + trimStr.trim() + "'");
        // Output: 'Hello Java'


        // strip()
        String stripStr = "   Hello Java   ";
        System.out.println("strip(): '" + stripStr.strip() + "'");
        // Output: 'Hello Java'


        // isBlank()
        String blankStr1 = "";
        String blankStr2 = "   ";
        String blankStr3 = "Java";

        System.out.println("isBlank(\"\" ): " + blankStr1.isBlank());   // true
        System.out.println("isBlank(\"   \"): " + blankStr2.isBlank()); // true
        System.out.println("isBlank(\"Java\"): " + blankStr3.isBlank()); // false


        //  indent()
        String indentStr = "Java\nPython";
        System.out.println("indent():");
        System.out.println(indentStr.indent(4));



        // transform()
        String transformStr = "java";
        String transformed = transformStr.transform(s -> s.toUpperCase());
        System.out.println("transform(): " + transformed);
        // Output: JAVA


        // 7️⃣ stripIndent()
        String stripIndentStr = """
                    Java
                        Python
                    C++
                    """;
        System.out.println("stripIndent():");
        System.out.println(stripIndentStr.stripIndent());



        // 8️⃣ translateEscapes()
        String escapeStr = "Hello\\nWorld\\tJava";
        System.out.println("translateEscapes():");
        System.out.println(escapeStr.translateEscapes());

        // Triple Quotes (Text Blocks)
        String textBlock = """
                Welcome to Java
                This is a Text Block
                Very readable!
                """;
        System.out.println("Triple Quotes (Text Block):");
        System.out.println(textBlock);


        // formatted()
        String formattedStr = "My name is %s and I am %d years old"
                .formatted("Sakshi", 22);
        System.out.println("formatted(): " + formattedStr);

    }
}
