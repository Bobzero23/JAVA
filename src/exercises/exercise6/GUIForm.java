package exercises.exercise6;

import java.util.ArrayList;
import javax.swing.JButton;

public class GUIForm extends javax.swing.JFrame {

    public GUIForm() {
        initComponents();
    }

    private void initComponents() {

        showButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vehicle Information");

        showButton.setText("Show Vehicles");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(showButton)
                                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(showButton)
                                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Vehicle vehicle1 = new Vehicle("Audi");
        SpaceVehicle spaceVehicle1 = new SpaceVehicle("RP-1 + LOX", "NASA");
        Rocket rocket1 = new Rocket("RP-1 + LOX", "ArianeSpace");

        LandVehicleWithEngine landVehicleWithEngine = new LandVehicleWithEngine("Toyota");
        LandVehicleWithoutEngine landVehicleWithoutEngine = new LandVehicleWithoutEngine("Bicycle");
        WheeledVehicle wheeledVehicle = new WheeledVehicle("Ford");
        TrackedVehicle trackedVehicle = new TrackedVehicle("Caterpillar");
        SailBoat sailBoat = new SailBoat("Beneteau");
        Car car = new Car("BMW");
        Tank tank = new Tank("T-90");

        ArrayList<Vehicle> vehicleTable = new ArrayList<>();
        vehicleTable.add(vehicle1);
        vehicleTable.add(spaceVehicle1);
        vehicleTable.add(rocket1);
        vehicleTable.add(landVehicleWithEngine);
        vehicleTable.add(landVehicleWithoutEngine);
        vehicleTable.add(wheeledVehicle);
        vehicleTable.add(trackedVehicle);
        vehicleTable.add(sailBoat);
        vehicleTable.add(car);
        vehicleTable.add(tank);

        for (int i = 0; i < vehicleTable.size(); i++) {
            System.out.println(vehicleTable.get(i).toString());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIForm().setVisible(true);
            }
        });
    }

    private javax.swing.JButton showButton;
}

