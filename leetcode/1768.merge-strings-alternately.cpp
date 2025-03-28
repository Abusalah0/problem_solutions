class Solution {
    public:
        string mergeAlternately(string word1, string word2) {
            string out = "";
            int  i=0, j =0;
            while (i < word1.size() && j < word2.size())
            {
                out += word1[i];
                out += word2[j];
                j++,i++;
            }
            if(word1.size() > word2.size())
            {
                 for (; i < word1.size(); ++i) 
                out += word1[i];
            }
            else
            {
                for (; j < word2.size(); ++j) 
                out += word2[j];
            }
    
            return  out;
        }
    };