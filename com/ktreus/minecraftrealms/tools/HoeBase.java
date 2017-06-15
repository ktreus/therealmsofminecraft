package com.ktreus.minecraftrealms.tools;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class HoeBase extends ItemHoe {

	public HoeBase(ToolMaterial material) {
		super(material);
		// TODO Auto-generated constructor stub
	}
	public static class HoeCobalt extends HoeBase {

		public HoeCobalt(ToolMaterial material) {
			super(material);
		}

	}
	public static class HoeEnderCristal extends HoeBase {

		public HoeEnderCristal(ToolMaterial material) {
			super(material);
		 
		}

	}
	public static class HoeEndernite extends HoeBase {

		public HoeEndernite(ToolMaterial material) {
			super(material);
		 
		}

	}
	public static class HoeMagnetite extends HoeBase {

		public HoeMagnetite(ToolMaterial material) {
			super(material);
		 
		}

	}
	public static class HoeNethiron extends HoeBase {

		public HoeNethiron(ToolMaterial material) {
			super(material);
		 
		}

	}
	public static class HoeRagnarite extends HoeBase {

		public HoeRagnarite(ToolMaterial material) {
			super(material);
		 
		}

	}

}
