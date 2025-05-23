package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Brandy: ImageVector
    get() {
        if (_brandy != null) {
            return _brandy!!
        }
        _brandy = Builder(name = "Brandy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 88.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 40.0f, 88.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(95.63f, 95.63f, 0.0f, false, false, -15.53f, -52.37f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.7f, -3.63f)
                horizontalLineTo(54.23f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.7f, 3.63f)
                arcTo(95.63f, 95.63f, 0.0f, false, false, 32.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(96.12f, 96.12f, 0.0f, false, false, 88.0f, 95.66f)
                verticalLineTo(216.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(183.66f)
                arcTo(96.12f, 96.12f, 0.0f, false, false, 224.0f, 88.0f)
                close()
                moveTo(58.7f, 48.0f)
                horizontalLineTo(197.3f)
                arcToRelative(79.52f, 79.52f, 0.0f, false, true, 10.3f, 32.0f)
                horizontalLineTo(48.4f)
                arcTo(79.52f, 79.52f, 0.0f, false, true, 58.7f, 48.0f)
                close()
                moveTo(128.0f, 168.0f)
                arcTo(80.11f, 80.11f, 0.0f, false, true, 48.4f, 96.0f)
                horizontalLineTo(207.6f)
                arcTo(80.11f, 80.11f, 0.0f, false, true, 128.0f, 168.0f)
                close()
            }
        }
        .build()
        return _brandy!!
    }

private var _brandy: ImageVector? = null
