package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Graphics-card`: ImageVector
    get() {
        if (`_graphics-card` != null) {
            return `_graphics-card`!!
        }
        `_graphics-card` = Builder(name = "Graphics-card", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 48.0f)
                lineTo(16.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(8.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(24.0f, 192.0f)
                lineTo(40.0f, 192.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(56.0f, 192.0f)
                lineTo(72.0f, 192.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(88.0f, 192.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(120.0f, 192.0f)
                lineTo(232.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(248.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 232.0f, 48.0f)
                close()
                moveTo(232.0f, 176.0f)
                lineTo(24.0f, 176.0f)
                lineTo(24.0f, 64.0f)
                lineTo(232.0f, 64.0f)
                close()
                moveTo(176.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 176.0f, 160.0f)
                close()
                moveTo(152.0f, 120.0f)
                arcToRelative(23.74f, 23.74f, 0.0f, false, true, 2.35f, -10.34f)
                lineToRelative(32.0f, 32.0f)
                arcTo(23.74f, 23.74f, 0.0f, false, true, 176.0f, 144.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 120.0f)
                close()
                moveTo(200.0f, 120.0f)
                arcToRelative(23.74f, 23.74f, 0.0f, false, true, -2.35f, 10.34f)
                lineToRelative(-32.0f, -32.0f)
                arcTo(23.74f, 23.74f, 0.0f, false, true, 176.0f, 96.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 200.0f, 120.0f)
                close()
                moveTo(80.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 80.0f, 160.0f)
                close()
                moveTo(56.0f, 120.0f)
                arcToRelative(23.74f, 23.74f, 0.0f, false, true, 2.35f, -10.34f)
                lineToRelative(32.0f, 32.0f)
                arcTo(23.74f, 23.74f, 0.0f, false, true, 80.0f, 144.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 56.0f, 120.0f)
                close()
                moveTo(104.0f, 120.0f)
                arcToRelative(23.74f, 23.74f, 0.0f, false, true, -2.35f, 10.34f)
                lineToRelative(-32.0f, -32.0f)
                arcTo(23.74f, 23.74f, 0.0f, false, true, 80.0f, 96.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 104.0f, 120.0f)
                close()
            }
        }
        .build()
        return `_graphics-card`!!
    }

private var `_graphics-card`: ImageVector? = null
