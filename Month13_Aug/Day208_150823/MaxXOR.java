package Month13_Aug.Day208_150823;


class Trie{
    Trie child[];

    Trie(){
        child = new Trie[2];
    }
}
public class MaxXOR {

    public static  void main(String s[]){
        int arr[] = {5, 17, 100, 11};
        Trie t = new Trie();

        for(int i : arr){
            insert( t, i);
        }

        int max = Integer.MIN_VALUE;
        for(int i : arr){
            max = Math.max(max, compute(t, i));
        }

        System.out.println(max);

    }
    public static void insert(Trie node, int n){
        Trie cur = node;

        for(int i = 31; i >= 0; i--){
            int bit = (n >> i) & 1;

            if(cur.child[bit] == null){
                Trie t = new Trie();

                cur.child[bit] = t;
            }
            cur = cur.child[bit];
        }
    }

    public static int compute(Trie node, int n){
        Trie cur = node;
        int ans = 0;

        for(int i = 31; i >= 0; i--){
            int bit = (n >> i) & 1;

           if(bit == 1){
               if(cur.child[0] != null){
                   ans += (1 << i);
               }else{
                   cur =cur.child[bit];
               }
           }else{
               if(cur.child[1] != null){
                   ans += (1 << i);
               }else{
                   cur =cur.child[bit];
               }
           }
        }

        return ans;
    }
}
