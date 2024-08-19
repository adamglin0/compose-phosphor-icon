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

public val LightGroup.`Bandaids-light`: ImageVector
    get() {
        if (`_bandaids-light` != null) {
            return `_bandaids-light`!!
        }
        `_bandaids-light` = Builder(name = "Bandaids-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(181.74f, 128.0f)
                lineToRelative(29.13f, -29.13f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, -53.74f, -53.74f)
                lineTo(128.0f, 74.26f)
                lineTo(98.87f, 45.13f)
                arcTo(38.0f, 38.0f, 0.0f, true, false, 45.13f, 98.87f)
                lineTo(74.26f, 128.0f)
                lineTo(45.13f, 157.13f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 53.74f, 53.74f)
                lineTo(128.0f, 181.74f)
                lineToRelative(29.13f, 29.13f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 53.74f, -53.74f)
                close()
                moveTo(165.62f, 53.62f)
                horizontalLineToRelative(0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 36.76f, 36.77f)
                lineToRelative(-29.13f, 29.13f)
                lineTo(136.49f, 82.75f)
                close()
                moveTo(164.77f, 128.0f)
                lineTo(128.0f, 164.77f)
                lineTo(91.23f, 128.0f)
                lineTo(128.0f, 91.23f)
                close()
                moveTo(53.62f, 90.38f)
                arcTo(26.0f, 26.0f, 0.0f, true, true, 90.38f, 53.62f)
                lineToRelative(29.13f, 29.13f)
                lineTo(82.75f, 119.52f)
                close()
                moveTo(90.38f, 202.38f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, -36.76f, -36.76f)
                lineToRelative(29.13f, -29.13f)
                lineToRelative(36.76f, 36.76f)
                close()
                moveTo(202.38f, 202.38f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -36.76f, 0.0f)
                lineToRelative(-29.14f, -29.13f)
                lineToRelative(36.77f, -36.77f)
                lineToRelative(29.13f, 29.14f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, 36.76f)
                close()
                moveTo(118.0f, 128.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 118.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_bandaids-light`!!
    }

private var `_bandaids-light`: ImageVector? = null
