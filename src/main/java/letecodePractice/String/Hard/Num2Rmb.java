package letecodePractice.String.Hard;

import java.util.Scanner;

public class Num2Rmb {
    public static void main(String[] args) {
        Num2Rmb NR = new Num2Rmb();
        for (;;){
            Scanner in = new Scanner(System.in);
            System.out.println("����������Ҫת�������֣�");
            String  string = in.nextLine();
            //����ѭ����ֹ�������������Ϊ�վͽ���ѭ��
            if (string == "") {
                System.out.println("���������");
                break;
            }
            Double a = Double.parseDouble(string);
            System.out.println("����Ҷ���Ϊ��");
            System.out.println(NR.zhengDivade(NR.divideZheng(a))+NR.toStr1(NR.divideXiao(a)));
            System.out.println("-----------------------------------------------------------");
        }


    }

        private  String[] str1 =  {"��","Ҽ","��","��","��","��","½","��","��","��"};
        private  String[] str2 =  {"ʮ","��","ǧ"};
        private  String[] str3 =  {"��","��"};
        private  String[] str4 =  {"Ԫ","��","��"};

        private  String divideZheng(double num)
        {
            long zheng = (long)num;
        //����ת�����ַ���
            return zheng + "";
        }
        //�Ѹ������ֽ��С�������ַ���
        private String divideXiao(double num)
        {
            long zheng = (long)num;
        //�õ���������С������
            long xiao = Math.round((num-zheng)*100);
        //�÷���������ת�����ַ���
            return String.valueOf(xiao);
        }

        //��С�����ֵ������ַ���ת���ɺ����ַ���
        private  String toStr1(String xiao)
        {
            String re1 = "";
            int len = xiao.length();
            if(len==2)
            {
                for(int i = 0;i<2;i++)
                {
//                ���ַ���ת��������
                    int num = xiao.charAt(i) - 48;
//                  ���ֲ�Ϊ������Ҫ�ӵ�λ��Ϊ���򲻲���
                    if(num!=0)
                    {
                        re1  += str1[num] + str3[i];
                    }
                }
            }
//        ������Ϊ1������12.09С������Ϊ9
            if(len==1&&xiao.charAt(0)!='0')
            {
                int num = xiao.charAt(0) - 48;
//            ��ʱֻ�з֣��ӵ�λstr3��1��
                re1 +=str1[num] + str3[1];
            }
            return re1;
        }

        //��һ����λ�������ַ�����ɺ����ַ���
        private  String toStr(String zheng)
        {
            String re = "" ;
            int j = 0;
            int lenz = zheng.length();
        //�������������0.89ʱ�������ַ���Ϊ0�Ĵ���
            if(zheng.charAt(0)=='0'&&lenz==1)
            {
                re +="��";
                return re;
            }
        //����ÿһλ����
            for(int i =0;i<lenz;i++)
            {
                int num = zheng.charAt(i) - 48;
        //���������һλ���������ֲ�Ϊ�㣬����Ҫ��ӵ�λ
                if(i!=lenz-1&&num!=0)
                {
                    re += str1[num]+str2[lenz-2-i];
                }
        //��������0���ֵ����⴦����1009���ڶ����㲻���в���
                else if(!(num==0&&re.charAt(j-1)=='��'))
                {
                    re += str1[num];
                }
                j = re.length();
            }
        //������������һλ����Ĵ�����1990��ɾ����ĩβ����
            if(re.charAt(j-1)=='��')
            {
                re = re.substring(0, j-1);
            }
            return re;
        }


        //���ڽ�������������12λ�����ڵĴ�����4λ��Ϊһ�飬
        //��1234���ڣ�,5678����,1234��Ԫ��.89��
        private String zhengDivade(String zheng)
        {
            int len = zheng.length();
            String Re = "";
            //�����n�����������
            int n = 0;
            //�ж��������ֵĳ��ȣ�������Ҫ�ּ�����
            if(len>=9)      n = 3;
            else if(len>=5) n = 2;
            else if(len>=1) n = 1;
        //��λ����4�ı���������ǰ�油0��ֱ��λ��Ϊ4�ı���Ϊֹ
        //�� 12,2345��Ϊ0012,2345
            if(len%4!=0)
            {
                String zh = "";
                int s = len%4;
        //��ǰ�油0
                for(int k=0;k<(4-s);k++)
                {
                    zh += "0";
                }
                zh += zheng;
                zheng = zh;
            }

        //����n����ϵĴ���
        //����n��ѭ��
            for(int i=0;i<n;i++)
            {
                String Zheng = "";
                String sss ="";
        //�����ڱ仯
                len = zheng.length();
        //��ȡ���������ֺ���λ�����зֿ���ת��
        //���substring�����ó������Ǵ�len-4������������������õ�ĩ��λ����;
                Zheng = zheng.substring(len-4);
        //��ȥ�Ѿ���ȡ���ַ���������ַ������ַ�������
                zheng = zheng.substring(0, len-4);
                int m =0,me=0;
        //���ַ���ת�������������� 0012����12
                for(int j=3;j>=0;j--)
                {
                    m =(int) ((Zheng.charAt(j)-48)*Math.pow(10, 3-j));
                    me += m;
                }
        //������12װ�����ַ���12
                Zheng = String.valueOf(me);
        //���ַ���12���� Ҽʰ��
                sss = this.toStr(Zheng);
        //�ν���Ԫ�ȵ�λ���ټ����Ѿ�ת���õĺ����ַ������˴�ע��ÿ���ַ������˳��
                sss += str4[i]+Re;
                Re = sss;
            }
            return Re;
        }
    }
