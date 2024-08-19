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

public val LightGroup.`Seatbelt-light`: ImageVector
    get() {
        if (`_seatbelt-light` != null) {
            return `_seatbelt-light`!!
        }
        `_seatbelt-light` = Builder(name = "Seatbelt-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 110.0f)
                arcTo(42.0f, 42.0f, 0.0f, true, false, 86.0f, 68.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 128.0f, 110.0f)
                close()
                moveTo(128.0f, 38.0f)
                arcTo(30.0f, 30.0f, 0.0f, true, true, 98.0f, 68.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 128.0f, 38.0f)
                close()
                moveTo(206.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(56.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.0f, -10.5f)
                lineToRelative(100.58f, -88.75f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, false, -89.78f, 50.72f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.91f, 5.05f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -1.0f, -0.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, -6.88f)
                arcTo(78.0f, 78.0f, 0.0f, false, true, 162.49f, 122.0f)
                lineTo(188.0f, 99.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 7.94f, 9.0f)
                lineTo(71.87f, 218.0f)
                lineTo(200.0f, 218.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 206.0f, 224.0f)
                close()
                moveTo(192.08f, 147.52f)
                arcTo(77.53f, 77.53f, 0.0f, false, true, 206.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(65.62f, 65.62f, 0.0f, false, false, -11.77f, -37.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.85f, -6.85f)
                close()
            }
        }
        .build()
        return `_seatbelt-light`!!
    }

private var `_seatbelt-light`: ImageVector? = null
