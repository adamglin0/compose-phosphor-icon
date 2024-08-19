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

public val FillGroup.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) {
            return _pinwheel!!
        }
        _pinwheel = Builder(name = "Pinwheel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.66f, 218.34f)
                lineToRelative(-48.42f, -48.41f)
                curveToRelative(1.1f, -0.33f, 2.19f, -0.68f, 3.27f, -1.07f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 220.37f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.25f, -4.78f)
                lineToRelative(-44.2f, 16.08f)
                curveToRelative(0.32f, -0.62f, 0.64f, -1.24f, 0.93f, -1.88f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 92.0f, 19.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 87.18f, 29.9f)
                lineToRelative(16.09f, 44.22f)
                curveToRelative(-0.63f, -0.32f, -1.25f, -0.65f, -1.89f, -1.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -81.73f, 74.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.25f, 4.78f)
                lineToRelative(44.2f, -16.09f)
                curveToRelative(-0.32f, 0.63f, -0.64f, 1.25f, -0.93f, 1.89f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 74.89f, 81.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.78f, -10.25f)
                lineToRelative(-16.08f, -44.18f)
                curveToRelative(0.62f, 0.31f, 1.24f, 0.62f, 1.88f, 0.91f)
                arcToRelative(59.87f, 59.87f, 0.0f, false, false, 22.48f, 5.58f)
                lineToRelative(57.22f, 57.23f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
                moveTo(109.0f, 203.87f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -3.73f, -77.81f)
                lineToRelative(29.6f, 81.33f)
                arcTo(43.6f, 43.6f, 0.0f, false, true, 109.0f, 203.87f)
                close()
                moveTo(152.4f, 94.62f)
                arcTo(43.77f, 43.77f, 0.0f, false, true, 134.8f, 114.0f)
                lineTo(105.19f, 32.63f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 47.16f, 62.0f)
                close()
            }
        }
        .build()
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
