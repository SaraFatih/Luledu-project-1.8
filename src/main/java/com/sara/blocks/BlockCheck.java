package com.sara.blocks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sara.commands.printSuccess;
import com.sara.myMod.MyMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLever;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.particle.EntityFireworkSparkFX;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityWeatherEffect;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityMinecartChest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockCheck extends Block {
	String name = "check";
	public static boolean answer;
	public BlockCheck() {
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(MyMod.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabAllSearch);
		setHardness(2F);
		setResistance(5F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe",2);
	}
	public String getName(){
		return name;
	}
	

	
	
	private void lalala(World worldIn, BlockPos pos, IBlockState state, int dx, int dz)  {
		int myX = pos.getX();
		int myY = pos.getY();
		int myZ = pos.getZ();
		int correctResult=0;
		int i=1;
		BlockPos currentPosition =  new BlockPos(myX + i * dx,myY,myZ + i * dz);
		List<Integer> firstArgument = new ArrayList<Integer>();
		List<Integer> secondArgument = new ArrayList<Integer>();
		List<Character> operators = new ArrayList<Character>();
		List<Integer> result = new ArrayList<Integer>();

		int operatorCounter=0;
		while(!(worldIn.isAirBlock(currentPosition))){
			IBlockState thisBlock = worldIn.getBlockState(currentPosition);
			Block myCurrentBlock = thisBlock.getBlock();
			String currentBlockName = myCurrentBlock.getLocalizedName();
			i++;
			currentPosition =  new BlockPos(myX + i * dx,myY,myZ + i * dz);
			if(currentBlockName.equals("zero")){
		
				if(operatorCounter==0)
					firstArgument.add(0);
				if(operatorCounter==1)
					secondArgument.add(0);
				if(operatorCounter==2)
					result.add(0);
			}
				
			else if(currentBlockName.equals("one")){

				if(operatorCounter==0)
					firstArgument.add(1);
				if(operatorCounter==1)
					secondArgument.add(1);
				if(operatorCounter==2)
					result.add(1);
			}
				
			else if(currentBlockName.equals("two")){

				if(operatorCounter==0)
					firstArgument.add(2);
				if(operatorCounter==1)
					secondArgument.add(2);
				if(operatorCounter==2)
					result.add(2);
			}
				
			else if(currentBlockName.equals("three")){

				if(operatorCounter==0)
					firstArgument.add(3);
				if(operatorCounter==1)
					secondArgument.add(3);
				if(operatorCounter==2)
					result.add(3);
			}
				
			else if(currentBlockName.equals("four")){

				if(operatorCounter==0)
					firstArgument.add(4);
				if(operatorCounter==1)
					secondArgument.add(4);
				if(operatorCounter==2)
					result.add(4);
			}
				
			else if(currentBlockName.equals("five")){

				if(operatorCounter==0)
					firstArgument.add(5);
				if(operatorCounter==1)
					secondArgument.add(5);
				if(operatorCounter==2)
					result.add(5);
			}
				
			else if(currentBlockName.equals("six")){

				if(operatorCounter==0)
					firstArgument.add(6);
				if(operatorCounter==1)
					secondArgument.add(6);
				if(operatorCounter==2)
					result.add(6);
			}
				
			else if(currentBlockName.equals("seven")){

				if(operatorCounter==0)
					firstArgument.add(7);
				if(operatorCounter==1)
					secondArgument.add(7);
				if(operatorCounter==2)
					result.add(7);
			}
				
			else if(currentBlockName.equals("eight")){

				if(operatorCounter==0)
					firstArgument.add(8);
				if(operatorCounter==1)
					secondArgument.add(8);
				if(operatorCounter==2)
					result.add(8);
			}
				
			else if(currentBlockName.equals("nine")){

				if(operatorCounter==0)
					firstArgument.add(9);
				if(operatorCounter==1)
					secondArgument.add(9);
				if(operatorCounter==2)
					result.add(9);
			}
				
			else if(currentBlockName.equals("plus")){

				operators.add('+');
				operatorCounter++;
			}
				
			else if(currentBlockName.equals("minus")){

				operators.add('-');
				operatorCounter++;
			}
				
			else if(currentBlockName.equals("multi")){

				operators.add('*');
				operatorCounter++;
			}
			
			else if(currentBlockName.equals("divide")){

				operators.add('/');
				operatorCounter++;
			}
				
			else if(currentBlockName.equals("equal")){

				operators.add('=');
				operatorCounter++;
			}
				
			else if(currentBlockName.equals("questionMark")){

				operators.add('?');
			}
				
		
		}	
		
		
		//here
		int firstArgumentSize = firstArgument.size();
		int secondArgumentSize = secondArgument.size();
		int resultSize = result.size();
		
		if(firstArgumentSize==0 || secondArgumentSize==0 || resultSize==0 || operators.isEmpty()){
			return;
		}
		
		int firstArgumentNumber=0;
		int secondArgumentNumber=0;
		int resultArgumentNumber=0;

		int z;
		int k;
		if(firstArgumentSize==1)
			firstArgumentNumber=firstArgument.get(0);
		else{
			z=firstArgumentSize-1;
			for(k=0;k<firstArgumentSize;k++){
				firstArgumentNumber = (int) (firstArgumentNumber + (firstArgument.get(k))*Math.pow(10,z));
				z--;
			}
		}
	
		
		if(secondArgumentSize==1)
			secondArgumentNumber=secondArgument.get(0);
		else{
			z=secondArgumentSize-1;
			for(k=0;k<secondArgumentSize;k++){
				secondArgumentNumber = (int) (secondArgumentNumber + (secondArgument.get(k))*Math.pow(10,z));
				z--;
			}
		}
	
		if(resultSize==1)
			resultArgumentNumber=result.get(0);
		else{
			z=resultSize-1;
			for(k=0;k<resultSize;k++){
				resultArgumentNumber = (int) (resultArgumentNumber + (result.get(k))*Math.pow(10,z));
				z--;
			}
		}
		
		
			if((operators.get(0))=='+')
				correctResult= firstArgumentNumber+secondArgumentNumber;
			
			else if ((operators.get(0))=='-')
				correctResult= firstArgumentNumber-secondArgumentNumber;
			
			else if ((operators.get(0))=='*')
				correctResult= firstArgumentNumber*secondArgumentNumber;
			
			else if ((operators.get(0))=='/')
				correctResult= firstArgumentNumber/secondArgumentNumber;
		
		
			System.out.println("first " + firstArgumentNumber);
			System.out.println("second " + secondArgumentNumber);
			System.out.println("correct " + correctResult);
			System.out.println("result " + resultArgumentNumber);
		
		if(resultArgumentNumber==correctResult){
			System.out.println("Correct answer");
			
			EntityMinecartChest myChest = new EntityMinecartChest(worldIn);
			myChest.setPosition(myX-2 * dx,myY,myZ - 2 * dz);
			worldIn.spawnEntityInWorld(myChest);
			//EntityPlayer player = worldIn.getClosestPlayer(1, 1, 1, 1);
			//player.addChatMessage(new ChatComponentText("Correct answer!"));
			worldIn.setThunderStrength(5);
			//EntityLargeFireball fire = new EntityLargeFireball(worldIn);
			//worldIn.spawnEntityInWorld(fire);
			//EntityFireworkSparkFX fi
			//worldIn.spawnEntityInWorld(E)
			worldIn.thunderingStrength=7;
			//worldIn.spawnEntityInWorld(Entit)
			
			//EntityFX entityfx = new EntityFireworkSparkFX(worldIn, myX, myY, myZ, 0.0D, 10.0D, 50.0D, Minecraft.getMinecraft().effectRenderer);
			//Minecraft.getMinecraft().effectRenderer.addEffect(entityfx);
			answer=true;
			
			//Entity
			
			EntityEgg myEgg = new EntityEgg(worldIn);
			myEgg.setPosition(myX,myY+3,myZ);
			worldIn.spawnEntityInWorld(myEgg);
			
		}
		else{
			System.out.println("wrong answer");
			EntitySpider mySpider = new EntitySpider(worldIn);
			mySpider.setPosition(myX-5 * dx,myY,myZ - 5 * dz);
			worldIn.spawnEntityInWorld(mySpider);
			EntityZombie myZombie = new EntityZombie(worldIn);
			myZombie.setPosition(myX-4 * dx,myY,myZ - 4 * dz);
			worldIn.spawnEntityInWorld(myZombie);
			//EntityPlayer player = worldIn.getClosestPlayer(1, 1, 1, 1);
			//player.addChatMessage(new ChatComponentText("Wrong answer, try again!"));
			answer=false;
		}
		
		}
	

	@Override
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		
			
		if(!worldIn.isRemote) {
			lalala(worldIn, pos, state, 1,0);
			lalala(worldIn, pos, state, 0,1);
			lalala(worldIn, pos, state, -1,0);
			lalala(worldIn, pos, state, 0,-1);
			EntityPlayer p;
			
			p= worldIn.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), -1);
		
			printSuccess printsu = new printSuccess();
			String[] array= null;
			try {
				printsu.execute(p, array);
			} catch (CommandException e) {
				e.printStackTrace();
			}
		
		}
	}
	@Override
	public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock) {
		BlockState myblockState = neighborBlock.getBlockState();
		if(!worldIn.isRemote) {
		if((neighborBlock instanceof BlockLever)){
			int myX = pos.getX();
			int myY = pos.getY();
			int myZ = pos.getZ();
			
				lalala(worldIn, pos, state, 1,0);
				lalala(worldIn, pos, state, 0,1);
				lalala(worldIn, pos, state, -1,0);
				lalala(worldIn, pos, state, 0,-1);
				EntityPlayer p;
				
				p= worldIn.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), -1);
			
				printSuccess printsu = new printSuccess();
				String[] array= null;
				try {
					printsu.execute(p, array);
				} catch (CommandException e) {
					e.printStackTrace();
				}
			
			}
			
		
	
		}
	
	} 
}

