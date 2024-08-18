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

public val FillGroup.`Broadcast-fill`: ImageVector
    get() {
        if (`_broadcast-fill` != null) {
            return `_broadcast-fill`!!
        }
        `_broadcast-fill` = Builder(name = "Broadcast-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 128.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 168.0f, 128.0f)
                close()
                moveTo(208.0f, 128.0f)
                arcToRelative(79.74f, 79.74f, 0.0f, false, false, -20.37f, -53.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.92f, 10.67f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 0.0f, 85.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.92f, 10.67f)
                arcTo(79.79f, 79.79f, 0.0f, false, false, 208.0f, 128.0f)
                close()
                moveTo(80.29f, 85.34f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 68.37f, 74.67f)
                arcToRelative(79.94f, 79.94f, 0.0f, false, false, 0.0f, 106.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.92f, -10.67f)
                arcToRelative(63.95f, 63.95f, 0.0f, false, true, 0.0f, -85.33f)
                close()
                moveTo(238.57f, 81.34f)
                arcTo(119.48f, 119.48f, 0.0f, false, false, 213.71f, 44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.42f, 11.2f)
                arcToRelative(103.9f, 103.9f, 0.0f, false, true, 0.0f, 145.56f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 213.71f, 212.0f)
                arcTo(120.12f, 120.12f, 0.0f, false, false, 238.57f, 81.29f)
                close()
                moveTo(32.17f, 168.48f)
                arcTo(103.9f, 103.9f, 0.0f, false, true, 53.71f, 55.22f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.29f, 44.0f)
                arcToRelative(119.87f, 119.87f, 0.0f, false, false, 0.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.42f, -11.2f)
                arcTo(103.61f, 103.61f, 0.0f, false, true, 32.17f, 168.48f)
                close()
            }
        }
        .build()
        return `_broadcast-fill`!!
    }

private var `_broadcast-fill`: ImageVector? = null
