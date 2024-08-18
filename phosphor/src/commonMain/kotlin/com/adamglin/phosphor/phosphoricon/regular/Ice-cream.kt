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

public val RegularGroup.`Ice-cream`: ImageVector
    get() {
        if (`_ice-cream` != null) {
            return `_ice-cream`!!
        }
        `_ice-cream` = Builder(name = "Ice-cream", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 97.37f)
                lineTo(208.0f, 96.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 48.0f, 96.0f)
                verticalLineToRelative(1.37f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 56.0f, 144.0f)
                horizontalLineToRelative(3.29f)
                lineToRelative(54.82f, 95.94f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 27.78f, 0.0f)
                lineTo(196.71f, 144.0f)
                lineTo(200.0f, 144.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 8.0f, -46.63f)
                close()
                moveTo(77.71f, 144.0f)
                lineTo(97.07f, 144.0f)
                lineToRelative(40.61f, 71.06f)
                lineTo(128.0f, 232.0f)
                close()
                moveTo(134.79f, 144.0f)
                lineTo(156.54f, 182.06f)
                lineTo(146.89f, 198.94f)
                lineTo(115.5f, 144.0f)
                close()
                moveTo(165.79f, 165.94f)
                lineTo(153.21f, 144.0f)
                horizontalLineToRelative(25.08f)
                close()
                moveTo(200.0f, 128.0f)
                lineTo(56.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(64.0f, 96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 128.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_ice-cream`!!
    }

private var `_ice-cream`: ImageVector? = null
