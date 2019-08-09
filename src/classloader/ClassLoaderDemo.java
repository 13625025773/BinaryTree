package classloader;

/**
 * 描述:
 * 创建人:ChiChi
 * 创建日期:2019/8/9 0009
 */
public class ClassLoaderDemo {
    public static void main(String[] args) throws Exception{
        Class<?>  cls=Class.forName("tree.BinaryTree");
        System.out.println(cls.getClassLoader());
        System.out.println(cls.getClassLoader().getParent());
        System.out.println(cls.getClassLoader().getParent().getParent());
    }
}
