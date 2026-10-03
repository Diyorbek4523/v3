package uz.uchar;

import net.minecraft.client.KeyMapping;
import net.minecraft.resources.Identifier;

/** Barcha Uchar tugmalari uchun umumiy bo'lim (Controls menyusida "Uchar"). */
public final class Keys {
	public static final KeyMapping.Category CATEGORY = KeyMapping.Category.register(
			Identifier.fromNamespaceAndPath("uchar", "main"));

	private Keys() {
	}
}
