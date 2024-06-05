
package pkgclass.dan.method;

public class main {

    public static void main(String[] args) {
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        PersegiPanjang persegiPanjang2 = new PersegiPanjang();
        PersegiPanjang persegiPanjang3 = new PersegiPanjang();
        persegiPanjang1.setPanjang(1); persegiPanjang1.setLebar(1);
        persegiPanjang2.setPanjang(30); persegiPanjang2.setLebar(40);
        persegiPanjang3.setPanjang(25); persegiPanjang3.setLebar(35);
        
        System.out.println("Persegi Panjang 1 memiliki Luas "+persegiPanjang1.getLuas()
                + " dan keliling "+ persegiPanjang1.getKeliling());
        System.out.println("Persegi Panjang 2 memiliki Luas "+persegiPanjang2.getLuas()
                +" dan keliling "+ persegiPanjang2.getKeliling());
        System.out.println("Persegi Panjang 3 memiliki Luas "+persegiPanjang3.getLuas()
                +" dan keliling "+ persegiPanjang3.getKeliling());
        
    }
    
}
