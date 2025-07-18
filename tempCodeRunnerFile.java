class WordFreq{
    String senteces;
    int frequency;
    public WordFreq( string s,int f){
       sentences=s;
       frequency=f;
}
}
class AutocompleteSystem{
    HashMap<String,Integer>[] array;
    String currentString="";
    public Autocompletesystem(String[] sentences, int[] times){
        array=new HashMap[26];
        for(int index=0; index<26;index++){
            array[index]=new HashMap<String , Integer>();
        }
        for(int index=0;index<sentences.length;index++){
            array[sentences[index].charAt(0)-'a'].put(sentences[index],times[index]);
        }
    }
    public List<String>input(char c){
        List<string>result=new ArrayList();
        if(c =='#'){
            array[currentString.charAt(0)-'a'].put(currentString,
                array[currentString.charAt(0)-'a'].getOrDefault(currentString ,0)+1);
                currentString="";
        }else{
            currentString+=c;
            List<WordFreq>list=new ArrayList();
            for(String key:array[currentStrin.charAt(0)-'a'].keySet()){
                if(key.inndexof(currentString)==0){
                    list.add(new WordFreq(key,array[currentString.charAt(0)-'a'].get(key)));
                }
            }
            Collection.sort(list,(a,b)->a,frequency==b.frequency ?
            a.sentences.compareTo(b.sentences):b.frequency-a.frequency);
            for(int index=0;index<Math.min(3,lis.size());index++){
                result.add(list.get(indexd).sentences);

            }
        }





        }
        return result;

    }
}