package Questions.oopsQuestions;

class bankAcount {
    public static void main(String[] args) {
        server[] users=new server[5];
        // server a=new server();
        // a.print();
        for (int i = 0; i < users.length; i++) {
            users[i]=new server();
        }
        for (int i = 0; i < users.length; i++) {
            users[i].depositAmount(1000);
        } 
        // users[0].withdraw(2000);
        users[1].name="rohan";
        users[1].getDetails();
    }
}

class server{
    String name;
    int accountNo;
    char accntType;
    private float balance;
    static int usersNum;

    // String test;

    // server(String news){
    //     test=news;
    // }

    // public void print(){
    //     System.out.println(test);
    // }
    
    public server(){    //Default initialization
        this.name="defaultUser";
        this.accountNo=0;
        this.accntType='D';
        this.balance=0.0f;
        server.usersNum+=1;
    } 
    
    public server(String name,int accountNo,char accntType,float balance){
        this.name=name;
        this.accountNo=accountNo;
        this.accntType=accntType;
        this.balance=balance;
        server.usersNum+=1;
    }

    public void depositAmount(int amount){
        this.balance+=amount;
        getDetails();
    }

    public void getDetails(){
        System.out.println("The balance for user "+this.name+" is: "+this.balance);
    }

    public void withdraw(int amount){
        if(this.balance<amount){
            System.out.println("Your current account balance " + this.balance+" is insufficient");
        }
        else{
            this.balance-=amount;
            getDetails();
        }
    }
}

