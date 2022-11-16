public class Polinom {
    int n;
    int [] a;
    Polinom(int n, int[]a){
        this.a=a;
        this.n=n;
    }

    public int getN() {
        return n;
    }

    public int[] getA() {
        return a;
    }

    int result(int x){
        int r=0;
        for(int i=1;i<a.length;i++){
                r+=Math.pow(x,i)*a[i];
        }
        return r+a[0];
    }
    Polinom sum(Polinom p){
        int maxn=Math.max(n,p.getN());
        int []ap=new int[maxn+1];
        for(int i=0;i<maxn+1;i++){
            ap[i] =0;
        }
        if(a.length>p.getA().length){
            ap=a;
            for(int i=0;i<p.getA().length;i++)
                ap[i]+=p.getA()[i];
        }
        if(a.length<p.getA().length){
            ap=p.getA();
            for(int i=0;i<a.length;i++)
                ap[i]+=a[i];
        }
        return new Polinom(maxn,ap);
    }
    Polinom dif(Polinom p){
        int maxn=Math.max(n,p.getN());
        int []ap=new int[maxn+1];
        if(n>p.getN()){
            ap=a;
            for(int i=0;i<p.getA().length;i++)
                ap[i]-=p.getA()[i];
        }
        if(n<p.getN()){
            for(int i=0;i<p.getA().length;i++)
                ap[i]=-p.getA()[i];
            for(int i=0;i<a.length;i++)
                ap[i]+=a[i];
        }
        return new Polinom(maxn,ap);
    }
    Polinom multi(Polinom p){
        int n1=n+p.getN();
        int []ap=new int[n1+1];
        for(int i=0;i<n1+1;i++){
            ap[i] =0;
        }
        for(int i=0;i<n+1;i++)
            for(int j=0;j<p.getN()+1;j++)
                    ap[i+j]+=a[i]*p.getA()[j];
        return new Polinom(n1,ap);
    }
    void print(){
        System.out.println("Your Polinom:");
        System.out.print(a[0]);
        for(int i=1;i<a.length;i++) {
            if(a[i]!=0) {
                System.out.print(" + ");
                System.out.print(a[i] + "x^" + i);
            }
        }
        System.out.println();
    }

}
