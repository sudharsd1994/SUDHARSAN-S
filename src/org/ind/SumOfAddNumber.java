package org.ind;

public class SumOfAddNumber {
public static void main(String[] args) {
int a = 0;
for (int i = 1; i<=100; i++) {
if (i%2 == 1) {
a = a+i;
}
}
System.out.println(a);
}
}