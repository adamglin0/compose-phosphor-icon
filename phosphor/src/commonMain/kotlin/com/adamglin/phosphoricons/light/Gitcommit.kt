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

public val LightGroup.GitCommit: ImageVector
    get() {
        if (_gitCommit != null) {
            return _gitCommit!!
        }
        _gitCommit = Builder(name = "GitCommit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 122.0f)
                horizontalLineTo(181.66f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -107.32f, 0.0f)
                horizontalLineTo(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(74.34f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 107.32f, 0.0f)
                horizontalLineTo(248.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(128.0f, 170.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, true, 42.0f, -42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 128.0f, 170.0f)
                close()
            }
        }
        .build()
        return _gitCommit!!
    }

private var _gitCommit: ImageVector? = null
