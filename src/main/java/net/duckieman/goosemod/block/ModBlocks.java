package net.duckieman.goosemod.block;

import net.duckieman.goosemod.GooseMod;
import net.duckieman.goosemod.block.custom.HorizontalRotationBlock;
import net.duckieman.goosemod.block.custom.SoundBlock;
import net.duckieman.goosemod.item.ModItems;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GooseMod.MOD_ID);

    public static final RegistryObject<Block> PIZZA_OVEN = registerBlock("pizza_oven",
    () -> new HorizontalRotationBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BLACK)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .strength(50.0F, 1200.0F)) {});

    public static final RegistryObject<Block> GOOSE_TOE_ORE = registerBlock("goose_toe_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 5.0F),
                    UniformInt.of(2, 5)));

    public static final RegistryObject<Block> DEEPSLATE_GOOSE_TOE_ORE = registerBlock("deepslate_goose_toe_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DEEPSLATE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(10.0F, 10.0F),
                    UniformInt.of(4, 7)));

    public static final RegistryObject<Block> DUCK_TOE_ORE = registerBlock("duck_toe_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 5.0F),
                    UniformInt.of(2,5)));

    public static final RegistryObject<Block> DEEPSLATE_DUCK_TOE_ORE = registerBlock("deepslate_duck_toe_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DEEPSLATE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 5.0F),
                    UniformInt.of(4,7)));

    public static final RegistryObject<Block> SOUND_BLOCK = registerBlock("sound_block",
            () -> new SoundBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
