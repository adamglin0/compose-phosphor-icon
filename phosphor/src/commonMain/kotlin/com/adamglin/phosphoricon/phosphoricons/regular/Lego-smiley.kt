package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Lego-smiley`: ImageVector
    get() {
        if (`_lego-smiley` != null) {
            return `_lego-smiley`!!
        }
        `_lego-smiley` = Builder(name = "Lego-smiley", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 124.0f)
                close()
                moveTo(156.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 100.0f)
                close()
                moveTo(151.73f, 145.23f)
                arcToRelative(45.0f, 45.0f, 0.0f, false, true, -47.46f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.54f, 13.54f)
                arcToRelative(61.0f, 61.0f, 0.0f, false, false, 64.54f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.54f, -13.54f)
                close()
                moveTo(216.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, true, -24.0f, 31.0f)
                verticalLineToRelative(17.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(80.0f, 240.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(64.0f, 207.0f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, true, -24.0f, -31.0f)
                lineTo(40.0f, 80.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 72.0f, 48.0f)
                lineTo(88.0f, 48.0f)
                lineTo(88.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(168.0f, 48.0f)
                horizontalLineToRelative(16.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 216.0f, 80.0f)
                close()
                moveTo(104.0f, 48.0f)
                horizontalLineToRelative(48.0f)
                lineTo(152.0f, 32.0f)
                lineTo(104.0f, 32.0f)
                close()
                moveTo(176.0f, 224.0f)
                lineTo(176.0f, 208.0f)
                lineTo(80.0f, 208.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(200.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(72.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(184.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                close()
            }
        }
        .build()
        return `_lego-smiley`!!
    }

private var `_lego-smiley`: ImageVector? = null
