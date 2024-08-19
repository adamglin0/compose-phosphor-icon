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

public val FillGroup.`Parallelogram-fill`: ImageVector
    get() {
        if (`_parallelogram-fill` != null) {
            return `_parallelogram-fill`!!
        }
        `_parallelogram-fill` = Builder(name = "Parallelogram-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.58f, 62.57f)
                lineToRelative(-64.8f, 144.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 167.19f, 216.0f)
                horizontalLineTo(24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 9.42f, 193.43f)
                lineToRelative(64.8f, -144.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 88.81f, 40.0f)
                horizontalLineTo(232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 14.59f, 22.57f)
                close()
            }
        }
        .build()
        return `_parallelogram-fill`!!
    }

private var `_parallelogram-fill`: ImageVector? = null
