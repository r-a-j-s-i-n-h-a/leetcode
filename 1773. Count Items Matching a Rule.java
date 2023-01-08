class Solution 
{
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
    {
        int count = 0 ;
        String type = "type" ;
        String color = "color" ;
        String name = "name" ;

        if(ruleKey.equals(type))
        {
            for(int i = 0 ; i < items.size() ; i++)
            {
                List<String> list = items.get(i) ;
                String val = list.get(0); 
                if(  ruleValue.equals(val)  )
                    count++ ;
                continue ;
            }   
        }
        else if(ruleKey.equals(color))
        {
            for(int i = 0 ; i < items.size() ; i++)
            {
                List<String> list = items.get(i) ;
                String val = list.get(1); 
                if(  ruleValue.equals(val) )
                    count++ ;
                continue ;
            }   
        }
        else if(ruleKey.equals(name))
        {
            for(int i = 0 ; i < items.size() ; i++)
            {
                List<String> list = items.get(i) ;
                String val = list.get(2); 
                if( ruleValue.equals(val) )
                    count++ ;
                continue ;
            }   
        }
        return count ;
    }
}
