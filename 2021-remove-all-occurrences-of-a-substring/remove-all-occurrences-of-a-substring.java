class Solution {
    public String removeOccurrences(String s, String part) {
    //    StringBuilder sb=new StringBuilder();
    //    for(int i=0;i<s.length();i++){
    //     char ch=s.charAt(i);
    //     sb.append(ch);
    //    if( sb.toString().endsWith(part)){
    //     sb.delete(sb.length() - part.length(), sb.length());
    //    }
    //    }
    //    return sb.toString();




// -------------------------------------------------------
    //   while (s.contains(part)) {
    //          s = s.replaceFirst(part, "");
    //     }

    //     return s;

    // ------------------------------------------------------
     while (s.contains(part)) {
            int index = s.indexOf(part);
            s = s.substring(0, index) 
              + s.substring(index + part.length());
        }
            return s;
    }
    }
