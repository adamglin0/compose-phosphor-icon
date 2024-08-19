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

public val ThinGroup.`Motorcycle-thin`: ImageVector
    get() {
        if (`_motorcycle-thin` != null) {
            return `_motorcycle-thin`!!
        }
        `_motorcycle-thin` = Builder(name = "Motorcycle-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 124.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -9.11f, 1.17f)
                lineToRelative(-8.64f, -22.46f)
                arcTo(59.64f, 59.64f, 0.0f, false, true, 216.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(194.13f, 92.0f)
                lineToRelative(-14.4f, -37.44f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 176.0f, 52.0f)
                lineTo(144.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(29.25f)
                lineToRelative(12.31f, 32.0f)
                lineTo(152.0f, 92.0f)
                curveToRelative(-17.56f, 0.0f, -31.67f, 4.0f, -40.83f, 11.54f)
                arcToRelative(20.05f, 20.05f, 0.0f, false, true, -21.0f, 2.63f)
                curveToRelative(-13.11f, -6.0f, -60.55f, -25.12f, -65.0f, -26.85f)
                curveTo(22.83f, 78.37f, 17.24f, 76.0f, 16.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.43f, 7.72f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.46f, 0.18f, 47.42f, 18.4f, 72.34f, 29.72f)
                arcToRelative(28.12f, 28.12f, 0.0f, false, false, 29.37f, -3.74f)
                curveToRelative(7.7f, -6.35f, 20.0f, -9.71f, 35.73f, -9.71f)
                horizontalLineToRelative(32.08f)
                arcToRelative(68.05f, 68.05f, 0.0f, false, false, -33.58f, 41.67f)
                arcTo(19.86f, 19.86f, 0.0f, false, true, 131.32f, 156.0f)
                lineTo(75.77f, 156.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 0.0f, 8.0f)
                horizontalLineToRelative(55.55f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, 26.89f, -20.18f)
                arcToRelative(60.06f, 60.06f, 0.0f, false, true, 32.58f, -38.22f)
                lineToRelative(8.64f, 22.46f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 216.0f, 124.0f)
                close()
                moveTo(40.0f, 164.0f)
                lineTo(67.71f, 164.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 0.0f, -8.0f)
                lineTo(40.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(216.0f, 188.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -13.68f, -52.42f)
                lineToRelative(10.0f, 25.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 164.0f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, false, 1.44f, -0.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.29f, -5.17f)
                lineToRelative(-9.94f, -25.86f)
                arcTo(28.0f, 28.0f, 0.0f, true, true, 216.0f, 188.0f)
                close()
            }
        }
        .build()
        return `_motorcycle-thin`!!
    }

private var `_motorcycle-thin`: ImageVector? = null
