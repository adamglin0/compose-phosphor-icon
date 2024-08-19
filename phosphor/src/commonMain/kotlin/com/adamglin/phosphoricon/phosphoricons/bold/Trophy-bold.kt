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

public val BoldGroup.`Trophy-bold`: ImageVector
    get() {
        if (`_trophy-bold` != null) {
            return `_trophy-bold`!!
        }
        `_trophy-bold` = Builder(name = "Trophy-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 60.0f)
                lineTo(212.0f, 60.0f)
                lineTo(212.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(56.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 48.0f)
                lineTo(44.0f, 60.0f)
                lineTo(24.0f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 4.0f, 80.0f)
                lineTo(4.0f, 96.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, 44.0f)
                horizontalLineToRelative(0.77f)
                arcTo(84.18f, 84.18f, 0.0f, false, false, 116.0f, 195.15f)
                lineTo(116.0f, 212.0f)
                lineTo(96.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(140.0f, 212.0f)
                lineTo(140.0f, 195.11f)
                curveToRelative(30.94f, -4.51f, 56.53f, -26.2f, 67.0f, -55.11f)
                horizontalLineToRelative(1.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, -44.0f)
                lineTo(252.0f, 80.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 232.0f, 60.0f)
                close()
                moveTo(28.0f, 96.0f)
                lineTo(28.0f, 84.0f)
                lineTo(44.0f, 84.0f)
                verticalLineToRelative(28.0f)
                curveToRelative(0.0f, 1.21f, 0.0f, 2.41f, 0.09f, 3.61f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 28.0f, 96.0f)
                close()
                moveTo(188.0f, 111.1f)
                curveToRelative(0.0f, 33.33f, -26.71f, 60.65f, -59.54f, 60.9f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 68.0f, 112.0f)
                lineTo(68.0f, 60.0f)
                lineTo(188.0f, 60.0f)
                close()
                moveTo(228.0f, 96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -16.12f, 19.62f)
                curveToRelative(0.08f, -1.5f, 0.12f, -3.0f, 0.12f, -4.52f)
                lineTo(212.0f, 84.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return `_trophy-bold`!!
    }

private var `_trophy-bold`: ImageVector? = null
