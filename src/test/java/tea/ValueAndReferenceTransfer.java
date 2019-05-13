package tea;

/**
 * 值传递和引用传递类
 * 
 * @author zhongjiahui  
 * @date 2018年11月1日
 */
public class ValueAndReferenceTransfer {
	public static void main(String[] args) { 
		ValueAndReferenceTransfer t = new ValueAndReferenceTransfer(); 
        int a = 99; 
        t.test1(a);//这里传递的参数a就是按值传递 
        System.out.println("第一个：" + a);
         
        MyObj obj=new MyObj(); 
        t.test2(obj);//这里传递的参数obj就是引用传递
        System.out.println("第二个：" + obj.b);
    } 
     
    public void test1(int a){ 
        a = a++;
        System.out.println("第三个：" + a);
        } 
     
    public void test2(MyObj obj){ 
        obj.b=100;
        System.out.println("第四个：" + obj.b);
        }
}
