package com.xu_lie_hua.util;

import java.io.*;

/**
 *
 * @ClassName: FileHelper
 * @Description: 文件序列化工具测试类
 * @author A18ccms a18ccms_gmail_com
 * @date 2018年6月7日 下午1:49:42
 *
 */
public class serializeFileHelper {

        /**
         * 文件路径
         */
        private String fileName;
        /**
         * 对象信息写入状态
         */
        private boolean flag = true;

        public serializeFileHelper() {

        }

        public serializeFileHelper(String fileName) {//文件路径构造器
            this.fileName = fileName;
        }
        /**
         *
         * @Title: saveFile
         * @Description: 将对象信息写入指定文件中
         * @param @param p    设定文件
         * @return void    返回类型
         * @throws
         */
        public boolean saveFile(Object p) {
            try {
                //创建输入流对象
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
                //将对象写入
                oos.writeObject(p);
                //关闭流
                oos.close();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                flag = false;
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                flag = false;
            }
            return flag;
        }
        /**
         *
         * @Title: readFile
         * @Description: 从指定文件中读取文件
         * @param @return    设定文件
         * @return Person    返回类型
         * @throws
         */
        public <T> T readFile( Class<T> clazz) {
            try {
                //创建输出流对象
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
                //读取流信息
                T p = (T)ois.readObject();
                //返回对象
                //关闭流
                ois.close();
                return p;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return null;
        }

    }