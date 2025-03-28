class Solution {
    public String reverseWords(String s) {
       String[] words = s.split(" ");
        String output = "";
        for (int i = words.length - 1; i >= 0; i-=1)
        {
            if (!words[i].isEmpty())  {
                output = output.concat(words[i]);
                output += " ";
            }
        }
//        for (String n : words) {
//            System.out.println("length of " + n + " " + n.length() );
//        }
        return output.trim();
    }
}