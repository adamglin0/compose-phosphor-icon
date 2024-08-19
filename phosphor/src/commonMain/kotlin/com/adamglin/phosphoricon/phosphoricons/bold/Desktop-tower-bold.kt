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

public val BoldGroup.`Desktop-tower-bold`: ImageVector
    get() {
        if (`_desktop-tower-bold` != null) {
            return `_desktop-tower-bold`!!
        }
        `_desktop-tower-bold` = Builder(name = "Desktop-tower-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(180.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 76.0f)
                close()
                moveTo(180.0f, 124.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(180.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(252.0f, 48.0f)
                lineTo(252.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(152.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(132.0f, 192.0f)
                lineTo(100.0f, 192.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(68.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(8.0f)
                lineTo(76.0f, 192.0f)
                lineTo(32.0f, 192.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 4.0f, 164.0f)
                lineTo(4.0f, 96.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 32.0f, 68.0f)
                lineTo(132.0f, 68.0f)
                lineTo(132.0f, 48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(80.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 252.0f, 48.0f)
                close()
                moveTo(132.0f, 168.0f)
                lineTo(132.0f, 92.0f)
                lineTo(32.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                close()
                moveTo(228.0f, 52.0f)
                lineTo(156.0f, 52.0f)
                lineTo(156.0f, 204.0f)
                horizontalLineToRelative(72.0f)
                close()
                moveTo(192.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 160.0f)
                close()
            }
        }
        .build()
        return `_desktop-tower-bold`!!
    }

private var `_desktop-tower-bold`: ImageVector? = null
