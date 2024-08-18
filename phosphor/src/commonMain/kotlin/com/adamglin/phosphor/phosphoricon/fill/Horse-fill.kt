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

public val FillGroup.`Horse-fill`: ImageVector
    get() {
        if (`_horse-fill` != null) {
            return `_horse-fill`!!
        }
        `_horse-fill` = Builder(name = "Horse-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.05f, 55.0f)
                arcTo(103.24f, 103.24f, 0.0f, false, false, 128.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(59.53f)
                lineTo(11.81f, 121.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.59f, 11.05f)
                lineToRelative(13.78f, 22.0f)
                lineToRelative(0.3f, 0.43f)
                arcToRelative(31.84f, 31.84f, 0.0f, false, false, 31.34f, 12.83f)
                curveToRelative(13.93f, -2.36f, 38.62f, -6.54f, 61.4f, 3.29f)
                lineToRelative(-26.6f, 36.57f)
                arcTo(84.71f, 84.71f, 0.0f, false, true, 69.34f, 194.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 58.67f, 206.0f)
                arcToRelative(103.32f, 103.32f, 0.0f, false, false, 69.26f, 26.0f)
                lineToRelative(2.17f, 0.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 72.0f, -177.0f)
                close()
                moveTo(124.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 124.0f, 112.0f)
                close()
            }
        }
        .build()
        return `_horse-fill`!!
    }

private var `_horse-fill`: ImageVector? = null
