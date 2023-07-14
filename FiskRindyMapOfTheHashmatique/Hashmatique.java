import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Stairway To Heaven", "There's a lady who's sure all that glitters is gold And she's buying a stairway to Heaven..");
        map.put("Wake Me Up When September Ends", "Summer has come and passed The innocent can never last Wake me up when September ends");
        map.put("Blue on Black", "Night falls and I'm alone Skin, yeah, chilled me to the bone You turned and you ran, oh yeah Oh oh, slipped right from my hand");
        map.put("The Cuppycake Song", "I've always had a sweet tooth Ever since I was two I like all kinds of goodies But none was sweet as you");
        map.put("I Don't Want to Set the World on Fire", "I don't want to set the world on fire I just want to start A flame in your heart");
        System.out.println(map.get("Stairway To Heaven"));
        for(String key : map.keySet()) {
            System.out.println(String.format("Track: %s - Lyrics:%s", key, map.get(key)));
        }
    }
}