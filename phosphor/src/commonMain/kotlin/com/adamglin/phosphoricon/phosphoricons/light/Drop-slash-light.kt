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

public val LightGroup.`Drop-slash-light`: ImageVector
    get() {
        if (`_drop-slash-light` != null) {
            return `_drop-slash-light`!!
        }
        `_drop-slash-light` = Builder(name = "Drop-slash-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineToRelative(23.7f, 26.07f)
                curveTo(50.51f, 94.93f, 42.0f, 119.77f, 42.0f, 144.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 147.28f, 60.33f)
                lineTo(203.56f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(74.09f, 74.09f, 0.0f, false, true, -74.0f, -74.0f)
                curveToRelative(0.0f, -21.0f, 7.27f, -42.76f, 21.59f, -64.73f)
                lineTo(181.18f, 195.42f)
                arcTo(73.81f, 73.81f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(91.4f, 49.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.2f, -8.49f)
                arcToRelative(245.6f, 245.6f, 0.0f, false, true, 33.36f, -29.49f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.88f, 0.0f)
                arcToRelative(251.42f, 251.42f, 0.0f, false, true, 41.09f, 38.0f)
                curveTo(199.66f, 80.26f, 214.0f, 113.09f, 214.0f, 144.0f)
                arcToRelative(86.2f, 86.2f, 0.0f, false, true, -3.08f, 22.87f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.78f, 4.41f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -1.59f, -0.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.2f, -7.38f)
                arcTo(74.0f, 74.0f, 0.0f, false, false, 202.0f, 144.0f)
                curveToRelative(0.0f, -59.63f, -59.0f, -108.94f, -74.0f, -120.52f)
                arcTo(253.83f, 253.83f, 0.0f, false, false, 99.88f, 48.86f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 91.4f, 49.07f)
                close()
            }
        }
        .build()
        return `_drop-slash-light`!!
    }

private var `_drop-slash-light`: ImageVector? = null
