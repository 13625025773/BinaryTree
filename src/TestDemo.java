import tree.BinaryTree;

import java.util.Arrays;

/**
 * 描述:
 * 创建人:ChiChi
 * 创建日期:2019/8/9 0009
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.add("B");
        binaryTree.add("E");
        binaryTree.add("A");
        binaryTree.add("D");
        binaryTree.add("X");
        binaryTree.add("P");
        binaryTree.add("M");
        binaryTree.add("K");
        binaryTree.add("L");
        binaryTree.add("O");
        System.out.println(Arrays.toString(binaryTree.toArray()));

    }
}
