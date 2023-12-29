//calculating mode and modal frequency
//can handle a bimodal dataset
import java.util.*;
public class lab1{
    public static void main(String[] args){
        Performance p = new Performance();
        System.out.println(Arrays.toString(p.marks));
        p.display();
    }
}

class Performance{
    int[] marks = new int[10];

    Performance (){
        readMarks();
    }

    void readMarks(){
        for (int i = 0; i < 10; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks "+0+i);
            marks[i] = sc.nextInt();
        }

    }
    int getMode(){
        int count = 0;
        int greatest = 0;
        int mode = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j<10; j++){
                if(marks[i] == marks[j]){
                    count++;
                }
            }
            if(count == greatest){
                if(marks[i]>mode){
                    mode = marks[i];
                }
            }
            else if(count>greatest){
                greatest = count;
                mode = marks[i];
            }
            count = 0;
        }
//        System.out.println("Mode is: "+mode);
//        System.out.println("Modal frequency is "+greatest);
        return mode;

    }
    int highestMark(){
        int highest = 0;
        for (int i = 0; i < 10; i++){
            if (marks[i]>highest){
                highest = marks[i];
            }
        }
        return highest;
    }
    int lowestMark(){
        int lowest = 200;
        for (int i = 0; i < 10; i++){
            if (marks[i]<lowest){
                lowest = marks[i];
            }
        }
        return lowest;
    }
    int getFreqAtMode(int mode){
        int count = 0;
        for (int i = 0; i < 10; i++){
            if(marks[i]==mode){
                count++;
            }
        }
        return count;
    }

    void display(){
        System.out.println("The mode: "+getMode());
        System.out.println("The frequency at mode: "+getFreqAtMode(getMode()));
        System.out.println("The highest mark: "+highestMark());
        System.out.println("The lowest mark: "+lowestMark());
    }
}
