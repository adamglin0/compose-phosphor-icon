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

public val BoldGroup.`Shrimp-bold`: ImageVector
    get() {
        if (`_shrimp-bold` != null) {
            return `_shrimp-bold`!!
        }
        `_shrimp-bold` = Builder(name = "Shrimp-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 60.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                lineTo(128.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.9f, 68.0f)
                curveTo(50.43f, 68.0f, 12.34f, 105.4f, 12.0f, 151.37f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 96.0f, 236.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(124.0f, 212.0f)
                lineTo(124.0f, 196.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(112.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, false, 75.58f, -68.07f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 244.0f, 60.0f)
                close()
                moveTo(96.9f, 92.0f)
                lineTo(100.0f, 92.0f)
                verticalLineToRelative(42.34f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, false, -12.65f, 9.27f)
                lineToRelative(-44.0f, -20.0f)
                arcTo(61.19f, 61.19f, 0.0f, false, true, 96.9f, 92.0f)
                close()
                moveTo(36.0f, 151.54f)
                curveToRelative(0.0f, -1.61f, 0.11f, -3.21f, 0.25f, -4.79f)
                lineToRelative(43.87f, 19.94f)
                arcToRelative(30.18f, 30.18f, 0.0f, false, false, 0.66f, 4.29f)
                lineTo(51.31f, 192.0f)
                arcTo(59.54f, 59.54f, 0.0f, false, true, 36.0f, 151.54f)
                close()
                moveTo(96.0f, 212.0f)
                arcToRelative(59.8f, 59.8f, 0.0f, false, true, -24.23f, -5.09f)
                lineToRelative(22.66f, -16.18f)
                arcToRelative(32.47f, 32.47f, 0.0f, false, false, 5.57f, 2.93f)
                lineTo(100.0f, 212.0f)
                close()
                moveTo(152.0f, 132.0f)
                lineTo(124.0f, 132.0f)
                lineTo(124.0f, 92.0f)
                horizontalLineToRelative(78.6f)
                arcTo(52.08f, 52.08f, 0.0f, false, true, 152.0f, 132.0f)
                close()
            }
        }
        .build()
        return `_shrimp-bold`!!
    }

private var `_shrimp-bold`: ImageVector? = null
