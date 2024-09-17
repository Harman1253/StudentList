/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**MONDAY
 *
 * @author harma
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // need to define three students herer
        Student[] list = new Student[2];
        Student s1=new Student();
        s1.setName("Harman");
        s1.setSid(1);
        
           Student s2=new Student();
        s2.setName("karman");
        s2.setSid(102);
        
           Student s3=new Student();
        s3.setName("Harman");
        s3.setSid(1005);
        
        list[0]=s1;
        list[1]=s2;
        //list[2]=s3;
        
        for(int i=0;i<list.length;i++){
            System.out.println(list[i].getName()+"\n "+ list[i].getSid());
        }
        
       
        
        
        
        
    }
    
}
