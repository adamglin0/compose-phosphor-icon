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

public val DuotoneGroup.MastodonLogo: ImageVector
    get() {
        if (_mastodonLogo != null) {
            return _mastodonLogo!!
        }
        _mastodonLogo = Builder(name = "MastodonLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 72.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(72.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 72.0f, 40.0f)
                horizontalLineTo(184.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 216.0f, 72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 32.0f)
                lineTo(72.0f, 32.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 32.0f, 72.0f)
                lineTo(32.0f, 192.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(72.0f, 216.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                verticalLineToRelative(-8.0f)
                lineTo(184.0f, 184.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                lineTo(224.0f, 72.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 184.0f, 32.0f)
                close()
                moveTo(208.0f, 144.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(48.0f, 168.0f)
                lineTo(48.0f, 72.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 72.0f, 48.0f)
                lineTo(184.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                close()
                moveTo(184.0f, 104.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(168.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(72.0f, 104.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 56.0f, -21.13f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 184.0f, 104.0f)
                close()
            }
        }
        .build()
        return _mastodonLogo!!
    }

private var _mastodonLogo: ImageVector? = null
