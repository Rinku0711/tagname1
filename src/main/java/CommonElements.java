

    public class CommonElements {

        public static void main(String a[]){
            String[] arr1 = {"JAVA","C++","python","C#","SQL"};
            String[] arr2 = {"C++","SQL","JAVA"};
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr2.length;j++){
                    if(arr1[i]==arr2[j]){
                        System.out.println(arr1[i]);
                    }
                }
            }
        }
    }

