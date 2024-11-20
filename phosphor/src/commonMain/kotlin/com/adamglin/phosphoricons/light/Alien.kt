package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Alien: ImageVector
    get() {
        if (_alien != null) {
            return _alien!!
        }
        _alien = Builder(name = "Alien", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 18.0f)
                arcToRelative(94.11f, 94.11f, 0.0f, false, false, -94.0f, 94.0f)
                curveToRelative(0.0f, 23.6f, 12.41f, 54.2f, 33.21f, 81.83f)
                curveTo(83.27f, 215.18f, 107.68f, 238.0f, 128.0f, 238.0f)
                reflectiveCurveToRelative(44.73f, -22.82f, 60.79f, -44.17f)
                curveTo(209.59f, 166.2f, 222.0f, 135.6f, 222.0f, 112.0f)
                arcTo(94.11f, 94.11f, 0.0f, false, false, 128.0f, 18.0f)
                close()
                moveTo(179.21f, 186.62f)
                curveTo(161.48f, 210.17f, 140.91f, 226.0f, 128.0f, 226.0f)
                reflectiveCurveToRelative(-33.48f, -15.83f, -51.21f, -39.38f)
                curveTo(57.8f, 161.37f, 46.0f, 132.78f, 46.0f, 112.0f)
                arcToRelative(82.0f, 82.0f, 0.0f, false, true, 164.0f, 0.0f)
                curveTo(210.0f, 132.78f, 198.2f, 161.37f, 179.21f, 186.62f)
                close()
                moveTo(118.0f, 136.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 80.0f, 98.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 118.0f, 136.0f)
                close()
                moveTo(104.0f, 138.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 104.0f, 138.0f)
                close()
                moveTo(176.0f, 98.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, 38.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 176.0f, 98.0f)
                close()
                moveTo(152.0f, 138.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, -26.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 152.0f, 138.0f)
                close()
                moveTo(150.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(112.0f, 190.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 150.0f, 184.0f)
                close()
            }
        }
        .build()
        return _alien!!
    }

private var _alien: ImageVector? = null
