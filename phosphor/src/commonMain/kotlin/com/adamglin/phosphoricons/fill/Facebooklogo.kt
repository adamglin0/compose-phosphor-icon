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

public val FillGroup.Facebooklogo: ImageVector
    get() {
        if (_facebooklogo != null) {
            return _facebooklogo!!
        }
        _facebooklogo = Builder(name = "Facebooklogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                arcToRelative(104.16f, 104.16f, 0.0f, false, true, -91.55f, 103.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.45f, -4.0f)
                verticalLineTo(152.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, -8.25f, -7.47f)
                horizontalLineTo(136.0f)
                verticalLineTo(112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 167.73f, 80.0f)
                horizontalLineTo(152.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.53f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 96.27f, 152.0f)
                horizontalLineTo(120.0f)
                verticalLineToRelative(75.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.44f, 4.0f)
                arcTo(104.15f, 104.15f, 0.0f, false, true, 24.07f, 124.09f)
                curveToRelative(2.0f, -54.0f, 45.74f, -97.9f, 99.78f, -100.0f)
                arcTo(104.12f, 104.12f, 0.0f, false, true, 232.0f, 128.0f)
                close()
            }
        }
        .build()
        return _facebooklogo!!
    }

private var _facebooklogo: ImageVector? = null
