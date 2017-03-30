/**
 * Created by July on 28.03.2017.
 */
public class Substance {
    public int ID = 0;
    public int preID = 0;
    public int generation = 0;
    public String info = "something";
    Substance (int id, int preid, int Generation, String Info){
        ID = id;
        preID = preid;
        generation = Generation;
        info = Info;
    }
    public String getInfo(){
        return info;
    }
}
