package project01_sort;

import java.io.*;

/*
@autho ：向黎华
@time ：2023/4/25/4：03
@Description ：奥运会金牌排序：读取txt文件内容或写入txt文件再读取，添加到ArrayList数组排序再写入到另外一个txt文件，需要就是要直接读取
 */
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


