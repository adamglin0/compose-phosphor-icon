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

public val ThinGroup.`Beer-bottle-thin`: ImageVector
    get() {
        if (`_beer-bottle-thin` != null) {
            return `_beer-bottle-thin`!!
        }
        `_beer-bottle-thin` = Builder(name = "Beer-bottle-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.83f, 45.17f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineToRelative(4.74f, 4.74f)
                lineTo(150.33f, 68.26f)
                lineToRelative(-39.11f, 7.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.0f, 1.09f)
                lineTo(25.86f, 160.49f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.28f)
                lineToRelative(41.37f, 41.37f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.28f, 0.0f)
                lineToRelative(83.32f, -83.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.09f, -2.05f)
                lineToRelative(7.82f, -39.11f)
                lineToRelative(44.69f, -59.58f)
                lineToRelative(4.74f, 4.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f)
                close()
                moveTo(89.83f, 224.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(31.51f, 183.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineTo(40.0f, 157.66f)
                lineTo(98.34f, 216.0f)
                close()
                moveTo(104.0f, 210.34f)
                lineTo(45.66f, 152.0f)
                lineTo(96.0f, 101.66f)
                lineTo(154.34f, 160.0f)
                close()
                moveTo(180.8f, 101.6f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, false, -0.72f, 1.62f)
                lineTo(172.32f, 142.0f)
                lineTo(160.0f, 154.34f)
                lineTo(101.66f, 96.0f)
                lineTo(114.0f, 83.68f)
                lineToRelative(38.81f, -7.76f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, false, 1.62f, -0.72f)
                lineToRelative(61.22f, -45.92f)
                lineToRelative(11.1f, 11.1f)
                close()
            }
        }
        .build()
        return `_beer-bottle-thin`!!
    }

private var `_beer-bottle-thin`: ImageVector? = null
