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

public val BoldGroup.Lastfmlogo: ImageVector
    get() {
        if (_lastfmlogo != null) {
            return _lastfmlogo!!
        }
        _lastfmlogo = Builder(name = "Lastfmlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 160.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, 44.0f)
                horizontalLineTo(190.57f)
                arcToRelative(60.2f, 60.2f, 0.0f, false, true, -54.37f, -34.63f)
                lineToRelative(-30.15f, -64.59f)
                arcTo(36.13f, 36.13f, 0.0f, false, false, 73.43f, 84.0f)
                horizontalLineTo(64.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 25.68f, -16.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 22.0f, 9.6f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 72.0f, 204.0f)
                horizontalLineTo(64.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, true, 4.0f, 144.0f)
                verticalLineTo(120.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, true, 64.0f, 60.0f)
                horizontalLineToRelative(9.43f)
                arcTo(60.2f, 60.2f, 0.0f, false, true, 127.8f, 94.63f)
                lineTo(158.0f, 159.22f)
                arcTo(36.13f, 36.13f, 0.0f, false, false, 190.57f, 180.0f)
                horizontalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -40.0f)
                horizontalLineTo(188.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, -80.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(188.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineToRelative(20.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 252.0f, 160.0f)
                close()
            }
        }
        .build()
        return _lastfmlogo!!
    }

private var _lastfmlogo: ImageVector? = null
