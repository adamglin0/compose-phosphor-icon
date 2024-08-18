package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Printer-fill`: ImageVector
    get() {
        if (`_printer-fill` != null) {
            return `_printer-fill`!!
        }
        `_printer-fill` = Builder(name = "Printer-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 96.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(200.0f, 184.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(64.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(56.0f, 184.0f)
                lineTo(24.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(16.0f, 96.0f)
                curveToRelative(0.0f, -13.23f, 11.36f, -24.0f, 25.33f, -24.0f)
                lineTo(56.0f, 72.0f)
                lineTo(56.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(192.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                lineTo(200.0f, 72.0f)
                horizontalLineToRelative(14.67f)
                curveTo(228.64f, 72.0f, 240.0f, 82.77f, 240.0f, 96.0f)
                close()
                moveTo(72.0f, 72.0f)
                lineTo(184.0f, 72.0f)
                lineTo(184.0f, 48.0f)
                lineTo(72.0f, 48.0f)
                close()
                moveTo(184.0f, 160.0f)
                lineTo(72.0f, 160.0f)
                verticalLineToRelative(48.0f)
                lineTo(184.0f, 208.0f)
                close()
                moveTo(200.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 116.0f)
                close()
            }
        }
        .build()
        return `_printer-fill`!!
    }

private var `_printer-fill`: ImageVector? = null
