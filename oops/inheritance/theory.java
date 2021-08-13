package inheritance;

public class theory {
    public static class AutoMobile {
        private double topSpeed;
        private String BrandName;
        private String YearOfManc;
        private double Cost;
        private double Durability;

        public AutoMobile(double topSpeed, String BrandName, String YearOfManc, double Cost, double Durability) {
            this.topSpeed = topSpeed;
            this.BrandName = BrandName;
            this.YearOfManc = YearOfManc;
            this.Cost = Cost;
            this.Durability = Durability;
        }

        public void movement() {
            System.out.println("Automobile.movement() was called and automobile moves");
        }
    }

    public static class Car extends AutoMobile {
        private String SteeringWheel;
        private String MoonRoof;
        private String BatterySize;
        private String HeadLamps;
        private String groundClearance;

        public Car(double topSpeed, String BrandName, String YearOfManc, double Cost, double Durability,
                String SteeringWheel, String MoonRoof, String BatterySize, String HeadLamps, String groundClearance) {

            super(topSpeed, BrandName, YearOfManc, Cost, Durability);

            this.SteeringWheel = SteeringWheel;
            this.MoonRoof = MoonRoof;
            this.BatterySize = BatterySize;
            this.HeadLamps = HeadLamps;
            this.groundClearance = groundClearance;
        }
    }

    public static void main(String[] args) {
        AutoMobile auto = new AutoMobile(200, "LandRover", "2018", 2000000, 10);

        Car car = new Car(150, "Audi", "2017", 3000000, 10, "Yes", "yes", "1000KW", "yes", "1.5 inch");

        auto.movement();
        car.movement();
    }
}
