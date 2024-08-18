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

public val FillGroup.`Paint-brush-fill`: ImageVector
    get() {
        if (`_paint-brush-fill` != null) {
            return `_paint-brush-fill`!!
        }
        `_paint-brush-fill` = Builder(name = "Paint-brush-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                curveToRelative(-44.08f, 0.0f, -89.31f, 49.71f, -114.43f, 82.63f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 32.0f, 164.0f)
                curveToRelative(0.0f, 30.88f, -19.54f, 44.73f, -20.47f, 45.37f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 224.0f)
                lineTo(92.0f, 224.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 57.37f, -77.57f)
                curveTo(182.3f, 121.31f, 232.0f, 76.08f, 232.0f, 32.0f)
                close()
                moveTo(124.42f, 113.55f)
                quadToRelative(5.14f, -6.66f, 10.09f, -12.55f)
                arcTo(76.23f, 76.23f, 0.0f, false, true, 155.0f, 121.49f)
                quadToRelative(-5.9f, 4.94f, -12.55f, 10.09f)
                arcTo(60.54f, 60.54f, 0.0f, false, false, 124.42f, 113.55f)
                close()
                moveTo(167.12f, 110.87f)
                arcToRelative(92.57f, 92.57f, 0.0f, false, false, -22.0f, -22.0f)
                curveToRelative(31.78f, -34.53f, 55.75f, -45.0f, 69.9f, -47.91f)
                curveTo(212.17f, 55.12f, 201.65f, 79.09f, 167.12f, 110.87f)
                close()
            }
        }
        .build()
        return `_paint-brush-fill`!!
    }

private var `_paint-brush-fill`: ImageVector? = null
