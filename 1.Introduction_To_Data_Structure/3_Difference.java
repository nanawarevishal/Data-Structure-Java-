


class numDiff{

    static int noCount(int x,int y){

        int count = 0;
        for(int i=x;i<=y;i++){
            count++;
        }

        return count;
    }

    static int nCountOptimised(int x,int y){
        return y-x+1;
    }

    public static void main(String[] args) {
        
        System.out.println(nCountOptimised(5, 10));
    }
}
