package org.ind;
public class InnerForLoop {
public static void main(String[] args) {
System.out.println("START");
for (int i = 0; i <=4; i++) {
if (i==3) {
continue;
}
for (int j = 0; j <=4; j++) {
System.out.print(i);
}
System.out.println();
}
System.out.println("END");
System.out.println("********************************************************************");
}

public void StudentId() {
	System.out.println("Student ID: 22-23/0153 ");
}
}
