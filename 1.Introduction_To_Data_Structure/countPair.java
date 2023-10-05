
public class countPair {

    static int countP(){

        char ch[] = {'a','b','e','g','a','g','g','a'};

        int aCount = 0;
        int count = 0;
        for(int i=0;i<ch.length;i++){

            if(ch[i]=='a'){
                aCount++;
            }

            if(ch[i]=='g'){
                count+=aCount;
            }
           
        }

        return count;
    }

    public static void main(String[] args) {
        
        System.out.println(countP());
        
    }    
}
