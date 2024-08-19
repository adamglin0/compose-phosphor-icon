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

public val BoldGroup.`Cpu-bold`: ImageVector
    get() {
        if (`_cpu-bold` != null) {
            return `_cpu-bold`!!
        }
        `_cpu-bold` = Builder(name = "Cpu-bold", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 88.0f)
                lineTo(100.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(168.0f, 100.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 88.0f)
                close()
                moveTo(144.0f, 144.0f)
                lineTo(112.0f, 144.0f)
                lineTo(112.0f, 112.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(232.0f, 140.0f)
                lineTo(220.0f, 140.0f)
                lineTo(220.0f, 116.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(220.0f, 92.0f)
                lineTo(220.0f, 56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(164.0f, 36.0f)
                lineTo(164.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(140.0f, 36.0f)
                lineTo(116.0f, 36.0f)
                lineTo(116.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(92.0f, 36.0f)
                lineTo(56.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 56.0f)
                lineTo(36.0f, 92.0f)
                lineTo(24.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(36.0f, 116.0f)
                verticalLineToRelative(24.0f)
                lineTo(24.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(36.0f, 164.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(92.0f, 220.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(116.0f, 220.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(164.0f, 220.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 164.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(196.0f, 196.0f)
                lineTo(60.0f, 196.0f)
                lineTo(60.0f, 60.0f)
                lineTo(196.0f, 60.0f)
                close()
            }
        }
        .build()
        return `_cpu-bold`!!
    }

private var `_cpu-bold`: ImageVector? = null
