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

public val FillGroup.`Pentagon-fill`: ImageVector
    get() {
        if (`_pentagon-fill` != null) {
            return `_pentagon-fill`!!
        }
        `_pentagon-fill` = Builder(name = "Pentagon-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.26f, 105.19f)
                lineToRelative(-32.0f, 107.54f)
                lineToRelative(-0.06f, 0.17f)
                arcTo(15.94f, 15.94f, 0.0f, false, true, 184.0f, 224.0f)
                horizontalLineTo(72.0f)
                arcTo(15.94f, 15.94f, 0.0f, false, true, 56.8f, 212.9f)
                lineToRelative(-0.06f, -0.17f)
                lineToRelative(-32.0f, -107.54f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 5.7f, -17.63f)
                lineToRelative(87.92f, -68.31f)
                lineToRelative(0.18f, -0.14f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, true, 18.92f, 0.0f)
                lineToRelative(0.18f, 0.14f)
                lineToRelative(87.92f, 68.31f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 231.26f, 105.19f)
                close()
            }
        }
        .build()
        return `_pentagon-fill`!!
    }

private var `_pentagon-fill`: ImageVector? = null
