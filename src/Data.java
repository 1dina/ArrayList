public class Data extends Print{
    int id;
    String name;
    @Override
    void print(String name){
        this.name=name;
        System.out.println("name : "+name +"\n id:"+id+"\n ===============================================");
    }
    public Data(String name,final int id){
        this.name=name;
        this.id=id;
        print(name);

    }

    @Override
    public String toString() {
        return ("name : "+name+"\n id :"+id);
    }
}
