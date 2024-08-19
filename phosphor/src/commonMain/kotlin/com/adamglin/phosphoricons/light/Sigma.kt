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

public val LightGroup.Sigma: ImageVector
    get() {
        if (_sigma != null) {
            return _sigma!!
        }
        _sigma = Builder(name = "Sigma", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.0f, 72.0f)
                verticalLineTo(54.0f)
                horizontalLineTo(76.48f)
                lineToRelative(56.21f, 70.25f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 7.5f)
                lineTo(76.48f, 202.0f)
                horizontalLineTo(186.0f)
                verticalLineTo(184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.69f, -9.75f)
                lineToRelative(61.0f, -76.25f)
                lineToRelative(-61.0f, -76.25f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 64.0f, 42.0f)
                horizontalLineTo(192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                verticalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _sigma!!
    }

private var _sigma: ImageVector? = null
