class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        HashMap<String,List<String>> map=new HashMap<String,List<String>>();
		
		for(int i=0;i<str.length;i++)
		{
		    char [] ar=str[i].toCharArray();
		    Arrays.sort(ar);
		    String val=new String(ar);
		    if(!map.containsKey(val))
		    {
		        map.put(val,new ArrayList<>());
		    }
		    map.get(val).add(str[i]);
		    
		}
		return new ArrayList<>(map.values());
    }
}
