package work;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Deal {
    //创建ArrayList对象变量array用于存入文件的数据并完成后续的排序功能
    ArrayList<Data> array = new ArrayList<>();


    //File新构建一个file实例
    File file = new File("C:\\Users\\LENOVO\\Desktop\\java学习\\Java\\SE\\src\\work\\Salary.txt");
    File file_out = new File("C:\\Users\\LENOVO\\Desktop\\java学习\\Java\\SE\\src\\work\\Salary_out.txt");
    FileWriter in1 = new FileWriter(file_out);

    public Deal() throws IOException {

    }

    public void PutArray() {
        for (Data s : array) {
            System.out.println(s.getName() + " " + s.getNumber());
        }
    }

    public void SetData() throws IOException {
        Scanner e = new Scanner(System.in);
        FileWriter in = new FileWriter(file);

        System.out.print("请输入数据个数: ");

        int times = Integer.parseInt(e.nextLine());

        while (times != 0) {
            String s = e.nextLine();
            in.write(s);
            in.write('\n');
            times--;
        }
//        in.flush();
        in.close();//关闭文件用于保存数据
    }

    public void ReadTxt() throws IOException {
        //读取文件一行内容
        BufferedReader txt = new BufferedReader(new FileReader(file));
        String x;
        while ((x = txt.readLine()) != null) {
            String name, num;
            int id = x.indexOf(" ");
            name = x.substring(0, id);
            num = x.substring(id + 1);
            int number = Integer.parseInt(num);
//            System.out.println(number);
            array.add(new Data(name, number));
            System.out.println(x);
        }
        Collections.sort(array);

//        处理array数组的数据，将其放入新文件中
        for (Data str : array) {
            String s = str.getName() + " " + str.getNumber();
            in1.write(s);
            in1.write('\n');
        }
        in1.close();
    }
}
