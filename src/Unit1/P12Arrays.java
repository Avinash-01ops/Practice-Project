package Unit1;

public class P12Arrays {
    //Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
    public static void main(String[] args) {

        int[] mynum = {10, 20, 30, 40};
        System.out.println(mynum[0]);
        System.out.println(mynum[1]);
        System.out.println(mynum[2]);
        System.out.println(mynum[3]);

        System.out.println("Array mynum length is "+mynum.length); //check the length of array

        //change an element in array
        mynum[3]=100;
        System.out.println(mynum[3]);

        //For loop in array
        for (int i = 0; i <= mynum.length; i++) {
            System.out.println(i);
        }

        for(int i:mynum){
            System.out.println(i);
        }

        //create a program that calculates the average of different ages:
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        float sum=0, avg=0;
        System.out.println(ages.length);
        for (int age:ages){
            sum+=age;
            avg=sum/ages.length;
            System.out.println("Average age is: "+avg);
        }
        String[] bus={"bus1","bus2","bus3","bus4","bus5","bus6"};
        for (String j:bus){
            if(j=="bus3") {
                System.out.println("This is my bus =" +j);
            }
        }


    }
}
