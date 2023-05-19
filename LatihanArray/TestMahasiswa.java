import java.util.ArrayList;

public class TestMahasiswa {
    public static void main(String[] args)
    {
        //deklarasi list dari objek
        ArrayList<MahasiswaIndividu> listMhs = new ArrayList<MahasiswaIndividu>();

        //instance setiap member list dengan menambahkan kedalam
        for(int i = 0; i < 3; i++)
        listMhs.add(new MahasiswaIndividu());

        //akses setter getter method dari setiap member
        for(int i = 0; i < listMhs.size(); i++) //size() untuk menghitung jumlah data
        listMhs.get(i).setNim("A11.2021." + (i + 1));

        for(int i = 0; i < listMhs.size(); i++)
        System.out.println(listMhs.get(i).getNim());

        System.out.println("Jumlah data : "+ listMhs.size() + " data");

    }
}