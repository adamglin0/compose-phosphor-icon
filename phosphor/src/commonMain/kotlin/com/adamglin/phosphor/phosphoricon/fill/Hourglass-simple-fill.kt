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

public val FillGroup.`Hourglass-simple-fill`: ImageVector
    get() {
        if (`_hourglass-simple-fill` != null) {
            return `_hourglass-simple-fill`!!
        }
        `_hourglass-simple-fill` = Builder(name = "Hourglass-simple-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.31f, 196.69f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 224.0f)
                horizontalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.32f, -27.31f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 0.13f, -0.13f)
                lineTo(116.43f, 128.0f)
                lineTo(44.82f, 59.44f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, -0.13f, -0.13f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 32.0f)
                horizontalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 11.32f, 27.31f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, -0.13f, 0.13f)
                lineTo(139.57f, 128.0f)
                lineToRelative(71.61f, 68.56f)
                arcTo(1.59f, 1.59f, 0.0f, false, false, 211.31f, 196.69f)
                close()
            }
        }
        .build()
        return `_hourglass-simple-fill`!!
    }

private var `_hourglass-simple-fill`: ImageVector? = null
