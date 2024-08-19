package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Receipt-light`: ImageVector
    get() {
        if (`_receipt-light` != null) {
            return `_receipt-light`!!
        }
        `_receipt-light` = Builder(name = "Receipt-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(80.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 182.0f, 104.0f)
                close()
                moveTo(176.0f, 130.0f)
                lineTo(80.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(230.0f, 56.0f)
                lineTo(230.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.85f, 5.1f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, true, -3.15f, 0.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.68f, -0.63f)
                lineTo(192.0f, 198.71f)
                lineToRelative(-29.32f, 14.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.36f, 0.0f)
                lineTo(128.0f, 198.71f)
                lineTo(98.68f, 213.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.36f, 0.0f)
                lineTo(64.0f, 198.71f)
                lineTo(34.68f, 213.37f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 26.0f, 208.0f)
                lineTo(26.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 42.0f)
                lineTo(216.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 56.0f)
                close()
                moveTo(218.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(40.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(38.0f, 198.29f)
                lineToRelative(23.32f, -11.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.36f, 0.0f)
                lineTo(96.0f, 201.29f)
                lineToRelative(29.32f, -14.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.36f, 0.0f)
                lineTo(160.0f, 201.29f)
                lineToRelative(29.32f, -14.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.36f, 0.0f)
                lineTo(218.0f, 198.29f)
                close()
            }
        }
        .build()
        return `_receipt-light`!!
    }

private var `_receipt-light`: ImageVector? = null
