/*
 * Copyright (c) 2005 - Ben Mazur (bmazur@sev.org)
 * Copyright (c) 2022-2024 - The MegaMek Team. All Rights Reserved.
 *
 * This file is part of MegaMek.
 *
 * MegaMek is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MegaMek is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MegaMek. If not, see <http://www.gnu.org/licenses/>.
 */
package megamek.common.weapons;

import megamek.common.Game;
import megamek.common.HitData;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.totalwarfare.TWGameManager;

import java.io.Serial;

import static megamek.common.weapons.DamageType.ACID;

/**
 * @author Sebastian Brocks
 */
public class SRMAXHandler extends SRMHandler {
    @Serial
    private static final long serialVersionUID = 8049199984294733124L;

    public SRMAXHandler(ToHitData t, WeaponAttackAction w, Game g, TWGameManager m) {
        super(t, w, g, m);
        sSalvoType = " acid-head missile(s) ";
        nSalvoBonus = -2;
        damageType = DamageType.ACID;
        generalDamageType = HitData.DAMAGE_AX;
    }
}
//Rules for AX Warheads are found in Tactical Operations: Advanced Units and Equipment (6th Printing), pg. 179
