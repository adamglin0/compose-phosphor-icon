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

public val FillGroup.`Truck-trailer-fill`: ImageVector
    get() {
        if (`_truck-trailer-fill` != null) {
            return `_truck-trailer-fill`!!
        }
        `_truck-trailer-fill` = Builder(name = "Truck-trailer-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 96.8f)
                lineTo(224.0f, 96.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, -56.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                lineTo(144.0f, 176.0f)
                lineTo(128.0f, 176.0f)
                lineTo(128.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(16.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 80.0f)
                lineTo(0.0f, 184.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 56.0f, 21.13f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 111.0f, 192.0f)
                horizontalLineToRelative(82.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 63.0f, -8.0f)
                lineTo(256.0f, 136.0f)
                arcTo(40.07f, 40.07f, 0.0f, false, false, 224.0f, 96.8f)
                close()
                moveTo(32.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 200.0f)
                close()
                moveTo(80.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 200.0f)
                close()
                moveTo(224.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_truck-trailer-fill`!!
    }

private var `_truck-trailer-fill`: ImageVector? = null
