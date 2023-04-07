package org.状态模式_积分下载;

public class Client {
    public static void main(String[] args) {
        FromAccount account=new FromAccount("czh");
        account.writeNote(100);
        System.out.println("```````````````````````````````````````````````````````````");
        account.downloadFile(20);
        System.out.println("```````````````````````````````````````````````````````````");
        account.replayNote(100);
        System.out.println("```````````````````````````````````````````````````````````");
        account.downloadFile(100);
        System.out.println("```````````````````````````````````````````````````````````");
        account.writeNote(1000);
        System.out.println("```````````````````````````````````````````````````````````");

    }
}
