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

public val BoldGroup.`Bird-bold`: ImageVector
    get() {
        if (`_bird-bold` != null) {
            return `_bird-bold`!!
        }
        `_bird-bold` = Builder(name = "Bird-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 72.0f)
                close()
                moveTo(244.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.34f, 10.0f)
                lineTo(220.0f, 102.42f)
                lineTo(220.0f, 120.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, true, 112.0f, 228.0f)
                lineTo(24.0f, 228.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 8.41f, 195.5f)
                lineToRelative(0.15f, -0.18f)
                lineTo(92.0f, 95.18f)
                lineTo(92.0f, 76.89f)
                curveTo(92.0f, 41.28f, 120.57f, 12.17f, 155.69f, 12.0f)
                lineTo(156.0f, 12.0f)
                arcToRelative(63.94f, 63.94f, 0.0f, false, true, 60.58f, 43.29f)
                lineTo(238.66f, 70.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 244.0f, 80.0f)
                close()
                moveTo(210.37f, 80.0f)
                lineTo(199.68f, 72.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.0f, -7.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 156.0f, 36.0f)
                horizontalLineToRelative(-0.19f)
                curveToRelative(-21.95f, 0.11f, -39.8f, 18.45f, -39.8f, 40.89f)
                lineTo(116.01f, 99.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.79f, 7.69f)
                lineTo(32.57f, 204.0f)
                lineTo(53.05f, 204.0f)
                lineToRelative(69.74f, -83.68f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 18.43f, 15.36f)
                lineTo(84.29f, 204.0f)
                lineTo(112.0f, 204.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, false, 84.0f, -84.0f)
                lineTo(196.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.35f, -10.0f)
                close()
            }
        }
        .build()
        return `_bird-bold`!!
    }

private var `_bird-bold`: ImageVector? = null
