package work;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        //创建Data实例
        Deal test = new Deal();
        //假如测试文件Salary没有数据则需要设置数据：SetData()方法
        //否则直接运行ReadTxt方法。
        test.SetData();
        test.ReadTxt();
    }
}


