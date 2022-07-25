package java01;

public class _07scopeBlocks {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String company="Samsung";

        /*
        Now we use a new feature that is using a curly braces to declare a seperate scope
        Ex. In our case below we start by declaring new variables inside the scope of {} but these variables will not be accessible outside the {} scope
        Although the variables declared outside the {} scope inside the function will be accesible everywhere
        
        We can however reassign values of the variables with function scope i.e a,b,company inside the {} scope and these reassingments will hold
        even after we exit the {} scope

        We can call the {} as a scope block and they can be nested
         */
        {
            //int a=20; will throw an error as a was already assigned outside
            a=20;
            int c=30;
            company="Xiaomi";
            
            {
                int sum=a+b+c; //20+20+30=70
                System.out.println(sum);
            }

            //System.out.println(sum); will throw an error because we cannot access the sum declared inside {} scope
        }

        System.out.println(a+" "+company); //We can observe the value of a and company remains changed
        //Variables like c and sum are not accessible outside as they were declared/ within scope blocks

        int sum=100;
        System.out.println(sum); //We can however reinitialize the sum variable outside the block as our function scope has not yet encountered a sum variable

        for(int i=0;i<5;i++){
            //int a=10; Will throw error as a was already initialized so not possible inside {}
            int num=10;
            System.out.println((num+i));
        }
    }
    
}
