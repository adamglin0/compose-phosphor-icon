package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Seatbelt-fill`: ImageVector
    get() {
        if (`_seatbelt-fill` != null) {
            return `_seatbelt-fill`!!
        }
        `_seatbelt-fill` = Builder(name = "Seatbelt-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 112.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, -44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 128.0f, 112.0f)
                close()
                moveTo(200.0f, 216.0f)
                lineTo(77.16f, 216.0f)
                lineTo(197.29f, 110.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, 1.1f, -1.19f)
                arcToRelative(8.07f, 8.07f, 0.0f, false, false, 1.61f, -5.08f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 186.71f, 98.0f)
                lineToRelative(-24.54f, 21.65f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 49.0f, 179.25f)
                arcToRelative(8.33f, 8.33f, 0.0f, false, false, -0.1f, 1.1f)
                lineTo(48.0f, 223.83f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 56.0f, 232.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(188.12f, 143.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.25f, 1.94f)
                lineTo(119.47f, 200.0f)
                lineTo(200.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                arcToRelative(79.6f, 79.6f, 0.0f, false, false, -14.27f, -45.62f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 188.12f, 143.0f)
                close()
            }
        }
        .build()
        return `_seatbelt-fill`!!
    }

private var `_seatbelt-fill`: ImageVector? = null
