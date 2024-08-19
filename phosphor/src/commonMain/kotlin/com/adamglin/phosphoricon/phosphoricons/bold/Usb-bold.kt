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

public val BoldGroup.`Usb-bold`: ImageVector
    get() {
        if (`_usb-bold` != null) {
            return `_usb-bold`!!
        }
        `_usb-bold` = Builder(name = "Usb-bold", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.2f, 118.4f)
                lineToRelative(-48.0f, -36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 184.0f, 92.0f)
                verticalLineToRelative(24.0f)
                lineTo(76.0f, 116.0f)
                lineTo(76.0f, 76.0f)
                lineTo(98.06f, 76.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 0.0f, -24.0f)
                lineTo(72.0f, 52.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 52.0f, 72.0f)
                verticalLineToRelative(44.0f)
                lineTo(12.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(52.0f, 140.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(96.0f, 204.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(168.0f, 176.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(116.0f, 156.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(4.0f)
                lineTo(76.0f, 180.0f)
                lineTo(76.0f, 140.0f)
                lineTo(184.0f, 140.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.2f, 9.6f)
                lineToRelative(48.0f, -36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -19.2f)
                close()
                moveTo(132.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 132.0f, 52.0f)
                close()
                moveTo(120.0f, 180.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                lineTo(120.0f, 204.0f)
                close()
                moveTo(208.0f, 140.0f)
                lineTo(208.0f, 116.0f)
                lineToRelative(16.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_usb-bold`!!
    }

private var `_usb-bold`: ImageVector? = null
