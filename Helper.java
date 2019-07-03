

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class Helper {

    public static ArrayList<Car>  readAllDataCar ()
    {
        //  ArrayList initialized with size 0
        ArrayList<Car> CarList = new ArrayList<Car>(0);
// Input stream
        ObjectInputStream inputStream = null;
        try
        {
// open file for reading
            inputStream = new ObjectInputStream(new FileInputStream("CarFile.ser"));
// End Of File flag
            boolean EOF = false;
// Keep reading file until file ends
            while(!EOF) {
                try {
// read object and type cast into CarDetails object
                    Car myObj = (Car) inputStream.readObject();
// add object into ArrayList
                    CarList.add(myObj);
//System.out.println("Read: " + myObj.getName());
                } catch (ClassNotFoundException e) {
//System.out.println("Class not found");
                } catch (EOFException end) {
// EOFException is raised when file ends
// set End Of File flag to true so that loop exits
                    EOF = true;
                }
            }
        }
        catch(FileNotFoundException e) {
//System.out.println("Cannot find file");
        } catch (IOException e) {
//System.out.println("IO Exception while opening stream");
//e.printStackTrace();
        } finally { // cleanup code to close stream if it was opened
            try {
                if(inputStream != null)
                    inputStream.close( );
            } catch (IOException e) {
// TODO Auto-generated catch block
                JOptionPane.showMessageDialog(new JFrame(),"Error while closing file");
            }
        }

// returns ArrayList
        return CarList;
    }
    public static ArrayList<Person>  readAllDataCustomer ()
    {
        //  ArrayList initialized with size 0
        ArrayList<Person> CustomerList = new ArrayList<Person>(0);
// Input stream
        ObjectInputStream inputStream = null;
        try
        {
// open file for reading
            inputStream = new ObjectInputStream(new FileInputStream("CustomerFile.ser"));
// End Of File flag
            boolean EOF = false;
// Keep reading file until file ends
            while(!EOF) {
                try {
// read object and type cast into CarDetails object
                    Person myObj = (Person) inputStream.readObject();
// add object into ArrayList
                    CustomerList.add(myObj);
//System.out.println("Read: " + myObj.getName());
                } catch (ClassNotFoundException e) {
//System.out.println("Class not found");
                } catch (EOFException end) {
// EOFException is raised when file ends
// set End Of File flag to true so that loop exits
                    EOF = true;
                }
            }
        }
        catch(FileNotFoundException e) {
//System.out.println("Cannot find file");
        } catch (IOException e) {
//System.out.println("IO Exception while opening stream");
//e.printStackTrace();
        } finally { // cleanup code to close stream if it was opened
            try {
                if(inputStream != null)
                    inputStream.close( );
            } catch (IOException e) {
// TODO Auto-generated catch block
                JOptionPane.showMessageDialog(new JFrame(),"Error while closing file");
            }
        }

// returns ArrayList
        return CustomerList;
    }
    //public static ArrayList<RentalSystem>  readAllDataBooking ()
//                        {
//                          //  ArrayList initialized with size 0
//		ArrayList<RentalSystem> RentalList = new ArrayList<RentalSystem>(0);
//		// Input stream
//		ObjectInputStream inputStream = null;
//		try
//		{
//			// open file for reading
//		inputStream = new ObjectInputStream(new FileInputStream("BookingFile.ser"));
//			// End Of File flag
//			boolean EOF = false;
//			// Keep reading file until file ends
//			while(!EOF) {
//				try {
//					// read object and type cast into CarDetails object
//					RentalSystem myObj = (RentalSystem) inputStream.readObject();
//					// add object into ArrayList
//					RentalList.add(myObj);
//					//System.out.println("Read: " + myObj.getName());
//				} catch (ClassNotFoundException e) {
//					//System.out.println("Class not found");
//				} catch (EOFException end) {
//					// EOFException is raised when file ends
//					// set End Of File flag to true so that loop exits
//					EOF = true;
//				}
//                        }
//                }
//		 catch(FileNotFoundException e) {
//			//System.out.println("Cannot find file");
//		} catch (IOException e) {
//			//System.out.println("IO Exception while opening stream");
//			//e.printStackTrace();
//		} finally { // cleanup code to close stream if it was opened
//			try {
//				if(inputStream != null)
//					inputStream.close( );
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				JOptionPane.showMessageDialog(new JFrame(),"Error while closing file");
//			}
//		}
//                
//		// returns ArrayList
//		return RentalList;
//	}
//
//public static void addArrayListToookingFile(ArrayList<RentalSystem> RentalList)
//{
//    ObjectOutputStream    outputStream = null;
//
//		try {
//                    // Read old objects
//		
//			// Append new object into existing list
//			
//			// Open Stream for writing
//	outputStream = new ObjectOutputStream(new FileOutputStream("BookingFile.ser"));
//			
//			// Write all objects (old and new one) into the file
//			for(int i = 0 ; i < RentalList.size() ; i++) {
//				outputStream.writeObject(RentalList.get(i));
//			}
//		} catch(IOException e) {
//			JOptionPane.showMessageDialog(new JFrame(),"Error while opening file");
//			
//		} finally { // cleanup code which closes output stream if its object was created
//			try {
//				if(outputStream != null) {
//					outputStream.close();								
//				}
//
//			} catch (IOException e) {
//				JOptionPane.showMessageDialog(new JFrame(),"Error while closing file");
//				
//			}
//		}		
//	}  
    public static void addArrayListToCarFile(ArrayList<Car> CarList)
    {
        ObjectOutputStream    outputStream = null;

        try {
            // Read old objects

            // Append new object into existing list

            // Open Stream for writing
            outputStream = new ObjectOutputStream(new FileOutputStream("CarFile.ser"));

            // Write all objects (old and new one) into the file
            for(int i = 0 ; i < CarList.size() ; i++) {
                outputStream.writeObject(CarList.get(i));
            }
        } catch(IOException e) {
            JOptionPane.showMessageDialog(new JFrame(),"Error while opening file");

        } finally { // cleanup code which closes output stream if its object was created
            try {
                if(outputStream != null) {
                    outputStream.close();
                }

            } catch (IOException e) {
                JOptionPane.showMessageDialog(new JFrame(),"Error while closing file");

            }
        }
    }
    public static void removeCar(String input) {
        try {


            ArrayList<Car> CarList =Helper.readAllDataCar();


            for(int i=0;i<CarList.size();i++) {
                if(CarList.get(i).getCarModel().equals(input))
                {
                    CarList.remove(i);
                }
                Helper.addArrayListToCarFile(CarList);
            }


        }
        catch(IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(new JFrame(),"Car not found");
        }
    }

    public static void addArrayListToCustomerFile(ArrayList<Person> CustomerList)
    {
        ObjectOutputStream    outputStream = null;

        try {
            // Read old objects

            // Append new object into existing list

            // Open Stream for writing
            outputStream = new ObjectOutputStream(new FileOutputStream("CustomerFile.ser"));

            // Write all objects (old and new one) into the file
            for(int i = 0 ; i < CustomerList.size() ; i++) {
                outputStream.writeObject(CustomerList.get(i));
            }
        } catch(IOException e) {
            JOptionPane.showMessageDialog(new JFrame(),"Error while opening file");

        } finally { // cleanup code which closes output stream if its object was created
            try {
                if(outputStream != null) {
                    outputStream.close();
                }

            } catch (IOException e) {
                JOptionPane.showMessageDialog(new JFrame(),"Error while closing file");

            }
        }
    }
}