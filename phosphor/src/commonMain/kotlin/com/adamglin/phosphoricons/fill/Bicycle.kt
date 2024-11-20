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

public val FillGroup.Bicycle: ImageVector
    get() {
        if (_bicycle != null) {
            return _bicycle!!
        }
        _bicycle = Builder(name = "Bicycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(54.46f, 164.71f)
                lineTo(82.33f, 126.5f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -12.92f, -9.44f)
                lineTo(41.54f, 155.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.92f, 9.42f)
                close()
                moveTo(208.0f, 112.0f)
                arcToRelative(47.81f, 47.81f, 0.0f, false, false, -16.93f, 3.09f)
                lineTo(214.91f, 156.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 201.09f, 164.0f)
                lineToRelative(-23.83f, -40.86f)
                arcTo(48.0f, 48.0f, 0.0f, true, false, 208.0f, 112.0f)
                close()
                moveTo(165.93f, 72.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                horizontalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.91f, 12.0f)
                lineToRelative(11.65f, 20.0f)
                horizontalLineTo(99.26f)
                lineTo(82.91f, 60.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 76.0f, 56.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(71.41f)
                lineTo(85.12f, 95.51f)
                lineTo(69.41f, 117.06f)
                arcToRelative(47.87f, 47.87f, 0.0f, false, true, 12.92f, 9.44f)
                lineToRelative(11.59f, -15.9f)
                lineTo(125.09f, 164.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 138.91f, 156.0f)
                lineToRelative(-30.32f, -52.0f)
                horizontalLineToRelative(57.48f)
                lineToRelative(11.19f, 19.17f)
                arcToRelative(48.11f, 48.11f, 0.0f, false, true, 13.81f, -8.08f)
                close()
            }
        }
        .build()
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
