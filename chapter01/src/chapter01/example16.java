package chapter01;

class example16{
    public static void main(String args[]){
   for (String str : args)
      System.out.println(str);
   System.out.println("main 매개변수 개수 : " + args.length +"개");
   }
}