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

public val FillGroup.`Star-and-crescent-fill`: ImageVector
    get() {
        if (`_star-and-crescent-fill` != null) {
            return `_star-and-crescent-fill`!!
        }
        `_star-and-crescent-fill` = Builder(name = "Star-and-crescent-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 206.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.36f, 7.13f)
                arcTo(94.93f, 94.93f, 0.0f, false, true, 112.0f, 224.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 0.0f, -192.0f)
                arcToRelative(94.93f, 94.93f, 0.0f, false, true, 43.64f, 10.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 14.25f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, 142.56f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 206.4f)
                close()
                moveTo(251.17f, 120.65f)
                lineTo(224.67f, 109.22f)
                lineTo(222.36f, 79.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.14f, -4.47f)
                lineTo(189.63f, 97.42f)
                lineToRelative(-27.71f, -6.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.81f, 11.82f)
                lineTo(168.18f, 128.0f)
                lineToRelative(-15.07f, 25.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.81f, 11.82f)
                lineToRelative(27.71f, -6.85f)
                lineToRelative(18.59f, 22.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.14f, -4.47f)
                lineToRelative(2.31f, -29.84f)
                lineToRelative(26.5f, -11.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -14.7f)
                close()
            }
        }
        .build()
        return `_star-and-crescent-fill`!!
    }

private var `_star-and-crescent-fill`: ImageVector? = null
