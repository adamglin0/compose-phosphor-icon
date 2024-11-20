package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) {
            return _lastfmLogo!!
        }
        _lastfmLogo = Builder(name = "LastfmLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                horizontalLineTo(190.57f)
                arcToRelative(56.22f, 56.22f, 0.0f, false, true, -50.75f, -32.32f)
                lineToRelative(-30.14f, -64.6f)
                arcTo(40.15f, 40.15f, 0.0f, false, false, 73.43f, 80.0f)
                horizontalLineTo(64.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 29.34f, -19.2f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 116.0f, 171.2f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 72.0f, 200.0f)
                horizontalLineTo(64.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 8.0f, 144.0f)
                verticalLineTo(120.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 64.0f, 64.0f)
                horizontalLineToRelative(9.43f)
                arcToRelative(56.22f, 56.22f, 0.0f, false, true, 50.75f, 32.32f)
                lineToRelative(30.14f, 64.6f)
                arcTo(40.15f, 40.15f, 0.0f, false, false, 190.57f, 184.0f)
                horizontalLineTo(208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -48.0f)
                horizontalLineTo(188.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, -72.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(188.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 40.0f)
                horizontalLineToRelative(20.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 248.0f, 160.0f)
                close()
            }
        }
        .build()
        return _lastfmLogo!!
    }

private var _lastfmLogo: ImageVector? = null
