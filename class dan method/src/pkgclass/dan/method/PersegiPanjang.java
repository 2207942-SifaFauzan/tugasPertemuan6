package pkgclass.dan.method;

public class PersegiPanjang {
    public int panjang;
    public int lebar;
    
    public PersegiPanjang(){
        panjang = 0;
        lebar = 0;
    }
    
    public PersegiPanjang(int PanjangBaru, int LebarBaru){
        this.panjang = PanjangBaru;
        this.lebar = LebarBaru;
    }
    
    void setPanjang(int PanjangBaru){
        this.panjang = PanjangBaru;
    }
    
    void setLebar(int LebarBaru){
        this.lebar = LebarBaru;
    }
    
    public int getLuas(){
        return panjang*lebar;
    }
    
    public int getKeliling(){
        return 2*(panjang+lebar);
    }
}
