
public class Sortingpart2 
{
		public static String[] merge(String [] 	arr1, String[] D2)
		{
				String[] result = new String[arr1.length + D2.length];
				int dex1 = 0;
				int dex2 = 0;
				int dexresult = 0;
				while(dexresult < result.length)
				{
					if (dex1 == arr1.length)
						{
							result[dexresult] = D2[dex2];
							dex2++;
						}
					
					else if(dex2 == D2.length)
						{
							result[dexresult] = arr1[dex1];
							dex1++;
						}
					
					else if (arr1[dex1].compareTo(D2[dex2]) < 0)
						{
							result[dexresult] = arr1[dex1];
							dex1++;
						}
					
					else  if(arr1[dex1].compareTo(D2[dex2]) > 0)
						{
							result[dexresult] = D2[dex2];
							dex2++;
						}
					dexresult++;
				}
				return result;
		  }
	}

public static String