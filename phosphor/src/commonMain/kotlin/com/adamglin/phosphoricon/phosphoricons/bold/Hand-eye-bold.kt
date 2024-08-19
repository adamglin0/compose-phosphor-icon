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

public val BoldGroup.`Hand-eye-bold`: ImageVector
    get() {
        if (`_hand-eye-bold` != null) {
            return `_hand-eye-bold`!!
        }
        `_hand-eye-bold` = Builder(name = "Hand-eye-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 184.0f)
                close()
                moveTo(220.0f, 112.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -184.0f, 0.0f)
                lineTo(36.0f, 76.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 76.0f, 45.0f)
                lineTo(76.0f, 44.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 60.79f, -14.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 180.0f, 60.0f)
                lineTo(180.0f, 81.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 40.0f, 31.0f)
                close()
                moveTo(196.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(156.0f, 60.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(76.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 136.0f, 0.0f)
                close()
                moveTo(128.0f, 128.0f)
                arcToRelative(55.8f, 55.8f, 0.0f, false, false, -49.89f, 30.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 21.37f, 10.92f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 57.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 167.21f, 176.0f)
                arcToRelative(11.83f, 11.83f, 0.0f, false, false, 5.45f, -1.32f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.23f, -16.14f)
                arcTo(55.8f, 55.8f, 0.0f, false, false, 128.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_hand-eye-bold`!!
    }

private var `_hand-eye-bold`: ImageVector? = null
