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

public val BoldGroup.`Leaf-bold`: ImageVector
    get() {
        if (`_leaf-bold` != null) {
            return `_leaf-bold`!!
        }
        `_leaf-bold` = Builder(name = "Leaf-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.42f, 39.86f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.28f, -11.28f)
                curveToRelative(-39.6f, -2.33f, -74.59f, 2.34f, -104.0f, 13.87f)
                curveTo(84.0f, 53.48f, 62.31f, 70.58f, 49.39f, 91.9f)
                curveToRelative(-17.62f, 29.11f, -17.66f, 64.45f, -0.45f, 98.19f)
                lineTo(31.51f, 207.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(17.43f, -17.43f)
                curveToRelative(16.74f, 8.54f, 33.88f, 12.85f, 50.45f, 12.85f)
                arcToRelative(91.31f, 91.31f, 0.0f, false, false, 47.74f, -13.3f)
                curveToRelative(21.32f, -12.92f, 38.42f, -34.62f, 49.45f, -62.75f)
                curveTo(225.08f, 114.46f, 229.75f, 79.46f, 227.42f, 39.86f)
                close()
                moveTo(151.66f, 186.08f)
                curveTo(131.57f, 198.25f, 108.0f, 199.17f, 83.94f, 189.0f)
                lineToRelative(84.54f, -84.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, -17.0f)
                lineTo(67.0f, 172.06f)
                curveToRelative(-10.14f, -24.0f, -9.22f, -47.63f, 3.0f, -67.72f)
                curveToRelative(20.91f, -34.53f, 70.54f, -53.72f, 134.0f, -52.25f)
                curveTo(205.38f, 115.53f, 186.19f, 165.17f, 151.66f, 186.08f)
                close()
            }
        }
        .build()
        return `_leaf-bold`!!
    }

private var `_leaf-bold`: ImageVector? = null
