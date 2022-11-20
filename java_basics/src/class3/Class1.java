package class3;

import java.util.Map;

class Class1 {

    Integer testObj;

    Class1(Integer value) {
        this.testObj = value;
    }
    public static void main(String[] args) {
        Class1 niwantha = new Class1(123);
        /*Class2 class2 = new Class2();
        niwantha.readObjectsPrivate(123);
        class2.readObjectsPrivate(44);
        Class1.readObjectsStatic(55);
        Class2.readObjectsStatic(77);*/
        niwantha.readObjectsStatic();
    }

    public void readObjectss(Map<Integer,String> value) {

    }

        private void readObjectsPrivate(Integer value) {
        System.out.println(value);
    }

    public  void readObjectsStatic() {
        System.out.println(testObj);
    }


}
