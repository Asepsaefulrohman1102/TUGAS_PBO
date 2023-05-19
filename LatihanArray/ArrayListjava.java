import java.util.ArrayList;

public class ArrayListjava {

    public static void main(String args[]){
        ArrayList<String> data = new ArrayList<String>();

        //memasukkan data kedalam array
        for(int i=0; i<5; i++){
            data.add("Data " + (i+1));

        }

        //menampilkan data
        for(int i=0; i<5; i++){
            System.out.println(data.get(i));
        }

    }
}