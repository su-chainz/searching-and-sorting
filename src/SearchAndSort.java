import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays; 

public class SearchAndSort {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		while (1 == 1) {	
			System.out.println("What algorithm would you like to execute?");
			String type = in.nextLine();
			while ((type.equalsIgnoreCase("bubble")) == false && (type.equalsIgnoreCase("selection")) == false && (type.equalsIgnoreCase("insertion")) == false && (type.equalsIgnoreCase("merge") == false && (type.equalsIgnoreCase("linear")) == false && (type.equalsIgnoreCase("binary")) == false && (type.equalsIgnoreCase("quit")) == false)) {
				System.out.println("Invalid Input");
				System.out.println("What algorithm would you like to execute?");
				type = in.nextLine();
			}
			if (type.equalsIgnoreCase("quit")) {
				in.close();
				break;
			}
			System.out.println("What type of data?");
			String dataType = in.nextLine();
			while ((dataType.equalsIgnoreCase("strings")) == false && (dataType.equalsIgnoreCase("integers")) == false) {
				System.out.println("Invalid Input");
				System.out.println("What type of data?");
				dataType = in.nextLine();
			}
			System.out.println("How is it sorted?");
			String sortType = in.nextLine();
			while ((sortType.equalsIgnoreCase("array")) == false && (sortType.equalsIgnoreCase("list")) == false) {
				System.out.println("Invalid Input");
				System.out.println("How is it sorted?");
				sortType = in.nextLine();
			}
			System.out.println("Enter the data in a comma delimited form. ex. a,b,c,d,e)");
			String arrayContents = in.nextLine();
			while (arrayContents.equals("") == true) {
				System.out.println("Invalid Input");
				System.out.println("Enter the data in a comma delimited form. ex. a,b,c,d,e)");
				arrayContents = in.nextLine();
			}
			if (dataType.equalsIgnoreCase("integers")) {
				String[] parts = arrayContents.split(",");
				int[] intArray = new int[parts.length];
				for (int i = 0; i < parts.length; i++) {
				    intArray[i] = Integer.parseInt(parts[i]);
				}
				ArrayList<Integer> intList =  new ArrayList<Integer>();
				for (int num : intArray) {
					intList.add(num);
				}
				
				if (sortType.equalsIgnoreCase("array")) {
					if (type.equalsIgnoreCase("bubble")) {
						bubble(intArray);
						System.out.println(Arrays.toString(intArray));
					} else if (type.equalsIgnoreCase("selection")) {
						selection(intArray);
						System.out.println(Arrays.toString(intArray));
					} else if (type.equalsIgnoreCase("insertion")) {
						insertion(intArray);
						System.out.println(Arrays.toString(intArray));
					} else if (type.equalsIgnoreCase("merge")) {
						merge(intArray);
						System.out.println(Arrays.toString(intArray));
					} else if (type.equalsIgnoreCase("linear")) {
						System.out.println("What integer are you searching for?");
						int x = in.nextInt();
						in.nextLine();
						System.out.println(linear(intArray, x));
					} else if (type.equalsIgnoreCase("binary")) {
						System.out.println("What integer are you searching for?");
						int x = in.nextInt();
						in.nextLine();
						System.out.println(binary(intArray, x));
					}
				} else if (sortType.equalsIgnoreCase("list")) {
					if (type.equalsIgnoreCase("bubble")) {
						intList = bubbleInt(intArray);
						System.out.println(intList);
					} else if (type.equalsIgnoreCase("selection")) {
						intList = selectionInt(intArray);
						System.out.println(intList);
					} else if (type.equalsIgnoreCase("insertion")) {
						intList = insertionInt(intArray);
						System.out.println(intList);
					} else if (type.equalsIgnoreCase("merge")) {
						intList = mergeInt(intArray);
						System.out.println(intList);
					} else if (type.equalsIgnoreCase("linear")) {
						System.out.println("What integer are you searching for?");
						int x = in.nextInt();
						in.nextLine();
						System.out.println(linearInt(intArray, x));
					} else if (type.equalsIgnoreCase("binary")) {
						System.out.println("What integer are you searching for?");
						int x = in.nextInt();
						in.nextLine();
						System.out.println(binaryInt(intArray, x));
					}
				}		
			} else if (dataType.equalsIgnoreCase("strings")) {
				String[] parts = arrayContents.split(",");
				String[] stringArray = new String[parts.length];
				for (int i = 0; i < parts.length; i++) {
				    stringArray[i] = parts[i];
				}
				
				ArrayList<String> stringList =  new ArrayList<String>();
				for (String num : stringArray) {
					stringList.add(String.valueOf(num));
				}
				
				if (sortType.equalsIgnoreCase("array")) {
					if (type.equalsIgnoreCase("bubble")) {
						bubble(stringArray);
						System.out.println(Arrays.toString(stringArray));
					} else if (type.equalsIgnoreCase("selection")) {
						selection(stringArray);
						System.out.println(Arrays.toString(stringArray));
					} else if (type.equalsIgnoreCase("insertion")) {
						insertion(stringArray);
						System.out.println(Arrays.toString(stringArray));
					} else if (type.equalsIgnoreCase("merge")) {
						merge(stringArray);
						System.out.println(Arrays.toString(stringArray));
					} else if (type.equalsIgnoreCase("linear")) {
						System.out.println("What string are you searching for?");
						String x = in.nextLine();
						System.out.println(linear(stringArray, x));
					} else if (type.equalsIgnoreCase("binary")) {
						System.out.println("What string are you searching for?");
						String x = in.nextLine();
						System.out.println(binary(stringArray, x));
					}
				} else if (sortType.equalsIgnoreCase("list")) {
					if (type.equalsIgnoreCase("bubble")) {
						stringList = bubbleString(stringArray);
						System.out.println(stringList);
					} else if (type.equalsIgnoreCase("selection")) {
						stringList = selectionString(stringArray);
						System.out.println(stringList);
					} else if (type.equalsIgnoreCase("insertion")) {
						stringList = insertionString(stringArray);
						System.out.println(stringList);
					} else if (type.equalsIgnoreCase("merge")) {
						stringList = mergeString(stringArray);
						System.out.println(stringList);
					} else if (type.equalsIgnoreCase("linear")) {
						System.out.println("What string are you searching for?");
						String x = in.nextLine();
						System.out.println(linearString(stringArray, x));
					} else if (type.equalsIgnoreCase("binary")) {
						System.out.println("What string are you searching for?");
						String x = in.nextLine();
						System.out.println(binaryString(stringArray, x));
					}
				}
			}
		}

	}
	
	
	
	/* BUBBLE SORTS */
	
	
	
	public static int[] bubble(int[] intArray) {
		int n = intArray.length;
        for (int i = 0; i < n-1; i++)
        	for (int j = 0; j < n-i-1; j++)
                if (intArray[j] > intArray[j+1])
                {
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
        return intArray;
	}
	
	public static String[] bubble(String[] stringArray) {
		String tempStr;
		for (int t = 0; t < stringArray.length - 1; t++) {
            for (int i= 0; i < stringArray.length - t -1; i++) {
                if(stringArray[i+1].compareTo(stringArray[i])<0) {
                    tempStr = stringArray[i];
                    stringArray[i] = stringArray[i + 1];
                    stringArray[i + 1] = tempStr;
                }
            }
        }
		return stringArray;
	}
	
	public static ArrayList<Integer> bubbleInt(int[] intArray) {
        bubble(intArray);
        ArrayList<Integer> intList = arrayToListInt(intArray);
        return intList;
	}
	
	public static ArrayList<String> bubbleString(String[] stringArray) {
        bubble(stringArray);
        ArrayList<String> stringList = arrayToListString(stringArray);
        return stringList;
	}
	
	
	
	/* SELECTION SORTS */
	
	
	
	public static int[] selection(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < intArray.length; j++)
                if (intArray[j] < intArray[index]) 
                    index = j;
      
            int smallerNumber = intArray[index];  
            intArray[index] = intArray[i];
            intArray[i] = smallerNumber;
        }
        return intArray;
	}
	
	public static String[] selection(String[] stringArray) {
		for ( int j=0; j < stringArray.length-1; j++ )
	    {
	      int min = j;
	      for ( int k=j+1; k < stringArray.length; k++ )
	        if ( stringArray[k].compareTo( stringArray[min] ) < 0 ) min = k;  

	      String temp = stringArray[j];
	      stringArray[j] = stringArray[min];
	      stringArray[min] = temp;
	    }
		return stringArray;
	}
	
	public static ArrayList<Integer> selectionInt(int[] intArray) {
		selection(intArray);
        ArrayList<Integer> intList = arrayToListInt(intArray);
        return intList;
	}
	
	public static ArrayList<String> selectionString(String[] stringArray) {
		selection(stringArray);
        ArrayList<String> stringList = arrayToListString(stringArray);
        return stringList;
	}
	
	
	
	/* INSERTION SORTS */
	
	
	
	public static int[] insertion(int[] intArray) {
		int n = intArray.length; 
        for (int i=1; i<n; ++i) 
        { 
            int key = intArray[i]; 
            int j = i-1; 
  
            while (j>=0 && intArray[j] > key) 
            { 
            	intArray[j+1] = intArray[j]; 
                j = j-1; 
            } 
            intArray[j+1] = key; 
        }
		return intArray;
	}
	
	public static String[] insertion(String[] stringArray) {
		String temp;
		for(int i = 1; i < stringArray.length; i++)
        {
             temp = stringArray[i];
             int j = 0;
             for(j = i; j > 0; j--)
                  if(temp.compareTo(stringArray[j - 1]) < 0)
                	  stringArray[j] = stringArray[j - 1];
                  else
                      break;
             stringArray[j] = temp;
        }
		return stringArray;
	}
	
	public static ArrayList<Integer> insertionInt(int[] intArray) {
		insertion(intArray);
        ArrayList<Integer> intList = arrayToListInt(intArray);
        return intList;
	}
	
	public static ArrayList<String> insertionString(String[] stringArray) {
		insertion(stringArray);
        ArrayList<String> stringList = arrayToListString(stringArray);
        return stringList;
	}
	
	
	
	/* MERGE SORTS */
	
	
	
	/* Integer Merge */
	
	private static int[] array;
    private static int[] tempMergArr;
    private static int length;
	
	public static int[] merge(int[] intArray) {
        array = intArray;
        length = intArray.length;
        tempMergArr = new int[length];
        doMergeSort(0, length - 1);
        return intArray;
    }
 
    private static void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private static void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
	
    
    
	/* String Merge */
    
    public static void merge(String[] stringArray) {
        if (stringArray.length >= 2) {
            String[] left = new String[stringArray.length / 2];
            String[] right = new String[stringArray.length-stringArray.length / 2];

            for (int i = 0; i < left.length; i++)
            {
                left[i] = stringArray[i];
            }
            for (int i = 0; i < right.length; i++)
            {
                right[i] = stringArray[i + stringArray.length / 2];
            }

            merge(left);
            merge(right);

            merge(stringArray, left, right);
        }
    }

    public static void merge(String[] result, String[] left, String[] right) {
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length &&
                                 left[i1].compareToIgnoreCase(right[i1])<0)) {
                      result[i] = left[i1];
                      i1++;
                 } else {
                      result[i] = right[i2];
                      i2++;
                 }
            }
    }
	
	public static ArrayList<Integer> mergeInt(int[] intArray) {
		merge(intArray);
        ArrayList<Integer> intList = arrayToListInt(intArray);
        return intList;
	}
	
	public static ArrayList<String> mergeString(String[] stringArray) {
		merge(stringArray);
        ArrayList<String> stringList = arrayToListString(stringArray);
        return stringList;
	}
	
	
	
	/* LINEAR SEARCHES */
	
	
	
	public static int linear(int[] intArray, int x) {
		int n = intArray.length; 
	    for(int i = 0; i < n; i++) 
	    { 
	        if(intArray[i] == x) 
	            return i; 
	    } 
	    return -1; 
	}
	
	public static int linear(String[] stringArray, String x) {
		int n = stringArray.length;
		for(int i = 0; i < n; i++) {
			if(stringArray[i].equals(x))
				return i;
		}
		return -1;
	}
	
	public static int linearInt(int[] intArray, int x) {
		return linear(intArray, x);
	}
	
	public static int linearString(String[] stringArray, String x) {
		return linear(stringArray, x);
	}
	
	
	
	/* BINARY SEARCHES */
	
	
	
	public static int binary(int[] intArray, int x) {
		return binarySearch(intArray, 0, intArray.length, x);
	}
	
	public static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            if (arr[mid] == x) 
                return mid; 
  
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        return -1; 
    } 
    
	static int binary(String[] stringArray, String x) 
    { 
        int l = 0, r = stringArray.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            int res = x.compareTo(stringArray[m]); 
  
            if (res == 0) 
                return m; 
   
            if (res > 0) 
                l = m + 1; 
  
            else
                r = m - 1; 
        } 
        return -1; 
    }
	
	public static int binaryInt(int intArray[], int x) {
		return binary(intArray, x);
	}
	
	public static int binaryString(String[] stringArray, String x) {
		return binary(stringArray, x);
	}
	
	
	
	/* CONVERSION METHODS */
	
	
	
	public static int[] listToArrayInt(ArrayList<Integer> intList) {
		int[] intArray = new int[intList.size()];
		for (int i = 0; i < intArray.length; i++) {
		    intArray[i] = intList.get(i);
		}
		return intArray;
	}
	
	public static ArrayList<Integer> arrayToListInt(int[] intArray) {
		ArrayList<Integer> intList =  new ArrayList<Integer>();
		for (int num : intArray) {
			intList.add(num);
		}
		return intList;
	}
	
	public static String[] listToArrayString(ArrayList<String> stringList) {
		String[] stringArray = new String[stringList.size()];
		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = stringList.get(i);
		}
		return stringArray;
	}
	
	public static ArrayList<String> arrayToListString(String[] stringArray) {
		ArrayList<String> stringList =  new ArrayList<String>();
		for (String num : stringArray) {
			stringList.add(num);
		}
		return stringList;
	}
	
}