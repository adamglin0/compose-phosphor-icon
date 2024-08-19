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

public val DuotoneGroup.`Pen-nib-duotone`: ImageVector
    get() {
        if (`_pen-nib-duotone` != null) {
            return `_pen-nib-duotone`!!
        }
        `_pen-nib-duotone` = Builder(name = "Pen-nib-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 48.0f)
                lineTo(68.32f, 70.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.08f, 6.17f)
                lineTo(40.0f, 216.0f)
                lineToRelative(139.45f, -23.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.17f, -5.08f)
                lineTo(208.0f, 128.0f)
                close()
                moveTo(124.0f, 152.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 124.0f, 152.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 92.68f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, false, -4.69f, -11.31f)
                lineTo(174.63f, 12.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineTo(123.57f, 41.11f)
                lineToRelative(-58.0f, 21.77f)
                arcTo(16.06f, 16.06f, 0.0f, false, false, 55.35f, 75.23f)
                lineTo(32.11f, 214.68f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 224.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 1.32f, -0.11f)
                lineToRelative(139.44f, -23.24f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.35f, -10.17f)
                lineToRelative(21.77f, -58.0f)
                lineTo(243.31f, 104.0f)
                arcTo(15.87f, 15.87f, 0.0f, false, false, 248.0f, 92.68f)
                close()
                moveTo(178.13f, 184.87f)
                lineTo(63.32f, 204.0f)
                lineToRelative(47.37f, -47.37f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -11.32f, -11.32f)
                lineTo(52.0f, 192.7f)
                lineTo(71.13f, 77.86f)
                lineTo(126.0f, 57.29f)
                lineTo(198.7f, 130.0f)
                close()
                moveTo(112.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 112.0f, 132.0f)
                close()
                moveTo(208.0f, 116.68f)
                lineTo(139.31f, 48.0f)
                lineToRelative(24.0f, -24.0f)
                lineTo(232.0f, 92.68f)
                close()
            }
        }
        .build()
        return `_pen-nib-duotone`!!
    }

private var `_pen-nib-duotone`: ImageVector? = null
