package cn.day16.Generic.itcast_03;

/**
 * Created by Searis on 2016/3/23.
 */
public class OjbectToolDemo {
    public static void main(String[] args) {
        ObjectTool<String> obj=new ObjectTool<String>();


        ObjectTool<?> obj2=new ObjectTool<String>();
        //ObjectTool<?> obj3=new ObjectTool<>();

        obj.setObj("Ë®ÐÇ");
        //obj.setObj(new Integer(10));  //±àÒë´íÎó
        String s=obj.getObj();
        System.out.println(s);

        ObjectTool<Integer> obj4=new ObjectTool<Integer>();
        obj4.setObj(11); //×Ô¶¯×°Ïä
        Integer i=obj4.getObj();
        System.out.println(i);

        ObjectTool objx=new ObjectTool();

        ObjectTool objectTool=new ObjectTool();

        obj.show(new String("·Ü¶·"));




    }
}
