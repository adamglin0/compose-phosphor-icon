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

public val FillGroup.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) {
            return _eyeClosed!!
        }
        _eyeClosed = Builder(name = "EyeClosed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.94f, 164.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 217.05f, 172.0f)
                lineToRelative(-19.0f, -33.2f)
                arcTo(123.23f, 123.23f, 0.0f, false, true, 162.0f, 155.46f)
                lineToRelative(5.87f, 35.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.58f, 9.21f)
                arcTo(8.4f, 8.4f, 0.0f, false, true, 160.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.88f, -6.69f)
                lineToRelative(-5.77f, -34.58f)
                arcToRelative(133.06f, 133.06f, 0.0f, false, true, -36.68f, 0.0f)
                lineToRelative(-5.77f, 34.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 200.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -1.32f, -0.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.58f, -9.21f)
                lineTo(94.0f, 155.46f)
                arcToRelative(123.23f, 123.23f, 0.0f, false, true, -36.06f, -16.69f)
                lineTo(39.0f, 172.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 25.06f, 164.0f)
                lineToRelative(20.0f, -35.0f)
                arcToRelative(152.8f, 152.8f, 0.0f, false, true, -19.3f, -20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -10.06f)
                curveTo(44.56f, 75.72f, 77.55f, 48.0f, 128.0f, 48.0f)
                reflectiveCurveToRelative(83.44f, 27.72f, 102.22f, 51.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 10.06f)
                arcToRelative(152.8f, 152.8f, 0.0f, false, true, -19.3f, 20.0f)
                close()
            }
        }
        .build()
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
