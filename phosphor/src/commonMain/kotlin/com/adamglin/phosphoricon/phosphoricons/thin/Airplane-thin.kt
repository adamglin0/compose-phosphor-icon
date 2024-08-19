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

public val ThinGroup.`Airplane-thin`: ImageVector
    get() {
        if (`_airplane-thin` != null) {
            return `_airplane-thin`!!
        }
        `_airplane-thin` = Builder(name = "Airplane-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.79f, 132.42f)
                lineTo(156.0f, 93.53f)
                verticalLineTo(48.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                verticalLineTo(93.53f)
                lineTo(22.21f, 132.42f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 136.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.78f, 3.92f)
                lineToRelative(75.22f, -15.0f)
                verticalLineToRelative(25.46f)
                lineTo(85.17f, 197.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 84.0f, 200.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.49f, 3.71f)
                lineTo(128.0f, 220.31f)
                lineToRelative(38.51f, 15.4f)
                arcTo(3.87f, 3.87f, 0.0f, false, false, 168.0f, 236.0f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, 2.24f, -0.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 172.0f, 232.0f)
                verticalLineTo(200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.17f, -2.83f)
                lineTo(156.0f, 182.34f)
                verticalLineTo(156.88f)
                lineToRelative(75.22f, 15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 236.0f, 168.0f)
                verticalLineTo(136.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 233.79f, 132.42f)
                close()
                moveTo(228.0f, 163.12f)
                lineToRelative(-75.22f, -15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 148.0f, 152.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.17f, 2.83f)
                lineTo(164.0f, 201.66f)
                verticalLineToRelative(24.43f)
                lineToRelative(-34.51f, -13.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(92.0f, 226.09f)
                verticalLineTo(201.66f)
                lineToRelative(14.83f, -14.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 108.0f, 184.0f)
                verticalLineTo(152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.78f, -3.92f)
                lineTo(28.0f, 163.12f)
                verticalLineTo(138.47f)
                lineToRelative(77.79f, -38.89f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 108.0f, 96.0f)
                verticalLineTo(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.21f, 3.58f)
                lineTo(228.0f, 138.47f)
                close()
            }
        }
        .build()
        return `_airplane-thin`!!
    }

private var `_airplane-thin`: ImageVector? = null
