package net.duckieman.goosemod.item;

import net.duckieman.goosemod.GooseMod;
import net.duckieman.goosemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GooseMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GOOSE_MOD = CREATIVE_MODE_TABS.register("goose_mod",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NITKA_DO_ZUPY.get()))
                    .title(Component.translatable("creativetab.goose_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.NITKA_DO_ZUPY.get());
                        pOutput.accept(ModItems.BASIL.get());
                        pOutput.accept(ModItems.CHEESE.get());
                        pOutput.accept(ModItems.PIZZA.get());
                        pOutput.accept(ModItems.DOUGH.get());
                        pOutput.accept(ModItems.DUCK_TOES.get());
                        pOutput.accept(ModItems.GOOSE_TOES.get());
                        pOutput.accept(ModItems.DUCK_SPAWN_EGG.get());
                        pOutput.accept(ModItems.GOOSE_SPAWN_EGG.get());
                        pOutput.accept(ModItems.GOOSE_SPAWN_EGG.get());
                        pOutput.accept(ModItems.TOMATO.get());
                        pOutput.accept(ModItems.TOMATO_SEEDS.get());
                        pOutput.accept(ModItems.PEPPERONI.get());
                        pOutput.accept(ModItems.SAUSAGE.get());
                        pOutput.accept(ModItems.SALT_AND_PEPPER.get());
                        pOutput.accept(ModItems.EXTRAORDINARY_SOUP.get());
                        pOutput.accept(ModItems.SOUP_POT.get());
                        pOutput.accept(ModItems.CHICKEN_BONE.get());
                        pOutput.accept(ModItems.ONION.get());
                        pOutput.accept(ModItems.ONION_SEEDS.get());
                        pOutput.accept(ModItems.RAW_DUCK_MEAT.get());
                        pOutput.accept(ModItems.RAW_GOOSE_MEAT.get());

                        pOutput.accept(ModBlocks.PIZZA_OVEN.get());
                        pOutput.accept(ModBlocks.GOOSE_TOE_ORE.get());
                        pOutput.accept(ModBlocks.DUCK_TOE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_DUCK_TOE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_GOOSE_TOE_ORE.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
