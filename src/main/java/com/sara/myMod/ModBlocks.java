package com.sara.myMod;

import com.sara.blocks.BlockBlack;
import com.sara.blocks.BlockBook;
import com.sara.blocks.BlockCheck;
import com.sara.blocks.BlockDivide;
import com.sara.blocks.BlockEight;
import com.sara.blocks.BlockEqual;
import com.sara.blocks.BlockFive;
import com.sara.blocks.BlockFour;
import com.sara.blocks.BlockMinus;
import com.sara.blocks.BlockMulti;
import com.sara.blocks.BlockNine;
import com.sara.blocks.BlockOne;
import com.sara.blocks.BlockPlus;
import com.sara.blocks.BlockQuestionMark;
import com.sara.blocks.BlockSeven;
import com.sara.blocks.BlockSix;
import com.sara.blocks.BlockThree;
import com.sara.blocks.BlockTwo;
import com.sara.blocks.BlockZero;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLever;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

public class ModBlocks {

	//Blocks
    public static Block zero;
    public static Block one;
    public static Block two;
    public static Block three;
    public static Block four;
    public static Block five;
    public static Block six;
    public static Block seven;
    public static Block eight;
	public static Block nine;
    public static Block questionMark;
    public static Block minus;
    public static Block plus;
    public static Block multi;
    public static Block divide;
    public static Block equal;
    public static Block check;
    public static Block black;
    public static Block myBook;
    
    public static void preInit(FMLInitializationEvent event)
    {
    	//Blocks
    	//This is the Block init line
    	zero = new BlockZero();
    	one = new BlockOne();
    	two = new BlockTwo();
    	three = new BlockThree();
    	four = new BlockFour();
    	five = new BlockFive();
    	six = new BlockSix();
    	seven = new BlockSeven();
    	eight = new BlockEight();
    	nine = new BlockNine();
    	questionMark = new BlockQuestionMark();
    	minus = new BlockMinus();
    	plus = new BlockPlus();
    	multi = new BlockMulti();
    	divide = new BlockDivide();
    	equal = new BlockEqual();
    	check = new BlockCheck();
    	black = new BlockBlack();
    	myBook = new BlockBook();
    	
    }
    
    public static void postInit(FMLInitializationEvent event)
    {
    	if(event.getSide()==Side.CLIENT){
    		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(zero),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockZero) zero).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(one),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockOne) one).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(two),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockTwo) two).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(three),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockThree) three).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(four),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockFour) four).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(five),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockFive) five).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(six),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockSix) six).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(seven),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockSeven) seven).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(eight),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockEight) eight).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(nine),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockNine) nine).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(questionMark),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockQuestionMark) questionMark).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(minus),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockMinus) minus).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(plus),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockPlus) plus).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(multi),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockMulti) multi).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(divide),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockDivide) divide).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(equal),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockEqual) equal).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(check),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockCheck) check).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(black),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockBlack) black).getName(),"inventory"));
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(myBook),0, new ModelResourceLocation(MyMod.MODID + ":" + ((BlockBook) myBook).getName(),"inventory"));

    	}
    	
    }
	

	
}
