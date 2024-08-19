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

public val LightGroup.`Beer-bottle-light`: ImageVector
    get() {
        if (`_beer-bottle-light` != null) {
            return `_beer-bottle-light`!!
        }
        `_beer-bottle-light` = Builder(name = "Beer-bottle-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.24f, 43.76f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineToRelative(3.11f, 3.11f)
                lineToRelative(-57.38f, 43.0f)
                lineToRelative(-38.67f, 7.74f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, false, -3.06f, 1.64f)
                lineTo(24.44f, 159.07f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 31.11f)
                lineToRelative(41.38f, 41.38f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 31.11f, 0.0f)
                lineToRelative(83.31f, -83.32f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, false, 1.64f, -3.06f)
                lineToRelative(7.74f, -38.67f)
                lineToRelative(43.0f, -57.38f)
                lineToRelative(3.11f, 3.11f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                close()
                moveTo(88.44f, 223.07f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -14.14f, 0.0f)
                lineTo(32.93f, 181.7f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -14.14f)
                lineTo(40.0f, 160.49f)
                lineTo(95.51f, 216.0f)
                close()
                moveTo(104.0f, 207.51f)
                lineTo(48.49f, 152.0f)
                lineTo(96.0f, 104.49f)
                lineTo(151.51f, 160.0f)
                close()
                moveTo(179.2f, 100.4f)
                arcToRelative(5.88f, 5.88f, 0.0f, false, false, -1.08f, 2.42f)
                lineTo(170.47f, 141.0f)
                lineTo(160.0f, 151.51f)
                lineTo(104.49f, 96.0f)
                lineTo(115.0f, 85.53f)
                lineToRelative(38.22f, -7.65f)
                arcToRelative(5.88f, 5.88f, 0.0f, false, false, 2.42f, -1.08f)
                lineToRelative(59.84f, -44.88f)
                lineToRelative(8.64f, 8.64f)
                close()
            }
        }
        .build()
        return `_beer-bottle-light`!!
    }

private var `_beer-bottle-light`: ImageVector? = null
