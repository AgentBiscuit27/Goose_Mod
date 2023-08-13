package net.duckieman.goosemod.item;

import net.duckieman.goosemod.GooseMod;
import net.duckieman.goosemod.item.custom.FuelItem;
import net.duckieman.goosemod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GooseMod.MOD_ID);

    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PIZZA)));

    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOMATO)));

    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHEESE)));

    public static final RegistryObject<Item> PEPPERONI = ITEMS.register("pepperoni",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAUSAGE = ITEMS.register("sausage",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SAUSAGE)));

    public static final RegistryObject<Item> BASIL = ITEMS.register("basil",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EXTRAORDINARY_SOUP = ITEMS.register("extraordinary_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.EXTRAORDINARY_SOUP)));

    public static final RegistryObject<Item> CHICKEN_BONE = ITEMS.register("chicken_bone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ONION)));

    public static final RegistryObject<Item> ONION_SEEDS = ITEMS.register("onion_seeds",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SALT_AND_PEPPER = ITEMS.register("salt_and_pepper",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NITKA_DO_ZUPY = ITEMS.register("nitka_do_zupy",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_DUCK_MEAT = ITEMS.register("raw_duck_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_DUCK_MEAT)));

    public static final RegistryObject<Item> RAW_GOOSE_MEAT = ITEMS.register("raw_goose_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_GOOSE_MEAT)));

    public static final RegistryObject<Item> GOOSE_TOES = ITEMS.register("goose_toes",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DUCK_TOES = ITEMS.register("duck_toes",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOOSE_SPAWN_EGG = ITEMS.register("goose_spawn_egg",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DUCK_SPAWN_EGG = ITEMS.register("duck_spawn_egg",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(512)));

    public static final RegistryObject<Item> HEAT_BRICK = ITEMS.register("heat_brick",
            () -> new FuelItem(new Item.Properties(), 2000));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
