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

public val FillGroup.`Speedometer-fill`: ImageVector
    get() {
        if (`_speedometer-fill` != null) {
            return `_speedometer-fill`!!
        }
        `_speedometer-fill` = Builder(name = "Speedometer-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.87f, 90.86f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.17f, -0.62f)
                lineToRelative(-75.42f, 75.42f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 129.0f, 154.35f)
                lineToRelative(92.7f, -92.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(197.0f, 63.73f)
                arcTo(112.05f, 112.05f, 0.0f, false, false, 22.34f, 189.25f)
                arcTo(16.09f, 16.09f, 0.0f, false, false, 37.46f, 200.0f)
                horizontalLineTo(218.53f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.11f, -10.71f)
                arcToRelative(112.28f, 112.28f, 0.0f, false, false, -11.77f, -98.43f)
                close()
                moveTo(57.44f, 166.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.25f, 9.43f)
                arcToRelative(7.89f, 7.89f, 0.0f, false, true, -1.6f, 0.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.83f, -6.41f)
                arcTo(88.06f, 88.06f, 0.0f, false, true, 143.59f, 65.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.82f, 15.75f)
                arcToRelative(72.07f, 72.07f, 0.0f, false, false, -83.33f, 85.28f)
                close()
            }
        }
        .build()
        return `_speedometer-fill`!!
    }

private var `_speedometer-fill`: ImageVector? = null
