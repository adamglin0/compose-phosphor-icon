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

public val BoldGroup.Texthsix: ImageVector
    get() {
        if (_texthsix != null) {
            return _texthsix!!
        }
        _texthsix = Builder(name = "Texthsix", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.06f, 140.33f)
                lineToRelative(13.24f, -22.18f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -20.6f, -12.3f)
                lineToRelative(-32.25f, 54.0f)
                curveToRelative(-0.09f, 0.15f, -0.17f, 0.31f, -0.25f, 0.47f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 39.86f, -20.0f)
                close()
                moveTo(212.0f, 196.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 212.0f, 196.0f)
                close()
                moveTo(156.0f, 56.0f)
                verticalLineTo(176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(52.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(80.0f)
                verticalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _texthsix!!
    }

private var _texthsix: ImageVector? = null
