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

public val BoldGroup.`Pen-nib-bold`: ImageVector
    get() {
        if (`_pen-nib-bold` != null) {
            return `_pen-nib-bold`!!
        }
        `_pen-nib-bold` = Builder(name = "Pen-nib-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 92.68f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, -5.86f, -14.14f)
                lineTo(177.46f, 9.85f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.29f, 0.0f)
                lineTo(121.35f, 37.67f)
                lineTo(64.11f, 59.14f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 51.4f, 74.58f)
                lineTo(28.16f, 214.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 228.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 2.0f, -0.16f)
                lineToRelative(139.45f, -23.25f)
                arcToRelative(20.07f, 20.07f, 0.0f, false, false, 15.44f, -12.7f)
                lineToRelative(21.46f, -57.25f)
                lineToRelative(27.82f, -27.82f)
                arcTo(19.85f, 19.85f, 0.0f, false, false, 252.0f, 92.68f)
                close()
                moveTo(175.2f, 181.3f)
                lineTo(75.0f, 198.0f)
                lineToRelative(33.0f, -33.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -17.0f, -17.0f)
                lineTo(58.0f, 181.0f)
                lineTo(74.7f, 80.8f)
                lineTo(125.0f, 61.94f)
                lineTo(194.05f, 131.0f)
                close()
                moveTo(112.0f, 134.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 112.0f, 134.0f)
                close()
                moveTo(208.0f, 111.0f)
                lineTo(145.0f, 48.0f)
                lineToRelative(18.34f, -18.34f)
                lineToRelative(63.0f, 63.0f)
                close()
            }
        }
        .build()
        return `_pen-nib-bold`!!
    }

private var `_pen-nib-bold`: ImageVector? = null
