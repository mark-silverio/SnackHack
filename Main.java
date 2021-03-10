package com.jamsilveriodev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private int myCategory;
    private int myFood;
    private int myMilktea;
    private int mySmoothies;

    private String orderSelected;
    private String orderSize;
    private int orderNumber;

    private static final String[] snackhack = {"[1.] FOOD", "[2.] MILKTEA", "[3.] SMOOTHIES", "[4.] EXIT"};
    private static final String[] food = {"[1.] Fries", "[2.] Hamburger", "[3.] Tacos", "[4.] BACK"};
    private static final String[] milktea = {"[1.] Wintermelon", "[2.] Pearl", "[3.] Chocolate", "[4.] BACK"};
    private static final String[] smoothies = {"[1.] Pineapple Mango", "[2.] Strawberry Banana", "[3.] Kiwi Apple", "[4.] BACK"};

    private static final String[] fries = {"[1.] Small P50", "[2.] Medium P80", "[3.] Large P100"};
    private static final String[] hamburger = {"[1.] Regular P60", "[2.] With Cheese P80", "[3.] Special P110"};
    private static final String[] tacos = {"[1.] Small P60", "[2.] Medium P80", "[3.] Large P100"};
    private static final String[] wintermelon = {"[1.] Small P60", "[2.] Medium P70", "[3.] Large P80"};
    private static final String[] pearl = {"[1.] Small P60", "[2.] Medium P70", "[3.] Large P80"};
    private static final String[] chocolate = {"[1.] Small P60", "[2.] Medium P70", "[3.] Large P80"};
    private static final String[] pineappleMango = {"[1.] Small P60", "[2.] Medium P80", "[3.] Large P110"};
    private static final String[] strawberryBanana = {"[1.] Small P60", "[2.] Medium P80", "[3.] Large P110"};
    private static final String[] kiwiApple = {"[1.] Small P60", "[2.] Medium P80", "[3.] Large P110"};

    private static final ArrayList<String> billingRecords = new ArrayList<>();
    private static final ArrayList<Double> totalBill = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Main snackhack = new Main();
        snackhack.welcome();


    }

    public void welcome() {
        String welcomeMessage =
                """
                        * * * * * * * * * * * * * * * * * * * * * * * *\s
                        *                                             *\s
                        *              WELCOME TO SNACKHACK           *\s
                        *                                             *\s
                        * * * * * * * * * * * * * * * * * * * * * * * *\s
                        """;
        System.out.println(welcomeMessage);

        displayMenu();
    }

    public void displayMenu() {
        String welcomeMenu =
                "\nSNACKHACK CATEGORIES:" + "\n" + "\n" +
                        snackhack[0] + "\n" +
                        snackhack[1] + "\n" +
                        snackhack[2] + "\n" +
                        snackhack[3];

        System.out.println(welcomeMenu);

        System.out.println("\nPlease choose your option [1-3]: ");

        try {
            int menuOption = scanner.nextInt();
            setMyCategory(menuOption);
            menuOption = getMyCategory();

            if (menuOption == 1) {
                displayFood();
            } else if (menuOption == 2) {
                displayMilktea();
            } else if (menuOption == 3) {
                displaySmoothies();
            } else if (menuOption == 4) {
                goodbye();
            } else {
                System.out.println("\n>>Please choose from 1 to 4.");
                displayMenu();
            }
        } catch (Exception e) {

        }


    }

    public void displayFood() {
        String welcomeFood =
                "\nSNACKHACK FOOD:" + "\n" + "\n" +
                        food[0] + "\n" +
                        food[1] + "\n" +
                        food[2] + "\n" +
                        food[3];

        System.out.println(welcomeFood);

        System.out.println("\nChoose your food[1-3]: ");
//        try {
//        String strMenuOption = scanner.nextLine();
//        int menuOption = Integer.parseInt(strMenuOption);
        int menuOption = scanner.nextInt();
        scanner.nextLine();
        setMyFood(menuOption);
        menuOption = getMyFood();

        if (menuOption == 1) {
            orderSelected = food[0];
            setOrderSelected(orderSelected);
            processOrder1(getOrderSelected());
        } else if (menuOption == 2) {
            orderSelected = food[1];
            setOrderSelected(orderSelected);
            processOrder1(getOrderSelected());
        } else if (menuOption == 3) {
            orderSelected = food[2];
            setOrderSelected(orderSelected);
            processOrder1(getOrderSelected());
        } else if (menuOption == 4) {
            displayFood();
        } else {
            System.out.println("\n>>Please choose from 1 to 3.");
            displayFood();
        }
//            switch(getMyFood()) {
//                case 1:
//                    orderSelected = food[0];
//                    setOrderSelected(orderSelected);
//                    processOrder1(getOrderSelected());
//                case 2:
//                    orderSelected = food[1];
//                    setOrderSelected(orderSelected);
//                    processOrder1(getOrderSelected());
//                case 3:
//                    orderSelected = food[2];
//                    setOrderSelected(orderSelected);
//                    processOrder1(getOrderSelected());
//                case 4: displayFood();
//                default:
//                    System.out.println("\n>>Please choose from 1 to 3.");
//                    displayFood();
//            }
//        } catch (Exception e) {
//
//        }


    }

    public void displayMilktea() {
        String welcomeMilktea =
                "\nSNACKHACK MILKTEA:" + "\n" + "\n" +
                        milktea[0] + "\n" +
                        milktea[1] + "\n" +
                        milktea[2] + "\n" +
                        milktea[3];

        System.out.println(welcomeMilktea);

        System.out.println("Choose your milktea[1-3]: ");
        try {
            myMilktea = scanner.nextInt();
            setMyMilktea(myMilktea);

            switch (getMyMilktea()) {
                case 1:
                    orderSelected = milktea[0];
                    setOrderSelected(orderSelected);
                    processOrder1(getOrderSelected());
                case 2:
                    orderSelected = milktea[1];
                    setOrderSelected(orderSelected);
                    processOrder1(getOrderSelected());
                case 3:
                    orderSelected = milktea[2];
                    setOrderSelected(orderSelected);
                    processOrder1(getOrderSelected());
                case 4:
                    displayMenu();
                default:
                    System.out.println("\n>>Please choose from 1 to 3.");
                    displayMenu();
            }
        } catch (Exception e) {

        }


    }

    public void displaySmoothies() {
        String welcomeSmoothies =
                "\nSNACKHACK SMOOTHIES:" + "\n" + "\n" +
                        smoothies[0] + "\n" +
                        smoothies[1] + "\n" +
                        smoothies[2] + "\n" +
                        smoothies[3];

        System.out.println(welcomeSmoothies);

        System.out.println("Choose your smoothie[1-3]: ");
        try {
            mySmoothies = scanner.nextInt();
            setMySmoothies(mySmoothies);

            switch (getMySmoothies()) {
                case 1:
                    orderSelected = smoothies[0];
                    setOrderSelected(orderSelected);
                    processOrder1(getOrderSelected());
                case 2:
                    orderSelected = smoothies[1];
                    setOrderSelected(orderSelected);
                    processOrder1(getOrderSelected());
                case 3:
                    orderSelected = smoothies[2];
                    setOrderSelected(orderSelected);
                    processOrder1(getOrderSelected());
                case 4:
                    displayMenu();
                default:
                    System.out.println("\n>>Please choose from 1 to 3.");
                    displayMenu();
            }
        } catch (Exception e) {

        }


    }

    public void setMyCategory(int myCategory) {
        this.myCategory = myCategory;
    }

    public int getMyCategory() {
        return this.myCategory;
    }

    public void setMyFood(int myFood) {
        this.myFood = myFood;
    }

    public int getMyFood() {
        return this.myFood;
    }

    public void setMyMilktea(int myMilktea) {
        this.myMilktea = myMilktea;
    }

    public int getMyMilktea() {
        return this.myMilktea;
    }

    public void setMySmoothies(int mySmoothies) {
        this.mySmoothies = mySmoothies;
    }

    public int getMySmoothies() {
        return this.mySmoothies;
    }


    public void setOrderSelected(String orderSelected) {
        this.orderSelected = orderSelected;
    }

    public String getOrderSelected() {
        return this.orderSelected;
    }

    public void setOrderSize(String orderSize) {
        this.orderSize = orderSize;
    }

    public String getOrderSize() {
        return this.orderSize;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return this.orderNumber;
    }

    public void displayOrderSizeFries() {
        String orderSizes =
                "Fries:" + "\n" + "\n" +
                        fries[0] + "\n" +
                        fries[1] + "\n" +
                        fries[2];

        System.out.println(orderSizes);
    }

    public void displayOrderSizeHamburger() {
        String orderSizes =
                "Hamburger:" + "\n" + "\n" +
                        hamburger[0] + "\n" +
                        hamburger[1] + "\n" +
                        hamburger[2];

        System.out.println(orderSizes);
    }

    public void displayOrderSizeTacos() {
        String orderSizes =
                "Tacos:" + "\n" + "\n" +
                        tacos[0] + "\n" +
                        tacos[1] + "\n" +
                        tacos[2];

        System.out.println(orderSizes);
    }

    public void displayOrderSizeWintermelon() {
        String orderSizes =
                "Wintermelon:" + "\n" + "\n" +
                        wintermelon[0] + "\n" +
                        wintermelon[1] + "\n" +
                        wintermelon[2];

        System.out.println(orderSizes);
    }

    public void displayOrderSizePearl() {
        String orderSizes =
                "Pearl:" + "\n" + "\n" +
                        pearl[0] + "\n" +
                        pearl[1] + "\n" +
                        pearl[2];

        System.out.println(orderSizes);
    }

    public void displayOrderSizeChocolate() {
        String orderSizes =
                "Chocolate:" + "\n" + "\n" +
                        chocolate[0] + "\n" +
                        chocolate[1] + "\n" +
                        chocolate[2];

        System.out.println(orderSizes);
    }

    public void displayOrderSizePineappleMango() {
        String orderSizes =
                "\nPineapple Mango:" + "\n" + "\n" +
                        pineappleMango[0] + "\n" +
                        pineappleMango[1] + "\n" +
                        pineappleMango[2];

        System.out.println(orderSizes);
    }

    public void displayOrderSizeStrawberryBanana() {
        String orderSizes =
                "Strawberry Banana:" + "\n" + "\n" +
                        strawberryBanana[0] + "\n" +
                        strawberryBanana[1] + "\n" +
                        strawberryBanana[2];

        System.out.println(orderSizes);
    }

    public void displayOrderSizeKiwiApple() {
        String orderSizes =
                "Kiwi Apple:" + "\n" + "\n" +
                        kiwiApple[0] + "\n" +
                        kiwiApple[1] + "\n" +
                        kiwiApple[2];

        System.out.println(orderSizes);
    }


    public void processOrder1(String orderSelected) {
        String[] myOrder = getOrderSelected().split("\\s");
        System.out.println("\nYou selected -> " + myOrder[1] + "\n");
        String selectedProduct = null;

        if (orderSelected.equals(food[0])) {
            selectedProduct = "fries";
            displayOrderSizeFries();
        } else if (orderSelected.equals(food[1])) {
            selectedProduct = "hamburger";
            displayOrderSizeHamburger();
        } else if (orderSelected.equals(food[2])) {
            selectedProduct = "tacos";
            displayOrderSizeTacos();
        } else if (orderSelected.equals(milktea[0])) {
            selectedProduct = "wintermelon";
            displayOrderSizeWintermelon();
        } else if (orderSelected.equals(milktea[1])) {
            selectedProduct = "pearl";
            displayOrderSizePearl();
        } else if (orderSelected.equals(milktea[2])) {
            selectedProduct = "chocolate";
            displayOrderSizeChocolate();
        } else if (orderSelected.equals(smoothies[0])) {
            selectedProduct = "pineappleMango";
            displayOrderSizePineappleMango();
        } else if (orderSelected.equals(smoothies[1])) {
            selectedProduct = "strawberryBanana";
            displayOrderSizeStrawberryBanana();
        } else if (orderSelected.equals(smoothies[2])) {
            selectedProduct = "kiwiApple";
            displayOrderSizeKiwiApple();
        } else {
            System.out.println("\n>>Please try again.");
            displayFood();
        }

        System.out.println("\nWhich size would your " + myOrder[1] + " be?");

        int orderSizeNumber = 0;
        ArrayList<Integer> order_tuple = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

        try {
            orderSizeNumber = scanner.nextInt();
        } catch (Exception e) {

        }
        if (order_tuple.contains(orderSizeNumber)) {
            orderSize = selectedProduct + "[" + (orderSizeNumber-1) + "]";
            setOrderSize(orderSize);

            double sizePrice = 0;
            if (getOrderSize().equals("fries[0]")) {
                setOrderSize(fries[0].substring(5));
                sizePrice = 50.0;
            } else if (getOrderSize().equals("fries[1]")) {
                setOrderSize(fries[1].substring(5));
                sizePrice = 80.0;
            } else if (getOrderSize().equals("fries[2]")) {
                setOrderSize(fries[2].substring(5));
                sizePrice = 100.0;
            } else if (getOrderSize().equals("hamburger[0]")) {
                setOrderSize(hamburger[0].substring(5));
                sizePrice = 60.0;
            } else if (getOrderSize().equals("hamburger[1]")) {
                setOrderSize(hamburger[1].substring(5));
                sizePrice = 80.0;
            } else if (getOrderSize().equals("hamburger[2]")) {
                setOrderSize(hamburger[2].substring(5));
                sizePrice = 110.0;
            } else if (getOrderSize().equals("tacos[0]")) {
                setOrderSize(tacos[0].substring(5));
                sizePrice = 60.0;
            } else if (getOrderSize().equals("tacos[1]")) {
                setOrderSize(tacos[1].substring(5));
                sizePrice = 80.0;
            } else if (getOrderSize().equals("tacos[2]")) {
                setOrderSize(tacos[2].substring(5));
                sizePrice = 100.0;
            } else if (getOrderSize().equals("wintermelon[0]")) {
                setOrderSize(wintermelon[0].substring(5));
                sizePrice = 60.0;
            } else if (getOrderSize().equals("wintermelon[1]")) {
                setOrderSize(wintermelon[1].substring(5));
                sizePrice = 70.0;
            } else if (getOrderSize().equals("wintermelon[2]")) {
                setOrderSize(wintermelon[2].substring(5));
                sizePrice = 80.0;
            } else if (getOrderSize().equals("pearl[0]")) {
                setOrderSize(pearl[0].substring(5));
                sizePrice = 60.0;
            } else if (getOrderSize().equals("pearl[1]")) {
                setOrderSize(pearl[1].substring(5));
                sizePrice = 70.0;
            } else if (getOrderSize().equals("pearl[2]")) {
                setOrderSize(pearl[2].substring(5));
                sizePrice = 80.0;
            } else if (getOrderSize().equals("chocolate[0]")) {
                setOrderSize(chocolate[0].substring(5));
                sizePrice = 60.0;
            } else if (getOrderSize().equals("chocolate[1]")) {
                setOrderSize(chocolate[1].substring(5));
                sizePrice = 70.0;
            } else if (getOrderSize().equals("chocolate[2]")) {
                setOrderSize(chocolate[2].substring(5));
                sizePrice = 80.0;
            } else if (getOrderSize().equals("pineappleMango[0]")) {
                setOrderSize(pineappleMango[0].substring(5));
                sizePrice = 60.0;
            } else if (getOrderSize().equals("pineappleMango[1]")) {
                setOrderSize(pineappleMango[1].substring(5));
                sizePrice = 80.0;
            } else if (getOrderSize().equals("pineappleMango[2]")) {
                setOrderSize(pineappleMango[2].substring(5));
                sizePrice = 110.0;
            } else if (getOrderSize().equals("strawberryBanana[0]")) {
                setOrderSize(strawberryBanana[0].substring(5));
                sizePrice = 60.0;
            } else if (getOrderSize().equals("strawberryBanana[1]")) {
                setOrderSize(strawberryBanana[1].substring(5));
                sizePrice = 80.0;
            } else if (getOrderSize().equals("strawberryBanana[2]")) {
                setOrderSize(strawberryBanana[2].substring(5));
                sizePrice = 110.0;
            } else if (getOrderSize().equals("kiwiApple[0]")) {
                setOrderSize(kiwiApple[0].substring(5));
                sizePrice = 60.0;
            } else if (getOrderSize().equals("kiwiApple[1]")) {
                setOrderSize(kiwiApple[1].substring(5));
                sizePrice = 80.0;
            } else if (getOrderSize().equals("kiwiApple[2]")) {
                setOrderSize(kiwiApple[2].substring(5));
                sizePrice = 110.0;
            } else {
                System.out.println("\n>>Please try again.");
                displayFood();
            }

            processOrder2(myOrder[1], sizePrice, getOrderNumber());

        } else {
            processOrder1(getOrderSelected());
        }


    }

    public void processOrder2(String order, double sizePrice, int orderNumber) {

        try {
            System.out.println("\nNumber of orders: ");
            orderNumber = scanner.nextInt();
        } catch (Exception e) {

        }

        if (orderNumber <= 0) {
            processOrder2(order, sizePrice, orderNumber);
        } else {
            setOrderNumber(orderNumber);
            billingCustomer(order, sizePrice, orderNumber);
        }

    }


    public void billingCustomer(String orderSelected, double sizePrice, int orderNumber) {
        System.out.println("\nSUMMARY: You ordered: \n");
        String record = orderSelected + " - " + getOrderSize() + "\n" + "Quantity: " + getOrderNumber() + "\n";
        billingRecords.add(record);
        System.out.println(billingRecords.toString());
        double total = sizePrice * orderNumber;
        totalBill.add(total);

//        System.out.println(totalBill);
        double customerBill = calculateTotalBill(totalBill);
        System.out.println("\n**YOUR TOTAL BILL IS ** \nP" + customerBill);

        orderAgain();
    }

    public double calculateTotalBill(ArrayList<Double> totalBill) {
        double total = 0;
        for (double bill : totalBill) {
            total += bill;
        }
        return total;
    }

    public void orderAgain() {
        System.out.println("\nWill you order again? \n[1] Yes [2] That's all. Thank you.");
        int confirmation = 0;
        try {
            confirmation = scanner.nextInt();
        } catch (Exception e) {

        }

        switch (confirmation) {
            case 1:
                clearScreen();
                displayMenu();
            case 2:
                billingRecords.clear();
                totalBill.clear();
                goodbye();
            default:
                clearScreen();
                orderAgain();
        }
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void goodbye() {
        scanner.close();
        System.out.println("\n>>Thank you. Come back again!");
        System.exit(0);
    }


}