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

public val FillGroup.Handpointing: ImageVector
    get() {
        if (_handpointing != null) {
            return _handpointing!!
        }
        _handpointing = Builder(name = "Handpointing", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 104.0f)
                verticalLineToRelative(50.93f)
                curveToRelative(0.0f, 46.2f, -36.85f, 84.55f, -83.0f, 85.06f)
                arcTo(83.71f, 83.71f, 0.0f, false, true, 80.6f, 215.4f)
                curveTo(58.79f, 192.33f, 34.15f, 136.0f, 34.15f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 6.53f, -22.23f)
                curveToRelative(7.66f, -4.0f, 17.1f, -0.84f, 21.4f, 6.62f)
                lineToRelative(21.0f, 36.44f)
                arcToRelative(6.09f, 6.09f, 0.0f, false, false, 6.0f, 3.09f)
                lineToRelative(0.12f, 0.0f)
                arcTo(8.19f, 8.19f, 0.0f, false, false, 96.0f, 151.74f)
                verticalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.77f, -16.0f)
                curveToRelative(8.61f, 0.4f, 15.23f, 7.82f, 15.23f, 16.43f)
                verticalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, 8.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, -8.25f)
                verticalLineTo(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.77f, -16.0f)
                curveToRelative(8.61f, 0.4f, 15.23f, 7.82f, 15.23f, 16.43f)
                verticalLineTo(112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, 8.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, -8.25f)
                verticalLineToRelative(-7.28f)
                curveToRelative(0.0f, -8.61f, 6.62f, -16.0f, 15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 104.0f)
                close()
            }
        }
        .build()
        return _handpointing!!
    }

private var _handpointing: ImageVector? = null
