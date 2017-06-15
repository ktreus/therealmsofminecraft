package com.ktreus.minecraftrealms.tools.uniques;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemSword;

public class MagestrySword extends ItemSword {
	protected AttributeModifier attackDam= new AttributeModifier("UniquePlusDamage", 8.5, 0);
	public MagestrySword(ToolMaterial material) {
		super(material);
	}
	public Multimap getItemAttributeModifiers() {
        HashMultimap multimap = HashMultimap.create();
        multimap.put((Object)SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), (Object)this.attackDam);
        return multimap;
    }
}
