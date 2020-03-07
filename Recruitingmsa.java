public class Recruitingmsa {
public static void main(String[] args) {
    int[] dato = new int[] {
       1,2,3
    };
    Long num = 2020202020202020L % 124000L;
    int result = 0;
    if (num < 4) {
        result = dato[num.intValue()];
    } else {
        for (Long i = 3L; i < num; i++) {
            result = (dato[0] + dato[1] + dato[2]) % 10000;
            dato[0] = dato[1];
            dato[1] = dato[2];
            dato[2] = result;
        }
    }
    System.out.println(result);
}
}