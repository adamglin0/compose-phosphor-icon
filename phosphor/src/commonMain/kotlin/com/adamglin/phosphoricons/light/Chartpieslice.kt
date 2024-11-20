package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) {
            return _chartPieSlice!!
        }
        _chartPieSlice = Builder(name = "ChartPieSlice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.0f, 109.5f)
                verticalLineToRelative(-72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.0f, -5.66f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 27.7f, 146.59f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.9f, 4.11f)
                lineToRelative(62.4f, -36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 102.0f, 109.5f)
                close()
                moveTo(90.0f, 106.0f)
                lineToRelative(-51.66f, 29.8f)
                quadTo(38.0f, 131.91f, 38.0f, 128.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 90.0f, 46.42f)
                close()
                moveTo(128.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(93.0f)
                lineTo(42.2f, 171.46f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.15f, 8.22f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.48f, 90.48f, 0.0f, false, true, -74.38f, -39.31f)
                lineTo(131.0f, 133.61f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, -5.19f)
                lineTo(134.0f, 38.2f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
