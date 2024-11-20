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

public val LightGroup.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) {
            return _lastfmLogo!!
        }
        _lastfmLogo = Builder(name = "LastfmLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 160.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, -38.0f, 38.0f)
                horizontalLineTo(190.57f)
                arcToRelative(54.21f, 54.21f, 0.0f, false, true, -48.94f, -31.16f)
                lineToRelative(-30.14f, -64.6f)
                arcTo(42.14f, 42.14f, 0.0f, false, false, 73.43f, 78.0f)
                horizontalLineTo(64.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, -42.0f, 42.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 42.0f, 42.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 31.17f, -20.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.0f, 4.8f)
                arcTo(46.0f, 46.0f, 0.0f, false, true, 72.0f, 198.0f)
                horizontalLineTo(64.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, true, -54.0f, -54.0f)
                verticalLineTo(120.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, true, 64.0f, 66.0f)
                horizontalLineToRelative(9.43f)
                arcToRelative(54.21f, 54.21f, 0.0f, false, true, 48.94f, 31.16f)
                lineToRelative(30.14f, 64.6f)
                arcTo(42.14f, 42.14f, 0.0f, false, false, 190.57f, 186.0f)
                horizontalLineTo(208.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.0f, -52.0f)
                horizontalLineTo(188.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, -68.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 30.0f, 30.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -18.0f, -18.0f)
                horizontalLineTo(188.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 44.0f)
                horizontalLineToRelative(20.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 246.0f, 160.0f)
                close()
            }
        }
        .build()
        return _lastfmLogo!!
    }

private var _lastfmLogo: ImageVector? = null
