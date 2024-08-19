package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Pennib: ImageVector
    get() {
        if (_pennib != null) {
            return _pennib!!
        }
        _pennib = Builder(name = "Pennib", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.31f, 81.36f)
                lineTo(174.63f, 12.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineTo(123.56f, 41.12f)
                lineToRelative(-58.0f, 21.76f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 55.36f, 75.23f)
                lineTo(34.59f, 199.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.77f, 3.49f)
                lineToRelative(57.0f, -57.0f)
                arcToRelative(23.85f, 23.85f, 0.0f, false, true, -2.29f, -12.08f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 13.6f, 23.4f)
                lineToRelative(-57.0f, 57.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.49f, 6.77f)
                lineToRelative(124.61f, -20.77f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.35f, -10.16f)
                lineToRelative(21.77f, -58.07f)
                lineTo(243.31f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f)
                close()
                moveTo(208.0f, 116.68f)
                lineTo(139.32f, 48.0f)
                lineToRelative(24.0f, -24.0f)
                lineTo(232.0f, 92.68f)
                close()
            }
        }
        .build()
        return _pennib!!
    }

private var _pennib: ImageVector? = null
