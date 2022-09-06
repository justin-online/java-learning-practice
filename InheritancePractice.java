public class InheritancePractice {

    public class HumanBodyPart {
        int numHairs;
        float skinThickness; // from 0 to 1, where 1 is thickest, 0 is thinnest

        public class Appendage extends HumanBodyPart {
            float lengthInCm;

            public class Arm extends Appendage {

                private void throw() {
                    System.out.println("Arm has thrown.")
                }
            }

            public class Leg extends Appendage {

                private void kick() {
                    System.out.println("Leg has kicked.")
                }



            }

        }


    }

}

public static void main(String args) {
    Arm daddysArm = new Arm();

    Arm.throw();

}
