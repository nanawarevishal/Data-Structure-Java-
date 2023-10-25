package CarryForward;

class GoodPairCount{

    static  int GoodPairCountBruteForce(char ch[],char ch1,char ch2){

        int count = 0;
        for(int i=0;i<ch.length;i++){

            for(int j=i+1;j<ch.length;j++){

                if(ch[i]==ch1 && ch[j]==ch2){
                    count++;
                }
            }
        }

        return count;
    }

    static int goodPairCount(char ch[],char ch1,char ch2){

        int count = 0;
        int cnt = 0;
        for(int i=0;i<ch.length;i++){

            if(ch[i]==ch1){
                cnt++;
            }

            else if (ch[i]==ch2){
                count+=cnt;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        char ch[] = {'a','b','e','g','a','g','g','a'};
        char ch1 = 'a';
        char ch2= 'g';

        System.out.println(GoodPairCountBruteForce(ch, ch1, ch2));
        System.out.println(goodPairCount(ch, ch1, ch2));
    }
}


/*
 * Time Complexity:
 *                 Brute Force :     O(N*N)
 *                 Optimal     :     O(N)
 *              
 */