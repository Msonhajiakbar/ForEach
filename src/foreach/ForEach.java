package foreach;
public class ForEach {
    
    public static void hasil(double p,double l){//wajib
        
        double hasil;
        hasil = p*l;
        System.out.println(hasil);
        hasil = p/l;
        System.out.println(hasil);
        hasil = p+l;
        System.out.println(hasil);
        hasil = p-l;
        System.out.println(hasil);   
    }
    
    public static void main(String[] args) {
        hasil(10,11);
    }
    
}