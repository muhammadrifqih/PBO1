public class Pengguna {
    private int id;
    private String username;
    private String password;

    public Pengguna() {
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

    public void login() {
        System.out.println("Ini Method untuk Login");
    }

    public void lupaPassword() {
        System.out.println("ini method Lupa password");
    }

    public void daftar() {
        System.out.println("Ini Method Daftar user baru");
    }

    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void hapus() {
        System.out.println("DELETE FROM pengguna");
    }

    public void hapus(int id) {
        System.out.println("DELETE FROM pengguna WHARE id=" + id);
    }

    public void hapus(String username) {
        System.out.println("DELETE FROM pengguna WHARE username=" + username);
    }

    public void login(String tokenGoogle) {
        System.out.println("Ini Login menggunakan Google");
    }
    
}
