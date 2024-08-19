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

public val FillGroup.`Ruler-fill`: ImageVector
    get() {
        if (`_ruler-fill` != null) {
            return `_ruler-fill`!!
        }
        `_ruler-fill` = Builder(name = "Ruler-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.32f, 96.0f)
                lineTo(96.0f, 235.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, 0.0f)
                lineTo(20.68f, 182.63f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.63f)
                lineToRelative(29.17f, -29.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(34.83f, 34.83f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.71f, -0.43f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, -0.6f, -11.09f)
                lineTo(66.82f, 119.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.65f)
                lineToRelative(15.0f, -15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(34.83f, 34.83f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.71f, -0.43f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, -0.6f, -11.09f)
                lineTo(98.83f, 87.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.65f)
                lineToRelative(15.0f, -15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.65f, 0.0f)
                lineToRelative(34.83f, 34.83f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.72f, -0.43f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, -0.61f, -11.09f)
                lineTo(130.83f, 55.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.65f)
                lineTo(160.0f, 20.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 0.0f)
                lineToRelative(52.69f, 52.68f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 235.32f, 96.0f)
                close()
            }
        }
        .build()
        return `_ruler-fill`!!
    }

private var `_ruler-fill`: ImageVector? = null
