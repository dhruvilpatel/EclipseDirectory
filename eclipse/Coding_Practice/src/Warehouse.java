import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Warehouse implements InventoryManagementSystem
{
	private InputStreamReader i_r=new InputStreamReader(System.in);
	private BufferedReader b_r;
	private FileOutputStream f_os;
	private	PrintStream p_os; 
	private FileReader f_rs;

	private boolean checkFile(String filename)
	{
		File myFile=new File(filename);
		boolean b=myFile.exists();	

		return b;
	}

	//This function will  create an auto-generating the product id.
	private String generate_id()
	{
		String id=" ";
		String checkline;
		String[] fullcontext = new String[200];
		String[] line_seprate=new String[5];
		int temp_counter=0,nid=0,a=0,b=0;
		boolean c=checkFile("check.txt");

		if(c==false)
		{
			id="0001";
		}
		else
		{
			try
			{
				f_rs=new FileReader("check.txt");
			 	b_r=new BufferedReader(f_rs);
				while((checkline=b_r.readLine()) != null)
				{
					temp_counter=temp_counter+1;
					fullcontext[temp_counter] = checkline;
				}
				f_rs.close();
 				line_seprate=fullcontext[temp_counter].split(",");
 				nid=Integer.parseInt(line_seprate[0]);
 				nid=nid+1;
 				a=(String.valueOf(nid)).length();
 				b=5-a;
 				for(int i=1;i<=b;i++)
 				{
 					id=id+"0";	
 				}
 				id=id+String.valueOf(nid);
 				id=id.substring(1);
			}
			catch(Exception ex)
			{
				System.out.println("Could not generate the product ID...!");
			}
		}
		return id;
	}

	//this function will  add new products to warehouse.
	private void addItem()
	{
		String productname;
		String productId;
		double price=0;
		int stock=0,amountToRestock=0;

		try
 		{
			productId=generate_id();
			System.out.print("\n Product ID :"+productId+"\n");
			b_r=new BufferedReader(i_r);

			System.out.print("\n Product name :");
			productname=b_r.readLine();

			System.out.print("\n Unit Price : Rs.");
			price=Double.parseDouble(b_r.readLine());

			System.out.print("\n Starting stock value :");
			stock=Integer.parseInt(b_r.readLine());		

			System.out.print("\n Re-order Level :");
			amountToRestock=Integer.parseInt(b_r.readLine());

			f_os=new FileOutputStream("check.txt",true);
			p_os=new PrintStream(f_os);

			p_os.println(productId+","+productname+","+price+","+stock+","+amountToRestock);
			f_os.close();
			System.out.println("Successfully added one product...");
		}
 		catch(Exception ex)
 		{
 			System.out.println("Error in adding product...");
 		}	
	}

	//this function will display the whethere product is avilable or need Restock of it.
	
	private void makeTransaction()
	{
		String id,desc,s="y";
		String msg,stock;
		int value;
		double price=0,amount=0;
		int qty=0;
int amountToPick=0;
		try
		{
			while(s.equals("y"))
			{
				b_r=new BufferedReader(i_r);

				System.out.print("\n Enter Product ID :");
				id=b_r.readLine();
				PickingResult p_result = pickProduct(id,amountToPick);
				msg=p_result.productId;
				if(msg.equals("Product not found..."))
				{
					System.out.print("\n"+msg);
					continue;
				}
				b_r=new BufferedReader(i_r);
				value=p_result.amountToPick;
				if(value>0)
				{
					System.out.println("Product in RestockingResult.");
					continue;	
				}
				

				if(value==0)
				{
					System.out.println("Current stock is empty");
					System.out.println("Could not pick any transaction on this product...");
					continue;
				}

				System.out.print("\n Qty to sold :");
				qty=Integer.parseInt(b_r.readLine());

				if(qty>value)
				{
					System.out.println("Out of stock...!");
					System.out.println("Could not sell out this product...");
					continue;
				}
				amount=qty*price;

				RestockingResult temp_check= restockProduct(id,qty);
				if(Integer.parseInt(temp_check.productId)==1)
				{
					System.out.println("Failed to update the stock...!");	
				}

				f_rs=new FileReader("check.txt");
				b_r=new BufferedReader(f_rs);

				while((msg=b_r.readLine()) != null)
				{
//					value=msg.split(",");
//					if(value[0].equals(id))
//					{
//						stock=value[3];
//						break;
//					}
				}

				f_os=new FileOutputStream("Transaction1.txt",true);
				p_os=new PrintStream(f_os);
				f_os.close();

				s="n";
			}
			System.out.println("Transaction processed successfully...");	
		}
		catch(Exception ex)
		{
			System.out.println("Could not process the transaction...!");	
		}	
	}

	// this function will helpful for searching a product in the  file
		public PickingResult pickProduct(String productId , int amountToPick)
	
	{
		PickingResult p_temp = new PickingResult(productId,amountToPick);
		
		int counter=0,i=0,flag=0;
		String s;
		String cline[]=new String[255];
		String cID[]=new String[5];
		String value=" ";

		try {
			f_rs=new FileReader("check.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b_r=new BufferedReader(f_rs);

		try
		{
			while((s=b_r.readLine()) != null)
			{
				counter=counter+1;
				cline[counter]=s;
				cID=cline[counter].split(",");
				if(cID[0].equals(productId))
				{
					for(;i<cID.length;i++)
					{
						value=value+","+cID[i];	
					}
					flag=1;
					break;
				}
			}
			switch(flag)
			{
				case 0:
					value="Product not found...";
					break;
				case 1:
					value=value.substring(2);
					break;						
			}
		}
		catch(Exception ex)
		{
			System.out.println("Could continue operation on searching the product...!");
		}

		return p_temp;
	}

	//function for updating the value of current stock whenever a specific item is sold out
	
	public RestockingResult restockProduct(String productId, int amountToRestock)
	{
		RestockingResult temp = new RestockingResult(productId);
		
		int counter=0,i=0,pos=0;
		String s;
		String cline[]=new String[255];
		String cID[]=new String[5];
		String row[]=new String[5];
		String desc,price,rol;
		int stock=0,status=0;

		
		try
		{
			f_rs=new FileReader("check.txt");
			b_r=new BufferedReader(f_rs);		

			while((s=b_r.readLine()) != null)
			{
				counter=counter+1;
				cline[counter]=s;			
				cID=s.split(",");
				if(cID[0].equals(productId))
 				{
 					pos=counter;
 					row=s.split(",");
 				}	
			}

			f_os=new FileOutputStream("check.txt",false);
			p_os=new PrintStream(f_os);

			for(i=0;i<cline.length;i++)
			{			
				if(i==pos)
				{
					desc=row[1];
					price=row[2];
					amountToRestock=Integer.parseInt(row[3])-amountToRestock;
					rol=row[4];
					p_os.println(productId+","+desc+","+price+","+amountToRestock+","+rol);
				}
				else
				{
					if(cline[i]!=null)
					{
						p_os.println(cline[i]);
					}
				}
				
			}
			f_os.close();	
			status=0;
		}
		catch(Exception ex)
		{
			status=1;	
		}
		return temp;	
	}

	//function to generate and print the daily transaction report
	private void displayReport()
	{
		String id,desc,qty,value,stock,s;
		String cline[]=new String[5];

		try
		{
			f_rs=new FileReader("Transaction1.txt");
			b_r=new BufferedReader(f_rs);		

			System.out.println("\npID   product_name   QtySold   Amount   CurrentStock");
			System.out.println("----------------------------------------------");

			while((s=b_r.readLine()) != null)
			{
				cline=s.split(",");
				id=cline[0];
				desc=cline[1];
				qty=cline[2];
				value=cline[3];
				stock=cline[4];

				System.out.println(id+"   "+desc+"              "+qty+"   "+"Rs."+value+"   "+stock);
			}	
		}
		catch(Exception ex)
		{
			System.out.println("Some exceptions occured...");
			System.out.println("Could not generate the daily transaction report...!");	
		}
	}

	public static void main(String args[]) throws IOException
	{
		Warehouse inv=new Warehouse();
		int ch=0;
		String s;
		InputStreamReader i_r=new InputStreamReader(System.in);
		BufferedReader b_r=new BufferedReader(i_r);

		System.out.println("Inventory    Management    System ");
		System.out.println("-----------------------------------------------");
		System.out.println("1. Add PRODUCT");
		System.out.println("2. Select PRODUCT");
		System.out.println("3. View RestockingResult");
		System.out.println("---------------------------------");
		System.out.println("4. Exit");
		begin:
		while(ch!=4)
		{
			System.out.print("\n");
			System.out.print("\n Enter a choice and  continue[1-4]:");
			ch=Integer.parseInt(b_r.readLine());

			if(ch>4||ch<1)
			{
				System.out.println(" Invalid option...!");
				continue begin;	
			}

			if(ch==1)
			{
				s="y";
				while(s.equals("y")||s.equals("Y"))
				{
					inv.addItem();
					System.out.print("\n Add more[y/n]:");
					s=b_r.readLine();						
				}
				continue begin;
			}
			else
			if(ch==2)
			{
				s="y";
				while(s.equals("y")||s.equals("Y"))
				{
					inv.makeTransaction();			
					System.out.print("\n Select more[y/n]:");
					s=b_r.readLine();						
				}
			}
			else
			if(ch==3)
			{
				inv.displayReport();		
			}	
		}
	}

	
	
} 