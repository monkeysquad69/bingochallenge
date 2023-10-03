
package net.monkeysquad.bingo.command;

import org.checkerframework.checker.units.qual.s;

import net.monkeysquad.bingo.procedures.BingoPlayerCommandProcedureProcedure;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

@Mod.EventBusSubscriber
public class BingoPlayerCommandCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("bingo").requires(s -> s.hasPermission(2)).then(Commands.argument("name", EntityArgument.player()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);
			Direction direction = entity.getDirection();

			BingoPlayerCommandProcedureProcedure.execute(world, x, y, z, entity);
			return 0;
		})));
	}
}
