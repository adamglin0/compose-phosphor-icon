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

public val BoldGroup.`Hand-fist-bold`: ImageVector
    get() {
        if (`_hand-fist-bold` != null) {
            return `_hand-fist-bold`!!
        }
        `_hand-fist-bold` = Builder(name = "Hand-fist-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 76.0f)
                lineTo(188.0f, 76.0f)
                lineTo(188.0f, 64.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -60.0f, -26.8f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 69.27f, 54.54f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 20.0f, 88.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, false, 216.0f, 0.0f)
                lineTo(236.0f, 112.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 200.0f, 76.0f)
                close()
                moveTo(140.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(164.0f, 76.0f)
                lineTo(140.0f, 76.0f)
                close()
                moveTo(92.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(44.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(212.0f, 128.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 44.61f, 138.15f)
                arcTo(35.93f, 35.93f, 0.0f, false, false, 80.0f, 130.8f)
                arcToRelative(35.89f, 35.89f, 0.0f, false, false, 43.65f, 3.34f)
                arcTo(36.23f, 36.23f, 0.0f, false, false, 130.0f, 140.5f)
                arcTo(51.82f, 51.82f, 0.0f, false, false, 116.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(152.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(140.0f, 100.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_hand-fist-bold`!!
    }

private var `_hand-fist-bold`: ImageVector? = null
