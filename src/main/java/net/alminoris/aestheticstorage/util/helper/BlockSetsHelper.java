package net.alminoris.aestheticstorage.util.helper;

import java.util.Dictionary;
import java.util.Hashtable;

public class BlockSetsHelper
{
    public static final Dictionary<String, Integer> WOOD_COLORS = new Hashtable<>()
    {{
        put("acacia", 0x7e4325);
        put("alder", 0x813627);
        put("apple", 0x845d3f);
        put("araucaria", 0x704c0f);
        put("aspen_nss", 0xa28239);
        put("aspen", 0x9f957e);
        put("azalea", 0x715242);
        put("bald_cypress", 0x555542);
        put("bamboo", 0x90813c);
        put("bauhinia", 0x523f30);
        put("birch", 0x90835a);
        put("cedar_nss", 0x764742);
        put("cedar", 0x694939);
        put("cherry", 0xa98581);
        put("coconut_nss", 0x9b6451);
        put("cottonwood", 0x665b4b);
        put("crimson", 0x4b2434);
        put("cryptomeria", 0x836745);
        put("cypress_nss", 0x645742);
        put("dark_oak", 0x31200f);
        put("fig", 0x8e7862);
        put("fir_nss", 0x45332d);
        put("fir", 0x674527);
        put("ghaf_nss", 0x69482b);
        put("hawthorn", 0x663318);
        put("hazelnut", 0x715e43);
        put("hornbeam", 0x8b8a79);
        put("jungle", 0x78563c);
        put("juniper", 0x8a5136);
        put("larch_nss", 0x3c4045);
        put("larch", 0x7e6b57);
        put("mahogany_nss", 0x522a1e);
        put("mango", 0x865a35);
        put("mangrove", 0x572824);
        put("maple_nss", 0x895e35);
        put("mountain_hemlock", 0x84684a);
        put("oak", 0x79613a);
        put("olive_nss", 0x453d22);
        put("olive", 0x564e3c);
        put("palo_verde_nss", 0x666122);
        put("pine", 0x826f4f);
        put("plum", 0x6c4d52);
        put("poplar", 0xa59163);
        put("quince", 0x997250);
        put("redwood_nss", 0x3b1815);
        put("saxaul_nss", 0x4c4134);
        put("scots_pine", 0x967865);
        put("sequoia", 0x774739);
        put("silverberry", 0x8b8467);
        put("silver_maple", 0xa38972);
        put("spruce", 0x553f24);
        put("staghorn_sumac", 0x905649);
        put("sugi_nss", 0x472a1f);
        put("swamp_oak", 0x5f4b35);
        put("tamarisk", 0x3b2522);
        put("thuja", 0x593b33);
        put("trembling_aspen", 0x6f6b59);
        put("viburnum", 0x754e3c);
        put("walnut", 0x5d4633);
        put("warped", 0x204e4a);
        put("western_serviceberry", 0x6a4d37);
        put("white_mulberry", 0x867224);
        put("wild_cherry", 0xa77a46);
        put("willow_nss", 0x241b0f);
        put("willow", 0x887e54);
        put("wisteria_nss", 0x817265);
        put("yew", 0x6c4b24);
    }};

    public static final String[] COLORS =
            {
                    "black", "brown", "gray", "light_gray",
                    "white", "red", "orange", "yellow",
                    "purple", "magenta", "pink", "blue",
                    "cyan", "light_blue", "green", "lime"
            };

    public static final String[] STONES =
            {
                    "stone", "tuff", "blackstone", "andesite", "diorite", "granite",  "deepslate", "basalt_side",
                    "quartz_block_bottom", "stone_bricks", "bricks", "mud_bricks", "sandstone"
            };

    public static final String[] EXTRA_STONES_WF =
            {
                    "dolomite_block", "saltmarsh_block", "loessic_marl_block", "loamy_marl_block", "fossil_marlstone_block", "limestone_block"
            };

    public static final String[] WOODS =
            {
                    "oak", "birch", "spruce", "jungle", "acacia", "dark_oak",
                    "crimson", "warped", "mangrove", "cherry", "bamboo"
            };

    public static final String[] EXTRA_WOODS_AN =
            {
                    "hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum", "white_mulberry", "wild_cherry",
                    "bauhinia", "pine", "fir", "cedar", "araucaria", "juniper",
                    "bald_cypress", "thuja", "sequoia", "mountain_hemlock", "cryptomeria", "yew", "larch"
            };

    public static final String[] EXTRA_WOODS_WF =
            {
                    "olive", "tamarisk", "western_serviceberry", "trembling_aspen", "cottonwood"
            };

    public static final String[] ST_WOOD_NAMES = new String[] { "walnut", "silver_maple", "staghorn_sumac", "silverberry" };

    public static final String[] WT_WOOD_NAMES = new String[] { "willow", "poplar", "alder", "aspen" };

    public static final String[] MT_WOOD_NAMES = new String[] { "azalea", "apple", "scots_pine", "swamp_oak" };

    public static final String[] NSS_WOOD_NAMES = new String[] { "aspen_nss", "cedar_nss", "coconut_nss", "cypress_nss", "fir_nss", "ghaf_nss",
            "larch_nss", "mahogany_nss", "maple_nss", "olive_nss", "palo_verde_nss", "redwood_nss", "saxaul_nss", "sugi_nss", "willow_nss", "wisteria_nss" };

    public static String[] getWoods()
    {
        String[] combinedWoods = new String[WOODS.length + EXTRA_WOODS_AN.length + EXTRA_WOODS_WF.length+
                ST_WOOD_NAMES.length+ WT_WOOD_NAMES.length+ MT_WOOD_NAMES.length+ NSS_WOOD_NAMES.length];
        System.arraycopy(WOODS, 0, combinedWoods, 0, WOODS.length);
        System.arraycopy(EXTRA_WOODS_AN, 0, combinedWoods, WOODS.length, EXTRA_WOODS_AN.length);
        System.arraycopy(EXTRA_WOODS_WF, 0, combinedWoods, WOODS.length + EXTRA_WOODS_AN.length, EXTRA_WOODS_WF.length);
        System.arraycopy(ST_WOOD_NAMES, 0, combinedWoods, WOODS.length + EXTRA_WOODS_AN.length+EXTRA_WOODS_WF.length, ST_WOOD_NAMES.length);
        System.arraycopy(WT_WOOD_NAMES, 0, combinedWoods, WOODS.length + EXTRA_WOODS_AN.length+EXTRA_WOODS_WF.length
                +ST_WOOD_NAMES.length, WT_WOOD_NAMES.length);
        System.arraycopy(MT_WOOD_NAMES, 0, combinedWoods, WOODS.length + EXTRA_WOODS_AN.length+EXTRA_WOODS_WF.length
                +ST_WOOD_NAMES.length+WT_WOOD_NAMES.length, MT_WOOD_NAMES.length);
        System.arraycopy(NSS_WOOD_NAMES, 0, combinedWoods, WOODS.length + EXTRA_WOODS_AN.length+EXTRA_WOODS_WF.length
                +ST_WOOD_NAMES.length+WT_WOOD_NAMES.length+MT_WOOD_NAMES.length, NSS_WOOD_NAMES.length);
        return combinedWoods;
    }

    public static String[] getStones()
    {
        String[] combinedStones = new String[STONES.length + EXTRA_STONES_WF.length];
        System.arraycopy(STONES, 0, combinedStones, 0, STONES.length);
        System.arraycopy(EXTRA_STONES_WF, 0, combinedStones, STONES.length, EXTRA_STONES_WF.length);
        return combinedStones;
    }

    public static String[] getWoodsNStones()
    {
        String[] combined = new String[getWoods().length + getStones().length];
        System.arraycopy(getWoods(), 0, combined, 0, getWoods().length);
        System.arraycopy(getStones(), 0, combined, getWoods().length, getStones().length);
        return combined;
    }
}