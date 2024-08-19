package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Crown-simple-bold`: ImageVector
    get() {
        if (`_crown-simple-bold` != null) {
            return `_crown-simple-bold`!!
        }
        `_crown-simple-bold` = Builder(name = "Crown-simple-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.63f, 70.0f)
                arcToRelative(19.82f, 19.82f, 0.0f, false, false, -23.55f, 4.71f)
                lineToRelative(-29.52f, 31.82f)
                lineTo(146.22f, 31.76f)
                lineToRelative(-0.06f, -0.14f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -36.32f, 0.0f)
                lineToRelative(-0.06f, 0.14f)
                lineTo(76.44f, 106.52f)
                lineTo(46.92f, 74.7f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -34.6f, 16.81f)
                curveToRelative(0.0f, 0.16f, 0.06f, 0.31f, 0.09f, 0.47f)
                lineTo(35.07f, 195.76f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 54.71f, 212.0f)
                horizontalLineTo(201.29f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.64f, -16.24f)
                lineTo(243.59f, 92.0f)
                curveToRelative(0.0f, -0.16f, 0.07f, -0.31f, 0.09f, -0.47f)
                arcTo(19.82f, 19.82f, 0.0f, false, false, 232.63f, 70.0f)
                close()
                moveTo(198.06f, 188.0f)
                horizontalLineTo(57.94f)
                lineTo(39.06f, 101.51f)
                lineTo(71.2f, 136.16f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 91.0f, 132.89f)
                lineToRelative(37.0f, -83.07f)
                lineToRelative(37.0f, 83.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.76f, 3.27f)
                lineToRelative(32.14f, -34.65f)
                close()
            }
        }
        .build()
        return `_crown-simple-bold`!!
    }

private var `_crown-simple-bold`: ImageVector? = null
