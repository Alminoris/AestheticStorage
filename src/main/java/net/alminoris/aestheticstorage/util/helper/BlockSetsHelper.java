package net.alminoris.aestheticstorage.util.helper;

import java.util.Dictionary;
import java.util.Hashtable;

public class BlockSetsHelper
{
    public static final Dictionary<String, Integer> WOOD_COLORS = new Hashtable<>()
    {{
        put("oak", 0x836b3f);
        put("birch", 0xbdab77);
        put("spruce", 0x694f30);
        put("jungle", 0x937143);
        put("acacia", 0x954727);
        put("dark_oak", 0x40321f);
        put("crimson", 0x712f4a);
        put("warped", 0x408d8b);
        put("mangrove", 0x662b2b);
        put("cherry", 0xcb7075);
        put("bamboo", 0xccb038);
        put("hazelnut", 0x856b42);
        put("hawthorn", 0x81421f);
        put("hornbeam", 0xb7b59a);
        put("quince", 0xc78955);
        put("plum", 0x8e656c);
        put("mango", 0xb4733c);
        put("fig", 0xbc9e80);
        put("viburnum", 0x895943);
        put("white_mulberry", 0xc1a630);
        put("wild_cherry", 0xd49549);
        put("bauhinia", 0x53412f);
        put("pine", 0xa88e65);
        put("olive", 0x605842);
        put("tamarisk", 0x553430);
        put("fir", 0x825a38);
        put("cedar", 0x875e4a);
        put("araucaria", 0x855e1c);
        put("juniper", 0xa75d38);
        put("bald_cypress", 0x5c5c48);
        put("thuja", 0x65443a);
        put("sequoia", 0x865040);
        put("mountain_hemlock", 0xa57d51);
        put("cryptomeria", 0xa37c4d);
        put("yew", 0x805a2b);
        put("larch", 0x9e8264);
        put("western_serviceberry", 0x78583f);
        put("trembling_aspen", 0x827e65);
        put("cottonwood", 0x786b57);
        put("aspen_nss", 0xe7b74c);
        put("cedar_nss", 0x9c5c5b);
        put("coconut_nss", 0xc57665);
        put("cypress_nss", 0x6c553e);
        put("fir_nss", 0x473330);
        put("ghaf_nss", 0x704c34);
        put("larch_nss", 0x3f414a);
        put("mahogany_nss", 0x5c2e24);
        put("maple_nss", 0x835232);
        put("olive_nss", 0x504328);
        put("palo_verde_nss", 0x6d6227);
        put("redwood_nss", 0x441b19);
        put("saxaul_nss", 0x4f3e2f);
        put("sugi_nss", 0x4d2d25);
        put("willow_nss", 0x221810);
        put("wisteria_nss", 0x89736a);
        put("walnut", 0x755941);
        put("silver_maple", 0xd7ae8b);
        put("staghorn_sumac", 0xbd6856);
        put("silverberry", 0xb1a578);
        put("willow", 0xa29453);
        put("poplar", 0xd3b366);
        put("alder", 0x8f3d2b);
        put("aspen", 0xcfbf99);
        put("azalea", 0x785644);
        put("apple", 0x9d6c46);
        put("scots_pine", 0xba8869);
        put("swamp_oak", 0x634f37);
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