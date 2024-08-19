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

public val BoldGroup.`High-heel-bold`: ImageVector
    get() {
        if (`_high-heel-bold` != null) {
            return `_high-heel-bold`!!
        }
        `_high-heel-bold` = Builder(name = "High-heel-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.93f, 152.31f)
                lineToRelative(-45.82f, -11.17f)
                lineTo(72.49f, 31.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.34f, 0.39f)
                curveTo(32.48f, 56.68f, 20.0f, 88.0f, 20.0f, 120.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(72.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(92.0f, 150.29f)
                lineToRelative(1.07f, 0.71f)
                arcToRelative(108.44f, 108.44f, 0.0f, false, true, 39.11f, 48.6f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 150.72f, 212.0f)
                lineTo(236.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineToRelative(-4.73f)
                arcTo(35.68f, 35.68f, 0.0f, false, false, 227.93f, 152.31f)
                close()
                moveTo(68.0f, 188.0f)
                lineTo(44.0f, 188.0f)
                lineTo(44.0f, 132.67f)
                arcToRelative(106.69f, 106.69f, 0.0f, false, true, 24.0f, 5.51f)
                close()
                moveTo(232.0f, 188.0f)
                lineTo(153.35f, 188.0f)
                arcToRelative(132.44f, 132.44f, 0.0f, false, false, -46.67f, -56.77f)
                arcToRelative(131.08f, 131.08f, 0.0f, false, false, -62.0f, -22.63f)
                arcTo(106.69f, 106.69f, 0.0f, false, true, 64.87f, 57.84f)
                lineTo(167.51f, 160.49f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, false, 5.65f, 3.17f)
                lineToRelative(49.2f, 12.0f)
                lineToRelative(0.25f, 0.06f)
                arcToRelative(11.84f, 11.84f, 0.0f, false, true, 9.39f, 11.6f)
                close()
            }
        }
        .build()
        return `_high-heel-bold`!!
    }

private var `_high-heel-bold`: ImageVector? = null
