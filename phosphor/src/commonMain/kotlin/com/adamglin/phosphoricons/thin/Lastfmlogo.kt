package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Lastfmlogo: ImageVector
    get() {
        if (_lastfmlogo != null) {
            return _lastfmlogo!!
        }
        _lastfmlogo = Builder(name = "Lastfmlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 160.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f)
                horizontalLineTo(190.57f)
                arcToRelative(52.19f, 52.19f, 0.0f, false, true, -47.12f, -30.0f)
                lineToRelative(-30.15f, -64.6f)
                arcTo(44.17f, 44.17f, 0.0f, false, false, 73.43f, 76.0f)
                horizontalLineTo(64.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, -44.0f, 44.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, 44.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 33.0f, -21.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.33f, 3.2f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 72.0f, 196.0f)
                horizontalLineTo(64.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, -52.0f)
                verticalLineTo(120.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 64.0f, 68.0f)
                horizontalLineToRelative(9.43f)
                arcToRelative(52.19f, 52.19f, 0.0f, false, true, 47.12f, 30.0f)
                lineToRelative(30.15f, 64.6f)
                arcTo(44.17f, 44.17f, 0.0f, false, false, 190.57f, 188.0f)
                horizontalLineTo(208.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -56.0f)
                horizontalLineTo(188.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -64.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(188.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 48.0f)
                horizontalLineToRelative(20.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 244.0f, 160.0f)
                close()
            }
        }
        .build()
        return _lastfmlogo!!
    }

private var _lastfmlogo: ImageVector? = null
