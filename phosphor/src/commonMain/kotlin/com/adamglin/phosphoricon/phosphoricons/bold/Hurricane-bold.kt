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

public val BoldGroup.`Hurricane-bold`: ImageVector
    get() {
        if (`_hurricane-bold` != null) {
            return `_hurricane-bold`!!
        }
        `_hurricane-bold` = Builder(name = "Hurricane-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 92.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 92.0f)
                close()
                moveTo(128.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 140.0f)
                close()
                moveTo(163.37f, 43.0f)
                lineTo(171.51f, 15.35f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 157.89f, 0.19f)
                arcTo(194.0f, 194.0f, 0.0f, false, false, 97.77f, 23.74f)
                curveTo(57.36f, 48.28f, 36.0f, 84.33f, 36.0f, 128.0f)
                arcToRelative(92.15f, 92.15f, 0.0f, false, false, 56.63f, 85.0f)
                lineToRelative(-8.14f, 27.65f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 256.0f)
                arcToRelative(11.58f, 11.58f, 0.0f, false, false, 2.11f, -0.19f)
                arcToRelative(194.0f, 194.0f, 0.0f, false, false, 60.12f, -23.55f)
                curveTo(198.64f, 207.72f, 220.0f, 171.67f, 220.0f, 128.0f)
                arcTo(92.15f, 92.15f, 0.0f, false, false, 163.37f, 43.0f)
                close()
                moveTo(146.37f, 211.35f)
                arcToRelative(168.74f, 168.74f, 0.0f, false, true, -32.74f, 15.28f)
                lineToRelative(5.28f, -18.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.42f, -15.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 60.0f, 128.0f)
                curveToRelative(0.0f, -35.12f, 16.7f, -63.18f, 49.65f, -83.39f)
                arcToRelative(168.84f, 168.84f, 0.0f, false, true, 32.74f, -15.29f)
                lineToRelative(-5.28f, 18.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.42f, 15.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 196.0f, 128.0f)
                curveTo(196.0f, 163.12f, 179.3f, 191.17f, 146.35f, 211.39f)
                close()
            }
        }
        .build()
        return `_hurricane-bold`!!
    }

private var `_hurricane-bold`: ImageVector? = null
