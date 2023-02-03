package number3;

public class Magazine {
    private String Mgazine_name;
    private String ISBN_number;
    private String Autor_name;
    private String Date;
    private String publisher;
    public Magazine(String Mgazine_name,String ISBN_number,String Autor_name, String Date,String publisher){
        this.Mgazine_name=Mgazine_name;
        this.ISBN_number=ISBN_number;
        this.Autor_name=Autor_name;
        this.Date=Date;
        this.publisher=publisher;
    }

    public void setMgazine_name(String Mgazine_name) {
       this.Mgazine_name = Mgazine_name;
    }

    public void setISBN_number(String ISBN_number) {
        this.ISBN_number = ISBN_number;
    }

    public void setAutor_name(String autor_name) {
       this.Autor_name = Autor_name;
    }

    public void setDate(String date) {
       this.Date = Date;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getMgazine_name() {
        return Mgazine_name;
    }

    public String getISBN_number() {
        return ISBN_number;
    }

    public String getAutor_name() {
        return Autor_name;
    }

    public String getDate() {
        return Date;
    }

    public String getPublisher() {
        return publisher;
    }
    String getMagazineInfo(){
        String MagazineInfo = "Mgazine_name:   "+ Mgazine_name + "\nISBN Number:  " + ISBN_number +
                "\nAuthor_name:   "+Autor_name+"\nDate:   "+ Date+"\npublisher:  "+publisher;
        return MagazineInfo;
    }

}
