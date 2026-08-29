class Solution {
    public int compress(char[] chars) {
        int index = 0, count;
        for(int i=0; i<chars.length; i++){
            char ch = chars[i];
            count = 0;
            while(i < chars.length && chars[i] == ch){
                count++;
                i++;
            }
            if(count == 1){
                chars[index++] = ch;
            }else{
                chars[index++] = ch;
                String str = Integer.toString(count);
                for(char digit : str.toCharArray()){
                    chars[index++] = digit;
                }
            }
            i--;
        }
        return index;
    }
}