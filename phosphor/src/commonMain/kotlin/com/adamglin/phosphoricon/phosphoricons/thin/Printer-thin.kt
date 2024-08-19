package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Printer-thin`: ImageVector
    get() {
        if (`_printer-thin` != null) {
            return `_printer-thin`!!
        }
        `_printer-thin` = Builder(name = "Printer-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.67f, 76.0f)
                lineTo(196.0f, 76.0f)
                lineTo(196.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(64.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(60.0f, 76.0f)
                lineTo(41.33f, 76.0f)
                curveTo(29.57f, 76.0f, 20.0f, 85.0f, 20.0f, 96.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(60.0f, 180.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(192.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(196.0f, 180.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(236.0f, 96.0f)
                curveTo(236.0f, 85.0f, 226.43f, 76.0f, 214.67f, 76.0f)
                close()
                moveTo(68.0f, 44.0f)
                lineTo(188.0f, 44.0f)
                lineTo(188.0f, 76.0f)
                lineTo(68.0f, 76.0f)
                close()
                moveTo(188.0f, 212.0f)
                lineTo(68.0f, 212.0f)
                lineTo(68.0f, 156.0f)
                lineTo(188.0f, 156.0f)
                close()
                moveTo(228.0f, 172.0f)
                lineTo(196.0f, 172.0f)
                lineTo(196.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(64.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(20.0f)
                lineTo(28.0f, 172.0f)
                lineTo(28.0f, 96.0f)
                curveToRelative(0.0f, -6.62f, 6.0f, -12.0f, 13.33f, -12.0f)
                lineTo(214.67f, 84.0f)
                curveTo(222.0f, 84.0f, 228.0f, 89.38f, 228.0f, 96.0f)
                close()
                moveTo(196.0f, 116.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 196.0f, 116.0f)
                close()
            }
        }
        .build()
        return `_printer-thin`!!
    }

private var `_printer-thin`: ImageVector? = null
