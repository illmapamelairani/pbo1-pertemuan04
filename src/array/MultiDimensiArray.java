package array;

public class MultiDimensiArray {
    public static void main(String[] args) {
        double[][] nilaimahasiswa = new double[5][30];
        int bobot[] = {1,2,3,4};
        System.out.println(bobot.length);

        nilaimahasiswa[0][0] = 80;
        nilaimahasiswa[1][0] = 90;
        nilaimahasiswa[2][0] = 75;
        nilaimahasiswa[3][0] = 70;

        nilaimahasiswa[4][0] = nilaimahasiswa[0][0] * bobot [0] +
                nilaimahasiswa[1][0] * bobot [1]+
                nilaimahasiswa[2][0] * bobot [2]+
                nilaimahasiswa[3][0] * bobot [3];

        System.out.println("Nilai si Mahasiswa 1 : "+nilaimahasiswa[4][0]);

        nilaimahasiswa[0][1] = 80;
        nilaimahasiswa[1][1] = 90;
        nilaimahasiswa[2][1] = 75;
        nilaimahasiswa[3][1] = 70;

        nilaimahasiswa[4][1] = 0;
        for (int i=0; i<=3; i++){
            nilaimahasiswa[4][1] += nilaimahasiswa[i][1] * bobot[i];
        }

        System.out.println("Nilai si Mahasiswa 2 : "+nilaimahasiswa[4][1]);

        double jumlahNilaiAkhir = 0;
        for (int i=0; i<=3; i++){
            jumlahNilaiAkhir += nilaimahasiswa[4][i];
        }

        System.out.println(jumlahNilaiAkhir);
    }
}
