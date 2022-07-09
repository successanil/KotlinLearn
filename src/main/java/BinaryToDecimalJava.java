public class BinaryToDecimalJava {
    public static int binary_to_decimal(String strI) {
        char []str = strI.toCharArray();
        double decimalNo = 0;
        int j=0;
        double sum = 0;
        for(int i=str.length - 1;i>=0;i--){
            decimalNo = java.lang.Math.pow(2,j);
            sum += (decimalNo * Double.parseDouble(""+str[i]));
            j++;
        }

        return (int)sum;
    }

    public static void main(String []args) {
        System.out.println(binary_to_decimal("110011"));
    }

}
