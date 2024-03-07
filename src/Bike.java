public class Bike {
    private boolean isOn;
    private int gear;
    private int currentSpeed;

    public Bike() {
        this.currentSpeed = 0;
        this.isOn = false;
        this.gear = 0;
    }

    public boolean checkPowerOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }


    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;
    }

    public int acceleration() {
        if (isOn) {
            if (gear == 1 && currentSpeed <= 20) {
                this.currentSpeed += 1;
            } else if (gear == 2 && currentSpeed <= 30) {
                this.currentSpeed += 2;
            } else if (gear == 3 && currentSpeed <= 40) {
                this.currentSpeed += 3;
            } else if (gear == 4 && currentSpeed > 40) {
                this.currentSpeed += 4;
            }
            return currentSpeed;
        } else {
            return 0;
        }
    }

    public int decelerate() {
        if (isOn) {
            if (gear == 1 && currentSpeed <= 20) {
                this.currentSpeed -= 1;
            } else if (gear == 2 && currentSpeed <= 30) {
                this.currentSpeed -= 2;
            } else if (gear == 3 && currentSpeed <= 40) {
                this.currentSpeed -= 3;
            } else if (gear == 4 && currentSpeed > 40) {
                this.currentSpeed -= 4;
            }
            return currentSpeed;
        } else {
            return 0;
        }
    }
}

