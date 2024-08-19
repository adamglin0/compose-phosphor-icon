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

public val ThinGroup.`Power-thin`: ImageVector
    get() {
        if (`_power-thin` != null) {
            return `_power-thin`!!
        }
        `_power-thin` = Builder(name = "Power-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 128.0f)
                lineTo(124.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(178.18f, 52.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.36f, 6.7f)
                curveTo(198.08f, 75.17f, 212.0f, 100.2f, 212.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, -168.0f, 0.0f)
                curveToRelative(0.0f, -27.8f, 13.92f, -52.83f, 38.18f, -68.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.36f, -6.7f)
                curveTo(51.24f, 70.0f, 36.0f, 97.44f, 36.0f, 128.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                curveTo(220.0f, 97.44f, 204.76f, 70.0f, 178.18f, 52.65f)
                close()
            }
        }
        .build()
        return `_power-thin`!!
    }

private var `_power-thin`: ImageVector? = null
