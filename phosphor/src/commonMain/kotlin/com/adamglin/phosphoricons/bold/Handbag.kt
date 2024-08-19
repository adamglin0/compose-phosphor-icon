package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Handbag: ImageVector
    get() {
        if (_handbag != null) {
            return _handbag!!
        }
        _handbag = Builder(name = "Handbag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.86f, 197.65f)
                lineToRelative(-14.25f, -120.0f)
                arcTo(20.06f, 20.06f, 0.0f, false, false, 209.67f, 60.0f)
                horizontalLineTo(179.83f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 76.17f, 60.0f)
                horizontalLineTo(46.33f)
                arcTo(20.06f, 20.06f, 0.0f, false, false, 26.39f, 77.65f)
                lineToRelative(-14.25f, 120.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 32.08f, 220.0f)
                horizontalLineTo(223.92f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.94f, -22.35f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 27.71f, 24.0f)
                horizontalLineTo(100.29f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(36.5f, 196.0f)
                lineTo(49.81f, 84.0f)
                horizontalLineTo(76.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(84.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(84.0f)
                horizontalLineToRelative(26.19f)
                lineTo(219.5f, 196.0f)
                close()
            }
        }
        .build()
        return _handbag!!
    }

private var _handbag: ImageVector? = null
