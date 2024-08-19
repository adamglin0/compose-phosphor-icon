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

public val BoldGroup.`Seat-bold`: ImageVector
    get() {
        if (`_seat-bold` != null) {
            return `_seat-bold`!!
        }
        `_seat-bold` = Builder(name = "Seat-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(112.0f, 244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(216.0f, 220.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 232.0f)
                close()
                moveTo(228.0f, 160.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(112.1f, 208.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -17.89f, -11.06f)
                lineTo(38.1f, 85.0f)
                arcToRelative(20.12f, 20.12f, 0.0f, false, true, 0.0f, -17.9f)
                lineTo(60.22f, 23.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 26.72f, -9.0f)
                lineToRelative(29.81f, 14.27f)
                lineToRelative(0.18f, 0.09f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 8.95f, 26.83f)
                lineToRelative(-0.17f, 0.33f)
                lineTo(112.5f, 80.08f)
                lineTo(142.25f, 140.0f)
                lineTo(208.0f, 140.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 160.0f)
                close()
                moveTo(204.0f, 164.0f)
                lineTo(139.77f, 164.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -17.89f, -11.06f)
                lineToRelative(-31.79f, -64.0f)
                arcToRelative(20.07f, 20.07f, 0.0f, false, true, 0.0f, -17.86f)
                curveToRelative(0.06f, -0.11f, 0.12f, -0.22f, 0.17f, -0.33f)
                lineToRelative(12.2f, -22.62f)
                lineTo(79.91f, 37.3f)
                lineTo(60.47f, 76.0f)
                lineToRelative(54.1f, 108.0f)
                lineTo(204.0f, 184.0f)
                close()
            }
        }
        .build()
        return `_seat-bold`!!
    }

private var `_seat-bold`: ImageVector? = null
