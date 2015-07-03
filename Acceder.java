/**
 * @(#)Acceder.java
 *
 *
 * @author
 * @version 1.00 2009/5/16
 */
 
 /*
  ACCEDER 1.5 - Admissions & Grading Data Base Management System
  
  CREATED BY - Dauji Vaid for the IB Diploma Programme
  COPYRIGHT© - 2008-2010 Dauji Vaid
  
  COPYRIGHT NOTICE:
  Accéder 1.5 is free software intended for the use of as database management system 
  of an educational institute. You can redistribute and/or modify it under the terms 
  of the General Public License (GNU) as published by the Free Software Foundation 
  version 3 of the License.

  This program is distributed in the hope that it will be useful, but without any 
  warranty; without even the implied warranty of merchantability or fitness for a 
  particular purpose. See the GNU General Public License for more details. 

  You should have received a copy of the GNU General Public License along with this 
  program. If not, see http://www.gnu.org/licenses/ .

  Copyright© 2008-2010 Dauji Vaid
  Author: Dauji Vaid - IB Computer Science Program Dossier
 */
 
 
								             
								              /*====================
								 				STAGE C- THE PROGRAM
								                ====================*/
				
										/*									 
										*PROGRAM NAME: Accéder 1.5
										*AUTHOR: Dauji Vaid
										*CANDIDATE NUMBER: 001424-064
										*SCHOOL: Pathways World School
										*PROGRAM USED: Java
										*PURPOSE: IB Computer Science Program Dossier
										*SESSION: May 2010
										
										      /*--------------------					
										 	    COMPUTER SYSTEM USED
										 	    --------------------*/					   
									    /*									
										*SYSTEM: Microsoft Windows Vista™ Home Premium Professional (All Rights Reserved)
										*SYSTEM TYPE: 32-bit Operating System (OS)
										*COMPUTER: DELL XPS M1330 Intel® Core™ 2 Duo CPU T5750 @ 2.00GHz
										*HARD DISK DRIVE: 295.00 GB
										*RANDOM ACCESS MEMORY: 3.00 GB*/
										 
/*--------------------
  LIBRARY/HEADER FILES 
  --------------------*/ 
import java.io.*;
import java.io.Console.*; 

//--------------------
// Using Java SE 6.0.
/*
I have used TextIO.class. It needs to be in the same directory as this program (Acceder.java).
This class is available at http://www.faqs.org/docs/javap/source/TextIO.java and is used to
implement error checking methods to verify data types. I do not claim to have developed this
class but simply used it. TextIO.class is distributed under the GNU Free Documentation License,
Version 1.1 and is not distributed as a part of this program. It may be procured individually at
http://www.faqs.org/docs/javap/source/TextIO.java.
*/
//--------------------
									/*
									$$$$$$$$$$$$$$$$$$$$$$$$
									     CLASS: ACCEDER 
									$$$$$$$$$$$$$$$$$$$$$$$$
									*/
public class Acceder {
	public static void main(String args[]) {
	
		//calling password
		
	try{
    	password call = new password();			// calling secure login method
    	call.pass();							// calling secure login method
    	}
    	
    catch (Throwable error)
    	{
    	System.out.println();
    	System.err.println("\n\t\tSYSTEM SAFETY ERROR: LOGIN FAILED REBOOT PROGRAMME");
    	System.err.println("\n\t\tPOSSIBLE REASONS: 1. INVALID CHARACTERS INPUTTED");
    	System.out.println("\n\t\t                  2. PROGRAM NOT EXECUTED CORRECTLY");
    	System.err.println("\n\t\tPOSSIBLE SOLUTION: REBOOT PROGRAMME");
    	System.exit(0);	  
    	}
		
		//calling password ends
		
	try {
		
// Prints the title with a new instance of the program.

		printTitle(new startAcceder());
		}
	catch (Throwable error) {
		System.out.println();
		System.err.println("FATAL ERROR! PROGRAM TERMINATED: REBOOT PROGRAM");
		System.err.println(error);
		error.printStackTrace();
		
// Ensures quit in error status.

		System.exit(1);
	}
		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println(" THANK YOU FOR USING ACCEDER 1.5 (BETA VERSION)");
		System.out.println("-----------------------------------------------------------");
		System.out.println(" Developed by: Dauji Vaid");
		System.out.println(" Developed for the IB Diploma - Computer Science Program Dossier");
		System.out.println(" Candidate number: 001424-064");
		System.out.println(" Session: May 2010");
		System.out.println();
		System.out.println("--------------------");
		System.out.println("ABOUT ACCEDER 1.5");
		System.out.println("--------------------");
		System.out.println("This is a Data Base Management System (DBMS) for Pathways World School which would help in managing its admissions and grading modules.");
		System.out.println();
		
// Exits with normal exit code.

		System.exit(0);
}
// Prints the tile of the program and loads the necessary data, then opens the Main Menu.

	public static void printTitle(startAcceder Acceder) throws
	Throwable {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("============================");
			System.out.println(" ACCEDER 1.5 (BETA VERSION)");
			System.out.println("============================");
			System.out.println();
			System.out.println("====================================================");
			System.out.println(" *PATHWAYS WORLD SCHOOL DATABASE MANAGEMENT SYSTEM*");
			System.out.println("====================================================");
			System.out.println();
			System.out.println("===================================");
			System.out.println(" Copyright(C) 2008-2010 Dauji Vaid");
			System.out.println("===================================");
			System.out.println();
			Acceder.startFile();
			Acceder.loadData();
			System.out.println();
			System.out.println(" Please press enter to continue...");
			System.console().readLine();
			
// Prints the Main Menu options.

	printOptMain(Acceder);
	}
	
// Main Menu

	public static void printOptMain(startAcceder Acceder) throws
		Throwable {
			
// Idendtifies when to exit from the Main Menu.

		boolean stayFlag = false;
			while(stayFlag == false) {
				System.out.println();
				System.out.println();
				System.out.println("\t\t\t--------------------------------------------------");
				System.out.println("\t\t\t*PATHWAYS WORLD SCHOOL DATABASE MANAGEMENT SYSTEM*");
			    System.out.println("\t\t\t--------------------------------------------------");
				System.out.println(" \n\nChoose one of the following options\n");
				System.out.println();
				System.out.println(" 1. Admissions Management");
				System.out.println(" 2. Grades Management \n");
				System.out.println(" 0. Exit Program");
				System.out.println();
				System.out.println(" Type a number (1/2/0) and then hit enter... ");
		int choice = TextIO.getInt();
		switch (choice) {
			case 1: printOptstudent(Acceder); break;
			case 2: printOptstudentdashgrade(Acceder); break;
			case 0:
				
// Verify user input for exit.

			System.out.println("\n Are you sure you want to quit (y/n) ?");
			stayFlag = TextIO.getBoolean();
			break;
				}
			}
		Acceder.writeData();
		}
		
// Provides the menu for dealing with the Admissions Module.

	public static void printOptstudent(startAcceder Acceder) throws
		Throwable {
			boolean stayFlag = true;
				while(stayFlag) {
					System.out.println();
					System.out.println(" ---------------------");
					System.out.println(" ADMISSIONS MANAGEMENT\n");
					System.out.println(" ---------------------");
					System.out.println(" Choose one of the following options");
					System.out.println();
					System.out.println(" 1. Enroll a student");
					System.out.println(" 2. Search for an enrolled student");
					System.out.println(" 3. Remove an enrolled student");
					System.out.println(" 4. List all enrollled students");
					System.out.println(" 5. Remove all enrolled students");
					System.out.println(" 0. Main Menu");
					System.out.println();
					System.out.println(" Type a number and then hit enter...");
					System.out.println();
				int choice = TextIO.getInt();
				switch (choice) {
					case 1: Acceder.addstudentdash(); break;
					case 2: searchstudentdash(Acceder); break;
					case 3: delstudentdash(Acceder); break;
					case 4: Acceder.printstudent(); break;
					case 5: Acceder.removeAllstudentdash(); break;
					case 0: stayFlag = false; break;
				}
			}
			}
			
// Provides the menu for dealing with the Grading Module.

	public static void printOptstudentdashgrade(startAcceder Acceder) throws
		Throwable {
			boolean stayFlag = true;
			while(stayFlag) {
				System.out.println();
				System.out.println(" ------------------");
				System.out.println(" GRADING MANAGEMENT\n");
				System.out.println(" ------------------");
				System.out.println(" Choose one of the following options");
				System.out.println();
				System.out.println(" 1. Add Grades for a student");
				System.out.println(" 2. Search for student grades");
				System.out.println(" 3. Remove a student grade");
				System.out.println(" 4. List all students with their grades");
				System.out.println(" 5. Remove all students with thier grades");
				System.out.println(" 0. Main Menu");
				System.out.println();
				System.out.println(" Please type a number and then hit enter...");
				System.out.println();
				int choice = TextIO.getInt();
				switch (choice) {
					case 1: Acceder.addstudentdashgrade(); break;
					case 2: searchstudentdashgrade(Acceder); break;
					case 3: delstudentdashgrade(Acceder); break;
					case 4: Acceder.printstudentdashgrade(); break;
					case 5: Acceder.removeAllstudentdashgrade(); break;
					case 0: stayFlag = false; break;
					}		
				}
				}
				
// Provides the necessary user interaction to remove a student.

	public static void delstudentdash (startAcceder Acceder) {
		boolean stayFlag = true;
		while(stayFlag) {
			System.out.println(" -------------------------");
			System.out.println(" Please Select Your Choice");
			System.out.println(" -------------------------");
			System.out.println();
			System.out.println(" 1. Remove by entering Identification Number (ID)");
			System.out.println(" 2. Remove by entering Name");
			System.out.println(" 0. Go Back");
			System.out.println();
			System.out.println(" Please type a number and then hit enter... \n");
			int choice = TextIO.getInt();
			boolean remove;
				switch(choice) {
				case 1:
				System.out.println(" Please enter the Identification Number (ID) to remove : \n");
				int id = TextIO.getInt();
				System.out.println(" Is this the correct entry to remove (y/n) ?");
				Acceder.printstudent(Acceder.searchstudentdash(id));
				remove = TextIO.getBoolean();
				if(remove) Acceder.removestudentdash(id);
				stayFlag = false;
				break;
				case 2:
				System.out.println(" Please enter the student name to remove : \n");
				String name = System.console().readLine();
				System.out.println(" Is this the correct entry to remove (y/n) ?");
				Adm removestudentdash = Acceder.searchstudentdash(name);
				Acceder.printstudent(removestudentdash);
				remove = TextIO.getBoolean();
				if(remove)
				Acceder.removestudentdash(removestudentdash.idKey);
				stayFlag = false;
				break;
				case 0: stayFlag = false; break;
				}
		}
	}
	
// Provides the necessary user interaction to remove a student grade.

	public static void delstudentdashgrade (startAcceder Acceder) {
		boolean stayFlag = true;
		while(stayFlag) {
			System.out.println(" -------------");
			System.out.println(" Please select");
			System.out.println(" -------------");
			System.out.println();
			System.out.println(" 1. Remove by entering Grading Identification Number (GID)");
			System.out.println(" 2. Remove by entering Name");
			System.out.println(" 0. Go Back");
			System.out.println();
			System.out.println(" Type a number and then hit enter... \n");
			int choice = TextIO.getInt();
			boolean remove;
		switch(choice) {
			case 1:
			System.out.println(" Please enter the Grading Identification Number (GID) to remove : \n");
			int id = TextIO.getInt();
			System.out.println(" Is this the correct entry to remove (y/n) ?");
			Acceder.printstudentdashgrade(Acceder.searchstudentdashgrade(id));
			remove = TextIO.getBoolean();
			if(remove) Acceder.removestudentdashgrade(id);
			stayFlag = false;
			break;
			case 2:
			System.out.println(" Please enter the student name of whose marks are to be removed : \n");
			String name = System.console().readLine();
			System.out.println(" Is this the correct entry to remove (y/n) ?");
			Gra removestudentdashgrade = Acceder.searchstudentdashgrade(name);
			Acceder.printstudentdashgrade(removestudentdashgrade);
			remove = TextIO.getBoolean();
			if(remove)
			Acceder.removestudentdashgrade(removestudentdashgrade.idKey);
			stayFlag = false;
			break;
			case 0: stayFlag = false; break;
		}
		}
	}
	
// Provides the necessary user interaction to search for a student.

	public static void searchstudentdash (startAcceder Acceder) {
		boolean stayFlag = true;
		while(stayFlag) {
			System.out.println(" -------------");
			System.out.println(" Please select");
			System.out.println(" -------------");
			System.out.println();
			System.out.println(" 1. Search by entering Identification Number (ID)");
			System.out.println(" 2. Search by enteringb Name");
			System.out.println(" 0. Go Back");
			System.out.println();
			System.out.println(" Please type a number and then hit enter... \n");
			int choice = TextIO.getInt();
		switch(choice) {
			case 1:
			System.out.println(" Please enter the Identification Number (ID) to search : \n");
			int id = TextIO.getInt();
			Acceder.printstudent(Acceder.searchstudentdash(id));
			stayFlag = false;
			break;
			case 2:
			System.out.println(" Please enter the student name to search : \n");
			String name = System.console().readLine();
			Acceder.printstudent(Acceder.searchstudentdash(name));
			stayFlag = false;
			break;
			case 0: stayFlag = false; break;
		}
		}
	}
	
// Provides the necessary user interaction to search for a student grade.

	public static void searchstudentdashgrade (startAcceder Acceder) {
		boolean stayFlag = true;
		while(stayFlag) {
			System.out.println(" -------------");
			System.out.println(" Please select");
			System.out.println(" -------------");
			System.out.println();
			System.out.println(" 1. Search by entering Grading Identification Number (GID)");
			System.out.println(" 2. Search by entering Name");
			System.out.println(" 0. Go Back");
			System.out.println();
			System.out.println(" Type a number and then hit enter... \n");
			int choice = TextIO.getInt();
		switch(choice) {
		case 1:
		System.out.println(" Please enter the Grading Identification Number (GID) to search : \n");
		int id = TextIO.getInt();
		Acceder.printstudentdashgrade(Acceder.searchstudentdashgrade(id));
		stayFlag = false;
		break;
		case 2:
		System.out.println(" Please enter the student name whose grades are to be searched : \n");
		String name = System.console().readLine();
		Acceder.printstudentdashgrade(Acceder.searchstudentdashgrade(name));
		stayFlag = false;
		break;
		case 0: stayFlag = false; break;
		}
		}
	}
}

									/*
									$$$$$$$$$$$$$$$$$$$$$$$$
									   CLASS: password 
									$$$$$$$$$$$$$$$$$$$$$$$$
									*/

// secure login method begins

class password												
{
	public void pass() throws IOException													
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int a;
    	
    		System.out.println("\n\n");
    		System.out.println("\t\t\t*PATHWAYS WORLD SCHOOL DATABASE MANAGEMENT SYSTEM*");
    		System.out.println("\t\t\t--------------------------------------------------");    		
    		
    		int p=0,n=0,u=0,chck=0;																											
    		for (n=3;n>-1;n--)																								
    			{																											
    				System.out.print("\t\t\n   Enter User Code (ONLY DIGITS ALLOWED): ");								
    				u=Integer.parseInt(in.readLine());
    			//	p=TextIO.getInt();																		
    				System.out.print("\t\t\n   Enter Password (ONLY DIGITS ALLOWED): ");    														
    				p=Integer.parseInt(in.readLine());
    			//	p=TextIO.getInt();																		
    					if (u==123 && p==456)																				//		Password Protection
    					{    																								//		Password Protection
    						System.out.println("\n\tUser ID & Password Accepted");											//		Password Protection
    						break;																							
    					}																								
    					else
    					{ 																								
    						System.out.print("\n\tAccess Denied! (User ID & Password do not match) No of tries left: ");	
    						System.out.print(n);																			
    						System.out.println("  ");
    						chck=chck+1;
    						if (chck==4)
    						{
    							System.exit(0);
    						}
    					}
																	
            	}			
	}
}

									/*
									$$$$$$$$$$$$$$$$$$$$$$$$
									   CLASS: startACCEDER 
									$$$$$$$$$$$$$$$$$$$$$$$$
									*/
class startAcceder {
	
// Holds the file names for the two data files

	final String FileNamestudent = "admissions.db";
	final String FileNamestudentdashgrade = "grades.db";
	RandomAccessFile admn;
	RandomAccessFile grad;
	Adm mystudentdash;
	
// Creates a new empty LinkList for 'Admn'

	LinkList Admn = new LinkList();
	Gra mystudentdashgrade;
	
// Creates a new empty Link List for 'Gra'.

	LinkList Grad = new LinkList();
	
// Creates Instances of the necessary Random Access Files.

	public void startFile() {
	try {
		admn = new RandomAccessFile(FileNamestudent,"rw");
		grad = new RandomAccessFile(FileNamestudentdashgrade, "rw");
	}
	catch (IOException ioe) {
	System.err.println(ioe);
	}
	}
	
// Calls the necessary methods to load the data into the LinkLists.

	public void loadData() throws Throwable {
		System.out.println(" Loading data from the database... ");
		System.out.println();
		loadstudentdashgrade();
		loadstudentdash();
	}
	
// Calls the necessary methods to write the data from the LinkList to the RandomAccessFile.

	public void writeData() {
		System.out.println(" Writing to the database...");
		writestudentdashgrade();
		writestudentdash();
	}
	
// Loads the data from the 'Gra' File to the Link List.

	public void loadstudentdashgrade() {
		Gra readstudentdashgrade = new Gra();
		long Ref;
		try{
			grad.seek(0);
			
// Read number of entries stored in file.

			int numberOf = grad.readInt();
			for(long i = 0; i < numberOf; i++) {
				readstudentdashgrade = new Gra();
				
// Read the ID key for the current 'Gra'.

				readstudentdashgrade.idKey = grad.readInt();
				
// Read the reference to the position on the file where the data for this entry is stored.

				Ref = (long)grad.readInt();
				grad.seek(Ref);
				
// Read all the other details of the 'Gra'.

				readstudentdashgrade.readFile(grad, Ref);
				
// Add the 'Gra' to the Link List.

				Grad = readstudentdashgrade.addstudentdashgrade(Grad);
				
// Seek to the next position of the ID key.

				grad.seek((8*i)+12);
			}
			System.out.println(" Grading data loaded, "+numberOf+" entries loaded...");
		}
		catch (IOException ioe) {
			System.err.println(" Grading file empty, no data loaded...");
		}
	}
// Loads the data from the 'Adm' File to the Link List. Similar to loadstudentdashgrade()

	public void loadstudentdash() {
		Adm readstudentdash = new Adm();
		long Ref;
		try{
			admn.seek(0);
			
// Read number of entries stored in file.

			int numberOf = admn.readInt();
			for(long i = 0; i < numberOf; i++) {
				readstudentdash = new Adm();
				
// Read the ID key for the current 'Adm'.

				readstudentdash.idKey = admn.readInt();
				
// Read the reference to the position on the file where the data for this entry is stored.

				Ref = (long)admn.readInt();
				admn.seek(Ref);
				
// Read all the other details of the 'Adm'.

				readstudentdash.readFile(admn, Ref);
				Admn = readstudentdash.addstudentdash(Admn);
				
// Seek to the next position of the ID key.

				admn.seek((8*i)+12);
			}
			System.out.println(" Admission data loaded, "+numberOf+" entries loaded...");
			}
		catch (IOException ioe) {
			System.err.println(" Admissions file empty, no data loaded...");
		}
		catch (myExceptions mEE) {
		System.err.println();
		System.err.println(" Admissions file CORRUPT! Please DELETE the data file & restart Acceder 1.5...");
		}
	}
	
// Writes the data from the Link List to the 'Gra' File.

	public void writestudentdashgrade() {
		try{
			
// Checks to see if there is data in the Link List.

			if(Grad.isEmpty()) {
			grad.seek(0);
			
// Writes an empty file and throws an exception if there is no data.

			grad.writeInt(0);
			throw new myExceptions().new LinkedListEmptyException();
			}
			
// Create a non-null 'Gra' to call methods.

		Gra validObj = (Gra)Grad.getLast();
		Gra array[] = new Gra[Grad.getSize()];
		
// Save the Link List as an array.

		array = validObj.toArray(Grad);
		
// Creates an array of Reference positions to write to the file later on.

		int REF[] = new int[Grad.getSize()];
		grad.seek(0);
		
// Writes the number of entries contained in the file.

		grad.writeInt(Grad.getSize());
		
// Seeks to the start of data and writes all the students grade.

		grad.seek((REF.length*8)+4);
		for(long i=0; i < array.length; i++) {
			int pos = (int) i;
			
// Stores the pointer position in the Reference array.

			REF[pos] = (int)grad.getFilePointer();
			array[pos].writeFile(grad);
		}
		
// Seek to the position to write the ID key followed by the reference to the data.

		grad.seek(4);
			for(long i=0; i < REF.length; i++) {
			grad.writeInt(array[(int)i].idKey);
			grad.writeInt(REF[(int)i]);
			}
		}
		catch (IOException ioe) {
			System.err.println(ioe);
		}
		catch (myExceptions.LinkedListEmptyException llee) {
			System.err.println("There is no Grading data to write...");
		}
	}
	
// Writes the data from the Link List to the 'Admn' File. Similar to writestudentdashgrade()

	public void writestudentdash() {
		try{
			
// Checks to see if there is data in the Link List.

			if(Admn.isEmpty()) {
				admn.seek(0);
				
// Writes an empty file and throws an exception if there is no data.

				admn.writeInt(0);
				throw new myExceptions().new LinkedListEmptyException();
			}
			
// Create a non-null 'Adm' to call methods.

			Adm validObj = (Adm)Admn.getLast();
			Adm array[] = new Adm[Admn.getSize()];
			
// Save the Link List as an array.

			array = validObj.toArray(Admn);
			
// Creates an array of Refernce positions to write to the file later on.

			int REF[] = new int[Admn.getSize()];
			admn.seek(0);
			
// Writes the number of entries contained in the file.

			admn.writeInt(Admn.getSize());
			
// Seeks to the start of data and writes all the students.

			admn.seek((REF.length*8)+4);
			for(long i=0; i < array.length; i++) {
				int pos = (int) i;
				
// Stores the pointer position in the Reference array.

				REF[pos] = (int)admn.getFilePointer();
				long seek = array[pos].writeFile(admn);
				admn.seek(seek);
			}
			
// Seek to the position to write the ID key followed by the reference to the data.

		admn.seek(4);
			for(long i=0; i < REF.length; i++) {
				admn.writeInt(array[(int)i].idKey);
				admn.writeInt(REF[(int)i]);
			}
			}
		catch (IOException ioe) {
			System.err.println(ioe);
		}
		catch (myExceptions.LinkedListEmptyException llee) {
			System.err.println("There is no Admissions data to write...");
		}
	}
	
/*############# HL MASTERY SEARCHIG IN RandomAccessFile #############
 
  ############# SL MASTERY User Defined method with return value (counts as 3 aspects) #############
  
  Searches for a student grade in the RandomAccessFile based on the provided ID key.*/
 
	public Gra searchstudentdashgrade(int idKey) {
		
// Write changes in 'Gra' to the file.

		writestudentdashgrade();
		Gra result = new Gra();
		try {
			grad.seek(0);
			
// Read the number of entries stored in the file.

			int RAFsize = grad.readInt();
			int idKeyIndex[] = new int[RAFsize];
			
// Create an array of ID keys from the file.

			for(int i=0; i < RAFsize; i++) {
				idKeyIndex[i] = grad.readInt();
				grad.seek((8*i)+12);
			}
			
// Search for the ID key, returns the position of the key.

			int resultIndex = Search.Search(idKeyIndex, idKey);
			
// If the key was not found throw an exception.

			if(resultIndex < 0) throw new myExceptions().new SearchResultException();
			
// Seek the the correct place of the result and reads the ID key and reference.

			grad.seek((8*resultIndex)+4);
			result.idKey = grad.readInt();
			int indexRef = grad.readInt();
			
// Read the remaining data from the RAF.

			result.readFile(grad, indexRef);
			return result;
		}
		catch (IOException ioe) {
			System.err.println(ioe);
		}
		catch (myExceptions.SearchResultException sre) {
			sre.toString(idKey);
		}
		return result;
	}
	
/*############# HL MASTERY SEARCHIG IN RandomAccessFile #############
 
Searches for a Adm in the RandomAccessFile based on the provided String 'Name'. Similar to searchstudentdashgrade()*/

	public Gra searchstudentdashgrade(String Name) {
		
	// Write changes in 'Gra' to the file.
	
		writestudentdashgrade();
		Gra result = new Gra();
		try {
			grad.seek(0);
			
// Read the number of entries stored in the file.

			int RAFsize = grad.readInt();
			String NameIndex[] = new String[RAFsize];
			int nextREF;
			
// Create an array of the Names from the file.

			for(int i=0; i < RAFsize; i++) {
				grad.seek(8*i+8);
				nextREF = grad.readInt();
				grad.seek(nextREF);
				grad.skipBytes(21);
				NameIndex[i] = grad.readUTF();
			}
			
// Search for the Name, returns the position of the result.

			int resultIndex = Search.Search(NameIndex, Name);
			
// If the name was not found throw an exception.

			if(resultIndex < 0) throw new myExceptions().new SearchResultException();
			
// Seek the the correct place of the result and reads the ID key and Reference.

			grad.seek((8*resultIndex)+4);
			result.idKey = grad.readInt();
			int indexRef = grad.readInt();
			
// Read the remaining data from the RAF.

			result.readFile(grad, indexRef);
			return result;
		}
		catch (IOException ioe) {
			System.err.println(ioe);
		}
		catch (myExceptions.SearchResultException sre) {
			System.err.println(sre);
		}
		return result;
	}
	
/*############# HL MASTERY SEARCHING IN RandomAccessFile #############
 
 Searches for a Adm in the RandomAccessFile based on the provided idKey. Similar to searchstudentdashgrade()*/
 
	public Adm searchstudentdash(int idKey) {
		
// Write changes in 'Admn' to the file.

		writestudentdash();
		Adm result = new Adm();
		try {
			admn.seek(0);
			
// Read the number of entries stored in the file.

			int RAFsize = admn.readInt();
			int idKeyIndex[] = new int[RAFsize];
			
// Create an array of ID keys from the file.

			for(int i=0; i < RAFsize; i++) {
				idKeyIndex[i] = admn.readInt();
				admn.seek((8*i)+12);
			}
			
// Search for the ID keys, returns the position of the key.

			int resultIndex = Search.Search(idKeyIndex, idKey);
			
// If the key was not found throws an exception.

			if(resultIndex < 0) throw new myExceptions().new
			SearchResultException();
			
// Seek the the correct place of the result and reads the ID key and Reference.

			admn.seek((8*resultIndex)+4);
			result.idKey = admn.readInt();
			int indexRef = admn.readInt();
			
// Read the remaining data from the RAF.

			result.readFile(admn, indexRef);
			return result;
		}
		catch (IOException ioe) {
			System.err.println(ioe);
		}
		catch (myExceptions.SearchResultException sre) {
			sre.toString(idKey);
		}
		catch (myExceptions mEE) {
		}
		return result;
	}
	
/*############# HL MASTERY SEARCHIG IN RandomAccessFile #############
 
 Searches for a 'Adm' in the RandomAccessFile based on the provided String 'Name'. Similar to searchstudentdash()*/
 
	public Adm searchstudentdash(String Name) {
		
// Write changes in 'Gra' to the file.

		writestudentdash();
		Adm result = new Adm();
		try {
			admn.seek(0);
			
// Read the number of entries stored in the file.

			int RAFsize = admn.readInt();
			String NameIndex[] = new String[RAFsize];
			int nextREF;
			
// Create an array of the Names from the file.

			for(int i=0; i < RAFsize; i++) {
				admn.seek(8*i+8);
				nextREF = admn.readInt();
				admn.seek(nextREF);
				admn.skipBytes(21);
				NameIndex[i] = admn.readUTF();
			}
			
// Search for the Name, returns the position of the result.

			int resultIndex = Search.Search(NameIndex, Name);
			
// If the name was not found throw an exception.

			if(resultIndex < 0) throw new myExceptions().new SearchResultException();
			
// Seek the the correct place of the result and read the ID key and Reference.

			admn.seek((8*resultIndex)+4);
			result.idKey = admn.readInt();
			int indexRef = admn.readInt();
			
// Read the remaining data from the RAF.

			result.readFile(admn, indexRef);
			return result;
		}
		catch (IOException ioe) {
			System.err.println(ioe);
		}
		catch (myExceptions.SearchResultException sre) {
			System.err.println(sre);
		}
		catch (myExceptions mEE) {
		}
		return result;
	}
	
// Removes a 'Gra' based on the ID key passed.

	public void removestudentdashgrade(int removeId) {
		boolean found = false;
		try {
			
// Search sequentially through the link list to find the ID key.

			Gra currentstudentdashgrade = (Gra)Grad.getFirst();
			for(int i=0; i < Grad.getSize(); i++) {
				currentstudentdashgrade = (Gra)Grad.getNext();
				
// Break the loop when the ID key has been found.

				if(currentstudentdashgrade.idKey == removeId) { found = true; break;}
			}
			
// Throws an exception if the ID key was not found

			if(found == false) { throw new myExceptions().new
			SearchResultException();}
			
// Calls the method to remove the ID key with confirmation and then confirms the removal of the ID key.

			else { Grad.removeCurrent(currentstudentdashgrade);
				System.out.println(" Removed idKey: "+removeId+" \n");}
		}
		catch (myExceptions.SearchResultException sre) {
			sre.toString(removeId);
		}
	}
	
// Removes all the students grades leaving an empty link list.

	public void removeAllstudentdashgrade() {
		
// User confirmation to remove all students grades

		System.out.println(" Are you sure you want to remove all student with their marks (y/n) ?");
		boolean remove = TextIO.getBoolean();
		
// Calls the method to remove all students grades if the user confirms

		if(remove) { Grad.removeAll();
			System.out.println(" All marks removed...\n");}
		System.out.println("\n Press Enter to continue...");
		System.console().readLine();
	}
	
// Removes a student based on the ID key passed. Similar to removestudentdashgrade()

	public void removestudentdash(int removeId) {
		boolean found = false;
		try {
			
// Search sequentially through the link list to find the ID key.

			Adm currentstudentdash = (Adm)Admn.getFirst();
			for(int i=0; i < Admn.getSize(); i++) {
				currentstudentdash = (Adm)Admn.getNext();
				
// Break the loop when the ID key has been found.

				if(currentstudentdash.idKey == removeId) {found = true; break;}
			}
			
// Throws an exception if the ID key was not found

			if(found == false) { throw new myExceptions().new SearchResultException();}
			
// Calls the method to remove the ID key with confirmation and then confirms the removal of the ID key.

			else { Admn.removeCurrent(currentstudentdash);
			System.out.println(" Removed Identification Number (ID): "+removeId+" \n");}
		}
		catch (myExceptions.SearchResultException sre) {
		sre.toString(removeId);
		}
	}
	
// Removes ALL the enrolled students leaving an empty link list. Similar to removeAllstudentdashgrade()

	public void removeAllstudentdash() {
		
// User confirmation to remove all enrolled students

		System.out.println(" Are you sure you want to remove all students enrolled (y/n) ?");
		boolean remove = TextIO.getBoolean();
		
// Calls the method to remove all enrolled students if the user confirms

		if(remove) { Admn.removeAll();
			System.out.println(" All enrolled students removed...");}
		System.out.println("\n Press Enter to continue...");
		System.console().readLine();
	}
	
// Prints a list of all the 'Admn' to the console

   public void printstudent() {
		System.out.println("\n");
		System.out.println(" Identification Number (ID)    Name    Form Teacher's Name    Dip./Certif.");
		System.out.println(" -------------------------------------------------------------------------\n");
		Adm currentstudentdash = (Adm)Admn.getFirst();
		while(currentstudentdash != null) {
			System.out.println("\n\n *"+currentstudentdash.idKey+" "+currentstudentdash.Name+" "+currentstudentdash.TName+" "+currentstudentdash.getLevel()+"\n");
			System.out.println();
			System.out.println(" Monday    Tuesday    Wednesdat    Thursday    Friday    Satuarday");
			System.out.print(" --------------------------------------------------------------------\n");
			Days currentDay = (Days)
			currentstudentdash.studentdashedDays.getFirst();
			int pass = 1;
			while(currentDay != null) {
				printDays(currentDay, pass);
				currentDay = (Days)
				currentstudentdash.studentdashedDays.getNext();
				pass ++;
			}
		currentstudentdash = (Adm)Admn.getNext();
		}
	Admn.getFirst();
	System.out.println("\n Press Enter to continue...");
	System.console().readLine();
	System.out.println("\n\n\n\n\n\n\n\n\n");
	}
	
// Prints only the student passed to the method

	public void printstudent(Adm currentstudentdash) {
		System.out.println("\n");
		System.out.println(" Identification Number (ID)    Name    Form Teacher's Name    Dip./Certif.");
		System.out.println(" -------------------------------------------------------------------------\n");
		System.out.println(" "+currentstudentdash.idKey+" "+currentstudentdash.Name+" "+currentstudentdash.TName+" "+currentstudentdash.getLevel()+"\n");
		System.out.println("\n");
		System.out.println(" Monday    Tuesday    Wednesday    Thursday    Friday    Satuarday");
		System.out.print(" ----------------------------------------------------------------------\n");
		Days currentDay = (Days)
		currentstudentdash.studentdashedDays.getFirst();
		int pass = 1;
		while(currentDay != null) {
			printDays(currentDay, pass);
			currentDay = (Days)
			currentstudentdash.studentdashedDays.getNext();
			pass ++;
		}
	}
	
// Used to print the Days on which a student has class and is supposed to come to school

	public void printDays(Days day, int pass) {
		System.out.print(" ");
		for(int i=0; i < day.Day-pass; i++) {
			System.out.print(" ");
		}
	day.printDay();
	}
	
// Prints a list of all the student grades to the console

	public void printstudentdashgrade() {
		System.out.println("\n");
		System.out.println(" Grading Identification Number (GID)    Adding Date    Type    Importance");
		System.out.println(" ------------------------------------------------------------------------");
		Gra currentstudentdashgrade = (Gra)Grad.getFirst();
		while(currentstudentdashgrade != null) {
			System.out.println(" "+currentstudentdashgrade.idKey+" "+currentstudentdashgrade.dateAdded.day+"/"+currentstudentdashgrade.dateAdded.month+"/"+currentstudentdashgrade.dateAdded.year+" "+currentstudentdashgrade.getType()+" "+currentstudentdashgrade.getImp()+"\n");
			System.out.println(" Name:"+currentstudentdashgrade.Name);
			System.out.println(" Marks Description:"+currentstudentdashgrade.Descp+"\n\n");
			currentstudentdashgrade = (Gra)Grad.getNext();
		}
		Grad.getFirst();
		System.out.println("\n Press Enter to continue...");
		System.console().readLine();
		System.out.println("\n\n\n\n\n\n\n\n\n");
	}
	
// Prints onlt the student grade passed to the method

	public void printstudentdashgrade(Gra currentstudentdashgrade) {
		System.out.println("\n");
		System.out.println(" Grading Identification Number (GID)    Adding Date    Type    Importance");
		System.out.println(" ------------------------------------------------------------------------");
		System.out.println(" "+currentstudentdashgrade.idKey+" "+currentstudentdashgrade.dateAdded.day+"/"+currentstudentdashgrade.dateAdded.month+"/"+currentstudentdashgrade.dateAdded.year+" "+currentstudentdashgrade.getType()+" "+currentstudentdashgrade.getImp()+"\n");
		System.out.println(" Name: "+currentstudentdashgrade.Name);
		System.out.println(" Marks Description:"+currentstudentdashgrade.Descp+"\n\n");
		System.out.println("\n Press Enter to continue...");
		System.console().readLine();
	}
	
// Used to call the necessary methods to enroll a student

	public void addstudentdash() {
		try {
			System.out.println(" -----------------");
			System.out.println(" Enrolling Student");
			System.out.println(" -----------------\n");
			
// Gets the input from the user

			mystudentdash = Terminal.getValstudentdash();
			
// Adds the student to the link list.

			Admn = mystudentdash.addstudentdash(Admn);
		}
		catch (myExceptions.KeyExistsException kee) {
			System.out.println(kee);
			System.out.println();
		}
		catch (myExceptions.KeyOutOfBoundsException koobe) {
			System.out.println(koobe);
		}
		catch (myExceptions.TimeFormatException tfe) {
			System.out.println(tfe);
		}
		catch (myExceptions.DaysOutOfBoundsException doobe) {
			System.out.println(doobe);
		}
		catch (myExceptions mEE) {
			System.out.println("UNKNOWN ERROR! record NOT added. For more infomation refer to User Documentation");
		}
	}
	
// Used to call the necessary methods to add a student grade

	public void addstudentdashgrade() {
		System.out.println(" Adding Grades for a Student");
		System.out.println(" -----------------------------\n");
		
// Gets the input fomr the user

		mystudentdashgrade = Terminal.getValstudentdashgrade();
		
// Adds the student grade to the link list

		Grad = mystudentdashgrade.addstudentdashgrade(Grad);
	}
}

									/*
									$$$$$$$$$$$$$$$$$$$$$$$$
									     CLASS: Terminal 
									$$$$$$$$$$$$$$$$$$$$$$$$
									*/
class Terminal {
	
// Provides an interface for the user to enter the enrolled student details.

	public static Adm getValstudentdash() throws myExceptions {
		Adm studentdashed = new Adm();
		System.out.println(" Student Identification Number (ID) ?\n");
		studentdashed.idKey = TextIO.getInt();
		
//################## HL MASTERY PARSING DATA STREAM ##################

		System.out.println(" Student Name ?\n");
		studentdashed.Name = System.console().readLine();
		System.out.println(" \nStudent Form Teacher's Name ?\n");
		studentdashed.TName = System.console().readLine();
		System.out.println(" \nIs the Student IB Diploma holder (y for Dip./n for Certif.)?\n");
		studentdashed.isHigher = TextIO.getBoolean();
		System.out.println(" \nHow many times a week is "+studentdashed.Name+" enrolled in this school ?\n");
		int numDays = TextIO.getInt();
		System.out.println(" \nYou will now enter the details for each day when "+studentdashed.Name+" is supposed to come to school\n");
		for(int i=0; i < numDays; i++) {
			Days currentDay = new Days();
			System.out.println(" \nWhich day is "+studentdashed.Name+" supposed to come (choose one for now) ?");
			System.out.println(" 1. Monday");
			System.out.println(" 2. Tuesday");
			System.out.println(" 3. Wednesday");
			System.out.println(" 4. Thursday");
			System.out.println(" 5. Friday");
			System.out.println(" 6. Saturday\n");
			currentDay.Day = TextIO.getInt();
			System.out.println(" \nAt what time is he supposed to report on "+currentDay.getDay()+"s at school (24-hour clock) ?");
			System.out.println(" Example -> 0930 = 9 h30 m");
			
// Formats the input as time.

			currentDay.Start.makeTime(TextIO.getInt());
			System.out.println(" \nAt what time can he leave the school on "+currentDay.getDay()+"s (24-hour clock) ?");
			System.out.println(" Example -> 0930 = 9 h30 m");
			
// Formats the input as time.

			currentDay.End.makeTime(TextIO.getInt());
			if(i==0) { studentdashed.studentdashedDays = new LinkList(currentDay);}
			else { studentdashed.studentdashedDays = currentDay.addDays(studentdashed.studentdashedDays);}
		}
	return studentdashed;
	}
	
// Provides an interface for the user to enter the student grade details.

	public static Gra getValstudentdashgrade() {
		Gra graders = new Gra();
		System.out.println(" Student Marks Grading Identification Number (GID) number ?\n");
		graders.idKey = TextIO.getInt();
		
//################## HL MASTERY PARSING DATA STREAM ##################

		System.out.println(" Student Name ?\n");
		graders.Name = System.console().readLine();
		System.out.println(" Subject Grades with description (add as many subjects required by using ';') ?\n");
		graders.Descp = System.console().readLine();
		System.out.println(" Date of Adding (i.e. Today's date) (dd mm yyyy) ?");
		System.out.println(" Example -> 01012010");
		int date = TextIO.getInt();
		
// Formats the input as a Date.

		graders.dateAdded.makeDate(date);
		System.out.println(" Type of task for which grades are provided (choose one)?");
		System.out.println(" 1. Homework ");
		System.out.println(" 2. Assignment ");
		System.out.println(" 3. Test ");
		System.out.println(" 4. Internal Assesment");
		System.out.println(" 5. Examination ");
		graders.Type = TextIO.getInt()-1;
		System.out.println(" Importance of task for which grades are provided (choose one)?");
		System.out.println(" 1. Low");
		System.out.println(" 2. Medium");
		System.out.println(" 3. High");
		graders.Imp = TextIO.getInt()-1;
		graders.isComplete = false;
		return graders;
	}
}

									/*
									$$$$$$$$$$$$$$$$$$$$$$$$
									   CLASS: myExceptions  
									$$$$$$$$$$$$$$$$$$$$$$$$
									*/
									
//################## HL MASTERY INHERITANCE ##################
									
class myExceptions extends Exception{
	public String toString() {
	return "Fatal Error!";
	}
	
/*---------------------
ID KEY EXISTS EXCEPTION
-----------------------*/

class KeyExistsException extends myExceptions {
	int idKey;
	KeyExistsException (int key) {
	idKey = key;
	}
	public String toString() {
	return "The ID key "+idKey+" already exists, please use another key!";
	}
}

/*----------------------------
ID KEY OUT OF BOUNDS EXCEPTION
------------------------------*/

class KeyOutOfBoundsException extends myExceptions {
	KeyOutOfBoundsException () {
	}
	public String toString() {
		return "The ID key should be a value between 1 & 999, please try again with another key!";
	}
}

/*-------------------
DATE FORMAT EXCEPTION
---------------------*/

class DateFormatException extends myExceptions {
	DateFormatException () {
	}
	public String toString() {
		return "The date is in the wrong format! Please enter the date as 'ddmmyyyy'";
	}
}

/*--------------------------
STUDENT GRADE TYPE EXCEPTION
----------------------------*/

class studentdashgradeTypeException extends myExceptions {
	studentdashgradeTypeException () {
	}
	public String toString() {
		return "The task type should be a value between 1 & 5! Please try again.";
	}
}

/*-------------------------
STUDENT GRADE IMP EXCEPTION
---------------------------*/

class studentdashgradeImpException extends myExceptions {
	studentdashgradeImpException () {
	}
	public String toString() {
		return "Importance should be between 1 & 3! Please try again.";
	}
}

/*-------------------
TIME FORMAT EXCEPTION
--------------------*/

class TimeFormatException extends myExceptions {
	TimeFormatException () {
	}
		public String toString() {
		return "The time needs to be entered as '0930' in 24 hour format";
		}
}

/*--------------------------
DAYS OUT OF BOUNDS EXCEPTION
----------------------------*/

class DaysOutOfBoundsException extends myExceptions {
	DaysOutOfBoundsException () {
	}
		public String toString() {
			return "Days on which you have Adm has to be between 1 & 6! Please try again.";
		}
}

/*-------------------------
LINKED LIST EMPTY EXCEPTION
---------------------------*/

class LinkedListEmptyException extends myExceptions {
	LinkedListEmptyException () {
	}
		public String toString() {
			return "ERROR! There is no data to write or read from!";
		}
}

/*---------------------
SEARCH RESULT EXCEPTION
-----------------------*/

class SearchResultException extends myExceptions {
	SearchResultException () {
	}
		public String toString(int searchVal) {
			return "The value "+searchVal+" was NOT found in the DATABASE!";
	}
}
}

									/*
									$$$$$$$$$$$$$$$$$$$$$$$$
									     CLASS: Adm 
									$$$$$$$$$$$$$$$$$$$$$$$$
									*/
									
class Adm {
	
/** Contains all necessary data members and methods to work with
the Admn Module.
*
* @param ID Key- The key field.
* @param Name- The name of the enrolled student.
* @param TName- The form teacher's name.
* @param isHigher- True for a diploma student.
* @param studentdashedDays- Link List of days which each have information about which days have school at what time.
*/

	int idKey;
	String Name; String TName;
	boolean isHigher;
	LinkList studentdashedDays = new LinkList();
	
// Calls methods to verify input data and places the new entry into the correct
// position in the link list

public LinkList addstudentdash(LinkList Admn) {
	try{
		
// Verifies the 'studentdashed'.

		this.verifystudentdash();
		Adm checkstudentdash = (Adm)Admn.getFirst();
		
// Makes a new link lis with a single entry if the link list is empty.

		if(Admn.isEmpty()) { Admn = new
		LinkList(this); }
		
// If the idKey is < the first entry inserts the studentdashed to the head of the Link List.

		else if(this.idKey <= checkstudentdash.idKey) {
			if(this.idKey == checkstudentdash.idKey) { throw
			new myExceptions().new KeyExistsException(this.idKey);}
			else { Admn.addHead(this);}
		}
		
// Otherwise keeps seeking until it find the right position or the end of the link list.

		else {
			while(checkstudentdash != null) {
				checkstudentdash = (Adm)Admn.getNext();
				if(checkstudentdash == null)
				{ Admn.addTail(this);}
				
//--------Till Here------------

			else if(this.idKey == checkstudentdash.idKey) { throw new myExceptions().new KeyExistsException(this.idKey);}
			else if(this.idKey < checkstudentdash.idKey)
			{ Admn.addBefore(this); break;}
			}
		}
	}
	catch (myExceptions.KeyExistsException kee) {
		System.out.println(kee);
		System.out.println();
	}
	catch (myExceptions.KeyOutOfBoundsException koobe) {
		System.out.println(koobe);
	}
	catch (myExceptions.TimeFormatException tfe) {
		System.out.println(tfe);
	}
	catch (myExceptions.DaysOutOfBoundsException doobe) {
		System.out.println(doobe);
	}
	catch (myExceptions mEE) {
		System.out.println("UNKNOWN ERROR! record NOT added. For more information refer to User Documentation");
	}
	return Admn;
}

/* Uses the link list method of converting to an array and casts every object
   as a 'Adm' to arrive at an array of Adm[] instead of Object[]*/

	public Adm[] toArray(LinkList list) {
		Object admn[] = new Object[list.getSize()];
		admn = list.toArray();
		Adm returnstudentdash[] = new Adm[admn.length];
		for(int i=0; i < admn.length; i++) {
			
// Each value in the Object[] array is cast as a 'Adm'.

		returnstudentdash[i] = (Adm) admn[i];
		}
return returnstudentdash;
	}	
		
/*################## HL MASTERY ADDING TO RandomAccessFile ##################
 Writes the 'Adm' details of a 'studentdashed' to the file (except the idKey)*/

	public long writeFile(RandomAccessFile file) throws IOException,
		myExceptions.LinkedListEmptyException {
		long seekReturn = 0;
		file.writeBoolean(this.isHigher);
		file.writeUTF(this.Name);
		file.writeUTF(this.TName);
		
// Writes the data for the link list of days for this 'studentdashed'.

		long seek = file.getFilePointer();
		if(this.studentdashedDays.isEmpty()) throw new
		myExceptions().new LinkedListEmptyException();
		Days validObj = (Days)this.studentdashedDays.getLast();
		Days array[] = new Days[this.studentdashedDays.getSize()];
		array = validObj.toArray(this.studentdashedDays);
		int REF[] = new int[this.studentdashedDays.getSize()];
		file.writeInt(this.studentdashedDays.getSize());
		file.seek((REF.length*8)+4+seek);
		for(long i=0; i < array.length; i++) {
			int pos = (int) i;
			REF[pos] = (int)file.getFilePointer();
			array[pos].writeFile(file);
			seekReturn = file.getFilePointer();
		}
		file.seek(seek+4);
		for(long i=0; i < REF.length; i++) {
			file.writeInt(array[(int)i].Day);
			file.writeInt(REF[(int)i]);
		}
	return seekReturn;
}

/*################### HL MASTERY READING FROM RandomAccessFile ###################
 Reads the Adm details of a studentdashed from the file at the seek position (except the ID key).*/
 
	public void readFile(RandomAccessFile file, long OrigSeek) throws
		IOException, myExceptions {
		file.seek(OrigSeek);
		this.isHigher = file.readBoolean();
		this.Name = file.readUTF();
		this.TName = file.readUTF();
		
// Reads the data for the link list of days for this student.

		long seek = file.getFilePointer();
		Days readDays = new Days();
		long Ref;
		file.seek(seek);
		int numberOf = file.readInt();
		for(long i = 0; i < numberOf; i++) {
			readDays = new Days();
			readDays.Day = file.readInt();
			Ref = (long)file.readInt();
			file.seek(Ref);
			readDays.readFile(file, Ref);
			this.studentdashedDays = readDays.addDays(this.studentdashedDays);
			file.seek((8*i)+12);
		}
		}
		
// Returns the String denoting the level of the student.

	public String getLevel() {
			String level = "Certificate Student";
			if(this.isHigher) level = "Diploma Student";
		return level;
	}
	
// Verifies the data of a particular student and throws an exception if it is not acceptable.

	public void verifystudentdash() throws myExceptions {
		if(this.idKey > 999 || this.idKey < 1) throw new
		myExceptions().new KeyOutOfBoundsException();
		Days nextDays = (Days)this.studentdashedDays.getFirst();
		while(nextDays != null)
		{
			nextDays.verifyDays();
			nextDays = (Days)this.studentdashedDays.getNext();
		}
		}
}

									/*
									$$$$$$$$$$$$$$$$$$$$$$$$
									     CLASS: Gra 
									$$$$$$$$$$$$$$$$$$$$$$$$
									*/
									
//################## SL MASTERY User Defined Objects ##################

class Gra {
	
/** Contains all necessary data members and methods to work with
the Grading Module.
*
* @param ID key- The key field.
* @param Name- The name of the student whose is graded.
* @param Descp- Student grading and description of the grades.
* @param Type- The type of task for which grades are provided.
* @param Imp-  The importance of the task for which grades are provided.
* @param dateAdded- The Date of adding the grades for the particular task.
*/

	String Name; String Descp;
	int Type; int Imp; int idKey;
	int studentdashedKey;
	Date dateAdded = new Date();
	boolean isComplete;
	
// Calls methods to verify input data and places the new entry into the correct
// position in the link list

	public LinkList addstudentdashgrade(LinkList Grad) {
		try{
			this.verifystudentdashgrade();
			Gra checkstudentdashgrade = (Gra)Grad.getFirst();
			if(Grad.isEmpty()) { Grad = new LinkList(this);}
			else if(this.idKey <= checkstudentdashgrade.idKey) {
			if(this.idKey == checkstudentdashgrade.idKey) { throw new
			myExceptions().new KeyExistsException(this.idKey);}
			else { Grad.addHead(this);}
			}
			else {
				while(checkstudentdashgrade != null) {
					checkstudentdashgrade = (Gra)Grad.getNext();
					if(checkstudentdashgrade == null)
					{ Grad.addTail(this);}
					else if(this.idKey == checkstudentdashgrade.idKey)
					{ throw new myExceptions().new KeyExistsException(this.idKey);}
					else if(this.idKey < checkstudentdashgrade.idKey)
					{ Grad.addBefore(this); break;}
				}
			}
		}
		catch (myExceptions.KeyExistsException kee) {
			System.out.println(kee);
			System.out.println();
		}
		catch (myExceptions.KeyOutOfBoundsException koobe) {
			System.out.println(koobe);
		}
		catch (myExceptions.studentdashgradeTypeException hte) {
			System.out.println(hte);
		}
		catch (myExceptions.studentdashgradeImpException hie) {
			System.out.println(hie);
		}
		catch (myExceptions.DateFormatException dfe) {
			System.out.println(dfe);
		}
		catch (myExceptions mEE) {
			System.out.println("UNKNOWN ERROR! record NOT added. For more information refer to User Documentation");
		}
		return Grad;
	}
	
// Uses the link list method of converting to an array and casts every object
// as a student grade to arrive at an array of Gra[] instead of Object[]

	public Gra[] toArray(LinkList list) {
		Object studentdashedgradea[] = new Object[list.getSize()];
		studentdashedgradea = list.toArray();
		Gra returnstudentdashgrade[] = new Gra[studentdashedgradea.length];
		for(int i=0; i < studentdashedgradea.length; i++) {
		returnstudentdashgrade[i] = (Gra) studentdashedgradea[i];
		}
		return returnstudentdashgrade;
	}
	
/*################## HL MASTERY ADDING TO RandomAccessFile ##################
 Writes the student grade details of a studentdashed to the file (except the ID key)*/

	public void writeFile(RandomAccessFile file) throws IOException {
		file.writeInt(this.dateAdded.day);
		file.writeInt(this.dateAdded.month);
		file.writeInt(this.dateAdded.year);
		file.writeInt(this.Imp);
		file.writeInt(this.Type);
		file.writeBoolean(this.isComplete);
		file.writeUTF(this.Name);
		file.writeUTF(this.Descp);
	}
	
/*################## HL MASTERY READING FROM RandomAccessFile ##################
 Reads the student grade details of a 'studentdashed' from the file at the seek position (except the ID key).*/

	public void readFile(RandomAccessFile file, long seek) throws
		IOException {
			file.seek(seek);
			this.dateAdded.day = file.readInt();
			this.dateAdded.month = file.readInt();
			this.dateAdded.year = file.readInt();
			this.Imp = file.readInt();
			this.Type = file.readInt();
			this.isComplete = file.readBoolean();
			this.Name = file.readUTF();
			this.Descp = file.readUTF();
		}
		
// Returns the string value of the type of task for which student is graded.

	public String getType() {
		String type = new String();
		switch (this.Type) {
			case 0: type = "Homework "; break;
			case 1: type = "Assignment "; break;
			case 2: type = "Test "; break;
			case 3: type = "Internal Assesment"; break;
			case 4: type = "Examination "; break;
		}
		return type;
	}
	
// Returns the string value of the Imprtance of of task for which student is graded.

	public String getImp() {
		String importance = new String();
		switch (this.Imp) {
			case 0: importance = "Low"; break;
			case 1: importance = "Medium"; break;
			case 2: importance = "High"; break;
		}
	return importance;
	}
	
// Verifies the data of a particular student grade info and throws an exception if it is not acceptable.

	public void verifystudentdashgrade() throws myExceptions {
		if(this.idKey < 1 || this.idKey > 999) throw new myExceptions().new KeyOutOfBoundsException();
		if(this.Type > 4 || this.Type < 0) throw new myExceptions().new studentdashgradeTypeException();
		if(this.Imp > 2 || this.Imp < 0) throw new myExceptions().new studentdashgradeImpException();
		this.dateAdded.verifyDate();
	}
}

									/*
									$$$$$$$$$$$$$$$$$$$$$$$$
									     CLASS: Date 
									$$$$$$$$$$$$$$$$$$$$$$$$
									*/
									
class Date {
	
/** Works with date for use in dueDates
*
* @param day- Day of the month.
* @param month- Month of the year.
* @param year- Year in the form: 2010
*/

	int day;
	int month;
	int year;
	
// Format a number in the form 01012010 into a date.

	public void makeDate(int date) {
		this.day = date/1000000;
		this.month = (date/10000)-(this.day*100);
		this.year = date-((this.day*1000000)+(this.month*10000));
	}
	
// Returns whether or a not a date is before another date.

	public boolean isBefore(Date date1, Date date2) {
		boolean isBefore ;
		if(date1.year < date2.year) {isBefore = true;}
		else if(date1.year == date2.year) {
		if(date1.month < date2.month) {isBefore = true;}
		else if(date1.month == date2.month) {
		if(date1.day < date2.day) {isBefore = true;}
		else {isBefore = false;}
		}
		else {isBefore = false;}
		}
		else {isBefore = false;}
		return isBefore;
	}
	
// Verify the input data.

	public void verifyDate() throws myExceptions {
		boolean isCorrect = true;
		if(this.day < 1) isCorrect = false;
		if(this.month <1 || this.month > 12) isCorrect = false;
		if(this.year <2001) isCorrect = false;
		if(this.month == 2) {
		if(this.year % 4 == 0 && this.day > 29) isCorrect = false;
		if(this.year % 4 != 0 && this.day > 28) isCorrect = false;
		}
		else {
			if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
			if(this.day > 31) isCorrect = false;
		}
		else if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
			if(this.day > 30) isCorrect = false;
		}
		}
		if(isCorrect == false) throw new myExceptions().new
		DateFormatException();
	}
}

									/*
									$$$$$$$$$$$$$$$$$$$$$$$$
									     CLASS: Days 
									$$$$$$$$$$$$$$$$$$$$$$$$
									*/
									
class Days {
	
/** Used to allocate the days of the week which there is must for student to attend school.
*
*
* @param Day- Day of the week. (eg. 0 = Monday)
* @param Start- Month of the year.
* @param End- Year in the form: 2010
*/

	int Day;
	Time Start = new Time();
	Time End = new Time();
	public void setNull(Days day) {
		day.Day = 0;
		Start.setNull();
		End.setNull();
	}
	
// Returns the string value of the day.

	public String getDay() {
		String day = new String();
		switch(this.Day) {
		case 1: day = "Monday "; break;
		case 2: day = "Tuesday "; break;
		case 3: day = "Wednesday"; break;
		case 4: day = "Thursday "; break;
		case 5: day = "Friday "; break;
		case 6: day = "Saturday "; break;
		}
	return day;
	}
	
// Print the start and end hours.

	public void printDay() {
		System.out.print(this.Start.hour+"h"+this.Start.minute+"m-"+this.End.hour+"h"+this.End.minute+"m");
	}
	
// Convert a link list of Days to an array.

	public Days[] toArray(LinkList list) {
		Object days[] = new Object[list.getSize()];
		days = list.toArray();
		Days returnDays[] = new Days[days.length];
		for(int i=0; i < days.length; i++) {
			returnDays[i] = (Days) days[i];
		}
		return returnDays;
	}
	
// Write the data to the file.

	public void writeFile(RandomAccessFile file) throws IOException {
		file.writeInt(this.Start.hour);
		file.writeInt(this.Start.minute);
		file.writeInt(this.End.hour);
		file.writeInt(this.End.minute);
	}
	
// Read the data from the file.

	public void readFile(RandomAccessFile file, long seek) throws
	IOException {
		file.seek(seek);
		this.Start.hour = file.readInt();
		this.Start.minute = file.readInt();
		this.End.hour = file.readInt();
		this.End.minute = file.readInt();
	}
	
// Add a day to the link list by verifying and adding it to the correct position.

	public LinkList addDays(LinkList studentdashedDays) throws myExceptions
	{
		Days checkDays = (Days)studentdashedDays.getFirst();
		if(studentdashedDays.isEmpty()) { studentdashedDays = new LinkList(this); }
		else if(this.Day <= checkDays.Day) {
		if(this.Day == checkDays.Day) { throw new
		myExceptions().new KeyExistsException(this.Day);}
		else { studentdashedDays.addHead(this);}
		}
		else {
			while(checkDays != null) {
				checkDays = (Days)studentdashedDays.getNext();
				if(checkDays == null)
				{ studentdashedDays.addTail(this);}
		else if(this.Day == checkDays.Day) { throw
		new myExceptions().new KeyExistsException(this.Day);}
		else if(this.Day < checkDays.Day)
		{ studentdashedDays.addBefore(this); break;}
			}
		}
	return studentdashedDays;
	}
	
// Verify the input data.

	public void verifyDays() throws myExceptions {
		if(this.Day >6 || this.Day < 1) throw new myExceptions().new DaysOutOfBoundsException();
		this.Start.verifyTime();
		this.End.verifyTime();
	}
}

									/*
									$$$$$$$$$$$$$$$$$$$$$$$$
									     CLASS: LINKLIST 
									$$$$$$$$$$$$$$$$$$$$$$$$
									*/
									
/*################## HL MASTERY POLYMORHPISM ##################
  ################## HL MASTERY 4x TIMES ABSTRACT DATA TYPE (ADT's) ##################
  ################## HL MASTERY 4x TIMES ABSTRACT DATA TYPE (ADT's) ##################
  ################## HL MASTERY 4x TIMES ABSTRACT DATA TYPE (ADT's) ##################
  ################## HL MASTERY 4x TIMES ABSTRACT DATA TYPE (ADT's) ##################*/
class LinkList {
	
/** Implements a Linked List using the List Item class.
*
* @param first- First ListItem in the List.
* @param last- Last ListItem in the list.
* @param current- The current ListItem.
* @param size- The size of the LinkList.
*/

	private ListItem first; 				// Reference to the Head of the list.
	private ListItem last; 					// Reference to the Tail of the list.
	private ListItem current; 				// Reference to the current node.
	private int size = 0; 					// Used to return the size of the list.
	
// Creates a list containing a null object. Constructor method.

	public LinkList() {
		first = new ListItem(null); 		// Sets the first to null.
		current = last = first; 			// Also sets last and current as there is only 1 item.
	}
	
// Creates a list containing a single object. Constructor method.

	public LinkList(Object item) {
		first = new ListItem(item);
		current = last = first;
		size = 1;
	}
	
// Creates a linked list of objects from any array. Constructor method.

	public LinkList(Object[] items) {
		
// Creates a single object link list

		first = new ListItem(items[0]);
		current = last = first;
		size = 1;
		
// Adds the other items to the new link list.

		for(int i = 1; i < items.length; i++) {
			addTail(items[i]);
		}
	}
	
// Adds an object to the Tail of the LinkList.

	public void addTail(Object item) {
		ListItem newEnd = new ListItem(item);
		last.setNext(newEnd);
		newEnd.setPrevious(last);
		size++;
		current = last = newEnd;
	}
	
// Adds an object to the Head of the LinkList.

	public void addHead(Object item) {
		ListItem newStart = new ListItem(item);
		first.setPrevious(newStart);
		newStart.setNext(first);
		size++;
		current = first = newStart;
	}
	
// Adds an object after the current item.

	public void addAfter(Object item) {
		ListItem newNext = new ListItem(item);
		current.getNext().setPrevious(newNext);
		newNext.setNext(current.getNext());
		newNext.setPrevious(current);
		current.setNext(newNext);
		size++;
	}
	
// Adds an object before the current item.

	public void addBefore(Object item) {
		ListItem newPrevious = new ListItem(item);
		current.getPrevious().setNext(newPrevious);
		newPrevious.setPrevious(current.getPrevious());
		newPrevious.setNext(current);
		current.setPrevious(newPrevious);
		size++;
	}
	
// Removes the current object in the LinkList.

	public void removeCurrent() {
		try{
			if(this.isEmpty()) throw new myExceptions().new LinkedListEmptyException();
			
// For when there is only 1 entry.

			if(current == last && current == first) {
			current.setNull();
			}
			
// If it is the last entry.

			else if(current == last) {
			current = last = current.getPrevious();
			current.setNext(null);
			}
			
// If it is the first entry.

			else if(current == first) {
			current = first = current.getNext();
			current.setPrevious(null);
			}
			
// If the entry is in any other position.

			else {
			current.getPrevious().setNext(current.getNext());
			current.getNext().setPrevious(current.getPrevious());
			current = current.getPrevious();
			}
			size--;
			}
		catch (myExceptions.LinkedListEmptyException llee) {
		System.err.println(llee);
		}
	}
	
// Used for safe removal of current student grade with the use of a check.

	public void removeCurrent(Gra checkstudentdashgrade) throws myExceptions.SearchResultException {
		Gra currentstudentdashgrade = (Gra) current.getObject();
		if(checkstudentdashgrade.idKey == currentstudentdashgrade.idKey)
		{ this.removeCurrent();}
		else { throw new myExceptions().new SearchResultException();}
	}
	
// Used for safe removal of current enrolled student with the use of a check.

	public void removeCurrent(Adm checkstudentdash) throws myExceptions.SearchResultException {
		Adm currentstudentdash = (Adm) current.getObject();
		if(checkstudentdash.idKey == currentstudentdash.idKey)
		{ this.removeCurrent();}
		else { throw new myExceptions().new SearchResultException();}
	}
	
// Removes all entries in the LinkList.

	public void removeAll () {
		int size = this.getSize();
		this.getFirst();
		for(int i=0; i < size; i++) {
			this.removeCurrent();
		}
	}
	
// Sets first as current and returns the object.

	public Object getFirst() {
		current = first;
		return first.getObject();
	}
	
// Sets last as current and returns the object.

	public Object getLast() {
		current = last;
		return last.getObject();
	}
	
// Sets next as current and returns the object.

	public Object getNext() {
		current = current.getNext();
		return current == null ? null : current.getObject();
	}
	
// Sets previous as current and returns the object.

	public Object getPrevious() {
		current = current.getPrevious();
		return current == null ? null : current.getObject();
	}
	
// Returns the size of the linked list.

	public int getSize() {
		return size;
	}
	
// Returns whether the linked list is empty.

	public boolean isEmpty() {
		boolean isEmpty;
		if(getSize() != 0)
		isEmpty = false;
		else
		isEmpty = true;
		return isEmpty;
	}
	
// Returns the linked list as an array of type Object.

	public Object[] toArray() {
		Object array[] = new Object[this.getSize()];
		try{
			if(this.isEmpty()) throw new myExceptions().new LinkedListEmptyException();
			int arrayPos = 0;
			Object nextItem = this.getFirst();
			array[arrayPos] = nextItem;
			for(int i=1; i < array.length; i++) {
				nextItem = this.getNext();
				array[i] = nextItem;
			}
		}
		catch (myExceptions.LinkedListEmptyException llee) {
			System.err.println(llee);
		}
	return array;
	}
}

									/*
									$$$$$$$$$$$$$$$$$$$$$$$$
									     CLASS: LISTITEM 
									$$$$$$$$$$$$$$$$$$$$$$$$
									*/
									
//################## HL MASTERY HIERARCHICAL COMPOSITE DATA STRUCTURE ##################

class ListItem {
	
/** Used to store each item in the Linked List.
*
* @param next- Pointer to next node.
* @param previous- Pointer to previous node.
* @param item- The item stored in the node.
*/

	ListItem next;
	ListItem previous;
	Object item;
	
// Used as a constructor.

	public ListItem(Object item) {
		this.item = item;
		next = previous = null;
	}
	
// Sets all values to null
// Used when emptying a linked list with a single item

	public void setNull() {
		this.next = null;
		this.previous = null;
		this.item = null;
	}
	
// Set the 'next' pointer to the given item.

	public void setNext(ListItem next) {
		this.next = next;
	}
	
// Set the 'previous' pointer to the given item.

	public void setPrevious(ListItem previous) {
		this.previous = previous;
	}
	
// Returns the 'next' item.

	public ListItem getNext() {
		return next;
	}
	
// Returns the 'previos' item.

	public ListItem getPrevious() {
		return previous;
	}
	
// Returns the object of this item.

	public Object getObject() {
		return item;
	}
}

									/*
									$$$$$$$$$$$$$$$$$$$$$$$$
									     CLASS: Sort 
									$$$$$$$$$$$$$$$$$$$$$$$$
									*/

class Sort {
	
// Used to pass the variables to the actual sorting algorithm.

	public static void Sort(int SortArray[]) {
		qs(SortArray, 0, SortArray.length-1);
	}
	
/** Carries out a quick sort on a sorted/unsorted array.
* @param SortArray[]- The array to sort.
* @param min- The least value in the array.
* @param max- The size of the array.
*/

//################## HL MASTERY ENCAPSULATION ##################

	private static void qs(int SortArray[], int min, int max) {
		int i, j;
		int x, y;
		x = SortArray[(min+max)/2];
		i = min;
		j = max;
	do{
		while((SortArray[i] < x) && (i < max)) i++;
		while((x < SortArray[j]) && (j > min)) j--;
		if(i <= j)
		{
			y = SortArray[i];
			SortArray[i] = SortArray[j];
			SortArray[j] = y;
			i++; j--;
		}
	}while(i <= j);
	
//################## HL MASTERY RECURSION ##################

	if(min < j) qs(SortArray, min, j);
	if(i < max) qs(SortArray, i, max);
	}
}

									/*
									$$$$$$$$$$$$$$$$$$$$$$$$
									     CLASS: Search 
									$$$$$$$$$$$$$$$$$$$$$$$$
									*/
									
class Search {
	
/** Performes a binary search on a sorted array.
* Returns the position of the result.
* Or a negative result if the value was not found.
*
* @param first- The least value currently evaluating.
* @param mid- The middle value of the search area.
* @param upto- The maximum value currently evaluating.
* @param sorted- A sorted array.
* @param key- The string or integer we are searching
for.
*/

// Performs a standard binary search on a sorted array of Strings.

	public static int Search(String[] sorted, String key) {
		int first = 0;
		int upto = sorted.length;
		while (first < upto) {
		int mid = (first + upto) / 2;
		if (key.compareTo(sorted[mid]) < 0) {
			upto = mid;
		} 
		else if (key.compareTo(sorted[mid]) > 0) {
			first = mid + 1;
		} 
		else {
			return mid;
		}
		}
	return -(first + 1);
}

// Performs a standard binary search on a sorted array of integers.

	public static int Search(int[] sorted, int key) {
		int first = 0;
		int upto = sorted.length;
		while (first < upto) {
		int mid = (first + upto) / 2;
		if (key < sorted[mid]) {
			upto = mid;
		} 
		else if (key > sorted[mid]) {
			first = mid + 1;
		} 
		else {
			return mid;
		}
		}
	return -(first + 1);
	}
}

									/*
									$$$$$$$$$$$$$$$$$$$$$$$$
									     CLASS: Time 
									$$$$$$$$$$$$$$$$$$$$$$$$
									*/
									
class Time {
	int hour; int minute;
	
// Makes the time from an input.

	public void makeTime(int time) {
	this.hour = time/100;
	this.minute = time-(this.hour*100);
	}
	
// Sets the time to 0 hrs 0 min.

	public void setNull() {
		this.hour = 0;
		this.minute = 0;
	}
	
// Verifies the format of time and throws an exception if incorrect.

	public void verifyTime() throws myExceptions.TimeFormatException
	{
		if(this.hour > 23 || this.hour < 0) throw new
		myExceptions().new TimeFormatException();
		if(this.minute > 59 || this.minute < 0) throw new
		myExceptions().new TimeFormatException();
	}
}