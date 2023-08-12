package net.duckieman.goosemod.item;

import net.duckieman.goosemod.GooseMod;
import net.duckieman.goosemod.item.custom.MetalDetectorItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GooseMod.MOD_ID);

    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(14).build())));

    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(1).build())));

    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).nutrition(2).build())));

    public static final RegistryObject<Item> PEPPERONI = ITEMS.register("pepperoni",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAUSAGE = ITEMS.register("sausage",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(2).build())));

    public static final RegistryObject<Item> BASIL = ITEMS.register("basil",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EXTRAORDINARY_SOUP = ITEMS.register("extraordinary_soup",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(14).build())));

    public static final RegistryObject<Item> CHICKEN_BONE = ITEMS.register("chicken_bone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(1).build())));

    public static final RegistryObject<Item> ONION_SEEDS = ITEMS.register("onion_seeds",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SALT_AND_PEPPER = ITEMS.register("salt_and_pepper",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NITKA_DO_ZUPY = ITEMS.register("nitka_do_zupy",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_DUCK_MEAT = ITEMS.register("raw_duck_meat",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_GOOSE_MEAT = ITEMS.register("raw_goose_meat",
            () -> new Item(new Item.Properties()));

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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
