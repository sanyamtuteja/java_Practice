package NanshuPractice;

public class Result
{
	String min;
	String max;
	
	public Result(String mi,String ma)
	{
		min=mi;
		max=ma;

	}


public Result findMinMax(String str)
{
	if(str==null||str.length()<=1)
	{
	return null;
	}
	
	String min=findMin(str);
	String max=findMax(str);
	if(min==null && max==null)
	{
		return null;
	}
	if(min!=null && max==null)
	{
		return new Result(min,min);
	}
	if(min==null && max!=null)
	{
		return new Result(max,max);
	}
	return new Result(min,max);
}

private String findMin(String str)
{
	String min = null;
	
	int i=0;
	int j=1;
	while(j<str.length())
	{
		if(!isVowel(str.charAt(i)) ||(min!=null && (str.charAt(i)-'a')>(min.charAt(0)-'a')))
		{
			i++;
			j++;
		}else
		{
			if(!isVowel(str.charAt(j)))
			{
				String sub=str.substring(i,j+1);
				min=min==null|| sub.compareTo(min)<0?sub:min;
				i=j++;
			}else{
				if((str.charAt(j)-'a')<= (str.charAt(i)-'a'))
				{
					i=j++;
				}else{
					j++;
				}
			}
		}
	}
	return min;
}

private String findMax(String str)
{
	String max = null;
	int i=0;
	int j=1;
	while(j<str.length())
	{
		if(!isVowel(str.charAt(i)) ||((max!=null)&&(str.charAt(i)-'a'<max.charAt(0)-'a')))
		{
			i++;
			j++;
		}else{
		
			if(!isVowel(str.charAt(j)))//If consonant, keep extending.
			{
				j++;
			}else{
				if((str.charAt(j)-'a')>=(str.charAt(i)-'a'))//If vowel is higher then vowel at i, start a new string.
				{
					i=j++;
				}else{
						if(!isVowel(str.charAt(j-1)))//If previous is a consonant, update max.
						{
							String sub=str.substring(i,j);
							max=max==null||sub.compareTo(max)>0?sub:max;
							i=j++;
						}else
						{
							j++;
						}
				}
			}
		}
	}
	return max;
	
}


private boolean isVowel(char c)
{
	return(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
}}