class book{
    String author;
    String bookName;
}

class books{
    public static void main(String[] args){
        book [] b = new book[3];
        b[0] = new book();
        b[1] = new book();
        b[2] = new book();
        int x = 0;
        b[0].author = "vivek";
        b[1].author = "vand";
        b[2].author = "vince";
        b[0].bookName = "I";
        b[1].bookName = "am";
        b[2].bookName = "vivek";

        while(x<3){ 
            System.out.print(b[x].bookName);
            System.out.print(" by ");
            System.out.println(b[x].author);
            x=x+1;
        }
    }
}