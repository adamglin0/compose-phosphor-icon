package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Seatbelt-duotone`: ImageVector
    get() {
        if (`_seatbelt-duotone` != null) {
            return `_seatbelt-duotone`!!
        }
        `_seatbelt-duotone` = Builder(name = "Seatbelt-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(92.0f, 68.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 68.0f)
                close()
                moveTo(128.0f, 120.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -72.0f, 72.0f)
                verticalLineToRelative(32.0f)
                lineTo(200.0f, 224.0f)
                lineTo(200.0f, 192.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 128.0f, 120.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 68.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 172.0f, 68.0f)
                close()
                moveTo(128.0f, 96.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 96.0f)
                close()
                moveTo(208.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(56.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.29f, -14.0f)
                lineToRelative(98.07f, -86.54f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -84.0f, 50.33f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 49.0f, 179.25f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 113.16f, -59.59f)
                lineTo(186.71f, 98.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.58f, 12.0f)
                lineTo(77.16f, 216.0f)
                lineTo(200.0f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 224.0f)
                close()
                moveTo(193.73f, 146.38f)
                arcTo(79.6f, 79.6f, 0.0f, false, true, 208.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(63.67f, 63.67f, 0.0f, false, false, -11.41f, -36.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.14f, -9.13f)
                close()
            }
        }
        .build()
        return `_seatbelt-duotone`!!
    }

private var `_seatbelt-duotone`: ImageVector? = null
