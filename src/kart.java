public class kart {
    private String[][] array;

    public String[][] bos = {{"-", "-", "-", "-"}, {"-", "-", "-", "-"}, {"-", "-", "-", "-"}, {"-", "-", "-", "-"}};

    public int q=0;     //eşitlik sağlayacağım


    public kart(String[][] array) {
        this.array = array;
    }

    public void karsila(int k, int l, int m, int u){
        //1 çıkartmalıyız çünkü 1 girilince 0.index kontrol edilmeli
        if (this.array[k-1][l-1].equals(this.array[m-1][u-1])){
            q++;
            System.out.println("Doğru eşleşme\n\n");
            bos[k-1][l-1]=array[k-1][l-1];
            bos[m-1][u-1]=array[m-1][u-1];
            for (int i=0;i<4;i++){
                for (int j=0;j<4;j++){
                    System.out.print(this.bos[i][j]+" ");
                }
                System.out.println();
            }
        }else {
            System.out.println("Yanlış eşleşme\n\n");
            for (int i=0;i<4;i++){
                for (int j=0;j<4;j++){
                    System.out.print(this.bos[i][j]);
                }
                System.out.println();
            }
        }
    }

    public int don(){
        if (q==8){
            return 1;
        }else return 0;
    }

    public String[][] getArray() {
        return array;
    }

    public void setArray(String[][] array) {
        this.array = array;
    }

    public String[][] getBos() {
        return bos;
    }

    public void setBos(String[][] bos) {
        this.bos = bos;
    }
}
