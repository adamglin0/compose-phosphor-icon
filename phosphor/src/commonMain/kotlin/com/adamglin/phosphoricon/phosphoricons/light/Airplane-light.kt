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

public val LightGroup.`Airplane-light`: ImageVector
    get() {
        if (`_airplane-light` != null) {
            return `_airplane-light`!!
        }
        `_airplane-light` = Builder(name = "Airplane-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.68f, 130.63f)
                lineTo(158.0f, 92.29f)
                verticalLineTo(48.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -60.0f, 0.0f)
                verticalLineTo(92.29f)
                lineTo(21.32f, 130.63f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 136.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.18f, 5.88f)
                lineTo(98.0f, 159.32f)
                verticalLineToRelative(22.19f)
                lineTo(83.76f, 195.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 82.0f, 200.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.23f, 5.57f)
                lineTo(128.0f, 222.46f)
                lineToRelative(37.77f, 15.11f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 174.0f, 232.0f)
                verticalLineTo(200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.76f, -4.24f)
                lineTo(158.0f, 181.51f)
                verticalLineTo(159.32f)
                lineToRelative(72.82f, 14.56f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 238.0f, 168.0f)
                verticalLineTo(136.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 234.68f, 130.63f)
                close()
                moveTo(226.0f, 160.68f)
                lineToRelative(-72.82f, -14.56f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 146.0f, 152.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.76f, 4.24f)
                lineTo(162.0f, 202.49f)
                verticalLineToRelative(20.65f)
                lineToRelative(-31.77f, -12.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.46f, 0.0f)
                lineTo(94.0f, 223.14f)
                verticalLineTo(202.49f)
                lineToRelative(14.24f, -14.25f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 110.0f, 184.0f)
                verticalLineTo(152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.18f, -5.88f)
                lineTo(30.0f, 160.68f)
                verticalLineToRelative(-21.0f)
                lineToRelative(76.68f, -38.34f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 110.0f, 96.0f)
                verticalLineTo(48.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                verticalLineTo(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.32f, 5.37f)
                lineTo(226.0f, 139.71f)
                close()
            }
        }
        .build()
        return `_airplane-light`!!
    }

private var `_airplane-light`: ImageVector? = null
