public class lengthAfterTransformations {
    public int lengthAfterTransformations(String s, int t) {
final int   MOD=1_000_000_007;
long length=s.length();
int[] freq=new int[26];

for(char c:s.toCharArray()){
    freq[c-'a']++;
}
for(int step=0;step<t;step++){
    int[] newFreq=new int[26];
    for(int i=0;i<26;i++){
        if(i==25){
            newFreq[0]=(int)((newFreq[0]+(long)freq[25])%MOD);
            newFreq[1]=(int)((newFreq[1]+(long)freq[25])%MOD);
            length=(length+freq[25])%MOD;
        }
        else{
            newFreq[i+1]=(int)((newFreq[i+1]+freq[i])%MOD);
        }
    }
    freq=newFreq;
}
return (int)(length%MOD);
    }
}
