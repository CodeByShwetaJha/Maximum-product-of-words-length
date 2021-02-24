# Maximum product word length

class Solution {
    public int maxProduct(String[] words) {
        
        int res=0;
        for(int i=0;i<words.length;i++)
        {
            int f=0,f1=0;
            int inv=words[i].length();
            for(int j=i+1;j<words.length;j++)
            {
                f=0;
                f1=0;
                int fv=words[j].length();
                for(int k=0;k<words[j].length();k++)
                {
                    f1++;
                    String c=""+words[j].charAt(k);
                    String st1=words[i];
                    if(st1.contains(c))
                    {
                        f++;
                        break;
                    }
                    
                        
                }
                if(f==0&&f1!=0)
                    res=Math.max(res,inv*fv);
            }
        }
        
        return res;
        }
     }
