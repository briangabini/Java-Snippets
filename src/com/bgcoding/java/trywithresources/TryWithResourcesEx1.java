package com.bgcoding.java.trywithresources;

import java.io.FileInputStream;

public class TryWithResourcesEx1 {

    public static void main(String[] args) throws Exception {
        try {
            workOnResource();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static void workOnResource() throws Exception {
        try(
            AutoCloseableResource resource1 = new AutoCloseableResource("One", true);
            AutoCloseableResource resource2 = new AutoCloseableResource("Two", true);    // when closing resources, it will close in reverse order, i.e. resource2 will be closed first
        ) {
            // use resources
            resource1.doOp(true);
            resource2.doOp(true);
        } catch(Exception e) {
            e.printStackTrace();
            Throwable[] suppressed = e.getSuppressed();
            System.out.println(suppressed);
            throw e;
        } finally {
            System.out.println("finally");
            throw new Exception("Exception from finally");
        }
    }

    /*public static void main(String[] args) throws Exception {

        *//*try(FileInputStream fileInputStream = new FileInputStream("data/data.txt")) {
            int data = fileInputStream.read();
            while(data != -1) {
                data = fileInputStream.read();
            }
        }*//*

        *//*try(
            AutoCloseableExample resource1 = new AutoCloseableExample();
            AutoCloseableExample resource2 = new AutoCloseableExample();    // when closing resources, it will close in reverse order, i.e. resource2 will be closed first
        ) {
            // use resources
        }*//*

        *//*try(
            AutoCloseableResource resource1 = new AutoCloseableResource("One", true);
            AutoCloseableResource resource2 = new AutoCloseableResource("Two", false);    // when closing resources, it will close in reverse order, i.e. resource2 will be closed first
        ) {
            // use resources
            resource1.doOp(true);
            resource2.doOp(false);
        } catch(Exception e) {
            e.printStackTrace();
            Throwable[] suppressed = e.getSuppressed();
            System.out.println(suppressed);
        }*//*
    }*/
}
