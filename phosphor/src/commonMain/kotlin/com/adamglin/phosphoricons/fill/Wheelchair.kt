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

public val FillGroup.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.53f, 199.59f)
                lineToRelative(-24.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.69f, -4.0f)
                lineTo(187.05f, 144.0f)
                horizontalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(106.34f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 112.0f, 216.0f)
                curveToRelative(25.91f, 0.0f, 50.09f, -18.05f, 56.25f, -42.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.5f, 4.0f)
                curveToRelative(-8.06f, 31.3f, -38.23f, 54.0f, -71.75f, 54.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 96.0f, 89.81f)
                verticalLineToRelative(-19.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 16.0f, 0.0f)
                verticalLineTo(88.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(112.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.15f, 4.42f)
                lineToRelative(28.9f, 57.8f)
                lineToRelative(17.42f, -5.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.06f, 15.18f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
