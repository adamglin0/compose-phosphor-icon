package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Bell-z-thin`: ImageVector
    get() {
        if (`_bell-z-thin` != null) {
            return `_bell-z-thin`!!
        }
        `_bell-z-thin` = Builder(name = "Bell-z-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(112.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.33f, -6.22f)
                lineTo(136.53f, 100.0f)
                lineTo(112.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.33f, 6.22f)
                lineTo(119.47f, 140.0f)
                lineTo(144.0f, 140.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 148.0f, 144.0f)
                close()
                moveTo(218.38f, 190.0f)
                arcTo(11.84f, 11.84f, 0.0f, false, true, 208.0f, 196.0f)
                lineTo(163.77f, 196.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -71.54f, 0.0f)
                lineTo(48.0f, 196.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 37.65f, 178.0f)
                curveTo(43.42f, 168.0f, 52.0f, 140.13f, 52.0f, 104.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 152.0f, 0.0f)
                curveToRelative(0.0f, 36.13f, 8.59f, 64.0f, 14.36f, 73.95f)
                arcTo(11.92f, 11.92f, 0.0f, false, true, 218.38f, 190.0f)
                close()
                moveTo(155.71f, 196.0f)
                lineTo(100.29f, 196.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 55.42f, 0.0f)
                close()
                moveTo(211.43f, 182.0f)
                curveTo(204.0f, 169.17f, 196.0f, 139.31f, 196.0f, 104.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, -136.0f, 0.0f)
                curveToRelative(0.0f, 35.32f, -8.0f, 65.17f, -15.44f, 78.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 4.0f)
                arcTo(3.91f, 3.91f, 0.0f, false, false, 48.0f, 188.0f)
                lineTo(208.0f, 188.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, false, 3.44f, -2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 211.43f, 182.0f)
                close()
            }
        }
        .build()
        return `_bell-z-thin`!!
    }

private var `_bell-z-thin`: ImageVector? = null
