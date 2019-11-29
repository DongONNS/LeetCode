package String.Hard;

import java.util.Arrays;
import java.util.Scanner;

public class Num2Rmb {
    public static void main(String[] args) {
        Num2Rmb NR = new Num2Rmb();
        for (;;){
            Scanner in = new Scanner(System.in);
            System.out.println("请输入您需要转换的数字：");
            String  string = in.nextLine();
            //设置循环终止条件，如果输入为空就结束循环
            if (string == "") {
                System.out.println("输入结束！");
                break;
            }
            Double a = Double.parseDouble(string);
            System.out.println("人民币读法为：");
            System.out.println(NR.zhengDivade(NR.divideZheng(a))+NR.toStr1(NR.divideXiao(a)));
            System.out.println("-----------------------------------------------------------");
        }


    }

        private  String[] str1 =  {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        private  String[] str2 =  {"十","百","千"};
        private  String[] str3 =  {"角","分"};
        private  String[] str4 =  {"元","万","亿"};

        private  String divideZheng(double num)
        {
            long zheng = (long)num;
        //整型转换成字符串
            return zheng + "";
        }
        //把浮点数分解成小数部分字符串
        private String divideXiao(double num)
        {
            long zheng = (long)num;
        //得到浮点数的小数部分
            long xiao = Math.round((num-zheng)*100);
        //用方法把整型转换成字符串
            return String.valueOf(xiao);
        }

        //把小数部分的数字字符串转换成汉字字符串
        private  String toStr1(String xiao)
        {
            String re1 = "";
            int len = xiao.length();
            if(len==2)
            {
                for(int i = 0;i<2;i++)
                {
//                把字符串转换成数字
                    int num = xiao.charAt(i) - 48;
//                  数字不为零则需要加单位，为零则不操作
                    if(num!=0)
                    {
                        re1  += str1[num] + str3[i];
                    }
                }
            }
//        若长度为1，例：12.09小数部分为9
            if(len==1&&xiao.charAt(0)!='0')
            {
                int num = xiao.charAt(0) - 48;
//            此时只有分，加单位str3【1】
                re1 +=str1[num] + str3[1];
            }
            return re1;
        }

        //把一个四位的数字字符串变成汉字字符串
        private  String toStr(String zheng)
        {
            String re = "" ;
            int j = 0;
            int lenz = zheng.length();
        //特殊情况如输入0.89时，整数字符串为0的处理
            if(zheng.charAt(0)=='0'&&lenz==1)
            {
                re +="零";
                return re;
            }
        //遍历每一位数字
            for(int i =0;i<lenz;i++)
            {
                int num = zheng.charAt(i) - 48;
        //若不是最后一位数字且数字不为零，则需要添加单位
                if(i!=lenz-1&&num!=0)
                {
                    re += str1[num]+str2[lenz-2-i];
                }
        //对于连续0出现的特殊处理，如1009，第二个零不进行操作
                else if(!(num==0&&re.charAt(j-1)=='零'))
                {
                    re += str1[num];
                }
                j = re.length();
            }
        //对特殊情况最后一位是零的处理，如1990，删除掉末尾的零
            if(re.charAt(j-1)=='零')
            {
                re = re.substring(0, j-1);
            }
            return re;
        }


        //对于金额的整数部分在12位数以内的处理，以4位数为一组，
        //如1234（亿）,5678（万）,1234（元）.89，
        private String zhengDivade(String zheng)
        {
            int len = zheng.length();
            String Re = "";
            //这里的n代表的是组数
            int n = 0;
            //判断整数部分的长度，考虑需要分几个组
            if(len>=9)      n = 3;
            else if(len>=5) n = 2;
            else if(len>=1) n = 1;
        //若位数非4的倍数，则在前面补0，直到位数为4的倍数为止
        //如 12,2345补为0012,2345
            if(len%4!=0)
            {
                String zh = "";
                int s = len%4;
        //在前面补0
                for(int k=0;k<(4-s);k++)
                {
                    zh += "0";
                }
                zh += zheng;
                zheng = zh;
            }

        //进行n个组合的串联
        //进行n次循环
            for(int i=0;i<n;i++)
            {
                String Zheng = "";
                String sss ="";
        //长度在变化
                len = zheng.length();
        //提取出整数部分后四位，进行分开的转换
        //这个substring方法拿出来的是从len-4后面的所有数，就是拿到末四位数字;
                Zheng = zheng.substring(len-4);
        //除去已经提取的字符串以外的字符串，字符串更新
                zheng = zheng.substring(0, len-4);
                int m =0,me=0;
        //把字符串转换成整形数，如 0012换成12
                for(int j=3;j>=0;j--)
                {
                    m =(int) ((Zheng.charAt(j)-48)*Math.pow(10, 3-j));
                    me += m;
                }
        //把数字12装换成字符串12
                Zheng = String.valueOf(me);
        //把字符串12换成 壹拾贰
                sss = this.toStr(Zheng);
        //衔接上元等单位，再加上已经转换好的汉字字符串，此处注意每组字符串间的顺序
                sss += str4[i]+Re;
                Re = sss;
            }
            return Re;
        }
    }
