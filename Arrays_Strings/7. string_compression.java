// Compression of a string inplace
// int a = 1;
// char a1 = (char)(a+’0’)   returns ‘1’

class Solution 
{
    public int compress(char[] chars) 
    {
        int index = 0, count=1, i=0;
        Stack st = new Stack();
        if(chars.length == 1)
            return 1;
        for(i=1;i<chars.length;i++) 
        {
            if(chars[i] == chars[i-1])
                count++;
            else
            {
                chars[index++] = chars[i-1];
                if(count < 10 && count > 1)
                    chars[index++] = (char)(count + '0');
                else if(count > 9)
                {
                    while(count > 0)
                    {
                        int val = count % 10;
                        count = count / 10;
                        st.push((char)(val + '0'));     //can even use a character array to store and reverse instead of stack
                    }
                    while(st.isEmpty() != true)
                    {
                        chars[index++] = (char)st.pop();
                    }
                }
                count=1;
            }
        }
        chars[index++] = chars[i-1];
        if(count < 10 && count > 1)
            chars[index++] = (char)(count + '0');
        else if(count > 9)
        {
            while(count > 0)
            {
                int val = count % 10;
                count = count / 10;
                st.push((char)(val + '0'));                                              
            }
            while(st.isEmpty() != true)
            {
                chars[index++] = (char)st.pop();
            }
        }
        count=1;
    
        return index;
    }
}
