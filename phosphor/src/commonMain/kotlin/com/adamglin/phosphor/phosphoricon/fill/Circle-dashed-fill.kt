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

public val FillGroup.`Circle-dashed-fill`: ImageVector
    get() {
        if (`_circle-dashed-fill` != null) {
            return `_circle-dashed-fill`!!
        }
        `_circle-dashed-fill` = Builder(name = "Circle-dashed-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(182.59f, 69.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.29f, 0.7f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 17.6f, 30.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.18f, 5.08f)
                arcToRelative(71.87f, 71.87f, 0.0f, false, false, -14.4f, -25.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 182.59f, 69.0f)
                close()
                moveTo(73.41f, 187.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.29f, -0.7f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -17.6f, -30.47f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 59.7f, 150.8f)
                arcToRelative(71.87f, 71.87f, 0.0f, false, false, 14.4f, 24.95f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 73.41f, 187.05f)
                close()
                moveTo(74.1f, 80.25f)
                arcToRelative(71.87f, 71.87f, 0.0f, false, false, -14.4f, 25.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.18f, -5.08f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 17.6f, -30.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.0f, 10.6f)
                close()
                moveTo(145.59f, 214.25f)
                arcToRelative(87.8f, 87.8f, 0.0f, false, true, -35.18f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.18f, -15.68f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, false, 28.82f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.18f, 15.68f)
                close()
                moveTo(151.84f, 51.25f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 57.61f)
                arcToRelative(7.89f, 7.89f, 0.0f, false, true, -1.6f, -0.16f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, false, -28.82f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -3.18f, -15.68f)
                arcToRelative(87.92f, 87.92f, 0.0f, false, true, 35.18f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 151.84f, 51.2f)
                close()
                moveTo(211.48f, 155.93f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -17.6f, 30.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.0f, -10.6f)
                arcToRelative(71.87f, 71.87f, 0.0f, false, false, 14.4f, -24.95f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.18f, 5.08f)
                close()
            }
        }
        .build()
        return `_circle-dashed-fill`!!
    }

private var `_circle-dashed-fill`: ImageVector? = null
