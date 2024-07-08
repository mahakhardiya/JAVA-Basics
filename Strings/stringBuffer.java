public class stringBuffer {
        public static void main(String[] args) {
            StringBuffer sb = new StringBuffer();
            
            sb.append("Hello, ");
            sb.append("world!");
            
            // Convert the StringBuffer to a String
            String result = sb.toString();
            
            // Print the result
            System.out.println(result); // Output: Hello, world!
        }
    }
    
