package juint_text;

public class Calculater {

public static String T(double a,double b,double c){
        double tem = Math.max(a, b);
                if(tem>c){
                    if(tem==a){
                           a = c;
                     }else {
                            b = c;
                           }
                   c = tem;
                }
               if(!(a+b>c&&Math.abs(a-b)<c)){
               return "无法构成三角形";
               }else if(a==b&&a==c&&b==c){
                return "等边三角形";
                }
               else if(a==b||a==c||b==c){
            	   return "等腰三角形";
               }
               else return "不等边三角形";
}
public void clear() {     // 将结果清零
    
}
public static void main(String[] args) {
System.out.println(Calculater.T(11, 5, 12));
}


}
