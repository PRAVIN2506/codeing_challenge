package Day_43;

class Solution {
    public static void main(String[] args) {
        Solution s=new Solution();
        String allowed="ab";
        String[] words={"ad","bd","aaab","baa","badab"};
        System.out.println(s.countConsistentStrings(allowed,words));
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int arr[]=new int[26];
        for(char i:allowed.toCharArray()){
            arr[i-'a']=1;
        }
        int count=0;
        for(String k:words){
            count+=findConsistentString(arr,k);
        }
        return count;
    }
    public static int findConsistentString(int arr[],String k){
        int flag=1;
        for(int i=0;i<k.length();i++){
            if(arr[k.charAt(i)-'a']==0){
                flag=0;
                break;
            }
        }
        return flag;
    }
}
