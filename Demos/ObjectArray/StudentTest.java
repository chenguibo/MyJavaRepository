package ObjectArray;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student s1 = new Student(1,"aaa", 10);
        Student s2 = new Student(2,"bbb", 20);
        Student s3 = new Student(3,"ccc", 30);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        Student s4 = new Student(4,"ddd", 40);

        boolean flag = contains(arr, s4.getId());
        if (flag) {
            System.out.println("该学生的id已存在！");
        } else {
            // 添加进数组
            int count = getCount(arr);
            if (count == arr.length) {
                System.out.println("数组已存满！");
                // 视频中创建新数组，我懒得写了
            } else {
                arr[count] = s4;
            }
        }
    }

    // 判断是否已存在
    public static boolean contains(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    // 数组已经存了几条数据
    public static int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }
}
