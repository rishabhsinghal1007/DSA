public class constructor {

    public static class school {
        private String StudName;
        private String RollNo;
        private String Standard;
        private String Section;

        // 1st
        school() {
            this("DefName", "000", "A", "C");
        }

        // 2nd
        school(String StudName, String RollNo) {
            this(StudName, RollNo, "!X", "D");
        }

        school(String StudName, String RollNo, String Standard, String Section) {
            this.StudName = StudName;
            this.RollNo = RollNo;
            this.Standard = Standard;
            this.Section = Section;
        }

        // getterFunctions .........
        public String getStudName() {
            return StudName;
        }

        public String getRollNo() {
            return RollNo;
        }

        public String getStandard() {
            return Standard;
        }

        public String getSection() {
            return Section;
        }
    }

    public static void main(String[] args) {
        school s1 = new school();
        school s2 = new school("Stud2name", "Stud2RollNo");
        school s3 = new school("Stud3name", "Stud3RollNo", "Stud3Standard", "3Sec");

        System.out.println(s1.getStudName());
        System.out.println(s1.Section);

        System.out.println(s2.getStudName());
        System.out.println(s2.Section);

        System.out.println(s3.getStudName());
        System.out.println(s3.Section);
    }
}