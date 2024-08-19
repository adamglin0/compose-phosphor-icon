package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Drop-light`: ImageVector
    get() {
        if (`_drop-light` != null) {
            return `_drop-light`!!
        }
        `_drop-light` = Builder(name = "Drop-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.53f, 49.06f)
                arcToRelative(252.86f, 252.86f, 0.0f, false, false, -41.09f, -38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.88f, 0.0f)
                arcToRelative(252.86f, 252.86f, 0.0f, false, false, -41.09f, 38.0f)
                curveTo(56.34f, 80.26f, 42.0f, 113.09f, 42.0f, 144.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                curveTo(214.0f, 113.09f, 199.66f, 80.26f, 172.53f, 49.06f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(74.09f, 74.09f, 0.0f, false, true, -74.0f, -74.0f)
                curveToRelative(0.0f, -59.62f, 59.0f, -108.93f, 74.0f, -120.51f)
                curveTo(143.0f, 35.07f, 202.0f, 84.38f, 202.0f, 144.0f)
                arcTo(74.09f, 74.09f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(181.92f, 153.0f)
                arcTo(55.58f, 55.58f, 0.0f, false, true, 137.0f, 197.92f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.0f, 0.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.0f, -11.92f)
                curveToRelative(17.38f, -2.92f, 32.13f, -17.68f, 35.08f, -35.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.84f, 2.0f)
                close()
            }
        }
        .build()
        return `_drop-light`!!
    }

private var `_drop-light`: ImageVector? = null
