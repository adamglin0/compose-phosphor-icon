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

public val BoldGroup.Towel: ImageVector
    get() {
        if (_towel != null) {
            return _towel!!
        }
        _towel = Builder(name = "Towel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.16f, 20.0f)
                curveToRelative(-0.47f, 0.0f, -0.93f, 0.0f, -1.39f, 0.0f)
                horizontalLineTo(72.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 44.0f, 48.0f)
                verticalLineTo(216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(168.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(52.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 196.0f, 44.0f)
                horizontalLineToRelative(0.35f)
                arcToRelative(8.33f, 8.33f, 0.0f, false, true, 7.7f, 8.48f)
                verticalLineTo(148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(52.48f)
                arcTo(32.13f, 32.13f, 0.0f, false, false, 197.16f, 20.0f)
                close()
                moveTo(72.0f, 44.0f)
                horizontalLineToRelative(93.0f)
                arcToRelative(32.24f, 32.24f, 0.0f, false, false, -1.0f, 8.0f)
                verticalLineTo(172.0f)
                horizontalLineTo(68.0f)
                verticalLineTo(48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 72.0f, 44.0f)
                close()
                moveTo(68.0f, 212.0f)
                verticalLineTo(196.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _towel!!
    }

private var _towel: ImageVector? = null
