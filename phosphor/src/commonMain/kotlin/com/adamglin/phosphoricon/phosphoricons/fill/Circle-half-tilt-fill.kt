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

public val FillGroup.`Circle-half-tilt-fill`: ImageVector
    get() {
        if (`_circle-half-tilt-fill` != null) {
            return `_circle-half-tilt-fill`!!
        }
        `_circle-half-tilt-fill` = Builder(name = "Circle-half-tilt-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(40.0f, 128.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 190.2f, 65.8f)
                lineTo(65.8f, 190.2f)
                arcTo(87.76f, 87.76f, 0.0f, false, true, 40.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_circle-half-tilt-fill`!!
    }

private var `_circle-half-tilt-fill`: ImageVector? = null
