package kr.aka.mod.akacore;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class AkaCoreTabs {
    public static final String CORE_MODID = "akacore";
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CORE_MODID);

    // 탭용 아이템 등록
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, "akacore");
    public static final Supplier<Item> AKACORE_ICON = ITEMS.register("akacore_icon",
        () -> new Item(new Item.Properties()));



    public static final ResourceKey<CreativeModeTab> AKA_QOL_TAB_KEY = ResourceKey.create(
        Registries.CREATIVE_MODE_TAB,
        ResourceLocation.fromNamespaceAndPath(CORE_MODID, "aka_qol_tab")
    );

    public static final Supplier<CreativeModeTab> AKA_QOL_TAB = TABS.register("aka_qol_tab",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.akacore.aka_qol_tab"))
            .icon(() -> new ItemStack(AKACORE_ICON.get()))
            .build()
    );
}