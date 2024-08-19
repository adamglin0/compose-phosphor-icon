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

public val DuotoneGroup.Tagsimple: ImageVector
    get() {
        if (_tagsimple != null) {
            return _tagsimple!!
        }
        _tagsimple = Builder(name = "Tagsimple", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 128.0f)
                lineToRelative(-45.62f, 68.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.66f, 3.56f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(187.72f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.66f, 3.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.66f, 123.56f)
                lineTo(201.0f, 55.13f)
                arcTo(15.94f, 15.94f, 0.0f, false, false, 187.72f, 48.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f)
                verticalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(187.72f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 201.0f, 200.88f)
                lineToRelative(45.63f, -68.44f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 246.66f, 123.56f)
                close()
                moveTo(187.72f, 192.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(187.72f)
                lineToRelative(42.66f, 64.0f)
                close()
            }
        }
        .build()
        return _tagsimple!!
    }

private var _tagsimple: ImageVector? = null
