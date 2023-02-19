public class LongestPalindromicSubsequence {
    private int findLPSLength(String s,int startIndex,int endIndex){
        if(startIndex>endIndex){
            return 0;
        }
        if(startIndex==endIndex){
            return 1;
        }
        int p1=0;
        if(s.charAt(startIndex)==s.charAt(endIndex)){
            p1=2+findLPSLength(s, startIndex+1, endIndex-1);
        }
        int p2=findLPSLength(s, startIndex+1, endIndex);
        int p3=findLPSLength(s, startIndex, endIndex-1);
        return Math.max(p1,Math.max(p2,p3));
    }
    public int findLPSLength(String s){
        return findLPSLength(s, 0, s.length()-1);
    }
}
