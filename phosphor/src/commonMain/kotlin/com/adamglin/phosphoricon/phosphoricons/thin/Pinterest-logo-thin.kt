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

public val ThinGroup.`Pinterest-logo-thin`: ImageVector
    get() {
        if (`_pinterest-logo-thin` != null) {
            return `_pinterest-logo-thin`!!
        }
        `_pinterest-logo-thin` = Builder(name = "Pinterest-logo-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 112.0f)
                curveToRelative(0.0f, 21.53f, -7.5f, 41.18f, -21.12f, 55.34f)
                curveTo(186.26f, 180.47f, 169.17f, 188.0f, 152.0f, 188.0f)
                curveToRelative(-21.35f, 0.0f, -33.52f, -8.76f, -39.76f, -15.57f)
                lineTo(99.89f, 224.92f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 96.0f, 228.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -0.92f, -0.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, -4.81f)
                lineToRelative(32.0f, -136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.78f, 1.84f)
                lineToRelative(-17.28f, 73.45f)
                curveTo(117.0f, 166.42f, 127.0f, 180.0f, 152.0f, 180.0f)
                curveToRelative(29.49f, 0.0f, 60.0f, -25.44f, 60.0f, -68.0f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 70.17f, 150.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.93f, 4.0f)
                arcTo(84.0f, 84.0f, 0.0f, true, true, 220.0f, 112.0f)
                close()
            }
        }
        .build()
        return `_pinterest-logo-thin`!!
    }

private var `_pinterest-logo-thin`: ImageVector? = null
