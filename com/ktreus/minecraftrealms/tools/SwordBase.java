package com.ktreus.minecraftrealms.tools;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class SwordBase extends ItemSword {
	
	public SwordBase(ToolMaterial material) {
		super(material);
		// TODO Auto-generated constructor stub
	}
	public static class SwordCobalt extends SwordBase {

		public SwordCobalt(ToolMaterial material) {
			super(material);
		}

	}
	public static class SwordEnderCristal extends SwordBase {

		public SwordEnderCristal(ToolMaterial material) {
			super(material);
		 
		}

	}
	public static class SwordEndernite extends SwordBase {

		public SwordEndernite(ToolMaterial material) {
			super(material);
		 
		}

	}
	public static class SwordMagnetite extends SwordBase {

		public SwordMagnetite(ToolMaterial material) {
			super(material);
		 
		}

	}
	public static class SwordNethiron extends SwordBase {

		public SwordNethiron(ToolMaterial material) {
			super(material);
		 
		}

	}
	public static class SwordRagnarite extends SwordBase {

		public SwordRagnarite(ToolMaterial material) {
			super(material);
		 
		}

	}

}
