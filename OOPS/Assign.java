

class CarService {
    
    final String carNames[] = { "Hatchback", "Sedan", "SUV" };
    final String serviceCode[][] = {
            { "BS01", "EF01", "CF01", "BF01", "GF01" },
            { "Basic Servicing", "Engine Fixing", "Clutch Fixing", "Brake Fixing", "Gear Fixing" }
 };
    final int serviceCharges[][] = {
        { 2000, 5000, 2000, 1000, 300 },
        { 4000, 8000, 4000, 1500, 6000 },
        { 5000, 10000, 6000, 2500, 8000 }
    };
    private String carType;
    private String serviceCodes;

    void setCarType(String str) {
        carType = str;
    }

    String getCarType() {
        return carType;
    }

    void setServiceCodes(String str) {
        serviceCodes = str;
    }

    String getServiceCodes() {
        return serviceCodes;
    }

    int generateBill() {
        int  bill = 0, i,j, carVal = -1;
        String services[] = getServiceCodes().split(",");
        String car = getCarType();

        //Set Car type
        for(i = 0; i < carNames.length; i++)
            if(car.equals(carNames[i])){
                carVal = i;
                break;
            }
        if (carVal != -1) {
            //Set Service Type
            for (i = 0; i < services.length; i++) {
                for (j = 0; j < carNames.length; j++) {
                    if (services[i].equals(serviceCode[0][j])) {
                        System.out.format("Charges for %s - Rs%d\n",serviceCode[1][j],serviceCharges[carVal][j]);
                        bill += serviceCharges[carVal][j];
                        break;
                    }
                }
            }
        }
        return bill;
    }

}



class Assign {
    public static void main(String args[]) {
        System.out.println("HI");
        CarService cs = new CarService();
        cs.setCarType("Hatchback");
        cs.setServiceCodes("BS01,EF01");
        int bill = cs.generateBill();
        System.out.println("Total Bill: " + bill);
        System.out.println((bill > 10000)? "Complimentary cleaning ! " : "" );
    }
}