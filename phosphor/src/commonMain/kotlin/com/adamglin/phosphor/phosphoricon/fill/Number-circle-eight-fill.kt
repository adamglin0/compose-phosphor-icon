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

public val FillGroup.`Number-circle-eight-fill`: ImageVector
    get() {
        if (`_number-circle-eight-fill` != null) {
            return `_number-circle-eight-fill`!!
        }
        `_number-circle-eight-fill` = Builder(name = "Number-circle-eight-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 152.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 148.0f, 152.0f)
                close()
                moveTo(128.0f, 116.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 116.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(164.0f, 152.0f)
                arcToRelative(35.93f, 35.93f, 0.0f, false, false, -14.19f, -28.61f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -43.62f, 0.0f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 164.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_number-circle-eight-fill`!!
    }

private var `_number-circle-eight-fill`: ImageVector? = null
