class Anony
{
    public static void main(String[] args) {
        Anony s=new Anony(); // new Anony().sum(new int[]{1,2,3})
        s.sum(new int[]{1,2,3});// use of anonymous array as parameter 
    }
    void sum(int[] x)
    {
        int total=0;
        for(int i=0;i<x.length;i++)
        {
            total +=x[i];
        }
        System.out.println(total);
    }
}
// both the functions should be of same type i.e. static or non static otherwise we'll have to create object in 
// inside the static function
