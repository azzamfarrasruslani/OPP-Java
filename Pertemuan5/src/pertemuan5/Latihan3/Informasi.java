package pertemuan5.Latihan3;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Informasi {

    private String jurusan, akre;

    public Informasi() {
        jurusan = "";
        akre = "";
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setAkre(String akre) {
        this.akre = akre;
    }

    public void infoJurusan() {

        String[][] info = {
            {"Jurusan Teknologi Industri", "Teknik Elektronika (TET)", "A", "Radio Frequency Engineering, Optical Fiber Communication Engineering, Computer Network", "S.Tr.T."},
            {"Jurusan Teknologi Industri", "Teknik Listrik (TL)", "B", "Teknologi Rekayasa Instalasi, Sistem Proteksi dan Pentanahan, Otomasi Tenaga Listrik", "S.Tr.T."},
            {"Jurusan Teknologi Industri", "Teknologi Rekayasa Mekatronika (TRM)", "A", "Mechatronics Engineering, Automation Engineering, Design Engineering", "S.Tr.T."},
            {"Jurusan Teknologi Industri", "Teknik Mesin (MS)", "B", "Gambar Tenik, CAD 2D dan 3D, Perancangan dan Pengembangan Produk", "S.Tr.T."},
            {"Jurusan Teknologi Informasi", "Teknik Informatika (TI)", "A", "Software Engineering, Data Engineering & Smart System", "S.Tr.Kom."},
            {"Jurusan Teknologi Informasi", "Sistem Informasi (SI)", "A", "Sistem Informasi Terintegrasi, Sistem Manajemen Data", "S.Tr.Kom."},
            {"Jurusan Teknologi Informasi", "Teknologi Rekayasa Komputer (TRK)", "A", "Cyber Security, Computer Network , IoT", "S.Tr.Kom."},
            {"Jurusan Administrasi Bisnis", "Akuntasi Perpajakan (AKtP)", "A", "Akuntansi Keuangan, Perpajakan , IoT", "S.Tr.Ak."}

        };

        System.out.printf("%100s\n", "Informasi Jurusan");
        System.out.println("================================================================================"
                + "==========================================================="
                + "===================================================");
        System.out.printf("|%-30s|%-40s|%-10s|%-90s|%-10s|\n", "Jurusan", "Nama Prodi", "Akreditasi", "Kompentesi Jurusan", "Gelar");
        System.out.println("================================================================================"
                + "==========================================================="
                + "===================================================");
        for (int i = 0; i < info.length; i++) {
            if (jurusan.equalsIgnoreCase("jtin")) {
                if (info[i][0].equalsIgnoreCase("Jurusan Teknologi Industri")) {
                    System.out.printf("%-30s|%-40s|%-10s|%-90s|%-10s|\n", info[i][0], info[i][1], info[i][2], info[i][3], info[i][4]);
                }
            } else if (jurusan.equalsIgnoreCase("jti")) {
                if (info[i][0].equalsIgnoreCase("Jurusan Teknologi Informasi")) {
                    System.out.printf("%-30s|%-40s|%-10s|%-90s|%-10s|\n", info[i][0], info[i][1], info[i][2], info[i][3], info[i][4]);
                }
            } else if (jurusan.equalsIgnoreCase("jab")) {
                if (info[i][0].equalsIgnoreCase("Jurusan Administrasi Bisnis")) {
                    System.out.printf("%-30s|%-40s|%-10s|%-90s|%-10s|\n", info[i][0], info[i][1], info[i][2], info[i][3], info[i][4]);
                }
            }

            if (akre.equalsIgnoreCase("A")) {
                if (info[i][2].equalsIgnoreCase("A")) {
                    System.out.printf("%-30s|%-40s|%-10s|%-90s|%-10s|\n", info[i][0], info[i][1], info[i][2], info[i][3], info[i][4]);
                }
            } else if (akre.equalsIgnoreCase("B")) {
                if (info[i][2].equalsIgnoreCase("B")) {
                    System.out.printf("%-30s|%-40s|%-10s|%-90s|%-10s|\n", info[i][0], info[i][1], info[i][2], info[i][3], info[i][4]);
                }
            }
        }

    }

}
