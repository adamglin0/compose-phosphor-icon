package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Wifi-x-fill`: ImageVector
    get() {
        if (`_wifi-x-fill` != null) {
            return `_wifi-x-fill`!!
        }
        `_wifi-x-fill` = Builder(name = "Wifi-x-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.66f, 98.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(200.0f, 91.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(188.69f, 80.0f)
                lineTo(170.34f, 61.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(200.0f, 68.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(211.31f, 80.0f)
                close()
                moveTo(206.85f, 131.0f)
                arcToRelative(32.75f, 32.75f, 0.0f, false, true, -4.15f, -3.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.37f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -45.18f, -45.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.34f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 149.0f, 38.91f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.11f, -6.08f)
                quadTo(137.0f, 32.0f, 128.0f, 32.0f)
                arcTo(186.67f, 186.67f, 0.0f, false, false, 14.28f, 70.1f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 8.11f, 80.91f)
                arcTo(15.65f, 15.65f, 0.0f, false, false, 11.65f, 92.8f)
                lineToRelative(104.0f, 125.43f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 128.0f, 224.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, 12.31f, -5.77f)
                lineToRelative(67.45f, -81.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 206.85f, 131.0f)
                close()
            }
        }
        .build()
        return `_wifi-x-fill`!!
    }

private var `_wifi-x-fill`: ImageVector? = null
