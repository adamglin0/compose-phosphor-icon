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

public val FillGroup.Sneaker: ImageVector
    get() {
        if (_sneaker != null) {
            return _sneaker!!
        }
        _sneaker = Builder(name = "Sneaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.65f, 129.11f)
                lineToRelative(-28.06f, -9.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.63f, 0.0f)
                lineToRelative(-43.23f, 15.72f)
                arcTo(8.14f, 8.14f, 0.0f, false, true, 152.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.71f, -5.88f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 5.22f, -9.73f)
                lineTo(168.0f, 113.67f)
                arcToRelative(2.54f, 2.54f, 0.0f, false, false, -0.06f, -4.8f)
                arcToRelative(23.93f, 23.93f, 0.0f, false, true, -8.8f, -5.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.17f, -0.91f)
                lineToRelative(-24.22f, 8.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.44f, -5.39f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 5.22f, -9.73f)
                lineTo(146.0f, 88.93f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.31f, -5.34f)
                lineToRelative(-3.06f, -7.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.05f, -2.19f)
                lineToRelative(-25.5f, 9.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.44f, -5.39f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 5.22f, -9.73f)
                lineToRelative(24.0f, -8.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.31f, -5.33f)
                lineTo(130.39f, 41.6f)
                reflectiveCurveToRelative(0.0f, -0.07f, 0.0f, -0.1f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 110.25f, 33.0f)
                lineTo(34.53f, 60.49f)
                arcTo(16.05f, 16.05f, 0.0f, false, false, 24.0f, 75.53f)
                verticalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(240.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(167.06f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 228.65f, 129.11f)
                close()
                moveTo(240.0f, 192.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(176.0f)
                horizontalLineTo(240.0f)
                close()
            }
        }
        .build()
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
