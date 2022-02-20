package com.company;

class if_else {
        public static void main(String[] args) {
//        If statement
                if (2>1) {
                        System.out.println("2 is greater than 1");
                }

                int x=2;
                int y=1;
                if (x>y){
                        System.out.println("x is greater than y");
                }
//        Else statement
                int time = 2;
                if (time<1){
                        System.out.println("Good Morning");
                }else {
                        System.out.println("Good evening");
                }
//        Else if statement
                int time1 = 22;
                if (time1<10){
                        System.out.println("Good Morning");
                }else if (time1<2){
                        System.out.println("Good day");
                }else {
                        System.out.println("Good Evening");
                }
//        short-hand if...else
                int time3 = 2;
                String result = (time3<1) ? "Good day." : "Good evening.";
                System.out.println(result);
        }
}