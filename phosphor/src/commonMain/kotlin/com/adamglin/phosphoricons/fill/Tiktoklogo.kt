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

public val FillGroup.Tiktoklogo: ImageVector
    get() {
        if (_tiktoklogo != null) {
            return _tiktoklogo!!
        }
        _tiktoklogo = Builder(name = "Tiktoklogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 80.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                arcToRelative(103.25f, 103.25f, 0.0f, false, true, -48.0f, -11.71f)
                verticalLineTo(156.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, -152.0f, 0.0f)
                curveToRelative(0.0f, -36.9f, 26.91f, -69.52f, 62.6f, -75.88f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 88.0f)
                verticalLineToRelative(42.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.57f, 7.23f)
                arcTo(20.0f, 20.0f, 0.0f, true, false, 120.0f, 156.0f)
                verticalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 80.0f)
                close()
            }
        }
        .build()
        return _tiktoklogo!!
    }

private var _tiktoklogo: ImageVector? = null
