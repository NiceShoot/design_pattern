package com.lian_biao_fanzhuan;

import java.util.LinkedList;

/**
 * @author jiabing
 * @Package com.lian_biao_fanzhuan
 * @Description: 单链表翻转
 * @date 2018/10/27 13:47
 */
public class RevertLinkList {


    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println(linkedList);
        revertLinkList(linkedList);
    }

    /**
     * linkList 翻转
     * @param linkedList
     */
    static void revertLinkList(LinkedList linkedList){
        LinkedList<Object> newLinkedList = new LinkedList<>();
        for(Object object :linkedList){
            newLinkedList.add(0,object);
        }
        System.out.println(newLinkedList);
    }



}