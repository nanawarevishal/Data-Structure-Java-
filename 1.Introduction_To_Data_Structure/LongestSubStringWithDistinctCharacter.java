


public class LongestSubStringWithDistinctCharacter {

    static String longStringDist(String str){

        String finalstr = "";
        int maxLength = Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){

            for(int j=i+1;j<str.length();j++){

                String sub = str.substring(i, j+1);

                String substr = getFrequency(sub);

                int count = 0;

                for(int k=1;k<substr.length();k+=2){

                    if(count>2){
                        break;
                    }

                    if(substr.charAt(k)>48 && substr.charAt(k)<=57){
                        count++;
                    }
                }

                // System.out.println(count);

                if(count==2 && maxLength<sub.length()){
                    finalstr = sub;
                    maxLength = sub.length();
                }
            }
        }


        return finalstr;
    }

    static String getFrequency(String str){

        int freq[] = new int[26];
    
        for(char ch: str.toCharArray()){
            freq[ch-'a']++;
        }

        char c = 'a';
        String s = "";
        for(int i : freq){
            s +=c;
            s+=i;
            c++;
        }

        // System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        String str = "abbadca";

        System.out.println(longStringDist(str));

    }
}
