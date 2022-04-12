
public class test {
    public static void main(String[] args) {
//        Student nam = new Student("B22TCCN123",
//                "Tran Van Nam", "Hanoi", "nam@gmail.com", "035415481");
//        nam.payFee("Math", 3555555);
//        nam.goToSchool();
//        nam.doFinalTest("math");
//
//    }
        subject math = new subject("M001", "Loan", "Math", 12, 3, 4);
        System.out.println("So tin chi: " + math.getTinchi());
        System.out.println(math);
    }
}
