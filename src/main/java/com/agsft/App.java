package com.agsft;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.agsft.packetDescriptor.PacketDescriptor;
import com.agsft.template001.SataIdentify;
import com.agsft.template002.SmartAttribute;

import io.kaitai.struct.ByteBufferKaitaiStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	/*
    	 
    	 
    	Path path = Paths.get("/home/pramod/Desktop/BinaryParse/SATA/SATAInfo_0016.bin");
        
    	 byte[] bytes;
		try {
			bytes = Files.readAllBytes(path);
			 ByteBufferKaitaiStream byteBufferKaitaiStream=new ByteBufferKaitaiStream(bytes);
			 PacketDescriptor packetDescriptor=new PacketDescriptor(byteBufferKaitaiStream);
			 System.out.print(packetDescriptor.headerSize());
			 System.out.print(packetDescriptor.header());
			 System.out.print(packetDescriptor.version());
			 System.out.print(packetDescriptor.copyrightInfo());
			 System.out.print(packetDescriptor.signature());
			 System.out.print(packetDescriptor.date());
			 System.out.print(packetDescriptor.time());
			 System.out.print(packetDescriptor.modelNumber());
			 System.out.print(packetDescriptor.serialNumber());
			 System.out.print(packetDescriptor.firmwareVersion());
			 System.out.print(packetDescriptor.hostId());
			 System.out.print(packetDescriptor.rackNumber());
			 System.out.print(packetDescriptor.slotNumber());
			 System.out.print(packetDescriptor.systemFw());
			 System.out.print(packetDescriptor.os());
			 System.out.print(packetDescriptor.interfacee());
			 System.out.print(packetDescriptor.attribute());
			 System.out.print(packetDescriptor.numberOfRecords());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
        */
    	
    	int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
    	String str1,str2,str3,str4,str5,str6,str7,str8,str9,str10;
    	
    	/*
    	Path path = Paths.get("/home/pramod/Desktop/BinaryParse/SATA/Template001_SataIdentify.bin");
        
   	 byte[] bytes;
		try {
			bytes = Files.readAllBytes(path);
			 ByteBufferKaitaiStream byteBufferKaitaiStream=new ByteBufferKaitaiStream(bytes);
			
			 SataIdentify sataIdentify=new SataIdentify(byteBufferKaitaiStream);
			a=sataIdentify.genralInformation().firstByte();
			b=sataIdentify.genralInformation().secondByte();
			str1=String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
			str2=String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
			
			
			System.out.println("General configuration: ");
			if(str1.charAt(0)=='1')
				System.out.println("                      removable media device");
			else
				System.out.println("                      not removable media device");
			
			if(str2.charAt(0)=='0')
				System.out.println("                      ATA device");
			else
				System.out.println("                      not ATA device");
			
			
			System.out.println("Serial Number: "+sataIdentify.serialNumber());
			
			System.out.println("Firmware Version: "+sataIdentify.firmwareVersion());
			
			System.out.println("Model Number: "+sataIdentify.modelNumber());
			
			
			a=sataIdentify.trustedComputingFuture().firstByte();
			str1=String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
			System.out.println("Trusted Computing feature set options:");
			if(str1.charAt(7)=='1')
				System.out.println("                                       Trusted Computing feature set is supported");
			else
				System.out.println("                                       Trusted Computing feature set is not supported");
			 
			
			a=sataIdentify.capabilities().firstByte();
			b=sataIdentify.capabilities().secondByte();
			str1=String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
			str2=String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
			System.out.println("Capabilities:");
			System.out.println("             Long Physical Sector Alignment Error reporting: "+str1.charAt(7)+str1.charAt(6));
			if(str2.charAt(7)=='1')
				System.out.println("             DMA supported");
			else
				System.out.println("             DMA not supported");
			
			if(str2.charAt(6)=='1')
				System.out.println("             Shall be set to one ");
			else
				System.out.println("             Shall be not set to one ");
		
			if(str2.charAt(5)=='1')
				System.out.println("             IORDY may be disabled ");
			else
				System.out.println("             IORDY may not be disabled ");
			
			if(str2.charAt(4)=='1')
				System.out.println("             IORDY supported ");
			else
				System.out.println("             IORDY may be supported ");
			
			if(str2.charAt(2)=='1')
				System.out.println("             Standby timer values as specified in this standard are supported ");
			else
				System.out.println("             Standby timer values shall be managed by the device ");
			
			
			a=sataIdentify.capabilitiess().firstByte();
			str1=String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
			System.out.println("Capabilities :");
			if(str1.charAt(7)=='1')
				System.out.println("             There is a minimum Standby time value and it is vendor specific.");
			else
				System.out.println("              There is no minimum Standby timer value");
			
			
			
			} 
		catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
        */
       
    	
    	Path path = Paths.get("/home/pramod/Desktop/BinaryParse/SATA/Template002_SATA_SMARTAttr.bin");
        
      	 byte[] bytes;
   	
   			try {
				bytes = Files.readAllBytes(path);
				 ByteBufferKaitaiStream byteBufferKaitaiStream=new ByteBufferKaitaiStream(bytes);
				 
				 SmartAttribute smartAttribute=new SmartAttribute(byteBufferKaitaiStream);
				 
				 str1=String.format("%4s", Integer.toHexString(smartAttribute.firstAttribute().value().thirdWord())).replace(' ', '0');
				 str2=String.format("%4s", Integer.toHexString(smartAttribute.firstAttribute().value().secondWord())).replace(' ', '0');
				 str3=String.format("%4s", Integer.toHexString(smartAttribute.firstAttribute().value().firstWord())).replace(' ', '0');
				 
				 System.out.println("Id: "+Integer.toHexString(smartAttribute.firstAttribute().id()));
				 System.out.println("Flag: "+Integer.toHexString(smartAttribute.firstAttribute().flag()));
				 System.out.println("Attr: "+Integer.toHexString(smartAttribute.firstAttribute().attr()));
				 System.out.println("Worst: "+Integer.toHexString(smartAttribute.firstAttribute().worst()));
				 System.out.println("Value: "+str1+str2+str3);
				 System.out.println("Rev :"+Integer.toHexString(smartAttribute.firstAttribute().rev()));
				 
				 str1=String.format("%4s", Integer.toHexString(smartAttribute.secondAttribute().value().thirdWord())).replace(' ', '0');
				 str2=String.format("%4s", Integer.toHexString(smartAttribute.secondAttribute().value().secondWord())).replace(' ', '0');
				 str3=String.format("%4s", Integer.toHexString(smartAttribute.secondAttribute().value().firstWord())).replace(' ', '0');
				 
				 System.out.println("Id: "+Integer.toHexString(smartAttribute.secondAttribute().id()));
				 System.out.println("Flag: "+Integer.toHexString(smartAttribute.secondAttribute().flag()));
				 System.out.println("Attr: "+Integer.toHexString(smartAttribute.secondAttribute().attr()));
				 System.out.println("Worst: "+Integer.toHexString(smartAttribute.secondAttribute().worst()));
				 System.out.println("Value: "+str1+str2+str3);
				 System.out.println("Rev :"+Integer.toHexString(smartAttribute.secondAttribute().rev()));
				
				 
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
   			
   		
    }
}

