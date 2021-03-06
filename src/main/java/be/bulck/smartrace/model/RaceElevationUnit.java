/*
 * Smart Race
 * Copyright (C) 2015-2017 Fabien Vanden Bulck
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package be.bulck.smartrace.model;

/**
 * A model enum for representing the measure unit used for elevation.
 *
 * @author Fabien Vanden Bulck
 */
public enum RaceElevationUnit {
    UNDERTERMINED(-1),
    M(0),
    FT(1);

    private static final float M_RATE = 1.0F;
    private static final float FT_RATE = 3.28084F;

    private int value;

    RaceElevationUnit(int value) { this.value = value; }
    public int getValue() { return value; }

    public static RaceElevationUnit parse(int value) {
        for (RaceElevationUnit unit : RaceElevationUnit.values()) {
            if (unit.getValue() == value)
                return unit;
        }

        return UNDERTERMINED;
    }

    public static float compute(RaceElevationUnit unit, float elevation) {
        switch (unit) {
            case M: return elevation * M_RATE;
            case FT: return elevation * FT_RATE;
            default: return -1.0F;
        }
    }

    public static float ingest(RaceElevationUnit unit, float elevation) {
        switch (unit) {
            case M: return elevation / M_RATE;
            case FT: return elevation / FT_RATE;
            default: return -1.0F;
        }
    }
}
