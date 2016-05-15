package com.sara.myMod;


import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import com.sara.blocks.BlockBlack;
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
import com.sara.commands.CommandHealth;
import com.sara.commands.DriveRead;
import com.sara.commands.MakeBeacon;
import com.sara.commands.ShowBlocks;
import com.sara.commands.StartAssignment;
import com.sara.commands.SudokuReadFromFile;
import com.sara.commands.URLtest;
import com.sara.commands.SudokuShowBlocks;
import com.sara.commands.ReadFromFile;
import com.sara.commands.readURL;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLever;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemBook;
import net.minecraft.item.ItemEditableBook;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemWritableBook;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;


@Mod(modid = MyMod.MODID, name="My Mod", version = MyMod.VERSION)
public class MyMod {
	public static final String MODID = "sara_mymod";
    public static final String VERSION = "1.0";
   
    
    
  @SidedProxy(clientSide = "com.sara.myMod.ClientProxySara", serverSide = "com.sara.myMod.CommonProxySara")
  public static CommonProxySara proxy;
   
   //------------------------------------- preInit ---------------------------------------------- 
    // preInit is where you register all the basics for your Mod
    @EventHandler
    public void preInit(FMLInitializationEvent event)
    {
    	//REMEMBER IMPORTANT
    	proxy.registerRendering();
    	ModBlocks.preInit(event);
    	/* The addRecipe method takes two parameters. The first parameter is an ItemStack.
    	 * An ItemStack is a class used to handle items or blocks in stacks
    	 * The first parameter is the item or Block the recipe will return. In this case it is an apple
    	 * The second parameter is a list of the elements used in the recipe, they are represented through a crafting grid
    	 * What comes after this, is the type of elements used. In this case it is dirt
    	*/
    	//GameRegistry.addRecipe(new ItemStack(greenSquare),
			//	"X",
				//"X",
				//'X', Blocks.dirt
		//);
    
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.zero),
				"XXX",
				"X X",
				"XXX",
				'X', Blocks.dirt
		);
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.one),
				"X  ",
				"   ",
				"   ",
				'X', Blocks.dirt
		);
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.two),
				"XX ",
				"   ",
				"   ",
				'X', Blocks.dirt
		);
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.three),
				"XXX",
				"   ",
				"   ",
				'X', Blocks.dirt
		);
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.four),
				"XXX",
				"X  ",
				"   ",
				'X', Blocks.dirt
		);
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.five),
				"XXX",
				"XX ",
				"   ",
				'X', Blocks.dirt
		);
  
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.six),
				"XXX",
				"XXX",
				"   ",
				'X', Blocks.dirt
		);
   
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.seven),
				"XXX",
				"XXX",
				"X  ",
				'X', Blocks.dirt
		);
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.eight),
				"XXX",
				"XXX",
				"XX ",
				'X', Blocks.dirt
		);
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.nine),
				"XXX",
				"XXX",
				"XXX",
				'X', Blocks.dirt
		);
		

    }
    //------------------------------------------ Init ------------------------------------------------
    // Init is where you place Mod specific code that is not directly related to registering.
   @EventHandler
    public void init(FMLInitializationEvent event)
    {
		

    }
    
    // ----------------------------------------- postInit --------------------------------------------
    @EventHandler
    public void postInit(FMLInitializationEvent event)
    {
    	if(event.getSide() == Side.CLIENT){
    		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    		//renderItem.getItemModelMesher().register(myBook, 0, new ModelResourceLocation(MODID + ":" + "myBook", "inventory"));
    		
    	}
    	ModBlocks.postInit(event);
    	
    }
    // New commands
    @EventHandler
    public void registerCommands(FMLServerStartingEvent event){
    	
    	ServerCommandManager manager = (ServerCommandManager) event.getServer().getCommandManager();
    	manager.registerCommand(new SudokuShowBlocks());
    	manager.registerCommand(new CommandHealth());
    	manager.registerCommand(new ReadFromFile());
    	manager.registerCommand(new ShowBlocks());
    	manager.registerCommand(new URLtest());
    	manager.registerCommand(new SudokuReadFromFile());
    	manager.registerCommand(new DriveRead());
    	manager.registerCommand(new StartAssignment());
    	manager.registerCommand(new MakeBeacon());
    	manager.registerCommand(new readURL());


    }

    }

